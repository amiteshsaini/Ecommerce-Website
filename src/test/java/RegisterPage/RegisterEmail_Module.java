package RegisterPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterEmail_Module {
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.sab2web.com/");	
			 driver.findElement(By.xpath("//div[3]//ul/li[1]/a/i")).click();
			 driver.findElement(By.xpath("//a[2]")).click();
			 driver.findElement(By.name("email")).sendKeys("dongarwarrevati@gmail.com");
			 
			 driver.quit();
			
		}

	}
