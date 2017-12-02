package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC001_CreateLead extends ProjectMethods{
	@BeforeClass
	public void setData() {
		dataSheetName = "Create";
		testCaseName = "TC001_CreateLead";
		testDescription = "To Test Login and LogOut";
		category= "Smoke";
		authors	="saravanan";
		browserName ="chrome";
	}

	@Test(dataProvider="fetchData")
	public void logInLogOut(String uName,String pwd,String companyname,String fname,String lname,String sid,String verifyname ) {

		new LoginPage(driver, test)
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogin()
		.clicklink()
		//clickleads()
		.clickcreatelead()
	
		.enterCompanyname(companyname)
		.enterfirstname(fname)
		.enterlastname(lname)
		.entersourceid(sid)
		.clickCreateLeadPage()
		.Verifyname(verifyname);








	}

}
