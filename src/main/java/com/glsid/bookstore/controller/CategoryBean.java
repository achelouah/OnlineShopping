package com.glsid.bookstore.controller;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.jboss.logging.Logger;

import com.glsid.bookstore.dao.CategoryDao;
import com.glsid.bookstore.dao.ICategoryDao;
import com.glsid.bookstore.model.Category;



@ManagedBean(name="CategoryBean",eager = true)
@ApplicationScoped
public class CategoryBean {
	private Logger log = Logger.getLogger(CategoryBean.class);
	@PersistenceContext(unitName="BooksStore")
	private EntityManager em ;
  //  private CategoryDao dao =new CategoryDao();
	@Inject
	private ICategoryDao dao ;
	private String name ;
	public String getName() {
		return name;
	}
  
	public void setName(String name) {
		this.name = name;
	}

	public void addCategory()
	{
		/*CategoryDao dao =new CategoryDao();
		*/
		/*if(em==null)
		{
			log.info("em is null");
		}*/
		name="bonjour ayoube ";
		
		Category cat =new Category();
		cat.setCategoryName("Jsf");
		if(em!=null)
		{
			log.info("em is not null ");
			dao.addCategory(cat);
		}
		for(Category cate :dao.getAllCategories())
		{
			log.info("category name : "+cate.getCategoryName());
		}
       //  dao.addCategory(cat);
		System.out.println("saved !");

		
	}
}
