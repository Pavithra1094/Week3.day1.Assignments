package org.college;

	public class Calculator {

		public void add(int a,int b)
		{
			int c= a+b;	
			System.out.println(c);
		}
		
		public void add(int a,int b, int c)
		{
			int d= a+b+c;
			System.out.println(d);
		}
		
		public void multiply(int a, int b)
		{
			int c= a*b;
			System.out.println(c);
		}
		
		public void multiply(int a, double b)
		{
			double c= a*b;
			System.out.println(c);
		}
		public void subtract(int a,int b)
		{	
			if(a>b)
			{
			int c= a-b;
			System.out.println(c);
		}else
		{
			int c= b-a;
			System.out.println(c);
		}
		}
		
		public void subtract(double a,double b)
		{	
			if(a>b)
			{
			double c=a-b;
			System.out.println(c);
		}else
		{
			double c=a-b;
			System.out.println(c);
		}
		}
		
		public void divide(int a,int b)
		{
			int c= a/b;
			System.out.println(c);
		}
		
		public void divide(int a, double b)
		{
			System.out.println("Divide");
			double c=a/b;
			System.out.println(c);
		}
		
	public static void main(String[] args)
	{
		Calculator cal=new  Calculator();
		cal.add(1, 0);
		cal.add(1, 98, 99);
		cal.divide(10, 2);
		cal.divide(100, 20);
		cal.multiply(10, 5675652);
		cal.multiply(4, 4);
		cal.subtract(234, 10);
		cal.subtract(100, 50);
		
	}}
