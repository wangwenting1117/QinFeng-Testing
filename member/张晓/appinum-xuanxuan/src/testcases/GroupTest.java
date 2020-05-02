package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.GroupPage;

public class GroupTest extends BaseTest{
	GroupPage groupPage=new GroupPage(driver);
	@Test
	public void test_chatSystem(){
		groupPage.test_chatSystem("zx");
	}
	@Test
	public void test_createGroup(){
		groupPage.test_createGroup("zx");
	}
}
