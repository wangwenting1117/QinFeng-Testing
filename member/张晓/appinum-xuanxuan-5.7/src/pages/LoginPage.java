package pages;

import utils.BaseAction;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LoginPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public LoginPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	public AndroidElement et_name(){
//		return driver.findElementsByClassName("android.widget.EditText").get(1);
		return driver.findElementByXPath("//*[@text='zx01']");
	}
	public AndroidElement et_pwd(){
//		return driver.findElementsByClassName("android.widget.EditText").get(2);
		return driver.findElementByXPath("//*[@text='zhangxiao']");
	}
	public AndroidElement btn_submit(){
		return driver.findElementByXPath("//*[@text='µÇÂ¼']");
	}
	public void login(String name,String pwd) throws Exception{
		et_name().clear();
		et_pwd().clear();
		Thread.sleep(3000);
		action.type(et_name(), name);
		action.type(et_pwd(), pwd);
		action.click(btn_submit());
	}
}
