package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google 
{
 @Test
 public void GoogleLogin() throws InterruptedException
 {
	 WebDriverManager.chromedriver().setup();
	 
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.ggogle.com");
	 
	 Thread.sleep(3000);
	 
	 driver.close();
	 
 }
}
