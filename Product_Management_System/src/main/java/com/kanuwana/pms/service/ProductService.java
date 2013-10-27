package main.java.com.kanuwana.pms.service;

import main.java.com.kanuwana.pms.dto.Product;

/**
 * Describes the interface for Product related database operations.
 * @author skanuwana
 *
 */
public interface ProductService {

	/**
	 * Saves a product in the default store.
	 * @param productName
	 */
	public void saveProduct(final String productName);
	
	/**
	 * Saves a product in a given store.
	 * @param productName
	 * @param storeName
	 */
	public void saveProduct(final String productName, final String storeName);
	
	/**
	 * Retrieves a product from the database.
	 * @param productName
	 * @return the product 
	 */
	public Product getProduct(final String productName);
	
	/**
	 * Updates an existing product.
	 * @param productName
	 */
	public void updateProduct(final String productName);
	
	/**
	 * Removes a product from a given store.
	 * @param productName
	 */
	public void removeProduct(final String productName);
}
