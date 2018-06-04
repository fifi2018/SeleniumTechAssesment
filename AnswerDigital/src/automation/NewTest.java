package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {

	WebDriver driver;
	
	public void test() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\phyll\\OneDrive\\Documents\\SeleniumChromeDriver");
		driver = new ChromeDriver();
		
		driver.get("www.google.co.uk");
		
		System.out.println("Successfully opened the web page");
		driver.quit();
	}
		
		
		
	}

