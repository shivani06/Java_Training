package com.java.training.corejava.Collection;
import java.util.Scanner;

public class primeNumbers {

		static void primes()
		{
			int i;
			//int m;
			Scanner m = new Scanner(System.in);
			System.out.println("enter an integer:");
			int n1 = m.nextInt();
			for (i=2;i<n1-1;i++)
			if (n1%2!=0 && n1%i!=0)
				System.out.println("Is a prime number");
			else
				System.out.println("Is not a prime number");
				
				//break;
				//return true;
		}
		

		public static void main(String[] args) {
			
			//examples obj1 = new examples();
			primes();		
		}
	}




