package dataprovider;

import org.testng.annotations.DataProvider;

public class ContactsData {

	@DataProvider(name="contacts")
	public Object[] data(){
		return new Object[] {"123","测试","ceshi","!$#@%$^","   ",""};
	}
}
