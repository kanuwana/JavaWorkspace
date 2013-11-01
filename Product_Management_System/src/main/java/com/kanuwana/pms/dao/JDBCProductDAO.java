package main.java.com.kanuwana.pms.dao;

import java.util.List;

import javax.ws.rs.core.Response.Status;

import main.java.com.kanuwana.pms.dto.Product;
import main.java.com.kanuwana.pms.dto.Store;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class JDBCProductDAO implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	private Session session;
	
	public JDBCProductDAO() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#saveProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	@Transactional
	public Status saveProduct(Product product) {
		
		session = getSession();
		session.beginTransaction();
		
		session.save(product);
		
		session.getTransaction().commit();
		
		session.close();

		return Status.OK;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#saveProduct(main.com.virtusa.pms.domain.Product, main.com.virtusa.pms.domain.Store)
	 */
	@Override
	@Transactional
	public Status saveProduct(Product product, Store store) {
		
		//Query object and HQL - TO DO
		session = getSession();
		//HQL
		Query query = session.createQuery("from Product id > ?");
		//Named Query
		Query namedQuery = session.getNamedQuery("Product.byId"); //session.createQuery("from Product id > 5");
		//Native (SQL) Query
		Query nativeQuery = session.getNamedQuery("Product.byName"); //session.createQuery("from Product id > 5");
		query.setInteger(1, product.getId());
		query.setString(1, product.getName());
		query.setFirstResult(1);
		query.setMaxResults(30);
		
		//Using criteria, projections order
		Criteria criteria = session.createCriteria(Product.class)
							.setProjection(Projections.count("name"))
							.addOrder(Order.asc("id"));
		criteria.add(Restrictions.or(Restrictions.eq("name",  "Soya"), Restrictions.like("name",  "Soya")))
				.add(Restrictions.isNotNull("name"));
		
		//Query By
		Product p = new Product();
		p.setId(2);
		p.setName("Soya%");
		
		Example example = Example.create(p).excludeProperty("excludeProperty").enableLike();
		Criteria criteria2 = session.createCriteria(Product.class)
				.add(example);
		
		List<Product> products = (List<Product>) query/*criteria*/.list();
		session.close();
		return Status.OK;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#getProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	@Transactional
	public Product getProduct(Product product) {
		session = getSession(); 
		session.beginTransaction();
		product = (Product) session.get(Product.class, product.getId());
		session.close();
		return product; 
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#removeProduct(main.com.virtusa.pms.domain.Product, main.com.virtusa.pms.domain.Store)
	 */
	@Override
	@Transactional
	public Status removeProduct(Product product, Store store) {
		
		session = getSession();
		session.delete(product);
		session.close();
		
		return Status.OK;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#updateProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	@Transactional
	public Status updateProduct(Product product) {
		session = getSession();
		session.update(product);
		session.close();
		
		return Status.OK;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#isNewProduct(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	public boolean isNewProduct(Product product) {
		return false;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#isStockEnough(main.com.virtusa.pms.domain.Product)
	 */
	@Override
	public boolean isStockEnough(Product product) {
		return false;
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.dao.ProductDAO#isStockEnough(main.com.virtusa.pms.domain.Product, main.com.virtusa.pms.domain.Store)
	 */
	@Override
	public boolean isStockEnough(Product product, Store store) {
		return false;
	}
	
	private Session getSession()
	{
		return sessionFactory.openSession();
	}

}
