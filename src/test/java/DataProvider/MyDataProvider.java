package DataProvider;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
	@DataProvider(name="DP1")
	public Object[][] dataProvider1() throws Exception{
	Object[][] dp = new Object[][] {
		{"admin","123456"},
		{"admin","123456"}
	};
	return dp;
}
}
