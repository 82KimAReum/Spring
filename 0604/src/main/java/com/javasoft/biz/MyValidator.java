package com.javasoft.biz;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.javasoft.vo.UserVO;

public class MyValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		//검증할 객체의 클래스 타입 정보를 반환
		return UserVO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserVO userVO = (UserVO)target;
		
		/*String name=userVO.getName();//이름있느ㅏ?
		if(name==null || name.length()==0 || name.trim().isEmpty()) {
			System.out.println("이름이 빠졌습니다.");
			errors.rejectValue("name", "No Name");
		}*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "No Name");
		
		/*int age =userVO.getAge();
		if(age==0) {
			System.out.println("나이가 빠졌습니다.");
			errors.rejectValue("age", "No Age");
		}
		if(age >0&&age<20) {
		//값의 법위는ValidationUtils에서 구별할수 없음으로 Validator인터페이스를 이용할 것
			System.out.println("성인이 아닙니다.");
			errors.rejectValue("age", "No Adult");
		}*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "No Age");
		/*String userid= userVO.getUserid();
		if(userid==null || userid.length()==0 ||userid.trim().isEmpty()) {
			System.out.println("아이디가 빠졌습니다.");
			errors.rejectValue("userid", "No Userid");
		}*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userid", "No UserID");
		
		
	}
	
}
