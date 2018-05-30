package test;

import com.javasoft.vo.StudentVO;

public class Calc {
	
	public static void calc(StudentVO student) {
		int sum = student.getKor() + student.getEng() + student.getMat() + student.getEdp();
		double avg = sum / 4.;
		String grade = (avg <= 100 && avg >= 90) ? "A" :
								(avg < 90 && avg >= 80) ? "B" :
									(avg < 80 && avg >= 70) ? "C" :
										(avg < 70 && avg >= 60) ? "D" : "F";
		student.setSum(sum);
		student.setAvg(avg);
		student.setGrade(grade);
 	}
}
