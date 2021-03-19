package com.retail.catalog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.catalog.model.Catalog;
import com.retail.catalog.model.Category;

import java.util.List;
import java.util.ArrayList;


@RestController
public class CategoryController {

	@RequestMapping("getCategories")
	public List<Category> getCatgories()
	{
		List<Category> categoryList= new ArrayList<>();
		Category parentOne= new Category(1, "Appliances", "this is are appliances in the store", "/image1", true, 0,0, 1);
		Category parentTwo= new Category(2, "Beauty", "this is are beauty products in the store", "/image2", true, 0,0, 2);
		Category parentThree= new Category(3, "Home", "this is are home producs in the store", "/image3", true, 0,0, 1);
		Category parentFour= new Category(4, "Cloths", "this is are cloths in the store", "/image4", true, 0,0, 2);
		
		categoryList.add(parentOne);
		categoryList.add(parentTwo);
		categoryList.add(parentThree);
		categoryList.add(parentFour);
		return categoryList;
	}
}
