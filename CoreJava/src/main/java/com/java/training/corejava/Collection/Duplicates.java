package com.java.training.corejava.Collection;
import java.util.ArrayList;
import java.util.Collections;
public class Duplicates {
	public static void main(String args[]) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	ArrayList<Integer> list1 = new ArrayList<Integer>();
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(4);
	list.add(4);
	Collections.sort(list);
	System.out.println(list);
	try {
	for (int i=0;i<list.size();i++) {
		if (list.get(i)==list.get(i+1)) 
		{
			list1.add(i);
			System.out.println(list.get(i)+" is duplicate");
			//break;
		}
	}
	if(list1.isEmpty()) {
		System.out.println("No duplicate elements");
		
	}
	}
	catch (IndexOutOfBoundsException e) {
	    System.out.println(e.getMessage());
	}
	
}
}
	


