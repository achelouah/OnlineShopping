package com.glsid.bookstore.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@Table(name = "tb_line_item")
public class LineItem implements Serializable {
	
	//===================================
	//=			 Attributes				=
	//===================================

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "code_line_item")
    private int id ;
	private static final long serialVersionUID = 1L;
	private double quantity;
	private double price;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "codeShoppingCart")
	private ShoppingCart shoppingCart;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "codeOrder")
	private Order order;
	@OneToMany(mappedBy="lineItem",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private Set<Book> books =new HashSet<Book>();
	//===================================
	//=			 Constructors		    =
	//===================================
	
	public LineItem() {
		super();

	}
	
	//===================================
	//=		   Getters and Setters      =
	//===================================
	
	
	public double getQuantity() {
		return quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Set<Book> getBooks() {
		return books;
	}

	public void setBooks(Set<Book> books) {
		this.books = books;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
