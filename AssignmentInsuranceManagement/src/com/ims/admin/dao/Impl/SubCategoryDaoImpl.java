package com.ims.admin.dao.Impl;

import java.util.List;

import com.ims.pojo.PolicyDetails;

public class SubCategoryDaoImpl extends PolicyDetailsDaoImpl {

	@Override
	public void addsubCategory() {
		// TODO Auto-generated method stub
		
		try {
			System.out.println(addCategory);
			System.out.println("Please enter the category name from above");
			String cName = sc.next();
			System.out.println("Please enter the Sub Category ID");
			int subcID = sc.nextInt();
			System.out.println("Please enter the Sub Category Name");
			String subcName = sc.next();
			System.out.println("Please enter the Sub Category Description");
			String subcDes = sc.next();
			
			PolicyDetails category = new PolicyDetails(cName, subcID, subcName, subcDes);
			addSubCategory.add(category);
			
			System.out.println(addSubCategory);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}finally {}
		
	}

	@Override
	public List<PolicyDetails> viewSubCategory() {
		// TODO Auto-generated method stub
		return addSubCategory;
	}

	@Override
	public void updateSubCategory(int sID) {
		// TODO Auto-generated method stub
		int num = 0;
		try {
			for(PolicyDetails k : addSubCategory)
			{
				if(k.getSubCategoryId() == sID)
				{
					System.out.println("Do you want to update 1) Sub Category Name 2) Sub Category Description ");
					int choice = sc.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("Please enter the new Sub Category Name");
						String subcName = sc.next();
						k.setSubCategoryName(subcName);
						System.out.println("Sub Category is updated");
						break;
					
					case 2:
						System.out.println("Please enter the new Sub Category Description");
						String subcDes = sc.next();
						k.setDescription(subcDes);
						System.out.println("Sub Category description is updated");
						break;
						
					default: 
						System.out.println("Do you want to update 1) Sub Category Name 2) Sub Category Description ");
						
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
	public void deleteSubCategory(int sID) {
		// TODO Auto-generated method stub
		int num = 0;
		try {
			for(PolicyDetails k : addSubCategory)
			{
				if(k.getSubCategoryId() == sID)
				{
					addSubCategory.remove(k);
					num += 1;
				}

			}	
			if(num ==0)
			{
				System.out.println("Record is not found");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally {}
		


	}

}
