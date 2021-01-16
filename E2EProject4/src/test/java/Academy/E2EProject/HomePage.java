package Academy.E2EProject;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Academy.pageObjects.ForgotPassword;
import Academy.pageObjects.LandingPage;
import Academy.pageObjects.LoginPage;
import Academy.resources.ConfigFileReader;


public class HomePage extends BaseTest {
	protected WebDriver driver;
	public static Logger log = LogManager.getLogger(HomePage.class.getName());

	@BeforeTest
	public void initialize() throws IOException {
		driver=initializeDriver();
		log.info("HomePage: Driver is initialised");
	}

	@Test(dataProvider = "getData")
	public void basePageNavigation(String email, String password, String text) throws IOException {

		driver.get(ConfigFileReader.INSTANCE.getApplicationUrl());
		log.info("HomePage: Navigated to Home Page");
		LandingPage objectOfLandingPage = new LandingPage(driver);
		LoginPage objectOfLoginPage = objectOfLandingPage.getLogin();
		log.info("HomePage: Successfully clicked the Login button");
		objectOfLoginPage.getEmail().sendKeys(email);
		log.info("HomePage: Successfully entered the EmailID inside Login page");
		objectOfLoginPage.getPassword().sendKeys(password);
		log.info("HomePage: Successfully entered the Password inside Login page");
		log.info(text);
		objectOfLoginPage.submit().click();
		log.info("HomePage: Successfully clicked the Submit button inside Login page");
		ForgotPassword objectOfForgotPassword = objectOfLoginPage.forgotPassword();
		objectOfForgotPassword.getEmail().sendKeys(email);
		log.info("HomePage: Successfully entered the EmailID inside Forgot Password page");
		objectOfForgotPassword.getInstructions().click();
		log.info("HomePage: Successfully clicked the Instructions button inside Forgot Password page");
	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[2][3];
		data[0][0] = "nonrestricteduser@qw.com";
		data[0][1] = "123456";
		data[0][2] = "Hello1";

		data[1][0] = "restricteduser@qw.com";
		data[1][1] = "123456";
		data[1][2] = "Hello2";
		return data;
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
