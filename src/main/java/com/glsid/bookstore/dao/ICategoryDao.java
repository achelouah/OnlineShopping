package com.glsid.bookstore.dao;

import java.util.List;
import java.util.Set;

import com.glsid.bookstore.model.Category;


public interface ICategoryDao {
  Category addCategory(Category category);
  void deleteCategory(Long codeCategory);
  List<Category> getAllCategories();
  Category updateCategory(Category category);
  
}
