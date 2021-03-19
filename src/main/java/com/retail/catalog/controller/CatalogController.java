package com.retail.catalog.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.catalog.model.Catalog;

import java.util.List;
import java.util.ArrayList;


@RestController
public class CatalogController {

	@RequestMapping("getCatalog")
	public List<Catalog> getCatalog() {
		List<Catalog> catalogList= new ArrayList();
		Catalog catalogOne= new Catalog();
		catalogOne.setCatalogId(1);
		catalogOne.setCatalogName("winter");
		catalogOne.setDescription("this is winter catalog");
		catalogOne.setRank(1);
		catalogOne.setType(1);
		Catalog catalogTwo= new Catalog();
		catalogTwo.setCatalogId(2);
		catalogTwo.setCatalogName("summer");
		catalogTwo.setDescription("this is summer catalog");
		catalogTwo.setRank(2);
		catalogTwo.setType(2);
		Catalog catalogThree= new Catalog();
		catalogThree.setCatalogId(3);
		catalogThree.setCatalogName("All season");
		catalogThree.setDescription("this is all season catalog");
		catalogThree.setRank(3);
		catalogThree.setType(3);
		catalogList.add(catalogOne);
		catalogList.add(catalogTwo);
		catalogList.add(catalogThree);
		return catalogList;
	}
	
}
