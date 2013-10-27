/**
 * 
 */
package main.java.com.kanuwana.pms.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import main.java.com.kanuwana.pms.business.ProductBusiness;
import main.java.com.kanuwana.pms.dto.Product;

/**
 * This is the service interface for presentation layer. This has all the functions related
 * to product save, produce retrieval and product removal from store(s).
 * @author skanuwana
 *
 */
@Path("/product/")
public class ProductServiceImpl implements ProductService {

	private ProductBusiness productBusiness; //This is injected by Spring
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#saveProduct(final String productName)
	 */
	@Override
	@Path("/save/")
	@POST
	public void saveProduct(final String productName) {
		System.out.println("save called");
		//productBusiness.saveProduct(productName);
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#saveProduct(final String productName, final String storeName)
	 */
	@Override
	//Not exposed
	public void saveProduct(final String productName, final String storeName) {
		//productBusiness.saveProduct(productName, storeName);
	}
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#retrieveProduct(final String productName)
	 */
	@Override
	@Path("/get/")
	@GET
	public Product getProduct(final String productName) {
		System.out.println("get called");
		return null;//productBusiness.getProduct(productName);
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#updateProduct(final String productName)
	 */
	@Override
	@Path("/update/")
	@DELETE
	public void updateProduct(final String productName) {
		System.out.println("update called");
		//productBusiness.updateProduct(productName);
	}
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#removeProduct(final String productName)
	 */
	@Override
	@Path("/remove/")
	@DELETE
	public void removeProduct(final String productName) {
		System.out.println("remove called");
		//productBusiness.removeProduct(productName);
	}
	
	@GET
	@Path("/test/")
	@Produces(MediaType.TEXT_HTML)
	public String test()
	{
		return "Product Management Service is Working!";
	}
}
