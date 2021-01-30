package TestNgSessions;

import org.testng.annotations.Test;

public class DependsOnMethods {
// next two test got skiped because the test on which tests were dependent got failed due to exception
	@Test(priority =1)
	public void loginTest() {
		System.out.println("loginTest");
		int i =9/0;
	}
	
	@Test(priority =2, dependsOnMethods ="loginTest")
	public void homeSearchTest() {
		System.out.println("homeSearchTest");
	}
	
	@Test(priority =3, dependsOnMethods ="loginTest")
	public void homeFilterTest() {
		System.out.println("homeFilterTest");
	}
}
