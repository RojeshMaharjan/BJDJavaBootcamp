package com.ims.admin.dao.details;

import java.util.List;

import com.ims.pojo.UserList;

public interface UserDetailsDAO {
	
	public void addUsers();
	public List<UserList> viewAllUsersInfo();
	public boolean verifyUsers(String uemail, String upassword);
	public boolean verifyAdmin(String uemail, String upassword);
	public String getPassword(String uemail);
	public List<UserList> policyActivate(String uemail, int upolicyId);
	public List<UserList> policyRequest(String uemail, int upolicyId);
	public List<UserList> policyCancel(String uemail, int upolicyId);

}

