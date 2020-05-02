package testcases;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.MyPage;

public class MyTest extends BaseTest{
	MyPage myPage=new MyPage(driver);
	@Test
	public void test_zhuxiao(){
		myPage.test_zhuxiao();
	}
	@Test
	public void test_persionalItem() throws Exception{
		myPage.test_persionalItem();
	}
	@Test
	public void test_close(){
		myPage.test_close();
	}
	@Test
	public void test_user(){
		myPage.test_user();
	}
}
