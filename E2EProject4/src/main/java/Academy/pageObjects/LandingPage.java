package Academy.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	

	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}

	public LoginPage getLogin() {

		driver.findElement(signin).click();
		return new LoginPage(driver);
	}

	public WebElement getTitle() {
		//String txt=driver.findElement(title).getText();
		//System.out.println(txt);
		return driver.findElement(title);
	}

	public WebElement getNavBar() {
		return driver.findElement(NavBar);

	}
}
