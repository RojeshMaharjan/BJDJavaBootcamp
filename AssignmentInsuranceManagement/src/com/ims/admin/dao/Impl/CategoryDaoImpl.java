package com.ims.admin.dao.Impl;

import java.util.List;
import java.util.Scanner;

import com.ims.pojo.PolicyDetails;

public class CategoryDaoImpl extends PolicyDetailsDaoImpl {
	
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void addCategory() {
		// TODO Auto-generated method stub
		try {
			System.out.println("Please enter the Category ID");
			int cID = sc.nextInt();
			System.out.println("Please enter the Category Name");
			String cName = sc.next();
			System.out.println("Please enter the Category Description");
			String cDes = sc.next();
			
			PolicyDetails category = new PolicyDetails(cID, cName, cDes);
			addCategory.add(category);
			
			System.out.println(addCategory);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {}


	}

	@Override
	public List<PolicyDetails> viewCategory() {
		// TODO Auto-generated method stub
		return addCategory;
	}

	@Override
	public void updateCategory(int cID) {
		// TODO Auto-generated method stub
		int num = 0;
		try {
			
			for(PolicyDetails k : addCategory)
			{
				if(k.getCategoryId() == cID)
				{
					System.out.println("Do you want to update 1) Category Name 2) Category Description ");
					int choice = sc.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("Please enter the new Category Name");
						String cName = sc.next();
						k.setCategoryName(cName);
						System.out.println("Category is updated");
						break;
					
					case 2:
						System.out.println("Please enter the new Category Description");
						String cDes = sc.next();
						k.setDescription(cDes);
						System.out.println("Category description is updated");
						break;
						
					default: 
						System.out.println("Do you want to update 1) Category Name 2) Category Description ");
						
					}
					num+=1;
				}
			}
			if(num == 0)
				System.out.println("Record is not found");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {}
		
	}

	@Override
	public void deleteCategory(int cID) {
		// TODO Auto-generated method stub
		int num = 0;
		try {
			
			for(PolicyDetails k : addCategory)
			{
				if(k.getCategoryId() == cID)
				{
					addCategory.remove(k);
					num += 1;
				}

			}	
			if(num ==0)
			{
				System.out.println("Record is not found");
			}
			
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}finally {}


	
	}
}