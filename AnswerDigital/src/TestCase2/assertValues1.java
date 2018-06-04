package TestCase2;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import junit.framework.Assert;
import org.testng.Assert;
import static junit.framework.Assert.assertEquals;

public class assertValues1 {
  WebDriver driver;
  
	@Before
	private void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\phyll\\OneDrive\\Documents\\SeleniumChromeDriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.answerdigital.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	private void whatWeAreAbout() throws InterruptedException {
		
		//Opens the who are we link
		WebElement whoAreWe = driver.findElement(By.partialLinkText("Who are"));
		whoAreWe.click();
		Thread.sleep(5000);
		
		WebElement str1 = driver.findElement(By.xpath("//*[@id=\"tdtop\"]/div[2]/div[3]/div/h3"));
		Assert.assertTrue(str1.equals("What we're about"));
		System.out.println("Passed");
         driver.quit();
	}
	
    
	
} 




