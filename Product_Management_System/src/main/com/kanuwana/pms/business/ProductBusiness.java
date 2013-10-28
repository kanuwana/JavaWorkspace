package main.com.kanuwana.pms.business;

import main.java.com.kanuwana.pms.dto.Product;
import main.java.com.kanuwana.pms.dto.Store;

/**
 * This provides all the business logic related to Product Management System
 * @author skanuwana
 *
 */
public interface ProductBusiness {

	/**
	 * Checks whether the given product is new or existing. Returns true if new.
	 * @param product 
	 * @return true/false
	 */
	public boolean isNewProduct(Product product);
	/**
	 * Checks whether the full in the stock and no need of further purchases. Returns
	 * true is there is enough stock. This will search in all store locations.
	 * @param product
	 * @return true/false
	 */
	public boolean isStockEnough(Product product);
	
	/**
	 * Checks whether the full in the stock and no need of further purchases. Returns
	 * true is there is enough stock. This will search in a particular store given.
	 * @param product
	 * @param store
	 * @return true/false
	 */
	public boolean isStockEnough(Product product, Store store);
	
	/**
	 * Saves a product in main store (Store 1)
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
	 * Removes a product from a given store.
	 * @param productName
	 */
	public void removeProduct(final String productName);
	
	/**
	 * Updates a given product.
	 * @param productName
	 * @return the updated product
	 */
	public Product updateProduct(final String productName);
}
