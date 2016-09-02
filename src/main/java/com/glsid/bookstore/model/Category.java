package com.glsid.bookstore.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */

@Entity
@Table(name = "tb_category")
@NamedQuery(name = "Find_All_Categories", query = "SELECT c FROM Category c")
public class Category implements Serializable {

	// ===================================
	// = Attributes =
	// ===================================

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codeCategory;
	private String categoryName;
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<Book>();

	// ===================================
	// = Constructors 					 =
	// ===================================

	public Category() {
		super();

	}

	// ===================================
	// = 	   Getters and Setters       =
	// ===================================

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Long getCodeCategory() {
		return codeCategory;
	}

	public void setCodeCategory(Long codeCategory) {
		this.codeCategory = codeCategory;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
