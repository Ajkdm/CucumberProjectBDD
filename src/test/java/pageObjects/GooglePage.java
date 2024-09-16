package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage 
{	public WebDriver driver;

	public GooglePage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@class='gLFyf']")
	@CacheLookup
	private WebElement searchBox;
	
	public void sendKeyWordToSearchBox(String keyWord) 
	{
		searchBox.clear();
		searchBox.sendKeys(keyWord);
		searchBox.sendKeys(Keys.ENTER);
	}
	
	
	
}
