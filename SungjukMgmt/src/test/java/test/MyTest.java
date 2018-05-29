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
	@Autowired
	private StudentService studentService;
	
	@Test @Ignore
	public void test() {
		Scanner scan = new Scanner(System.in);
		System.out.print("학번 : ");    String hakbun = scan.nextLine();
		System.out.print("이름 : ");    String irum = scan.nextLine();
		System.out.print("국어 : ");    int kor = scan.nextInt();
		System.out.print("영어 : ");    int eng = scan.nextInt();
		System.out.print("수학 : ");    int mat = scan.nextInt();
		System.out.print("전산 : ");    int edp = scan.nextInt();
		StudentVO student = new StudentVO(hakbun, irum, kor, eng, mat, edp);
		Calc calc = new Calc();   calc.calc(student);
		int su = this.studentService.insertStudent(student);
		if(su == 1) System.out.println("Insert Success");
		else System.out.println("Insert Failure");
	}
	@Test@Ignore
	public void test1() {
		//select all
		for (StudentVO student:this.studentService.selectAll()) {
			System.out.println(student);
		}
	}
	@Test@Ignore
	public void test2() {
		//select one
		Scanner scan = new Scanner(System.in);
		System.out.println("hakbun: "); String hakbun =scan.nextLine();
		StudentVO student =this.studentService.selectStudent(hakbun);
		System.out.println(student);
	}
	@Test@Ignore
	public void test3() {
		//update
		Scanner scan = new Scanner(System.in);
		System.out.println("hakbun: "); String hakbun =scan.nextLine();
		StudentVO student =this.studentService.selectStudent(hakbun);
		System.out.println("국어 ("+student.getKor() + "):");
		int kor =scan.nextInt(); student.setKor(kor);
		System.out.println("영어 ("+student.getEng() + "):");
		int eng= scan.nextInt(); student.setEng(eng);
		System.out.println("수학 ("+student.getMat() + "):");
		int mat =scan.nextInt(); student.setMat(mat);
		System.out.println("전산 ("+student.getEdp() + "):");
		int edp= scan.nextInt(); student.setEdp(edp);
		Calc calc = new Calc();
		calc.calc(student);
		int su =this.studentService.updateStudent(student);
		if(su ==1) System.out.println("update seccess");
		else System.out.println("update failure");
	}
	@Test
	public void test4() {
		//delete
		Scanner scan = new Scanner(System.in);
		System.out.println("hakbun: ");String hakbun =scan.nextLine();
		int su =this.studentService.deleteStudent(hakbun);
		if(su ==1) System.out.println("delete seccess");
		else System.out.println("delete failure");
	}
	
	
}
class Calc {
	public void calc(StudentVO student) {
		int sum = student.getKor() + student.getEng() + student.getMat() + student.getEdp();
		double avg = sum / 4.;
		char grade = (avg <= 100 && avg >= 90) ? 'A' :
								(avg < 90 && avg >= 80) ? 'B' :
									(avg < 80 && avg >= 70) ? 'C' :
										(avg < 70 && avg >= 60) ? 'D' : 'F';
		student.setSum(sum);
		student.setAvg(avg);
		student.setGrade(String.valueOf(grade));
 	}
}
