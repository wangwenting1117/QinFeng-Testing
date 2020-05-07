package base;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseTest {
	protected AndroidDriver<AndroidElement> driver;
	URL url;
	Dimension dimension;
	@BeforeClass
	public void setUp() throws Exception{
		url=new URL("http://127.0.0.1:4723/wd/hub");
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "127.0.0.1:62001");
		
		capabilities.setCapability("appPackage", "com.cnezsoft.xxm");
		capabilities.setCapability("appActivity", ".MainActivity");
		
		capabilities.setCapability("noReset", true);
		driver=new AndroidDriver<AndroidElement> (url,capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dimension=driver.manage().window().getSize();
	}
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}




















