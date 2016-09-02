package com.glsid.bookstore.model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@DiscriminatorValue("AD")
public class Administrator extends WebUser {
	
	//===================================
	//=			 Attributes				=
	//===================================

	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private String email;

	
	//===================================
	//=			 Constructors		    =
	//===================================
	
	public Administrator() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



}
