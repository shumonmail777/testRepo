package seleniumPackage;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SeleniumTest {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\All jars\\chromedriver.exe");
		
		  
		WebDriver driver = new ChromeDriver();
		 
		driver.get("http:\\www.google.com");
		
		//driver.manage().window().fullscreen();
		 
		String title =driver.getTitle();
		
		String expected= "Google";
		
		 try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		 
		 System.out.println("- - - - -- -"+ title + "- - - - - - - - - -- -  ");
		
		 Assert.assertEquals(title, expected);
		
		 System.out.println("TiTLE mATCHES: TEST PASSED");
		 
		 //driver.close();
		// driver.quit(); // THERE IS A BUG ABOUT THIS ONE IN SELENIUM 4.00 VERSION
		
		
			 
		 }
	}


