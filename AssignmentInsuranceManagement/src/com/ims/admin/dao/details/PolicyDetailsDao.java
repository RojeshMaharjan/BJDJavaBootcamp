package com.ims.admin.dao.details;

import java.util.List;

import com.ims.pojo.PolicyDetails;

public interface PolicyDetailsDao {
	
	public void addPolicy();
	List<PolicyDetails> viewPolicy();
	PolicyDetails viewPolicy(int pid);
	public void updatePolicy(int pid);
	public void deletePolicy(int pid);
	
	public void addCategory();
	List<PolicyDetails> viewCategory();
	public void updateCategory(int cID);
	public void deleteCategory(int cID);
	
	public void addsubCategory();
	List<PolicyDetails> viewSubCategory();
	public void updateSubCategory(int sID);
	public void deleteSubCategory(int sID);

}
