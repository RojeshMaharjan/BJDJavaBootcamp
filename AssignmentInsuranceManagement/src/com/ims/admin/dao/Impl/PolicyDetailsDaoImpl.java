package com.ims.admin.dao.Impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.ims.admin.dao.details.PolicyDetailsDao;
import com.ims.pojo.PolicyDetails;

public class PolicyDetailsDaoImpl implements PolicyDetailsDao {
	
	Scanner sc = new Scanner(System.in);
	static List<PolicyDetails> addPolicy = new LinkedList();
	static List<PolicyDetails> addCategory = new LinkedList();
	static List<PolicyDetails> addSubCategory = new LinkedList();


	@Override
	public void addPolicy() {
		// TODO Auto-generated method stub
		int choice = 1;
		while(choice==1 )
		{
			try {
				
				System.out.println("Please enter the Policy ID: ");
				int pPolicy = sc.nextInt();
				System.out.println("Please enter the Policy name: ");
				String pName = sc.next();
				System.out.println(addCategory);
				System.out.println("Please enter the Category from above: ");
				String pCat = sc.next();
				System.out.println(addSubCategory);
				System.out.println("Please enter the Sub Category from above: ");
				String pSubCat = sc.next();
				System.out.println("Please enter the Description: ");
				String pDes = sc.next();
				System.out.println("Please enter the Assured sum: ");
				int pSum = sc.nextInt();
				System.out.println("Please enter the Assured premium: ");
				int pPre = sc.nextInt();
				
				PolicyDetails policy = new PolicyDetails(pPolicy, pName, pCat, pSubCat, pDes, pSum, pPre);
				addPolicy.add(policy);
				
				System.out.println("Policy Added Successful.  Do you want to add more?  1) YES   2) NO");
				choice = sc.nextInt();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}


			
		}
		//int policyId, String policyName, String categoryName, String subCategoryName, String description,
		// int sumAssured, int premium)

	}

	@Override
	public List<PolicyDetails> viewPolicy() {
		// TODO Auto-generated method stub
		return addPolicy;
	}

	@Override
	public PolicyDetails viewPolicy(int pid) {
		// TODO Auto-generated method stub
		int num = 0;
		try {
			for(PolicyDetails k : addPolicy)
			{
				if(k.getPolicyId() == pid)
				{
					System.out.println(k.toString());
					num += 1; 
				}
			}
			if(num == 0)
				System.out.println("You have entered wrong policy ID");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {}
		
		return null;	

	}

	@Override
	public void updatePolicy(int pid) {
		// TODO Auto-generated method stub
		
		for(PolicyDetails k : addPolicy)
		{
			if(k.getPolicyId() == pid)
			{
				try
				{
					System.out.println("What would you like to update? 1) Policy Name 2) Category 3) Sub Category 4) Description 5) Assured Sum  6) Assured premium");
					int choice = sc.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("Please enter the Policy name: ");
						String pName = sc.next();
						k.setPolicyName(pName);
						break;
						
					case 2:
						System.out.println("Please enter the Category: ");
						String pCat = sc.next();
						k.setCategoryName(pCat);
						break;
						
					case 3:
						System.out.println("Please enter the Sub Category: ");
						String pSubCat = sc.next();
						k.setSubCategoryName(pSubCat);
						break;
						
					case 4:
						System.out.println("Please enter the Description: ");
						String pDes = sc.next();
						k.setDescription(pDes);
						break;
						
					case 5:
						System.out.println("Please enter the Assured sum: ");
						int pSum = sc.nextInt();
						k.setSumAssured(pSum);
						break;
						
					case 6:
						System.out.println("Please enter the Assured premium: ");
						int pPre = sc.nextInt();
						k.setPremium(pPre);
						break;
						
					default:
						System.out.println("What would you like to update? 1) Policy Name 2) Category 3) Sub Category 4) Description 5) Assured Sum  6) Assured premium");
						break;
					}
				}catch (Exception e)
				{
					e.printStackTrace();
				}
			}//end of if loop
		}//end of for loop
		
	}
	


	@Override
	public void deletePolicy(int pid) {
		// TODO Auto-generated method stub
		int num = 0;
		try {
			for(PolicyDetails k : addPolicy)
			{
				if(k.getPolicyId() == pid)
				{
					addPolicy.remove(k);
					System.out.println("Successful deletion of Policy");
					num += 1;
				}
			}
			if(num ==0)
				System.out.println("Invalid Policy ID");

			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {}
		
	}

	@Override
	public void addCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PolicyDetails> viewCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCategory(int cID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategory(int cID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addsubCategory() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<PolicyDetails> viewSubCategory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateSubCategory(int sid) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteSubCategory(int sid) {
		// TODO Auto-generated method stub

	}

}
