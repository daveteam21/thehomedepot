package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BrowserHelper;

public class HomePage {
	WebDriver driver;

	@FindBy(id = "headerMyAccountTitle") // <- need to declare it
	public WebElement myAccount;
	@FindBy(xpath = "//*[@id=\"SPSOSignIn\"]/a/span")
	public WebElement signinButton;


	public HomePage() {
		driver = BrowserHelper.driver;
		PageFactory.initElements(driver, this); // <- use this in a same class name>
	}

	public void loadPage() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL != "https://www.homedepot.com/") {  // <- this way it will not reload the page twice. only if the url is not the same page>
			driver.get("https://www.homedepot.com/");
		}
	}
}


