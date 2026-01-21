package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListProblem {

    static List<String> auditLogs =  Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) throws Exception{

        Thread writer = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                auditLogs.add("LOG-" + i);			// 10 separate copy created...
            }
        });

        Thread reader = new Thread(() -> {
            	synchronized (auditLogs) {
            		for (String log : auditLogs) { // ❌ fail-fast
                        System.out.println("Reading: " + log);
                    }
				}
    
        		
        });

        writer.start();
        reader.start();
       writer.join();
       reader.join();
        System.out.println("Final size of list is "+auditLogs.size());
    }
}

