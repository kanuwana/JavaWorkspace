package test.java.com.kanuwana.pms.service;

import main.java.com.kanuwana.pms.service.ProductService;
import main.java.com.kanuwana.pms.service.ProductServiceImpl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ProductServiceTest {
	
	ProductService ps;

	@Before
	public void setUp() throws Exception {
		ps = new ProductServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		ps = null;
	}

	public ProductServiceTest() {
	}
	
	@Test
	public void testTestPMS() {
		Assert.assertEquals("Still working", ps.testPMS());
	}
	
//	@Parameterized.Parameters
//	public static Collection<Object> parameterCollection() {
//		return null;
//	}

}
