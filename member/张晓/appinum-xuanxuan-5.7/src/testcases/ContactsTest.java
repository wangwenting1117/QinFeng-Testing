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
	@Test(dataProvider="contacts")
	public void test_chatWithAdmin(String a){
		contactsPage.test_chatWithAdmin(a);
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
