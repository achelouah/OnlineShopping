package com.glsid.bookstore.model;


import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "typeUser", discriminatorType = DiscriminatorType.STRING, length = 2)
@Table(name="tb_web_user")
public class WebUser implements Serializable {

	//===================================
	//=			 Attributes				=
	//===================================
	
	private static final long serialVersionUID = 1L;
	@Id
	private String codeUser;
	private String password;
	@Enumerated(EnumType.STRING)
	private UserState state;

	//===================================
	//=			 Constructors		    =
	//===================================

	public WebUser() {
		super();
	}
	
	//===================================
	//=		   Getters and Setters      =
	//===================================
	
	public String getCodeUser() {
		return codeUser;
	}

	public void setCodeUser(String codeUser) {
		this.codeUser = codeUser;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserState getState() {
		return state;
	}

	public void setState(UserState state) {
		this.state = state;
	}


}
