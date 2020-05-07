package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GroupPage;

public class GroupTest extends BaseTest{
	GroupPage groupPage=new GroupPage(driver);
	@Test(dataProvider="group")
	public void test_chatSystem(String a){
		groupPage.test_chatSystem(a);
	}
	@Test(dataProvider="group")
	public void test_createGroup(String a){
		groupPage.test_createGroup(a);
	}
}
