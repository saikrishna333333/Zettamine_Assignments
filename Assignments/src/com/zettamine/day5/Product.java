package com.zettamine.day5;

import java.io.Serializable;

public class Product implements Serializable{
	private int productid;
	private String productname;
	public Product(int productid, String productname) {
		super();
		this.productid = productid;
		this.productname = productname;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	
	

}
