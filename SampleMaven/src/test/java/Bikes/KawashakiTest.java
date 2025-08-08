package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class KawashakiTest {

	@Test
	public void launch() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.kawasaki-india.com/");
		Reporter.log("KawashakiTest Class executed", true);
	}
	
}
