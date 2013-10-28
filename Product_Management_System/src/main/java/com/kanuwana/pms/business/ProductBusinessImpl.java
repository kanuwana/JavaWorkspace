/**
 * 
 */
package main.java.com.kanuwana.pms.business;

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
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#saveProduct(final String productName)
	 */
	@Override
	public void saveProduct(final String productName) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#saveProduct(final String productName, final String storeName)
	 */
	@Override
	public void saveProduct(final String productName, final String storeName) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#getProduct(final String productName)
	 */
	@Override
	public Product getProduct(final String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#removeProduct(final String productName, final String storeName)
	 */
	@Override
	public void removeProduct(final String productName) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.business.ProductBusiness#updateProduct(final String productName)
	 */
	@Override
	public Product updateProduct(final String productName) {
		// TODO Auto-generated method stub
		return null;
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
}
