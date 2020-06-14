package com.catolicasc.N2;

public class Category {

	private int CategoryID;
	private String CategoryName;
	private String Description;
	
	public Category() { }
	
	public Category(int CategoryID, String CategoryName, String Description) {
		this.CategoryID = CategoryID;
		this.CategoryName = CategoryName;
		this.Description = Description;
	}

	public int getCategoryID() {
		return CategoryID;
	}

	public void setCategoryID(int CategoryID) {
		this.CategoryID = CategoryID;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String CategoryName) {
		this.CategoryName = CategoryName;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	@Override
	public String toString() {
		return "Pessoa [CategoryID=" + CategoryID + ", CategoryName=" + CategoryName + ", Description=" + Description + "]";
	}
}
