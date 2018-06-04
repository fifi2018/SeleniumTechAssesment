	package TestCase3;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class playVideo {
		 
		  
		  public static void main(String[] args) throws InterruptedException{
		  
		        WebDriver driver;
	
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\phyll\\OneDrive\\Documents\\SeleniumChromeDriver");
				driver = new ChromeDriver();
				
				driver.get("http://www.answerdigital.com/");
				driver.manage().window().maximize();
				
				//Opens the who are we link
				WebElement whoAreWe = driver.findElement(By.partialLinkText("Who are"));
				whoAreWe.click();
				Thread.sleep(5000);
				
				//To play video link
				WebElement academyVideo = driver.findElement(By.id("academyVideo"));
				academyVideo.click();
				
		         driver.quit();
		} 
	}
