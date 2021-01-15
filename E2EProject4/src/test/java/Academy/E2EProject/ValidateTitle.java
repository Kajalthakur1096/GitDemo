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
import Academy.resources.ConstantReader;


public class ValidateTitle extends BaseTest {
	protected WebDriver driver;
	public static Logger log = LogManager.getLogger(ValidateTitle.class.getName());
	

	@BeforeTest
	public void initialize() throws IOException {	
		driver=initializeDriver();	
		log.info("ValidateTitle: Driver is initialised");
		log.info("ValidateTitle: Navigated to Home Page");
		driver.get(ConfigFileReader.INSTANCE.getApplicationUrl());
	}

	@Test
	public void validateTitleOfHomePage() throws IOException {
		LandingPage objectOfLandingPage = new LandingPage(driver);		
		Assert.assertEquals(objectOfLandingPage.getTitle().getText(), ConstantReader.getHomepageTitle());
		log.info("ValidateTitle: Successfully validated the title");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
