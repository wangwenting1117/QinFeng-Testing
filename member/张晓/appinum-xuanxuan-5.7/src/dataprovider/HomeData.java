package dataprovider;

import org.testng.annotations.DataProvider;

public class HomeData {
	@DataProvider(name="home")
	public Object[] data(){
		return new Object[] {"123","测试","ceshi","!$#@%$^","   ",""};
	}
}

