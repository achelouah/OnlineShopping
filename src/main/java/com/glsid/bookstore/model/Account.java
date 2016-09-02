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
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@Table(name="tb_account")
public class Account implements Serializable {
	
	//===================================
	//=			 Attributes				=
	//===================================
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeAccount;
	private String billingAddress;
	private boolean isClosed;
	@Temporal(TemporalType.DATE)
	private Date openDate;
	@Temporal(TemporalType.DATE)
	private Date closeDate;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="account",fetch=FetchType.LAZY)
    private Set<Payment> payments =new HashSet<Payment>() ;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="codeShoppingCart")
	private ShoppingCart shoppingCart ;
    @OneToMany(mappedBy="account",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private Set<Order> orders =new HashSet<Order>() ;;	
	
	//===================================
	//=			 Constructors		    =
	//===================================
    
	public Account() {
		super();
	}
	
	//===================================
	//=		   Getters and Setters      =
	//===================================
	
	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Set<Payment> getPayments() {
		return payments;
	}

	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}

	public String getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}

	public boolean isClosed() {
		return isClosed;
	}

	public void setClosed(boolean isClosed) {
		this.isClosed = isClosed;
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public Long getCodeAccount() {
		return codeAccount;
	}

	public void setCodeAccount(Long codeAccount) {
		this.codeAccount = codeAccount;
	}



}
