package com.glsid.bookstore.dao;



import java.util.List;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagementType;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import org.apache.log4j.Logger;
import com.glsid.bookstore.model.Category;

/**
 * 
 * @author Errabi Ayoub
 * @email errabi.ayoub@gmail.com
 */

@Singleton
@TransactionManagement(TransactionManagementType.CONTAINER)
public class CategoryDao implements ICategoryDao {
	//===================================
	//=			 Attributes				=
	//===================================
	private final String UNIT_NAME="BooksStore";
	@PersistenceContext(unitName = UNIT_NAME, type = PersistenceContextType.TRANSACTION)
	private EntityManager em;
	private Logger log = Logger.getLogger(CategoryDao.class);
	//===================================
	//=			 Constructors		    =
	//===================================
	public CategoryDao() {
		super();

	}
	
	//===================================
	//=		CRUD Database Operations	=
	//===================================
	
	public Category addCategory(Category category) {
		em.persist(category);
		log.info("CategoryDao : Object persisted.");
		return category;
	}

	@Override
	public void deleteCategory(Long codeCategory) {
		Category category = em.find(Category.class, codeCategory);
		if(category!=null)
		{
			em.remove(category);
			log.info("CategoryDao : Object was removed.");
		}

	}

	@Override
	public List<Category> getAllCategories() {
		Query query = em.createNamedQuery("Find_All_Categories");
		List<Category> categories = query.getResultList();
		return categories;
	}

	@Override
	public Category updateCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

}
