package main.com.kanuwana.hellospring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {
	
	@Before("execution(public String getName())")
	public void logginAdvice()
	{
		System.out.println("Logging is working");
	}

}
