package com.javasoft.vo;

import java.sql.Date;

public class EmployeeVO {
	private int empno;
	private String ename;
	private String job;
	private Date hiredate;
	public EmployeeVO() {
	
	}
	public EmployeeVO(int empno, String ename, String job, Date hiredate) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.hiredate = hiredate;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "EmployeeVO [empno=" + empno + ", ename=" + ename + ", job=" + job + ", hiredate=" + hiredate + "]";
	}
	
}
