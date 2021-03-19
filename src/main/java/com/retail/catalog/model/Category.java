package com.retail.catalog.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

public class Category {
	private int categoryId;
	private String  categoryName;
	private String categoryDescription;
	private String categoryImage;
	private boolean topCategory;
	private int  parentCategoryId;
	private double type;
	private int rank;
	
	public Category(int id,String  name,String description,String image,boolean topCategory,int  parentCategoryId,double type,int rank) 
	{
		this.categoryId=id;
		this.categoryImage=name;
		this.categoryDescription=description;
		this.categoryImage= image;
		this.topCategory=topCategory;
		this.parentCategoryId=parentCategoryId;
		this.type=type;
		this.rank=rank;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public String getCategoryImage() {
		return categoryImage;
	}
	public void setCategoryImage(String categoryImage) {
		this.categoryImage = categoryImage;
	}
	public boolean isTopCategory() {
		return topCategory;
	}
	public void setTopCategory(boolean topCategory) {
		this.topCategory = topCategory;
	}
	public int getParentCategoryId() {
		return parentCategoryId;
	}
	public void setParentCategoryId(int parentCategoryId) {
		this.parentCategoryId = parentCategoryId;
	}
	public double getType() {
		return type;
	}
	public void setType(double type) {
		this.type = type;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
}
