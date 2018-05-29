package com.javasoft;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAop {
	//joinpoint 객체를 전달 받을 때에는 반드시 첫번째 파라미터여야 한다.
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		String signatureStr = joinpoint.getSignature().toShortString();
		//Signature getSignature() : 호출되는 메소드에대한 정보를 구한다.
		//cf)Object getTarget() : 대상 객체를 구한다.
		//cf)Object [] getArgs() : 파라미터 목록을 구한다.
	
		//toShortString() : 메소드를 축약해서 표현한 문장을 구한다. 메소드의 이름만 구한다.
		//cf)toLongString() : 완전하게 표현된 문장. 리턴타입, 메소드이름, 파라미터 타입 모두
		//cf)getName() : 메소드의 이름을 구한다.
		System.out.println(signatureStr + " is start.");
		long start = System.currentTimeMillis();
	
		try{
			Object obj = joinpoint.proceed(); //대상객체의 실제 메소드 호출
			return obj;
		}finally{
			long end = System.currentTimeMillis();
			System.out.println(signatureStr + " is finished.");
			System.out.println(signatureStr + " 경과시간 : " + (end - start));
		}
	}
}
