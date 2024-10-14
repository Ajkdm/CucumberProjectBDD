package hooks;

import org.openqa.selenium.WebDriver;

public class WebDriverManagerClass 
{
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driver) {
        WebDriverManagerClass.driver.set(driver);
    }
}
