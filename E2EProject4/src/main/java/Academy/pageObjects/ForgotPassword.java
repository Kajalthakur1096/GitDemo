package Academy.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword extends BasePage  {
	
	By email = By.id("user_email");
	By instructionButton= By.cssSelector("[type='submit']");


	public ForgotPassword(WebDriver driver) {
		// TODO Auto-generated constructor stub0
		this.driver=driver;
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}

	public WebElement getInstructions() {
		return driver.findElement(instructionButton);

	}
}
