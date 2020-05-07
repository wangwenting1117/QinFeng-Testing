package dataprovider;

import org.testng.annotations.DataProvider;

public class GroupData {

	@DataProvider(name="group")
	public Object[] data(){
		return new Object[] {"123","测试","ceshi","!$#@%$^","   ",""};
	}
}
