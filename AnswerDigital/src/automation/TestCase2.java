package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		//String emptyStr = " ";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\phyll\\OneDrive\\Documents\\SeleniumChromeDriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.answerdigital.com/");
		driver.manage().window().maximize();
		
		//Open the Contact us link
		WebElement contactUsLink = driver.findElement(By.linkText("Contact Us"));
		contactUsLink.click();
		Thread.sleep(1000);
		
		WebElement name = driver.findElement(By.name("Fullname"));
		name.sendKeys("John");
		Thread.sleep(5000);
		
		WebElement email = driver.findElement(By.name("Email"));
		email.sendKeys("john.smith@email.co.uk");
		
		WebElement sendQueryBtn = driver.findElement(By.xpath("//*[@id=\"tdtop\"]/div[2]/div[1]/div[1]/form/div[2]/input")); 
		sendQueryBtn.click();
		
		WebElement query = driver.findElement(By.name("Query"));
	
		if (query == null) {
			
			System.out.println("The query box can not be left empty");
			Thread.sleep(5000);
		}
		
		driver.quit();
	}

}
