package com.orgHRM.master;

public class basicfunctions 
{
	public static void main(String[] args) 
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		basicfunctions b=new basicfunctions();
		b.function3();
		
		res=b.function4();
		System.out.println(res);
	}
	
	//static Function Without returning value
	
	public static void function1()
	{
		System.out.println("This is function1 code");
	}

	//static Function with returning value
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//non static function without returning value
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//non static function with returning value
	public String function4()
	{
		System.out.println("This is function4 code");
		return "Fail";
	}
	
}