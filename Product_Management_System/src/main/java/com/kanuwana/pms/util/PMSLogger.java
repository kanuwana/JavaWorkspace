package main.java.com.kanuwana.pms.util;

import main.java.com.kanuwana.pms.service.ProductServiceImpl;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PMSLogger {
	
	private static Logger logger = Logger.getLogger(ProductServiceImpl.class);
	
	public static Logger getLogger()
	{
		PropertyConfigurator.configure("log4j.properties");
		
		if (logger == null)
		{
			logger = Logger.getLogger(ProductServiceImpl.class); 
		}
		return logger;
	}

}
