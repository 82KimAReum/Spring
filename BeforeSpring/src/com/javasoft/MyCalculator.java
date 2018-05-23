package com.javasoft;

public class MyCalculator {
	private Calc calc;
	private int first;
	private int second;
	public MyCalculator() {
		this.calc=new Calc();
	}
	public Calc getCalc() {
		return calc;
	}
	public void setCalc(Calc calc) {
		this.calc = calc;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void addAction() {
		this.calc.add(this.first,this.second);
	}
	public void subAction() {
		this.calc.sub(this.first,this.second);
	}
	public void mulAction() {
		this.calc.mul(this.first,this.second);
	}
	public void adivAction() {
		this.calc.div(this.first,this.second);
	}
	
}
