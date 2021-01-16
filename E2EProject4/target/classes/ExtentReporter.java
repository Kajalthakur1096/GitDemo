package Academy.resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {
	static ExtentReports objectOfExtentReports;

	public static ExtentReports getReportObject() {
		String pathOfReport = ConfigFileReader.INSTANCE.getReportPath()
				+ ConfigFileReader.INSTANCE.getReportFolderName() + ConfigFileReader.INSTANCE.getReportName();
		ExtentSparkReporter objectOfExtentSparkReporter = new ExtentSparkReporter(pathOfReport);

		objectOfExtentSparkReporter.config().setReportName(ConstantReader.getReportName());
		objectOfExtentSparkReporter.config().setDocumentTitle(ConstantReader.getDocumentTitle());
		objectOfExtentReports = new ExtentReports();
		objectOfExtentReports.attachReporter(objectOfExtentSparkReporter);
		objectOfExtentReports.setSystemInfo(ConstantReader.getTesterInfo(), ConstantReader.getTesterName());
		return objectOfExtentReports;
	}
}
