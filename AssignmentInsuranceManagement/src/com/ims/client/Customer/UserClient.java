package com.ims.client.Customer;

import java.util.Scanner;

import com.ims.admin.dao.Impl.PolicyDetailsDaoImpl;
import com.ims.client.main.InsuranceManagementSystemClient;
import com.ims.pojo.PolicyDetails;

public class UserClient {
	static PolicyDetailsDaoImpl pDDaoImpl = new PolicyDetailsDaoImpl();
	
	public static void user()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try
			{
				System.out.println("        1) View List of Category      ");
				System.out.println("        2) View list of Sub Category  ");
				System.out.println("        3) View Policy           ");		
				System.out.println("        4) Apply your Policy           ");
				System.out.println("        5) Home                       ");

				
				System.out.println("Please choose from option 1 to 5 ");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:    //View List of Category
					for(PolicyDetails policy : pDDaoImpl.viewCategory())
					{
						System.out.println(policy.toString());
					}
					break;
					
				case 2:		//View list of Sub Category
					for(PolicyDetails policy : pDDaoImpl.viewSubCategory())
					{
						System.out.println(policy.toString());
					}
					break;
					
				case 3:		//View for policy
					for(PolicyDetails policy : pDDaoImpl.viewPolicy())
					{
						System.out.println(policy.toString());
					}
					break;
					
				case 4:		//Apply for policy

					break;
					
				case 5:		//Home
					InsuranceManagementSystemClient.main(null);
					break;
					
				default:
					System.out.println("Please choose from option 1 to 6 ");
				
				}//end of switch
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally
			{
				
			}
	
		}//end of while 
	}
	

}
