package com.timePass.dao;
import java.util.List;

import com.timePass.controller.Category;
public interface ICategoryDAO {

	public List<Category> getAllCategories();
	public Category getCategoryById(Category category);
	public List<Category> searchCateogry(Category searchCriteria);
	public boolean addCategory(Category category);
	
}
