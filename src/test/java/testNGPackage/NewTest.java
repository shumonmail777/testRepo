package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
  
	WebDriver driver;  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hello testNg..... === ====== =======.");
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\All jars\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	 driver.get("http:\\www.google.com");
	 String title =driver.getTitle();
	 try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
	
		e.printStackTrace();
	}
	 System.out.println(title+"- - - - - - - - - -- -  ");
  }

  @Test
  public void lastly() {
	  System.out.println("fininsh ++++++++TEST PASSED+++++++++++finish");  
  }

}
