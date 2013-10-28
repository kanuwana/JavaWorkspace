package main.java.com.kanuwana.pms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Represents the actual store where products are saved, retrieved and removed
 * @author skanuwana
 *
 */
@Entity
@Table(name="STORE")
public class Store {

	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private int id;
	@Column(name="STORE_NAME")
	private String name;
//	@Embedded
//	@ElementCollection(fetch=FetchType.EAGER)//Pulls up entire object including collection
//	@JoinTable (name="STORE_ADDRESSES")
//	@GenericGenerator(name="hilo-gen", strategy="hilo")//Generator id generation since Address has no id
//	@CollectionId (columns={@Column(name="ADD_ID")}, generator="", type=@Type(type="long"))
	//private Collection<Address> addresses = new ArrayList<Address>(); //Collection of addresses
	//@OneToMany (cascade=CascadeType.PERSIST, mappedBy="id")
	
	//@Transient
	//private Collection<Product> products;
	
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
//	public Collection<Address> getAddresses() {
//		return addresses;
//	}
//	public void setAddresses(Collection<Address> addresses) {
//		this.addresses = addresses;
//	}
//	public Collection<Product> getProducts() {
//		return products;
//	}
//	public void setProducts(Collection<Product> products) {
//		this.products = products;
//	}
}
