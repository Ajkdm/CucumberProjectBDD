package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumPage
{
	public WebDriver driver;
	public SeleniumPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[text()='Downloads']")
	private WebElement downloadButton;
	
	public void clickOnDownloadButton() 
	{
		downloadButton.click();
	}
}
