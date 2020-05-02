package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class GroupPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public GroupPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	
	public AndroidElement btn_group(){
		return this.driver.findElementByXPath("//android.view.View[@text='������ �� 2 ����ǩ���� 4 ��']");
	}
	public AndroidElement btn_system(){
		return this.driver.findElementByXPath("//android.view.View[@text='ϵͳ ������']");
	}
	public AndroidElement btn_createGroup(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='��������']");
	}
	public AndroidElement et_text(){
		return this.driver.findElementByClassName("android.widget.EditText");
	}
	public AndroidElement btn_send(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='����']");
	}
	public AndroidElement btn_zx01(){
		return this.driver.findElementByXPath("//android.view.View[@text='Z zx01']");
	}
	public AndroidElement btn_zx03(){
		return this.driver.findElementByXPath("//android.view.View[@text='Z zx03']");
	}
	public AndroidElement btn_ok(){
		return this.driver.findElementByClassName("android.widget.Button");
	}
	public AndroidElement et_name(){
		return this.driver.findElementByXPath("//android.widget.EditText[@text='��������������']");
	}
	public AndroidElement btn_create(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='����']");
	}
	
	public HomePage test_chatSystem(String text){
		action.click(btn_group());
		action.click(btn_system());
		action.type(et_text(), text);
		action.click(btn_send());
		return new HomePage(driver);
	}
	public HomePage test_createGroup(String name){
		action.click(btn_group());
		action.click(btn_createGroup());
		action.click(btn_zx01());
		action.click(btn_zx03());
		action.click(btn_ok());
		action.type(et_name(), name);
		action.click(btn_create());
		return new HomePage(driver);
	}
}
