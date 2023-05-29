package com.ims.pojo;

public class PolicyDetails {
	
	//create what will go into policies/category/subcatagory/description
	
	private int categoryId;
	private String categoryName;
	private int subCategoryId;
	private String subCategoryName;
	private String description;
	private int policyId;
	private String policyName;
	private int sumAssured;
	private int premium;
	
	
	public PolicyDetails() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PolicyDetails(int categoryId, String categoryName, String description) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.description = description;

	}


	public PolicyDetails(String categoryName, int subCategoryId, String subCategoryName, String description) {
		super();
		this.categoryName = categoryName;
		this.subCategoryId = subCategoryId;
		this.subCategoryName = subCategoryName;
		this.description = description;
	}


	public PolicyDetails( int policyId, String policyName, String categoryName, String subCategoryName, String description,
			int sumAssured, int premium) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.categoryName = categoryName;
		this.subCategoryName = subCategoryName;
		this.description = description;
		this.sumAssured = sumAssured;
		this.premium = premium;
	}


	public PolicyDetails(String policyName, String categoryName, String subCategoryName, String description,
			int sumAssured, int premium) {
		super();
		this.policyName = policyName;
		this.categoryName = categoryName;
		this.subCategoryName = subCategoryName;
		this.description = description;
		this.sumAssured = sumAssured;
		this.premium = premium;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public int getSubCategoryId() {
		return subCategoryId;
	}


	public void setSubCategoryId(int subCategoryId) {
		this.subCategoryId = subCategoryId;
	}


	public String getSubCategoryName() {
		return subCategoryName;
	}


	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getPolicyId() {
		return policyId;
	}


	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}


	public String getPolicyName() {
		return policyName;
	}


	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}


	public int getSumAssured() {
		return sumAssured;
	}


	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}


	public int getPremium() {
		return premium;
	}


	public void setPremium(int premium) {
		this.premium = premium;
	}


	@Override
	public String toString() {
		
		if(this.categoryId !=0)
		{
			return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", description=" + description +"]";
		}
		else if(this.subCategoryId !=0)
		{
			return "SubCategory [subCategoryId="+ subCategoryId + ", subCategoryName=" + subCategoryName + ", description=" + description +"]";
		}
		else if(this.policyId !=0)
		{
			return "Policy [policyId=" + policyId + ",categoryName=" + categoryName + ", subCategoryName=" + subCategoryName + ", policyName=" + policyName + ", sumAssured=" + sumAssured + ", premium=" + premium +"]";
			
		}
		else
			return "Invalid Policy Details";
		
	}
	
	
	

}
