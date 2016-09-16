package com.orgHRM.Testsuit;

import java.io.IOException;

import com.orgHRM.master.orgMaster;

public class orgHrmSuite {

	public static void main(String[] args) throws IOException 
	{
		orgMaster om=new orgMaster();
		//Login TC
		String res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Launch App "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login App "+res);
		
		res=om.org_Logout();
		System.out.println("Logout App "+res);
		
		om.org_Close();
		
		//Empreg Test
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Launch App "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login App "+res);
		
		res=om.org_Empreg("VenkiCh123", "VenkiCh");
		System.out.println("Emp Registration "+res);
		
		res=om.org_Logout();
		System.out.println("Logout App "+res);
		
		om.org_Close();
		
		//userregTC
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Launch App "+res);
		
		res=om.org_Login("Admin", "admin");
		System.out.println("Login App "+res);
		
		res=om.org_Userreg("VenkiCh123 VenkiCh", "VenkiCh1234", "VenkiCh1234", "VenkiCh1234");
		System.out.println("User registration "+res);
		
		res=om.org_Logout();
		System.out.println("Logout App "+res);
		
		om.org_Close();
		
		//UserloginTC
		
		res=om.org_Launch("http://orangehrm.qedgetech.com");
		System.out.println("Launch App "+res);
		
		res=om.org_Login("VenkiCh1234", "VenkiCh1234");
		System.out.println("User Login  "+res);
		
		res=om.org_Logout();
		System.out.println("Logout App "+res);
		
		om.org_Close();

	}

}
