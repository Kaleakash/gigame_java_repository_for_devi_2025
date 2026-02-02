package com;
import java.nio.ByteBuffer;

public class BufferExample {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);
        byte a = 1;
        String name = "Ravi";
        buffer.put(a);
        buffer.put((byte) 2);
        buffer.put(name.getBytes());	// convert string to byte 

        buffer.flip(); // switch write → read

        while (buffer.hasRemaining()) {
            System.out.println(buffer.get());
        }
    }
}

