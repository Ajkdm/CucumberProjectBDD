package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseClass 
{
	public  WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<>();
	
	//@Parameters("Browsers")
	//@BeforeClass
	public WebDriver launchBrowser(String browser) 
	{
		if(browser.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new EdgeDriver());
		}
		
		getDriver().manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
		
	}
	
	public static synchronized WebDriver getDriver() 
	{
		return tlDriver.get();
	}
}
