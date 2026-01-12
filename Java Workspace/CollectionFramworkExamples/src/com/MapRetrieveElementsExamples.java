package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapRetrieveElementsExamples {

	public static void main(String[] args) {
		Map<Integer, String> mm = new HashMap<Integer, String>();
		mm.put(10, "Raju");
		mm.put(5, "Lokesh");
		System.out.println(mm);
		Set<Integer> keys=  mm.keySet();	// store all keys in set 	mm is object of map which containns keySet method which store all keys from map to set 
		Iterator<Integer> li = keys.iterator();
		while(li.hasNext()) {
			int k = li.next();
			System.out.println("key "+k+" Value "+mm.get(k));
		}
	}

}
