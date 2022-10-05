package Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listner implements ITestListener {
	
	ExtentReports report= ExtentReportGenerator.getReport();
	ThreadLocal<ExtentTest> extentTest =new ThreadLocal<ExtentTest>();
	@Override
	public void onTestStart(ITestResult result) {
		Library.test=report.createTest(result.getClass().getName()+"=="+result.getMethod().getMethodName());
		extentTest.set(Library.test);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
	extentTest.get().log(Status.PASS, "Pass");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		extentTest.get().log(Status.FAIL, "Fail");
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.get().log(Status.SKIP, "Skip");	}
	@Override
	public void onFinish(ITestContext context) {
	report.flush();
	}
	
	
}
