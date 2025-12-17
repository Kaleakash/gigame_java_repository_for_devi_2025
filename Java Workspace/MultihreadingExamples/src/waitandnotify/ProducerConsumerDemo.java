package waitandnotify;

class Store {

    private int item;
    private boolean available = false;

    public synchronized void produce(int value) {

        while (available) {
            try {
                wait();   // wait if item already exists
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        item = value;
        available = true;
        System.out.println("Producer produced item: " + item); //i

        notify();  // notify consumer
    }

    public synchronized void consume() {

        while (!available) {
            try {
                wait();   // wait if no item
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Consumer consumed item: " + item);
        available = false;

        notify();  // notify producer
    }
}


class Producer extends Thread {

    private Store store;

    Producer(Store store) {
        this.store = store;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            store.produce(i);
            try {
                Thread.sleep(1000); // production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {

    private Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {
            store.consume();
            try {
                Thread.sleep(1500); // consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        Store store = new Store();				// store object created 

        Producer producer = new Producer(store);		// same object shared to producer as well as consumer 
        Consumer consumer = new Consumer(store);

        producer.start();
        consumer.start();
    }
}

