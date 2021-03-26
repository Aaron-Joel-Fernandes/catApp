package com.retail.catalog.dao.contract;

import java.util.List;

import com.retail.catalog.model.Catalog;

public interface CatalogDataServiceInterface{

    public List<Catalog> findAll();
}
