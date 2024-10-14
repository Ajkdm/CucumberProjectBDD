package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.CommonCunstructor;
import hooks.Hook1;
import hooks.WebDriverManagerClass;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class YoutubeTitle //extends CommonCunstructor
{
	 public WebDriver  driver;
	
	Hook1 hk=new Hook1(driver);
	public YoutubeTitle(){}
	
	/*
	 * public YoutubeTitle(Hook1 hook) { this.driver=hook.getDriver(); }
	 */
	 
	@Given("Youtube lanched")
	public void m1()
	{
		Hook1 hk=new Hook1(driver);
		//WebDriver driver = WebDriverManagerClass.getDriver();
		driver.get("https://www.youtube.com/");
	}
	@Then("print youtube title")
	public void m2() 
	{
		Hook1 hk=new Hook1(driver);
		//WebDriver driver = WebDriverManagerClass.getDriver();
		System.out.println(driver.getTitle());
	}
}
