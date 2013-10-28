package test.java.com.kanuwana.pms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.java.com.kanuwana.pms.service.ProductServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({ProductServiceTest.class})
public class TestSuite {

	public TestSuite() {
	}

}
