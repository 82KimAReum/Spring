package com.javasoft;

public class BMICalculator {
	private double lowWeight;
	private double normal;
	private double overWeight;
	private double obesity;
	public double getLowWeight() {
		return lowWeight;
	}
	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOverWeight() {
		return overWeight;
	}
	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	public void bmiCalculator(double height, double weight) {
		double bmi= (weight/Math.pow(height, 2))*10000 ;//height^2
		System.out.printf("BMI지수 = %.1f\n",bmi );
		if(bmi>= this.obesity)System.out.println("비만");
		else if(bmi< this.obesity && bmi>=this.overWeight)
			System.out.println("과체중");
		else if(bmi< this.obesity && bmi>=this.normal)
			System.out.println("정상");
		else 
			System.out.println("저체중");
		
		
	}
}
