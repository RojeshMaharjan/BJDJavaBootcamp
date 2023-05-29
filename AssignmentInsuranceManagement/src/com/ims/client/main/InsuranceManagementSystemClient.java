package com.ims.client.main;

import java.util.Scanner;

import com.ims.admin.dao.Impl.UserDetailsDaoImpl;
import com.ims.client.Admin.AdminClient;
import com.ims.client.Customer.UserClient;
import com.ims.client.Customer.UserRegistration;

public class InsuranceManagementSystemClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetailsDaoImpl uDaoImpl = new UserDetailsDaoImpl();
		Scanner sc = new Scanner(System.in);


		while(true)
		{
			try {
				System.out.println("==============================================");
				System.out.println("                1) Admin login                ");
				System.out.println("                2) User Registration          ");
				System.out.println("	        3) User  login                ");
				System.out.println("                4) Exit                       ");
				System.out.println("==============================================");
				
				System.out.println("Please choose between 1 to 3: ");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("Please enter Admin Username: ");
					String aName = sc.next();
					System.out.println("Please enter Admin Password: ");
					String aPass = sc.next();
					boolean verify = uDaoImpl.verifyAdmin(aName, aPass);
					if(verify == true)
						AdminClient.admin();
					break;
					
				case 2:
					UserRegistration.userRegister();
					break;
					
				case 3: 
					System.out.println("Please enter User email: ");
					String uEmail = sc.next();
					System.out.println("Please enter User Password: ");
					String uPass = sc.next();
					boolean uverify = uDaoImpl.verifyUsers(uEmail, uPass);
					if(uverify == true)
						UserClient.user();
					break;
					
				case 4:
					System.out.println("Thank you for using our Insurance System.");
					System.exit(0);
					
					
				default:
					System.out.println("Please choose between 1 to 3");
					
				}//end of switch
				
				
			}catch (Exception e)
			{
				e.printStackTrace();
			}finally {}
			
			
		}//end of while

	}

}
