package com.java.training.corejava.exceptions;

//public class ExceptionDemo {
class customexception extends Exception 
{
		
		public customexception(String s) 
		{
			super(s);
		}
		public static void main(String[] args)
		{
		try 
		{
			throw new customexception("hello");
		}
		catch(customexception ex) 
		{
			System.out.println("exception handled");
			System.out.println(ex.getMessage());
		}
		
	}
}


