package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.SeleniumPage;

public class ParallelTest extends BaseClass
{
	SeleniumPage page;
	//WebDriver driver;
	
	@Given("launch selenium website with URL {string}")
	public void m1(String url) 
	{
		//driver=new ChromeDriver();
		page=new SeleniumPage(driver);
		driver.get(url);
	}
	
	@Then("click on download button")
	public void m2() 
	{
		page=new SeleniumPage(driver);
		page.clickOnDownloadButton();
	}
}
