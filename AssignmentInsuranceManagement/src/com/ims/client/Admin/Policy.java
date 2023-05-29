package com.ims.client.Admin;

import java.util.Scanner;

import com.ims.admin.dao.Impl.PolicyDetailsDaoImpl;
import com.ims.pojo.PolicyDetails;

public class Policy {
	
	static PolicyDetailsDaoImpl pDDaoImpl = new PolicyDetailsDaoImpl();
	
	public static void policy()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			try {
				
				System.out.println("==================================");
				System.out.println("          1) Add Policy           ");
				System.out.println("          2) View Policy          ");
				System.out.println("          3) Update Policy        ");
				System.out.println("          4) Delete Policy        ");
				System.out.println("          5) Home                 ");
				System.out.println("==================================");
				
				System.out.println("Please choose from 1 to 5: ");
				int choice = sc.nextInt();
				
				switch(choice)
				{
				case 1: //add category
					pDDaoImpl.addPolicy();
					break;
					
				case 2: // view category
					for(PolicyDetails pol : pDDaoImpl.viewPolicy())
					{
						System.out.println(pol.toString());
					}
					
					break;
				case 3: //update category
					System.out.println("Please enter the Policy ID you would like to update");
					int pID = sc.nextInt();
					pDDaoImpl.updatePolicy(pID);
					break;
					
				case 4: // delete category
					System.out.println("Please enter the policy ID you would like to delete");
					int pIdd = sc.nextInt();
					pDDaoImpl.deletePolicy(pIdd);
					break;
					
				case 5: //home
					AdminClient.admin();
					break;
					
				default:
					System.out.println("Please choose from 1 to 5: ");

				
				}//end of switch
			}catch (Exception e)
			{
				e.printStackTrace();
			}finally {}
			
		}//end of while
		
	}

}
