package test.java.com.kanuwana.pms;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class TestRunner {

	public TestRunner() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Result result = JUnitCore.runClasses(TestSuite.class);
		
		for (Failure failure : result.getFailures())
		{
			System.out.println(failure.getMessage());
		}
		
		System.out.println(result.wasSuccessful() ? "Passed" : "Failed");
	}

}
