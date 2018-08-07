package com.java.training.corejava.Collection;

public class Multiplications {
	public static void main(String[] args) {
	int i=1;
	int j=1;
	System.out.println("Multiplication table is:");
	for (i=1;i<11;i++) {
		System.out.println("**************"+"Table"+" "+ i+"**************" );
		for(j=1;j<11;j++) {
			System.out.println(i + "*" + j + "=" + i*j);
		}
		
	}
}
}
