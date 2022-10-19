package HomePageHeader;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieCancel {public static void main(String[] args) throws IOException, InterruptedException {
	System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.sab2web.com/");
	 driver.findElement(By.xpath("//*[@id=\"cookie-cancel-button\"]")).click();
	 Thread.sleep(1000);
	 driver.quit();

}
}
