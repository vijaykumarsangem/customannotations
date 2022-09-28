package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

	@Around("@annotation(Hello)")
	public Object trace(ProceedingJoinPoint s) throws Throwable {
		Object result = s.proceed();
		System.out.println("hello world");
		return result;
	}

}
