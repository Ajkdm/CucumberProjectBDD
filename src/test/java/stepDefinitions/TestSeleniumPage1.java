package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.SeleniumPage;

public class TestSeleniumPage1 
{
	WebDriver driver;
	SeleniumPage page;
	@Given("User launches selenium website with URL {string}")
	public void user_launches_selenium_website_with_url(String url) 
	{
		driver=new ChromeDriver();
		page=new SeleniumPage(driver);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("Selenium page title should be {string}")
	public void selenium_page_title_should_be(String eTitle) 
	{
		page=new SeleniumPage(driver);
		System.out.println("Page title is "+driver.getTitle());
		Assert.assertEquals(driver.getTitle(), eTitle);
	}

	@When("User clicks on download button")
	public void user_clicks_on_download_button()
	{
		page=new SeleniumPage(driver);
		page.clickOnDownloadButton();
	}

	@Then("Close the browser")
	public void close_the_browser() 
	{
		driver.close();
	}
}
