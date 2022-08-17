package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {

	public static ExtentReports report;
	public static ExtentReports getReport() {
	String path= System.getProperty("user.dir")+"\\Report\\index.html";
	ExtentSparkReporter exrepo=new ExtentSparkReporter(path);
	exrepo.config().setDocumentTitle("Do Well");
	exrepo.config().setReportName("Shekhar");
	exrepo.config().setTheme(Theme.DARK);
	
	ExtentReports report=new ExtentReports();
	report.attachReporter(exrepo);
	report.setSystemInfo("Owner", "Me");
	report.setSystemInfo("Tester", "Shekhar");
	return report;
	
	}
}
