package main.java.com.kanuwana.pms.service;

import javax.ws.rs.core.Response;


/**
 * Describes the interface for Product related database operations.
 * @author skanuwana
 *
 */
public interface ProductService {

	/**
	 * Saves a product in the default store.
	 * @param productName
	 * @return the status response
	 */
	public Response saveProduct(final String productName);
	
	/**
	 * Saves a product in a given store.
	 * @param productName
	 * @param storeName
	 * @return the status response
	 */
	public Response saveProduct(final String productName, final String storeName);
	
	/**
	 * Retrieves a product from the database.
	 * @param productName
	 * @return the product response
	 */
	public Response getProduct(final String productName);
	
	/**
	 * Retrieves all the products list from the database.
	 * @param productName
	 * @return the product list response 
	 */
	public Response getAllProducts();
	
	/**
	 * Updates an existing product.
	 * @param productName
	 * @return the status response
	 */
	public Response updateProduct(final String productName);
	
	/**
	 * Removes a product from a given store.
	 * @param productName
	 * @return the status response
	 */
	public Response removeProduct(final String productName, final String storeName);
	
	//TEST method
	public Response testPMS();
}
