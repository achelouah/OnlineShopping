package com.glsid.bookstore.model;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@Table(name="tb_shopping_cart")
public class ShoppingCart implements Serializable {

	//===================================
	//=			 Attributes				=
	//===================================
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeShoppingCart;
	@Temporal(TemporalType.DATE)
	private Date creationDate;
	@OneToMany(mappedBy="shoppingCart",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<LineItem> lineOfItems =new HashSet<LineItem>();
	
	//===================================
	//=			 Constructors		    =
	//===================================
	public ShoppingCart() {
		super();
	}
	//===================================
	//=		   Getters and Setters      =
	//===================================
	
	public Long getCodeShoppingCart() {
		return codeShoppingCart;
	}

	public Set<LineItem> getLineOfItems() {
		return lineOfItems;
	}

	public void setLineOfItems(Set<LineItem> lineOfItems) {
		this.lineOfItems = lineOfItems;
	}

	public void setCodeShoppingCart(Long codeShoppingCart) {
		this.codeShoppingCart = codeShoppingCart;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}



}
