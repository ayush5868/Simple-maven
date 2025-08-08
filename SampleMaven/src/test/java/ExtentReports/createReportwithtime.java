package ExtentReports;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class createReportwithtime {
	@Test
	public void createReport() {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		
		ExtentSparkReporter spark   = new ExtentSparkReporter("./HTML_reports/extentReports_"+timestamp+".html");
		
		ExtentReports ereports  =new ExtentReports();
		
		ereports.attachReporter(spark);
		
		ExtentTest test = ereports.createTest("createReport");
		
		test.log(Status.PASS, "message added into reports");
		
		ereports.flush();
	}

}