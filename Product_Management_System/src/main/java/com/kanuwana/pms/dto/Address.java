package main.java.com.kanuwana.pms.dto;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Represent the location address.
 * @author skanuwana
 *
 */
@Embeddable
public class Address {

	@Column (name="ADD_1")
	private String addressLine1;
	@Column (name="ADD_2")
	private String addressLine2;
	@Column (name="CITY")
	private String city;
	@Column (name="STATE")
	private String state;
	@Column (name="ZIP_CODE")
	private String zipcode;
	
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
