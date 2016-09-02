package com.glsid.bookstore.model;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@Table(name="tb_payment")
public class Payment implements Serializable {

	//===================================
	//=			 Attributes				=
	//===================================
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codePayment;
	@Temporal(TemporalType.DATE)
	private Date paidDate;
	private double total;
	private String details;
	@ManyToOne
	@JoinColumn(name = "codeAccount",nullable=false)
	private Account account;

	//===================================
	//=			 Constructors		    =
	//===================================
	
	public Payment() {
		super();

	}
	
	//===================================
	//=		   Getters and Setters      =
	//===================================
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Long getCodePayment() {
		return codePayment;
	}

	public void setCodePayment(Long codePayment) {
		this.codePayment = codePayment;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}



}
