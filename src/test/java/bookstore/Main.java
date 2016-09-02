package bookstore;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.glsid.bookstore.dao.CategoryDao;
import com.glsid.bookstore.model.Category;

public class Main {

	public static void main(String[] args) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BooksStore");
	      
	      EntityManager entitymanager = emfactory.createEntityManager( );
		System.out.println("create an object dao");
		
	}

}
