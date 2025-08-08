package Bikes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfieldTest {


	@Test
	public void launch() {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.royalenfield.com/in/en/home/");
		Reporter.log("RoyalEnfieldTest Class executed", true);
	}
	
}
