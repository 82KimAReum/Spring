package test;

import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.javasoft.service.StudentService;
import com.javasoft.vo.StudentVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class MyTest {
	Scanner sc= new Scanner(System.in);
	@Autowired
	private StudentService studentService;
	@Test@Ignore
	public void test() {
		//select all
		for(StudentVO student:this.studentService.selectAll()) {
			System.out.println(student);
		}
	}
	@Test@Ignore
	public void test1() {
		//select one
		System.out.println("학번: "); String hakbun=sc.nextLine();
		System.out.println(this.studentService.selectStudent(hakbun));
	}
	@Test@Ignore
	public void test2() {
		//insert
		System.out.println("학번: "); String hakbun=sc.nextLine();
		System.out.println("이름: "); String irum=sc.nextLine();
		System.out.println("국어: "); int kor=sc.nextInt();
		System.out.println("영어: "); int eng=sc.nextInt();
		System.out.println("수학: "); int mat=sc.nextInt();
		System.out.println("전산: "); int edp=sc.nextInt();
		StudentVO studnet= new StudentVO(hakbun, irum, kor, eng, mat, edp);
		Calc.calc(studnet);
		this.studentService.insertStudent(studnet);
		System.out.println("insert success");
	}
	@Test@Ignore
	public void test3() {
		//update		
		System.out.print("수정할 학생의 학번 : ");   String hakbun = sc.nextLine();
		StudentVO student = this.studentService.selectStudent(hakbun);
		System.out.print("국어(" + student.getKor() + ") : "); int kor = sc.nextInt();
		System.out.print("영어(" + student.getEng() + ") : "); int eng = sc.nextInt();
		System.out.print("수학(" + student.getMat() + ") : "); int mat = sc.nextInt();
		System.out.print("전산(" + student.getEdp() + ") : "); int edp = sc.nextInt();
		student.setKor(kor);  student.setEng(eng); student.setMat(mat);
		student.setEdp(edp);
		Calc.calc(student);
		this.studentService.updateStudent(student);
		System.out.println("Update Success");
	}
	@Test
	public void test4() {
		//delete
		System.out.println("삭제할 학생의 학번: ");String hakbun =sc.nextLine();
		this.studentService.deleteStudent(hakbun);
		System.out.println("delete Success");
	}

}
