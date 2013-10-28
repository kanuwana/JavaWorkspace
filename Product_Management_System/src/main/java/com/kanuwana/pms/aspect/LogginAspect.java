package main.java.com.kanuwana.pms.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("Exection(public String test())")
	public void loggingAdvice()
	{
		System.out.println("Test Method Called");
	}
}
