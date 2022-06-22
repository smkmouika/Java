package com.Java.Oops;

public class VarArg {
	
	public void hello(String... str)//Can pass zero to any number of parameters 
	{
		System.out.println("String VarArg method");
	}
	
	public void hello(String str,int... i)
	{
	  System.out.println("Int VarArg method");
	}
	 
	public void hello(String str)
	{
		System.out.println("normal method");
	}
	public static void main(String[] args) 
	{
		VarArg demo=new VarArg();
		demo.hello();
		demo.hello("java");
		demo.hello("java","with");
		demo.hello("java","with","selenium");
		demo.hello("java","with","selenium","hardwork");

	}

}
