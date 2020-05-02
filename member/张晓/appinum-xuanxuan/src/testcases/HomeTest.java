package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;

public class HomeTest extends BaseTest{
	HomePage homePage=new HomePage(driver);
	@Test
	public void test_chatWithAll(){
		homePage.test_chatWithAll("01");
	}
	@Test
	public void test_chatWithSomeone(){
		homePage.test_chatWithSomeone("02");
	}
	@Test
	public void test_enshire(){
		homePage.test_enshire();
	}
	@Test
	public void test_members(){
		homePage.test_members();
	}
	@Test
	public void test_renameOk(){
		homePage.test_renameOk("okkkk");
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
