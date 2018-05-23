package com.javasoft;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a first number: ");
		int first=sc.nextInt();
		
		System.out.println("enter a second number: ");
		int second=sc.nextInt();
		MyCalculator mc=new MyCalculator();
		mc.setFirst(first);mc.setSecond(second);
		mc.mulAction();
	}
}
