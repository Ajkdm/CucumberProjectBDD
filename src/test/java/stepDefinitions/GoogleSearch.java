package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.GooglePage;

public class GoogleSearch
{
	WebDriver driver;
	GooglePage page;
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser()
	{
	  driver=new ChromeDriver();
	  page=new GooglePage(driver);
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) 
	{
	   driver.get(url);
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.manage().window().maximize();
	}

	@When("User enters key word as {string}")
	public void user_enters_key_word_as(String keyWord)
	{
		page=new GooglePage(driver);
		page.sendKeyWordToSearchBox(keyWord);
		
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String expectedTitle)
	{
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
	}

	@Then("Close browser")
	public void close_browser() 
	{
	   driver.close();
	}
}
