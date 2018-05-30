package com.javasoft.vo;

public class StudentVO {
	private String hakbun,irum,grade;
	private int kor,eng,mat,edp,sum;
	private double avg;
	
	public StudentVO() {
	
	}

	public StudentVO(String hakbun, String irum, int kor, int eng, int mat, int edp, int sum,
			double avg, String grade) {
		super();
		this.hakbun = hakbun;
		this.irum = irum;
		this.grade = grade;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
		this.sum = sum;
		this.avg = avg;
	}
	
	public StudentVO(String hakbun, String irum, int kor, int eng, int mat,int edp) {
		super();
		this.hakbun = hakbun;
		this.irum = irum;
		
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.edp = edp;
		
	}
	
	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getIrum() {
		return irum;
	}

	public void setIrum(String irum) {
		this.irum = irum;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEdp() {
		return edp;
	}

	public void setEdp(int edp) {
		this.edp = edp;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public String toString() {
		return String.format("StudentVO [hakbun=%s, irum=%s, grade=%s, kor=%s, eng=%s, mat=%s, edp=%s, sum=%s, avg=%s]",
				hakbun, irum, grade, kor, eng, mat, edp, sum, avg);
	}
	
	
}
