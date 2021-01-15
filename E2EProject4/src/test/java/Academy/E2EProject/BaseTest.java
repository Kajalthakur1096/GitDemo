package Academy.E2EProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Academy.resources.ConfigFileReader;
import Academy.resources.ConstantReader;

public class BaseTest {
	protected WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		String browserName = ConfigFileReader.INSTANCE.getBrowserName();
		if (browserName.equals(ConstantReader.getChromeBrowser())) {
			// Code to set chrome driver
			System.setProperty("webdriver.chrome.driver", ConfigFileReader.INSTANCE.getChromeDriverPath());
			driver = new ChromeDriver();

		} else if (browserName.equals(ConstantReader.getFirefoxBrowser())) {
			// Code to set firefox driver
			System.setProperty("webdriver.gecko.driver", ConfigFileReader.INSTANCE.getFireFoxDriverPath());
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(ConfigFileReader.INSTANCE.getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}

	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {

		TakesScreenshot objectOfScreenshot = (TakesScreenshot) driver;
		File screenshotFileSource = objectOfScreenshot.getScreenshotAs(OutputType.FILE);
		String destinationFile = ConfigFileReader.INSTANCE.getReportPath()
				+ ConfigFileReader.INSTANCE.getReportFolderName() + testCaseName
				+ ConfigFileReader.INSTANCE.getImageExtension();
		FileUtils.copyFile(screenshotFileSource, new File(destinationFile));
		return destinationFile;

	}
}
