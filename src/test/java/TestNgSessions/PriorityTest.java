package TestNgSessions;

import org.testng.annotations.Test;

public class PriorityTest {
    /**its not necessary to write pre conditions and post condition all the time
	 test will run in alphabetical order
	if tests and tests with priority are run, test will run in alphabetical order first and 
	than prioprity tests will run
	if two or more tests have same priority than among them  also test will run in alphabetical order
	we can give 0, +ive and -gitve priority also, test will start  running from -negitve priority first,
	though in general practice we donot give negative and zero priority
	*/
	@Test(priority =1)
	public void a_Test() {
		System.out.println("a test ");
	}
	
	@Test (priority =0)
	public void b_Test() {
		System.out.println("b test ");
	}
	
	@Test(priority =2)
	public void c_Test() {
		System.out.println("c test ");
	}
	
	@Test
	public void d_Test() {
		System.out.println("d test ");
	}
	
		
	@Test(priority =3)
	public void e_Test() {
		System.out.println("e test ");
	}	
		
	@Test(priority = -1)
	public void f_Test() {
		System.out.println("f test ");
	}
			
	@Test(priority = -2)
	public void g_Test() {
		System.out.println("g test ");
	}
	
	@Test
	public void h_Test() {
		System.out.println("h test ");
	}
	
	@Test
	public void i_Test() {
		System.out.println("i test ");
	}
	
}
