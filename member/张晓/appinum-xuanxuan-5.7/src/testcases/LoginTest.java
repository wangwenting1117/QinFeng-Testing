package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	LoginPage loginPage=new LoginPage(driver);
	@Test(dataProvider="login_success")
	public void login_success(String a,String b) throws Exception{
		loginPage.login(a, b);
	}
	@Test(dataProvider="login_fail")
	public void login_fail(String a,String b) throws Exception{
		loginPage.login(a,b);
	}
}
