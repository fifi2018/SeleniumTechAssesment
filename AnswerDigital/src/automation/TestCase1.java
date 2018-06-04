package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver;
		//String emptyStr = " ";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\phyll\\OneDrive\\Documents\\SeleniumChromeDriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.answerdigital.com/");
		driver.manage().window().maximize();
		
		WebElement contactUsLink = driver.findElement(By.linkText("Contact Us"));
		contactUsLink.click();
		Thread.sleep(1000);
		
		WebElement sendQueryBtn = driver.findElement(By.xpath("//*[@id=\"tdtop\"]/div[2]/div[1]/div[1]/form/div[2]/input")); 
		sendQueryBtn.click();
		
		WebElement name = driver.findElement(By.name("Fullname"));
		
		WebElement email = driver.findElement(By.name("Email"));
		
		WebElement query = driver.findElement(By.name("Query"));
		
	
		
		if (name == null && email == null && query == null) {
			
			System.out.println("Fullname, email and chosen contact are required before submitting a query");
			Thread.sleep(5000);
		}
		
		driver.quit();
	}

}
