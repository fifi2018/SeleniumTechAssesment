package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

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
		Thread.sleep(5000);
		
		WebElement query = driver.findElement(By.name("Query"));
		query.sendKeys("The big brown fox jumped over the lazy dog");
		Thread.sleep(5000);
		
		WebElement sendQueryBtn = driver.findElement(By.xpath("//*[@id=\"tdtop\"]/div[2]/div[1]/div[1]/form/div[2]/input")); 
		sendQueryBtn.click();
		
		boolean checkBox = driver.findElement(By.xpath("//*[@id=\"tdtop\"]/div[2]/div[1]/div[1]/form/div[2]/div[2]/div[2]/div[1]/input ")).isSelected();
	
		if (checkBox == false) {
			
			System.out.println("No chosen contact selected");
			Thread.sleep(5000);
		}
		
		driver.quit();
	}

}
