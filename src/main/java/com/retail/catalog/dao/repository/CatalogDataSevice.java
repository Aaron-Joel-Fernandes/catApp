package com.retail.catalog.dao.repository;

import java.util.List;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.retail.catalog.dao.contract.CatalogDataServiceInterface;
import com.retail.catalog.dao.mapper.CatalogRowMapper;
import com.retail.catalog.model.Catalog;
@Repository
public class CatalogDataSevice implements CatalogDataServiceInterface{
private NamedParameterJdbcTemplate template;


public CatalogDataSevice(NamedParameterJdbcTemplate template) {  
        this.template = template;  
} 

@Override
public List<Catalog> findAll() {
	// TODO Auto-generated method stub
	
	return template.query("select * from catalog", new CatalogRowMapper());
}





}
