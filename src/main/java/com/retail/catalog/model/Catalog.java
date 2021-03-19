package com.retail.catalog.model;

public class Catalog {
private int catalogId;
private String  catalogName;
private String description;
private double type;
private int rank;
public int getCatalogId() {
	return catalogId;
}
public void setCatalogId(int catalogId) {
	this.catalogId = catalogId;
}
public String getCatalogName() {
	return catalogName;
}
public void setCatalogName(String catalogName) {
	this.catalogName = catalogName;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
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
