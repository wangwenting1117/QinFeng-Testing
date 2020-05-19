package edu.pages;

import edu.utils.BaseAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

//192.168.1.2:11443
public class XuanxuanPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public XuanxuanPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action = new BaseAction(driver);
	}
	//登录
	public AndroidElement service() {
		return this.driver.findElementByXPath
				("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]");
	}
	
	public AndroidElement edit_username() {
		return this.driver.findElementByXPath
				("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]");
	}

	public AndroidElement edit_password() {
		return this.driver.findElementByXPath
				("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[3]");
	}

	public AndroidElement btn_submit() {
		return this.driver.findElementByXPath("//*[@text='登录']");
	}
	
	//聊天
	public AndroidElement chat() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]");
	}
	
	//发送消息
	public AndroidElement sendkeysclick() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	public AndroidElement sendkeys() {
		return this.driver.findElementByClassName("android.widget.EditText");
	}
	public AndroidElement send() {
		return this.driver.findElementByClassName("android.widget.Button");
	}
	//收藏联系人
	public AndroidElement three() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	public AndroidElement sc() {
		return this.driver.findElementByXPath("//*[@text='收藏']");
	}
	//取消收藏
	public AndroidElement canclesc() {
		return this.driver.findElementByXPath("//*[@text='取消收藏']");
	}
	//资料
	public AndroidElement zl() {
		return this.driver.findElementByXPath("//*[@text='资料']");
	}
	//同步最近消息
	public AndroidElement tb() {
		return this.driver.findElementByXPath("//*[@text='同步最近的消息']");
	}
	//返回
	public AndroidElement back() {
		return this.driver.findElementByXPath("//*[@text='返回']");
	}
	//"+"创建聊天
	public AndroidElement plus() {
		return this.driver.findElementByXPath("//*[@text='创建聊天']");
	}//和xyx3创建聊天
	public AndroidElement xyx3() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[5]");
	}
	public AndroidElement ok() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]");
	}
	//聊天发送图片
	public AndroidElement picture() {
		return this.driver.findElementByXPath("//*[@text='发送其他内容']");
	}
	public AndroidElement picture1() {
		return this.driver.findElementByXPath("//*[@text='照片']");
	}
	public AndroidElement picture2() {
		return this.driver.findElementByXPath("//*[@text='拍照']");
	}
	public AndroidElement choicePicture2() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView");
	}
	//多人讨论组
	public AndroidElement person1() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]");
	}
	public AndroidElement person2() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[3]");
	}
	public AndroidElement person3() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View/android.view.View[5]");
	}
	public AndroidElement ManypersonName() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText");
	}
	public AndroidElement createName() {
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText/android.widget.Button[2]");
	}
	
	
	public void loginSuccess(String service, String username,String password) {
		action.type(service(), service);
		action.type(edit_username(),username);
		action.type(edit_password(), password);
		action.click(btn_submit());
	}
	
	public String loginFail(String service, String username,String password) {
		action.type(service(), service);
		action.type(edit_username(),username);
		action.type(edit_password(), password);
		action.click(btn_submit());
		return action.getToast();
	}
	
	public void sendChat(String sendkeys) throws InterruptedException {
		action.click(chat());
		Thread.sleep(3000);
		action.click(sendkeysclick());
		//action.type(sendkeys(), sendkeys);
		Thread.sleep(3000);
		action.click(send());
	}
	public void choiceAndcancle() {
		action.click(chat());
		action.click(three());
		action.click(sc());
		action.click(three());
		action.click(canclesc());
		action.click(three());
		action.click(zl());
		action.click(sc());
		action.click(sc());
		action.click(back());
		action.click(three());
		action.click(tb());
		action.click(back());
	}
	public void createChat() throws InterruptedException {
		action.click(plus());
		action.click(back());
		action.click(plus());
		action.click(xyx3());
		action.click(ok());
		action.click(sendkeysclick());
		//action.type(sendkeysclick(), message);
		action.click(picture());
		action.click(picture1());
//		action.click(choicePicture());
//		action.click(choicePicture1());
		Thread.sleep(3000);
		action.click(choicePicture2());
		action.click(back());
		//action.click(send());
	}
	public void createManychat(String name){
		action.click(plus());
		action.click(person1());
		action.click(person2());
		action.click(person3());
		action.click(ok());
		action.type(ManypersonName(), name);
		action.click(createName());
	}


}
