package ExtentReports;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AddingScreenshotIntoReport {

	@Test
	public void addingScreenshot() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://maven.apache.org/download.cgi");
		
//		String timestamp = LocalDateTime.now().toString().replace(":","-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		String Screenshot = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/screenshot.html");
		
//		ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_reports/extentReports_"+timestamp+".html");
		
		ExtentReports eReport = new ExtentReports();
		eReport.attachReporter(spark);
		ExtentTest test= eReport.createTest("addingScreenshot");
		
		test.log(Status.INFO,"Adding Sctreenshot");
		test.addScreenCaptureFromBase64String(Screenshot);
		
		eReport.flush();
		
		driver.close();
	}
}
