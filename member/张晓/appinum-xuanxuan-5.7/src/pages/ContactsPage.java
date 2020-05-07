package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class ContactsPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public ContactsPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	public AndroidElement btn_contact(){
		return this.driver.findElementByXPath("//android.view.View[@text='联系人 第 3 个标签，共 4 个']");
	}
	public AndroidElement btn_admin(){
		return this.driver.findElementByXPath("//android.view.View[@tet='A admin [离线]']");
	}
	public AndroidElement btn_return(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='返回']");
	}
	public AndroidElement btn_enshire(){
		return this.driver.findElementByXPath("//*[@text='收藏']");
	}
	public AndroidElement btn_chat(){
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/"
				+ "android.view.View/android.view.View/android.view.View/android.view.View/"
				+ "android.view.View");
	}
	public AndroidElement et_text(){
		return this.driver.findElementByClassName("android.widget.EditText");
	}
	public AndroidElement btn_send(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='发送']");
	}
	public AndroidElement btn_enshire2(){
		return this.driver.findElementByXPath("//*[@text='收藏']");
	}
	public AndroidElement btn_data(){
		return this.driver.findElementByXPath("//*[@text='资料']");
	}
	
	public ContactsPage test_data(){
		action.click(btn_contact());
		action.click(btn_admin());
		action.click(btn_chat());
		action.click(btn_data());
		return new ContactsPage(driver);
	}
	public ContactsPage test_enshire2(){
		action.click(btn_contact());
		action.click(btn_admin());
		action.click(btn_chat());
		action.click(btn_enshire2());
		return new ContactsPage(driver);
	}
	public ContactsPage test_chatWithAdmin(String text){
		action.click(btn_contact());
		action.click(btn_admin());
		action.click(btn_chat());
		action.type(et_text(), text);
		action.click(btn_send());
		return new ContactsPage(driver);
	}
	public ContactsPage test_enshire(){
		action.click(btn_contact());
		action.click(btn_admin());
		action.click(btn_enshire());
		action.click(btn_return());
		return new ContactsPage(driver);
	}
	public ContactsPage test_checkAdmin(){
		action.click(btn_contact());
		action.click(btn_admin());
		action.click(btn_return());		
		return new ContactsPage(driver);
	}
}
