package main.java.com.kanuwana.pms.aspect;

import main.java.com.kanuwana.pms.util.PMSLogger;

import org.apache.log4j.Priority;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@SuppressWarnings("deprecation")
	@Before("Execution(public String testPMS)")
	public void loggingAdvice()
	{
		PMSLogger.getLogger().log(Priority.INFO, "Test Method Called");
	}
}
