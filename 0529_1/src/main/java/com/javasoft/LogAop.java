package com.javasoft;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("logAop")
@Aspect
public class LogAop {
	@Pointcut("within(com.javasoft.Student)*")
	private void publicMethod() {}
	
	@Around("publicMethod()")
	public Object loggerAop(ProceedingJoinPoint joinpoint) throws Throwable{
		String signatureStr = joinpoint.getSignature().toShortString();
		
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
