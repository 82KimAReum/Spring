package com.javasoft.biz;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.javasoft.vo.UserVO;

public class MyValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		//������ ��ü�� Ŭ���� Ÿ�� ������ ��ȯ
		return UserVO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		UserVO userVO = (UserVO)target;
		
		/*String name=userVO.getName();//�̸��ִ���?
		if(name==null || name.length()==0 || name.trim().isEmpty()) {
			System.out.println("�̸��� �������ϴ�.");
			errors.rejectValue("name", "No Name");
		}*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "No Name");
		
		/*int age =userVO.getAge();
		if(age==0) {
			System.out.println("���̰� �������ϴ�.");
			errors.rejectValue("age", "No Age");
		}
		if(age >0&&age<20) {
		//���� ������ValidationUtils���� �����Ҽ� �������� Validator�������̽��� �̿��� ��
			System.out.println("������ �ƴմϴ�.");
			errors.rejectValue("age", "No Adult");
		}*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "age", "No Age");
		/*String userid= userVO.getUserid();
		if(userid==null || userid.length()==0 ||userid.trim().isEmpty()) {
			System.out.println("���̵� �������ϴ�.");
			errors.rejectValue("userid", "No Userid");
		}*/
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userid", "No UserID");
		
		
	}
	
}
