package com.ims.client.Admin;

import java.util.Scanner;

import com.ims.admin.dao.Impl.SubCategoryDaoImpl;
import com.ims.pojo.PolicyDetails;

public class SubCategory {
	static SubCategoryDaoImpl sCDaoImpl = new SubCategoryDaoImpl();
	
	public static void subCategory()
	{
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try {
				System.out.println("==================================");
				System.out.println("          1) Add Sub Category     ");
				System.out.println("          2) View Sub Category    ");
				System.out.println("          3) Update Sub Category  ");
				System.out.println("          4) Delete Sub Category  ");
				System.out.println("          5) Home                 ");
				System.out.println("==================================");
				
				System.out.println("Please choose from 1 to 5: ");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1: //add category
					sCDaoImpl.addsubCategory();
					break;
					
				case 2: // view category
					for(PolicyDetails sCat : sCDaoImpl.viewSubCategory())
					{
						System.out.println(sCat.toString());
					}
					
					break;
				case 3: //update category
					System.out.println("Please enter the Sub category ID you would like to update");
					int scID = sc.nextInt();
					sCDaoImpl.updateCategory(scID);
					break;
					
				case 4: // delete category
					System.out.println("Please enter the Sub category ID you would like to delete");
					int scIDdel = sc.nextInt();
					sCDaoImpl.deleteSubCategory(scIDdel);
					break;
					
				case 5: //home
					AdminClient.admin();
					break;
					
				default:
					System.out.println("Please choose from 1 to 5: ");

				}//end of switch
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally {}
			
		}//end of while
	}

}
