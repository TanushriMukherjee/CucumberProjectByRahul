package stepDefinitions1;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
	WebDriver driver;
	
	
	@Given("^User is on Greencart Landing Page$")
	public void user_is_on_Greencart_Landing_Page() throws Throwable {
        System.setProperty("webdriver.driver.chrome", "C:\\Tanu Docs\\TS\\AUTOMATION PRACTICE\\AllDownloadedFiles\\chromedriver75_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
    }

    @When("^User searched for \"([^\"]*)\" vegetable$")
    public void user_searched_for_something_vegetable(String strArg1) throws Throwable {
      driver.findElement(By.xpath("//input[@type='search']")).sendKeys(strArg1);
      driver.findElement(By.cssSelector("button.search-button")).click();
    }

    @Then("^\"([^\"]*)\" results are displayed$")
    public void something_results_are_displayed(String strArg1) throws Throwable {
    	Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
    }

}