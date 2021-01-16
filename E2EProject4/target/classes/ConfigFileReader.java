package Academy.resources;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public enum ConfigFileReader {
	INSTANCE;
	Properties prop;

	ConfigFileReader() {
		prop = new Properties();
		try {
			prop.load(getClass().getClassLoader().getResourceAsStream("data.properties"));
		} catch (IOException e) {
			Logger.getLogger(getClass().getName()).log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public String getBrowserName() {
		String browserName = prop.getProperty("browser");
		if (browserName != null)
			return browserName;
		else
			throw new RuntimeException("BrowserName not specified in the data.properties file.");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = prop.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait not specified in the data.properties file.");
	}

	public String getApplicationUrl() {
		String url = prop.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the data.properties file.");
	}

	public String getChromeDriverPath() {
		String chromeDriverPath = prop.getProperty("chromeDriverPath");
		if (chromeDriverPath != null)
			return chromeDriverPath;
		else
			throw new RuntimeException("chromeDriverPath not specified in the data.properties file.");
	}

	public String getFireFoxDriverPath() {
		String firefoxDriverPath = prop.getProperty("geckoDriverPath");
		if (firefoxDriverPath != null)
			return firefoxDriverPath;
		else
			throw new RuntimeException("firefoxDriverPath not specified in the data.properties file.");
	}

	public String getImageExtension() {
		String imageExtension = prop.getProperty("imageExtension");
		if (imageExtension != null)
			return imageExtension;
		else
			throw new RuntimeException("ImageExtensionType not specified in the data.properties file.");
	}

	public String getReportPath() {
		String reportPath = prop.getProperty("reportPath");
		if (reportPath != null)
			return reportPath;
		else
			throw new RuntimeException("Report folder path not specified in the data.properties file.");

	}

	public String getReportFolderName() {
		String reportFolderName = prop.getProperty("reportFolderName");
		if (reportFolderName != null)
			return reportFolderName;
		else
			throw new RuntimeException("Report folder name not specified in the data.properties file.");

	}

	public String getReportName() {
		String reportName = prop.getProperty("reportName");
		if (reportName != null)
			return reportName;
		else
			throw new RuntimeException("Report name not specified in the data.properties file.");

	}
}
