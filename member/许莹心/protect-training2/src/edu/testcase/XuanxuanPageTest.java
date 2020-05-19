package edu.testcase;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import edu.base.BaseTest;
import edu.pages.XuanxuanPage;;

public class XuanxuanPageTest extends BaseTest {
	
	@Test
	public void testloginSuccess() {
		XuanxuanPage xuanxuanPage=new XuanxuanPage(driver);
		xuanxuanPage.loginSuccess("http://192.168.1.2:11443", "admin","123456");
		Assert.assertEquals(this.driver.currentActivity(), "com.example.todolist.MainActivity:");
	}

	@Test
	public void testloginFail() {
		XuanxuanPage xuanxuanPage=new XuanxuanPage(driver);
		String actResult=xuanxuanPage.loginFail("192.168.1.3", "aaa","3");
		Assert.assertEquals(actResult, "用户名或者密码错误");
	}
	
	@Test
	public void testsendChat() throws InterruptedException {
		XuanxuanPage xuanxuanPage=new XuanxuanPage(driver);
		//xuanxuanPage.sendKeys("hello");
	}
	//收藏、取消收藏、资料、同步消息
	@Test
	public void testchoiceAndcancle() {
		XuanxuanPage xuanxuanPage=new XuanxuanPage(driver);
		xuanxuanPage.choiceAndcancle();
	}
	
	@Test
	public void testcreateChat() throws InterruptedException {
		XuanxuanPage xuanxuanPage=new XuanxuanPage(driver);
		xuanxuanPage.createChat();
	}
	@Test
	public void testcreateManychat() throws InterruptedException {
		XuanxuanPage xuanxuanPage=new XuanxuanPage(driver);
		xuanxuanPage.createManychat("friends");
	}
	
	
}
