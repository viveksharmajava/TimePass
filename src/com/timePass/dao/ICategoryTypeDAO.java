package com.timePass.dao;

import java.util.List;

import com.timePass.controller.CategoryType;

public interface ICategoryTypeDAO {
	public List<CategoryType> getAllCategories();
	public CategoryType getCategoryTypeById(CategoryType CategoryType);
	public List<CategoryType> searchCateogry(CategoryType searchCriteria);
	public boolean addCategoryType(CategoryType CategoryType);
}
