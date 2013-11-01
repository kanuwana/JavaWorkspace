package main.java.com.kanuwana.pms.dto;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Represents a distributor who distribute one or many products.
 * @author skanuwana
 *
 */
@Entity
@Table (name="DISTRIBUTOR")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.STRING)
public class Distributor {

	@Id 
	@Column (name="ID")
	@GeneratedValue (strategy=GenerationType.AUTO)
	private int id;
	@Column (name="DISTRIBUTER_NAME")
	private String name;
	@Embedded
	@AttributeOverrides({
	@AttributeOverride(name = "addressLine1" , column = @Column(name = "LINE_1")), 
	@AttributeOverride(name = "addressLine2" , column = @Column(name = "LINE_2"))
	})
	private Address address;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
