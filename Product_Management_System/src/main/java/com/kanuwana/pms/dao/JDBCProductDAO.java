package main.java.com.kanuwana.pms.dao;

import main.java.com.kanuwana.pms.dto.Product;
import main.java.com.kanuwana.pms.dto.Store;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class JDBCProductDAO implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public JDBCProductDAO() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#saveProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	@Transactional
	public void saveProduct(Product product) {
		
		Session session = getSession();
		session.beginTransaction();
		
		session.save(product);
		
		session.getTransaction().commit();
		
		session.close();

	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#saveProduct(main.com.virtusa.pms.domain.Product, main.com.virtusa.pms.domain.Store)
	 */
	@Override
	@Transactional
	public void saveProduct(Product product, Store store) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#getProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	@Transactional
	public Product getProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#removeProduct(main.com.virtusa.pms.domain.Product, main.com.virtusa.pms.domain.Store)
	 */
	@Override
	@Transactional
	public void removeProduct(Product product, Store store) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#updateProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	@Transactional
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#isNewProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	public boolean isNewProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#isStockEnough(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	public boolean isStockEnough(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#isStockEnough(main.com.virtusa.pms.domain.Product, main.com.virtusa.pms.domain.Store)
	 */
	@Override
	public boolean isStockEnough(Product product, Store store) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private Session getSession()
	{
		return sessionFactory.openSession();
	}

}
