package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy(xpath = "//button[@class='css-eMVmlR' and contains(text(),'Log in')]")
	@FindBy(xpath = "//button[text()='Log in']")
	WebElement loginButton;
	

	public void clickLoginButton() throws InterruptedException {
		loginButton.click();
		Thread.sleep(10000);

	}

}
