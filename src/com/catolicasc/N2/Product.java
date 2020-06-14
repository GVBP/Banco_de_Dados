package com.catolicasc.N2;

public class Product {

	private int ProductID;
	private String ProductName;
	private int CategoryID;
	private int QuantityPerUnit;
	private float UnitPrice;
	
	public Product() { }
	
	public Product(int ProductID, String ProductName, int CategoryID, int QuantityPerUnit, float UnitPrice) {
		this.ProductID = ProductID;
		this.ProductName = ProductName;
		this.CategoryID = CategoryID;
		this.QuantityPerUnit = QuantityPerUnit;
		this.UnitPrice = UnitPrice;
	}

	public int getProductID() {
		return ProductID;
	}

	public void setProductID(int ProductID) {
		this.ProductID = ProductID;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String ProductName) {
		this.ProductName = ProductName;
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int CategoryID) {
		this.CategoryID = CategoryID;
	}
	
	public int getQuantityPerUnit() {
		return QuantityPerUnit;
	}

	public void setQuantityPerUnit(int QuantityPerUnit) {
		this.QuantityPerUnit = QuantityPerUnit;
	}
	
	public float getUnitPrice() {
		return UnitPrice;
	}

	public void setUnitPrice(float UnitPrice) {
		this.UnitPrice = UnitPrice;
	}

	@Override
	public String toString() {
		return "Pessoa [ProductID=" + ProductID + ", ProductName=" + ProductName + ", CategoryID=" + CategoryID + ", QuantityPerUnit=" + QuantityPerUnit + ", UnitPrice=" + UnitPrice + "]";
	}
}
