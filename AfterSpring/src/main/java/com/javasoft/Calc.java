package com.javasoft;

public class Calc {
	public void add(int a, int b) {
		System.out.println("called add()");
		 System.out.printf("%d + %d = %d\n",a,b,a+b);
	}
	public void sub(int a, int b) {
		System.out.println("called sub()");
		 System.out.printf("%d - %d = %d\n",a,b,a-b);
	}
	
	public void mul(int a, int b) {
		System.out.println("called mul()");
		 System.out.printf("%d x %d = %d\n",a,b,a*b);
	}
	public void div(int a, int b) {
		System.out.println("called div()");
		 System.out.printf("%d / %d = %d\n",a,b,a/b);
	}
}
