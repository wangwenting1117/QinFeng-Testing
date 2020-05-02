package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	LoginPage loginPage=new LoginPage(driver);
	@Test
	public void login_success() throws Exception{
		loginPage.login("zx01", "zhangxiao");
	}
	@Test
	public void login_fail() throws Exception{
		loginPage.login("zx01", "zh");
	}
}
