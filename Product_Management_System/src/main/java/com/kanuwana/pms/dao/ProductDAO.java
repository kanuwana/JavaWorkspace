package main.java.com.kanuwana.pms.dao;

import javax.ws.rs.core.Response.Status;

import main.java.com.kanuwana.pms.dto.Product;
import main.java.com.kanuwana.pms.dto.Store;

/**
 * Describes the interface for Product related database operations.
 * @author skanuwana
 *
 */
public interface ProductDAO {

	/**
	 * Saves a product in main store (Store 1)
	 * @param product
	 * @return the status
	 */
	public Status saveProduct(final Product product);
	
	/**
	 * Saves a product in a given store.
	 * @param product
	 * @param store
	 * @return the status
	 */
	public Status saveProduct(final Product product, final Store store);
	
	/**
	 * Retrieves a product from the database.
	 * @param product
	 * @param store
	 * @return the product 
	 */
	public Product getProduct(final Product product);
	
	/**
	 * Removes a product from a given store.
	 * @param product
	 * @param store
	 * @return the status
	 */
	public Status removeProduct(final Product product, final Store store);
	
	/**
	 * Updates a given product.
	 * @param product
	 * @return the updated product
	 */
	public Status updateProduct(final Product product);
	
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
}
