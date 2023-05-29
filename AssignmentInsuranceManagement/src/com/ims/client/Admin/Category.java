package com.ims.client.Admin;

import java.util.Scanner;

import com.ims.admin.dao.Impl.CategoryDaoImpl;
import com.ims.pojo.PolicyDetails;

public class Category {
	static CategoryDaoImpl cDaoImpl = new CategoryDaoImpl();
	
	public static void category()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try {
				
				System.out.println("==================================");
				System.out.println("          1) Add Category         ");
				System.out.println("          2) View Category        ");
				System.out.println("          3) Update Category      ");
				System.out.println("          4) Delete Category      ");
				System.out.println("          5) Home                 ");
				System.out.println("==================================");
				
				System.out.println("Please choose from 1 to 5: ");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1: //add category
					cDaoImpl.addCategory();
					break;
					
				case 2: // view category
					for(PolicyDetails cat : cDaoImpl.viewCategory())
					{
						System.out.println(cat.toString());
					}
					
					break;
				case 3: //update category
					System.out.println("Please enter the category ID you would like to update");
					int cID = sc.nextInt();
					cDaoImpl.updateCategory(cID);
					break;
					
				case 4: // delete category
					System.out.println("Please enter the category ID you would like to delete");
					int cIDdel = sc.nextInt();
					cDaoImpl.deleteCategory(cIDdel);
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
