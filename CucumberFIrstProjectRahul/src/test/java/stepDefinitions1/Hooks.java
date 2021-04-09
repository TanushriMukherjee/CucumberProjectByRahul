package stepDefinitions1;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	@Before("@MobileTest")
	public void BeforeMobValidation() {
		System.out.println("Before Mobile Test cases");
	}
	
	@After("@MobileTest")
	public void AfterMobValidation() {
		System.out.println("After Mobile Test cases");
	}
	
	@Before("@WebTest")
	public void BeforeWebValidation() {
		System.out.println("Before Web Test cases");
	}
	
	@After("@WebTest")
	public void AfterWebValidation() {
		System.out.println("After Web Test cases");
	}
}
