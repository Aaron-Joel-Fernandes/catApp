package com.retail.catalog.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.retail.catalog.model.Catalog;

public class CatalogRowMapper implements RowMapper<Catalog>{

	@Override
	public Catalog mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		Catalog catalog= new Catalog();
		catalog.setCatalogId(rs.getInt("catalogId"));
		catalog.setCatalogName(rs.getString("catalogName"));
		catalog.setDescription(rs.getString("description"));
		catalog.setType(rs.getInt("type"));
		catalog.setRank(rs.getInt("rank"));
		return catalog;
	}

}
