package TestNgSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
//	its exception property to exit out of method so the next syso will not print 
//	though the test gets passed after writng exception
	
	String name ="tom";
	@Test (expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void divTest() {
		System.out.println("div test");
		//int i =9/0;
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj =null;
		System.out.println(obj.name);
		
		System.out.println(" finish div test");
	}

}
