package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.ContactsPage;

public class ContactsTest extends BaseTest{
	ContactsPage contactsPage=new ContactsPage(driver);
	@Test
	public void test_checkAdmin(){
		contactsPage.test_checkAdmin();
	}
	@Test
	public void test_enshire(){
		contactsPage.test_enshire();
	}
	@Test
	public void test_chatWithAdmin(){
		contactsPage.test_chatWithAdmin("ceshi");
	}
	@Test
	public void test_enshire2(){
		contactsPage.btn_enshire2();
	}
	@Test
	public void test_data(){
		contactsPage.test_data();
	}
}
