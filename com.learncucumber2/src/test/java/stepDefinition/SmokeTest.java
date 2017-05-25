package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class SmokeTest {
	
	WebDriver driver;
	
	@Given("^Open chrome and star application$")
	public void open_chrome_and_star_application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String uname) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

		driver.findElement(By.id("email")).sendKeys(uname);
	}

	@When("^Pongo enter a valid \"([^\"]*)\"$")
	public void pongo_enter_a_valid(String pass) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.findElement(By.id("pass")).sendKeys(pass);
	}

	@Then("^User should be able to login succesfully$")
	public void user_should_be_able_to_login_succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  
		driver.quit();
	}
}
