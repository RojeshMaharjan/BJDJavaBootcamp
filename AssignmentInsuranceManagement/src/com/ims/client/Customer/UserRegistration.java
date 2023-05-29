package com.ims.client.Customer;

import java.util.Scanner;

import com.ims.admin.dao.Impl.UserDetailsDaoImpl;
import com.ims.client.main.InsuranceManagementSystemClient;

public class UserRegistration {
	
	static UserDetailsDaoImpl uDaoImpl = new UserDetailsDaoImpl();
	
	public static void userRegister()
	{
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			try {
				System.out.println("==================================");
				System.out.println("          1) Register new User    ");
				System.out.println("          2) Forgot password      ");
				System.out.println("          3) Home                 ");
				System.out.println("==================================");
				
				System.out.println("Please choose between 1 to 3: ");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					uDaoImpl.addUsers();
					break;
					
				case 2:
					System.out.println("Please enter the user email");
					String uemail = sc.next();
					if (uDaoImpl.getPassword(uemail) != null)
					{
						System.out.println("The password is" +uDaoImpl.getPassword(uemail));
					}
					break;
				
				case 3:
					InsuranceManagementSystemClient.main(null);
					break;
					
				default:
					System.out.println("Please choose between 1 to 3: ");
					
				}//end of switch
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}finally {}
			

		}//end of while
		
	}

}
