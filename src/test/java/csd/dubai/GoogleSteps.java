package csd.dubai;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.TestCase;

public class GoogleSteps extends TestCase {
	  private WebDriver driver;
	  private String baseUrl;
	@Given("^\"([^\"]*)\" enter \"([^\"]*)\" in \"([^\"]*)\"$")
	public void enter_in(String arg1, String arg2, String arg3) throws Throwable {
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
	    if(arg3.equals("Google"))
	    {
	    		baseUrl = "https://www.google.ae/";
	    }
	    	driver.get(baseUrl + "/?gfe_rd=cr&ei=5dcfWd_kNIfv8Afh7434Bg&gws_rd=ssl");
	    driver.findElement(By.id("lst-ib")).clear();
	    driver.findElement(By.id("lst-ib")).sendKeys(arg2);
	    
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Given("^Browser is \"([^\"]*)\"$")
	public void browser_is(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@When("^click on google search$")
	public void click_on_google_search() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.findElement(By.id("_fZl")).click();
	}

	@Then("^Google status bar should display search count more than (\\d+)$")
	public void google_status_bar_should_display_search_count_more_than(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String result = driver.findElement(By.id("ResultStats")).getAttribute("value");
		assertEquals(arg1, Integer.parseInt(result));
	}
}
