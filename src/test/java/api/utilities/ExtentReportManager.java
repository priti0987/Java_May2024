package api.utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestResult;

import org.testng.ITestContext;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{

	public ExtentSparkReporter sparkRepoerter;
	public ExtentReports extent;
	public ExtentTest test;
	
	String repName;
	
	public void onStart(ITestContext testContest) {
		
		String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName ="Test-Report-"+timestamp+".html";
		
		sparkRepoerter = new ExtentSparkReporter(".\\reports\\"+repName);
		
		sparkRepoerter.config().setDocumentTitle("RestAssureAutomationProject");
		sparkRepoerter.config().setReportName("Pet Store");
		sparkRepoerter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkRepoerter);
		extent.setSystemInfo("Application","Pest Store Users API");
		extent.setSystemInfo("Operating System", System.getProperty("os.name"));
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Envirnoment", "QA");
		extent.setSystemInfo("User","Priti Fuse");
			
	}
	public void onTestSuccess(ITestResult result)
	{

		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		test.log(Status.PASS,"Test Pass");
		
	}
	
	public void onTestFail(ITestResult result) {
		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		test.log(Status.FAIL,"Test Failed");
		test.log(Status.FAIL, result.getThrowable().getMessage());

	}

	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.createNode(result.getName());
		test.log(Status.SKIP,"Test Skipped");
		test.log(Status.SKIP, result.getThrowable().getMessage());

	}

	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
}
