package com.retail.catalog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.catalog.dao.repository.CatalogDataSevice;
import com.retail.catalog.model.Catalog;

import java.util.List;

import javax.annotation.Resource;

import java.util.ArrayList;


@RestController
@RequestMapping("/api")
public class CatalogController {
	@Resource
	CatalogDataSevice catalogDataSevice;
	
	@RequestMapping("/getCatalog")
	public List<Catalog> getCatalog() {
		List<Catalog> catalogList= new ArrayList<Catalog>();

       catalogList= catalogDataSevice.findAll();		
       return catalogList;
	}
	
}
