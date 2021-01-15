package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Academy.pageObjects.LandingPage;
import Academy.resources.ConfigFileReader;


public class ValidateNavBar extends BaseTest {
	protected WebDriver driver;
	public static Logger log = LogManager.getLogger(ValidateNavBar.class.getName());

	@BeforeTest
	public void initialize() throws IOException {	
		driver=initializeDriver();
		log.info("ValidateNavBar: Driver is initialised");
		driver.get(ConfigFileReader.INSTANCE.getApplicationUrl());
		log.info("ValidateNavBar: Navigated to Home Page");
	}

	@Test
	public void validateNavigationBar() throws IOException {
		LandingPage objectOfLandingPage = new LandingPage(driver);
		Assert.assertTrue(objectOfLandingPage.getNavBar().isDisplayed());
		log.info("ValidateNavBar: Successfully validated NavBar");
	}
	
	@Test
	public void getval(){
		System.out.println("Hello getval");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
