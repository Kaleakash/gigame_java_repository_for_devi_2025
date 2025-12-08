package synchroizationexample;
class Shop {
    private int item;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException {
        while (available==true) {
            wait(); // wait until item is consumed
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notify(); // notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (available==false) {
            wait(); // wait until item is produced
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify(); // notify producer
    }
}

class Producer implements Runnable {
    Shop shop;

    Producer(Shop shop) {
        this.shop = shop;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                shop.produce(i);
                Thread.sleep(1000); // simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Consumer implements Runnable {
    Shop shop;

    Consumer(Shop shop) {
        this.shop = shop;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                shop.consume();
                Thread.sleep(1500); // simulate time delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ProducerConsumerTest {
    public static void main(String[] args) {
        
    	Shop shop = new Shop();

        Producer producer = new Producer(shop);
        Consumer consumer = new Consumer(shop);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}


