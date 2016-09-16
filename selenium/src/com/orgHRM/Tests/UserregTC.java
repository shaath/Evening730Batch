package com.orgHRM.Tests;

import java.io.IOException;

import com.orgHRM.master.orgMaster;

public class UserregTC 
{
	public static void main(String[] args) throws IOException
	{
		orgMaster om=new orgMaster();
		
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Launch App "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login App "+res);
		
		res=om.org_Userreg("VenkiCh VenkiCh", "VenkiCh123", "VenkiCh123", "VenkiCh123");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Logout App "+res);
		
		om.org_Close();

	}

}
