package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomeTest extends BaseTest{
	HomePage homePage=new HomePage(driver);
	@Test(dataProvider="home")
	public void test_chatWithAll(String a){
		homePage.test_chatWithAll(a);
	}
	@Test(dataProvider="home")
	public void test_chatWithSomeone(String a){
		homePage.test_chatWithSomeone(a);
	}
	@Test
	public void test_enshire(){
		homePage.test_enshire();
	}
	@Test
	public void test_members(){
		homePage.test_members();
	}
	@Test(dataProvider="home")
	public void test_renameOk(String a){
		homePage.test_renameOk(a);
	}
	@Test
	public void test_renameCancel(){
		homePage.test_renameCancel();
	}
	@Test
	public void test_syncMessage(){
		homePage.test_syncMessage();
	}
}
