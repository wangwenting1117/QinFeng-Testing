package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.BaseAction;

public class MyPage {
	private AndroidDriver<AndroidElement> driver;
	BaseAction action;
	
	public MyPage(AndroidDriver<AndroidElement> driver) {
		this.driver=driver;
		this.action=new BaseAction(driver);
	}
	public AndroidElement btn_my(){
		return this.driver.findElementByXPath("//*[@text='�ҵ�']");
	}
	public AndroidElement btn_zhuxiao(){
		return this.driver.findElementByXPath("//*[@text='ע��']");
	}
	public AndroidElement btn_ok(){
		return this.driver.findElementByXPath("//*[@text='ȷ��']");
	}
	public AndroidElement btn_meanu(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='��ʾ�˵�']");
	}
	public AndroidElement btn_about(){
		return this.driver.findElementByXPath("//android.view.View[@text='����']");
	}
	public AndroidElement btn_persional(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='��˽����']");
	}
	public AndroidElement btn_close(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='�ر�']");
	}
	public AndroidElement btn_user(){
		return this.driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/"
				+ "android.widget.LinearLayout/android.widget.FrameLayout/android.view.View/"
				+ "android.view.View/android.view.View/android.view.View/android.view.View[2]/"
				+ "android.view.View/android.view.View[1]/android.view.View");
	}
	public AndroidElement btn_return(){
		return this.driver.findElementByXPath("//android.widget.Button[@text='����']");
	}
	
	public void test_zhuxiao(){
		action.click(btn_my());
		action.click(btn_zhuxiao());
		action.click(btn_ok());
	}
	public void test_persionalItem() throws Exception{
		action.click(btn_my());
		action.click(btn_meanu());
		action.click(btn_about());
		action.click(btn_persional());
		Thread.sleep(10000);
	}
	public void test_close(){
		action.click(btn_my());
		action.click(btn_meanu());
		action.click(btn_about());
		action.click(btn_close());
	}
	public void test_user(){
		action.click(btn_my());
		action.click(btn_user());
		action.click(btn_return());
	}
}
