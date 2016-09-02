package com.glsid.bookstore.model;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */
@Entity
@Table(name = "tb_book")
public class Book implements Serializable {

	//===================================
	//=			 Attributes				=
	//===================================

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeBook;
	private String bookTitle;
	private String autor;
	private String ISBN;
	private String description;
	private double price;
	@ManyToOne
	@JoinColumn(name="codeLineItem")
    private LineItem lineItem ;
	@ManyToOne
	@JoinColumn(name="codeCategory")
	private Category category ;
	//===================================
	//=		   Getters and Setters      =
	//===================================
	
	public LineItem getLineItem() {
		return lineItem;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public void setLineItem(LineItem lineItem) {
		this.lineItem = lineItem;
	}

	public Long getCodeBook() {
		return codeBook;
	}

	public void setCodeBook(Long codeBook) {
		this.codeBook = codeBook;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	//===================================
	//=			 Constructors		    =
	//===================================

	public Book() {
		super();

	}

}
