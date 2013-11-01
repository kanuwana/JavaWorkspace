package main.java.com.kanuwana.pms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Represents a product/item stored in the store.
 * @author skanuwana
 *
 */
@Entity
@NamedQuery(name="Product.byId", query="from Product where id = ?")
@NamedNativeQuery(name="Product.byName", query="select * from PRODUCT where PRODUCT_NAME = ?", resultClass=Product.class)
@Table(name="PRODUCT")
public class Product {

	@Id
	@Column (name="ID")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int id;
	@Column (name="PRODUCT_NAME")
	private String name;
	
	
	//@Column (name="EXPIRY_DATE")
	//@Temporal (TemporalType.DATE)//Prints the date without time 
	//private Date expireDate;
	
	//@OneToOne (cascade=CascadeType.PERSIST)
	//@JoinColumn(name="DISTRIBUTER_ID")
	//@Transient
	//private Distributor distributor;
	//private transient String SKU; //Not persisted
	//@Transient //Not persisted
	//private String SerialNo; //May be you can use as surrogate key
	//@Lob //Large object CLOB/BLOB
	//private Image productImage;
	//@ManyToOne
	//@JoinColumn(name="STORE_ID")
	//@Transient
	//private Store store;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public Date getExpireDate() {
//		return expireDate;
//	}
//	public void setExpireDate(Date expireDate) {
//		this.expireDate = expireDate;
//	}
//	public Distributor getDistributor() {
//		return distributor;
//	}
//	public void setDistributor(Distributor distributor) {
//		this.distributor = distributor;
//	}
//	public String getSKU() {
//		return SKU;
//	}
//	public void setSKU(String sKU) {
//		SKU = sKU;
//	}
//	public String getSerialNo() {
//		return SerialNo;
//	}
//	public void setSerialNo(String serialNo) {
//		SerialNo = serialNo;
//	}
//	public Image getProductImage() {
//		return productImage;
//	}
//	public void setProductImage(Image productImage) {
//		this.productImage = productImage;
//	}
//	public Store getStore() {
//		return store;
//	}
//	public void setStore(Store store) {
//		this.store = store;
//	}
}
