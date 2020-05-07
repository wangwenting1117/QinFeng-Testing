package dataprovider;

import org.testng.annotations.DataProvider;

public class LoginData {

	@DataProvider(name="login_success")
	public Object[][] data1(){
		return new Object[][] {{"zx01","zhangxiao"},{"zx02","zhangxiao"}};
	}
	@DataProvider(name="login_fail")
	public Object[][] data2(){
		return new Object[][] {{"z01","zhangxiao"},{"zx01","zhang"},{"","zhangxiao"},
			{"zx01",""},{"",""}};
	}

}
