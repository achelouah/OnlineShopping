package com.glsid.bookstore.model;


import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "tb_order")
public class Order implements Serializable {

	// ===================================
	// =            Attributes           =
	// ===================================

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long numberOrder;
	@Temporal(TemporalType.DATE)
	private Date dateOrder;
	@Temporal(TemporalType.DATE)
	private Date dateShipped;
	private String shipToAddress;
	private double total;
	@Enumerated(EnumType.STRING)
	private OrderStatus status;
	@ManyToOne
	@JoinColumn(name = "codeAccount", nullable = false)
	private Account account;
	@OneToMany(mappedBy="order",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    private Set<LineItem> lineOfItems =new HashSet<LineItem>();
	// ===================================
	// =          Constructors           =
	// ===================================

	public Order() {
		super();

	}

	// ===================================
	// =       Getters and Setters       =
	// ===================================

	public Account getAccount() {
		return account;
	}

	public Set<LineItem> getLineOfItems() {
		return lineOfItems;
	}

	public void setLineOfItems(Set<LineItem> lineOfItems) {
		this.lineOfItems = lineOfItems;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Long getNumberOrder() {
		return numberOrder;
	}

	public void setNumberOrder(Long numberOrder) {
		this.numberOrder = numberOrder;
	}

	public Date getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}

	public Date getDateShipped() {
		return dateShipped;
	}

	public void setDateShipped(Date dateShipped) {
		this.dateShipped = dateShipped;
	}

	public String getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

}
