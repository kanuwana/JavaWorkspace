/**
 * 
 */
package main.java.com.kanuwana.pms.business;

import javax.ws.rs.core.Response.Status;

import main.java.com.kanuwana.pms.dao.ProductDAO;
import main.java.com.kanuwana.pms.dto.Address;
import main.java.com.kanuwana.pms.dto.Distributor;
import main.java.com.kanuwana.pms.dto.Product;
import main.java.com.kanuwana.pms.dto.Store;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * This is the implementation of ProductBusiness which describes all the business related
 * logic for Product Management System.
 * @author skanuwana
 *
 */
public class ProductBusinessImpl implements ProductBusiness {

	@Autowired
	private ProductDAO jdbcDao;
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#saveProduct(final String productName)
	 */
	@Override
	public Status saveProduct(final String productName) {
		return jdbcDao.saveProduct(prepareProduct(productName));
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#saveProduct(final String productName, final String storeName)
	 */
	@Override
	public Status saveProduct(final String productName, final String storeName) {
		return jdbcDao.saveProduct(prepareProduct(productName), prepareStore(storeName));
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#getProduct(final String productName)
	 */
	@Override
	public Product getProduct(final String productName) {
		return jdbcDao.getProduct(prepareProduct(productName));
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#removeProduct(final String productName, final String storeName)
	 */
	@Override
	public Status removeProduct(final String productName, final String storeName) {
		return jdbcDao.removeProduct(prepareProduct(productName), prepareStore(storeName));
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#updateProduct(final String productName)
	 */
	@Override
	public Status updateProduct(final String productName) {
		return jdbcDao.updateProduct(prepareProduct(productName));
	}
	
	/** For testing */
	public Product prepareProduct(final String productName)
	{
		Address addr = new Address();
		addr.setAddressLine1("130");
		addr.setAddressLine2("Worcester Road");
		addr.setCity("Framingham");
		addr.setState("MA");
		addr.setZipcode("01702");
		
		Store st = new Store();
		st.setName("Framingham Shop");
		st.setId(1);
		
		Distributor d = new Distributor();
		d.setName("Sahan K");
		d.setAddress(addr);
		
		Product p1 = new Product();
		p1.setName(productName);
		//p1.setDistributor(d);
		//p1.setStore(st);
		
		jdbcDao.saveProduct(p1);
		
		return p1;
	}
	
	/** for testing */
	private Store prepareStore(final String storeName)
	{
		Store st = new Store();
		st.setName("Framingham Shop");
		st.setId(1);
		return st;
	}
	
	public ProductDAO getJdbcDao() {
		return jdbcDao;
	}

	public void setJdbcDao(ProductDAO jdbcDao) {
		this.jdbcDao = jdbcDao;
	}
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#isNewProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	public boolean isNewProduct(Product product) {
		return false;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#isStockEnough(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	public boolean isStockEnough(Product product) {
		return false;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#isStockEnough(main.com.virtusa.pms.domain.Product, main.com.virtusa.pms.domain.Store)
	 */
	@Override
	public boolean isStockEnough(Product product, Store store) {
		return false;
	}
}
