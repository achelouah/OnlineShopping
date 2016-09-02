package com.glsid.bookstore.model;


import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@DiscriminatorValue("CU")
public class Customer extends WebUser {
	
	//===================================
	//=			 Attributes				=
	//===================================

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String address;
	private String email;
	private String phone;
	private String creditCardInfo;
	@OneToOne(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	@JoinColumn(name="codeAccount")
    private Account account ;
	
	//===================================
	//=			 Constructors		    =
	//===================================

	public Customer() {
		super();
	}
	
	//===================================
	//=		   Getters and Setters      =
	//===================================
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCreditCardInfo() {
		return creditCardInfo;
	}

	public void setCreditCardInfo(String creditCardInfo) {
		this.creditCardInfo = creditCardInfo;
	}


}
