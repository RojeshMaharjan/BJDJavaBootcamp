package com.ims.client.Admin;

import java.util.Scanner;

import com.ims.admin.dao.Impl.UserDetailsDaoImpl;
import com.ims.client.main.InsuranceManagementSystemClient;
import com.ims.pojo.UserList;

public class AdminClient 
{
	static UserDetailsDaoImpl uDaoImpl = new UserDetailsDaoImpl();
	
	public static void admin() {
		Scanner sc = new Scanner(System.in);
		
	
		while(true)
		{
			try {
				System.out.println("        1) View User list      		  ");
				System.out.println("        2) Category            		  ");
				System.out.println("        3) SubCategory         		  ");
				System.out.println("        4) Policy                     ");
				System.out.println("        5) Buyer policy request       ");
				System.out.println("        6) Home                       ");
				
				System.out.println("Please choose from option 1 to 6 ");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:    //View User list
					for(UserList user: uDaoImpl.viewAllUsersInfo())
					{
						System.out.println(user.toString());
					}
					break;
					
				case 2:		//Category
					Category.category();
					break;
					
				case 3:		//SubCategory
					SubCategory.subCategory();
					break;
					
				case 4:		//policy
					Policy.policy();
					break;
					
				case 5:		//buyer policy request
					
					break;
					
				case 6:		//admin home
					InsuranceManagementSystemClient.main(null);
					break;
					
				default:
					System.out.println("Please choose from option 1 to 6 ");
				
				}//end of switch
				

			}catch(Exception e)
			{
				e.printStackTrace();
			}finally {}
			
		}//end of while 
	}
	


}
