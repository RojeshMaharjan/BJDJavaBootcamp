package com.ims.admin.dao.Impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.ims.admin.dao.details.UserDetailsDAO;
import com.ims.pojo.UserList;

public class UserDetailsDaoImpl implements UserDetailsDAO {
	Scanner sc = new Scanner(System.in);
	static List<UserList> addUsers = new LinkedList();    //only one instance of a static member exists, even if you create multiple objects of the class

	
	
	@Override
	public void addUsers() {
		// TODO Auto-generated method stub
		int k = 1;
		while(k==1)
		{
			try {
				System.out.print("Please enter user ID: ");
				int uid = sc.nextInt();
				System.out.print("Please enter user's name: ");
				String uname= sc.next();
				System.out.print("Please enter user's address: ");
				String uadd = sc.next();
				System.out.print("Please enter user's phone: ");
				Long uphone = sc.nextLong();
				System.out.print("Please enter user's email: ");
				String uemail = sc.next();
				System.out.print("Please enter user's password: ");
				String upass = sc.next();
				//	public UserList(int uid, String uname, String uaddress, long uphone, String uemail, String upassword)
				UserList ulist = new UserList(uid,uname, uadd, uphone,uemail,upass);
				addUsers.add(ulist);
				System.out.println("User added successfully. Do you want to add another user?   1) Yes  2) No");
				k = sc.nextInt();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally {}
		}

	}

	@Override
	public List<UserList> viewAllUsersInfo() {
		// TODO Auto-generated method stub
		return addUsers;
	}

	@Override
	public boolean verifyUsers(String email, String password) {
		// TODO Auto-generated method stub
		
		/*
		private String uemail;
		private String upassword;
		public String getUemail() {
			return uemail;
		}
		public String getUpassword() {
			return upassword;
		}
		*/
		int num = 0;
		try {
			
			for(UserList k: addUsers)  //going through each list
			{
				if((k.getUemail().equals(email)) && (k.getUpassword().equals(password)))
				{
					num +=1;
					return true;
				}
				else if ((k.getUemail().equals(email)) || (k.getUpassword().equals(password)))
				{
					System.out.println("You have put wrong username or password");
					return false;
				}
	
			}
		if(num ==0)
			System.out.println("You are invalid user");


			
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}finally {}
		
		return false;	
	
	}

	@Override
	public boolean verifyAdmin(String aemail, String apassword) {
		// TODO Auto-generated method stub
		
	
		//public static String adminEmail = "admin";
		//public static String adminPass = "admin";
		
		if(UserList.adminEmail.equals(aemail) && UserList.adminPass.equals(apassword))
		{
			System.out.println("You are verified as an admin");
			return true;
		}
		else
			System.out.println("You have put invalid username/password for admin");
			return false;
		
	}

	@Override
	public String getPassword(String uemail) {
		// TODO Auto-generated method stub
		int num = 0;
		
		try {
			for(UserList k : addUsers)
			{
				if(k.getUemail().equals(uemail))
				{
					num +=1;
					return k.getUpassword();
					
				}
			}
			if (num==0)
				System.out.println("You have inputted wrong email");

			
		}catch (Exception e)
		{
			e.printStackTrace();
		}finally {}
		
		return null;
		
	}

	@Override
	public List<UserList> policyActivate(String uemail, int upolicyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserList> policyRequest(String uemail, int upolicyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserList> policyCancel(String uemail, int upolicyId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void policyRequestList()
	{
		
	}
	
	public void policyActiveUserList()
	{
		
	}
	
	public void policycancelUserList()
	{
		
	}

}
