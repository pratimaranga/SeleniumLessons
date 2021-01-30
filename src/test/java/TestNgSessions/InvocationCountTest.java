package TestNgSessions;

import org.testng.annotations.Test;

public class InvocationCountTest {
//invocationCount gives the count that how many times the test will run. such types of
//	tests used for API to check the load
//	in UI automation we dont use invocationCount generally
	
	@Test(invocationCount =10)
	public void loginTest() {
		System.out.println("loginTest");
		int i =9/0;
	}
}
