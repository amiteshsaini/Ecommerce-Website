package HomePageFooter;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Call_Module {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.sab2web.com/");
		 driver.findElement(By.xpath("//*[@id=\"cookie-consent-button\"]")).click();
		 
		 Thread.sleep(2000);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,5550)", "");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//a[normalize-space()='7640822707']")).click();
		 Thread.sleep(1000);
		 driver.quit();
	}
}
