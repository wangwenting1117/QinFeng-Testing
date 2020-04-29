package base;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.HomePage;

public class BaseTest {

	URL url;
	protected AndroidDriver<AndroidElement> driver;
	
	@BeforeMethod
	public void startUp() throws  MalformedURLException {
		url = new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName", "2dea82a4");
		cap.setCapability("appPackage", "com.cnezsoft.xxm");
		cap.setCapability("appActivity", ".MainActivity");
		
		cap.setCapability("noReset", "true");
		driver = new AndroidDriver<AndroidElement>(url, cap);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	}
}
