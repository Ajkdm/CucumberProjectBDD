package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class GmailTest 
{
	WebDriver driver;
	@Given("launch gmail")
	public void m1() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
}
