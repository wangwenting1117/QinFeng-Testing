package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class HomePage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public HomePage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	public AndroidElement btn_system(){
		return this.driver.findElementByXPath("//android.view.View[@text='ϵͳ ������']");
	}
	public AndroidElement btn_choseOne(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='��������']");
	}
	public AndroidElement et_text(){
		return this.driver.findElementByClassName("android.widget.EditText");
	}
	public AndroidElement btn_send(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='����']");
	}
	public AndroidElement btn_zx01(){
		return this.driver.findElementByXPath("//android.view.View[@text='Z zx01 [����]']");
	}
	public AndroidElement btn_admin(){
		return this.driver.findElementByXPath("//android.view.View[@text='ϵͳ ������']");
	}
	public AndroidElement btn_return(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='����']");
	}
	public AndroidElement btn_menu(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='��ʾ�˵�']");
	}
	public AndroidElement btn_enshire(){
		return this.driver.findElementByXPath("//android.view.View[@text='�ղ�']");
	}
	public AndroidElement btn_notEnshire(){
		return this.driver.findElementByXPath("//android.view.View[@text='ȡ���ղ�']");
	}
	public AndroidElement btn_members(){
		return this.driver.findElementByXPath("//android.view.View[@text='��Ա�б�']");
	}
	public AndroidElement btn_rename(){
		return this.driver.findElementByXPath("//android.view.View[@text='������']");
	}
	public AndroidElement et_name(){
		return this.driver.findElementByXPath("//android.widget.EditText[@text='ϵͳ, ϵͳ']");
	}
	public AndroidElement btn_ok(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='������']");
	}
	public AndroidElement btn_cancel(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='ȡ��']");
	}
	public AndroidElement btn_syncMessage(){
		return this.driver.findElementByXPath("//android.view.View[@text='ͬ���������Ϣ']");
	}
	
	public HomePage test_syncMessage(){
		action.click(btn_system());
		action.click(btn_menu());
		action.click(btn_syncMessage());
		return new HomePage(driver);
	}
	public HomePage test_renameOk(String name){
		action.click(btn_system());
		action.click(btn_menu());
		action.click(btn_rename());
		et_name().clear();
		action.type(et_name(), name);
		action.click(btn_ok());
		return new HomePage(driver);
	}
	public HomePage test_renameCancel(){
		action.click(btn_system());
		action.click(btn_menu());
		action.click(btn_rename());
		action.click(btn_cancel());
		return new HomePage(driver);
	}
	public HomePage test_members(){
		action.click(btn_system());
		action.click(btn_menu());
		action.click(btn_members());
		return new HomePage(driver);
	}
	public HomePage test_enshire(){
		action.click(btn_system());
		action.click(btn_menu());
		action.click(btn_enshire());
		action.click(btn_return());
		//�鿴�Ƿ����Ǳ�
		action.click(btn_system());
		action.click(btn_menu());
		action.click(btn_notEnshire());
		action.click(btn_return());
		//�鿴�Ǳ���ȡ��
		return new HomePage(driver);
	}
	public HomePage test_chatWithAll(String text){
		action.click(btn_system());
		action.type(et_text(), text);
		action.click(btn_send());
		return new HomePage(driver);
	}
	public HomePage test_chatWithSomeone(String text){
		action.click(btn_choseOne());
		action.click(btn_zx01());
		action.type(et_text(), text);
		action.click(btn_send());
		action.click(btn_return());
		action.click(btn_admin());
		action.type(et_text(), text);
		action.click(btn_send());
		return new HomePage(driver);
	}
}
