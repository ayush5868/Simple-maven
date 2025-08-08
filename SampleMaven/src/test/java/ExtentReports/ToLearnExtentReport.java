package ExtentReports;

import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {

	@Test
	public void createReport() {
		
		
		//Step1: Create ExtentSparkReporter object
		 ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentreport.html");
		 
		 //Step2: Create ExtentReports object
		 ExtentReports eReport = new ExtentReports();
		 
		//Step3: Create ExtentSparkReporter to ExtentReports
		 eReport.attachReporter(spark);
		 
		//Step4: Create ExtentTest object
		 ExtentTest Test =eReport.createTest("createReport");
		 
			//Step5: Call log(Status, "Message")
		 Test.log(Status.PASS, "log Message added into Report");
		 
		 //step6: call flush
		 eReport.flush(); 
		 
	}
}
