package Academy.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage  {
	
	By email = By.id("user_email");
	By password = By.id("user_password");
	By login = By.cssSelector("input[type='submit']");
	By forgotpassword= By.cssSelector("[href*='password/new']"); //regular expression

	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub0
		this.driver=driver;
	}

	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getPassword() {
		return driver.findElement(password);
	}

	public WebElement submit() {
		return driver.findElement(login);

	}
	public ForgotPassword forgotPassword() {
		driver.findElement(forgotpassword).click();;
		return new ForgotPassword(driver);

	}
}
