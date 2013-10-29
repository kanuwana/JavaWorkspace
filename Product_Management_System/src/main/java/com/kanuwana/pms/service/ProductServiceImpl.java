package main.java.com.kanuwana.pms.service;

import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import main.java.com.kanuwana.pms.business.ProductBusiness;
import main.java.com.kanuwana.pms.dto.Product;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * This is the service interface for presentation layer. This has all the functions related
 * to product save, produce retrieval and product removal from store(s).
 * @author skanuwana
 *
 */
@Path("/product/")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductBusiness productBusiness; //This is auto injected by Spring

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#saveProduct(final String productName)
	 */
	@Override
	@Path("/save/")
	@POST
	public Response saveProduct(@FormParam("productName") final String productName) {
		System.out.println(productName);
		return Response.status(productBusiness.saveProduct(productName)).build();
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#saveProduct(final String productName, final String storeName)
	 */
	@Override
	//Not exposed
	public Response saveProduct(final String productName, final String storeName) {
		return Response.status(productBusiness.saveProduct(productName, storeName)).build();
	}
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#getProduct(final String productName)
	 */
	@Override
	@Path("/get/")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public Response getProduct(@DefaultValue("Test Product") @QueryParam("productName") String productName) {
		//return Response.ok(productBusiness.getProduct(productName)).build();
		Product p = new Product();
		p.setName(productName);
		return Response.ok(p).build();
	}
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#getAllProducts()
	 */
	@Override
	@Path("/getall/")
	@GET
	public Response getAllProducts() {
		return Response.ok("To do").build();
	}

	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#updateProduct(final String productName)
	 */
	@Override
	@Path("/update/")
	@DELETE
	public Response updateProduct(final String productName) {
		return Response.status(productBusiness.updateProduct(productName)).build();
	}
	
	/* (non-Javadoc)
	 * @see main.com.virtusa.pms.service.ProductService#removeProduct(final String productName)
	 */
	@Override
	@Path("/remove/")
	@DELETE
	public Response removeProduct(final String productName, final String storeName) {
		return Response.status(productBusiness.removeProduct(productName, storeName)).build(); 
	}
	
	@GET
	@Path("/test/")
	@Produces(MediaType.TEXT_HTML)
	public String testPMS(@DefaultValue("Test Product") @PathParam("productName") String productName)
	{
		return productName;//Response.status(Status.OK).entity("It is working fine").build();
	}
	
	public ProductBusiness getProductBusiness() {
		return productBusiness;
	}

	public void setProductBusiness(ProductBusiness productBusiness) {
		this.productBusiness = productBusiness;
	}
}
