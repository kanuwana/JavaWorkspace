package main.com.kanuwana.hellospring.util;

import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyLogger {
	
	public void logginAdvice()
	{
		System.out.println("Logging Aspect Working");
	}

}
