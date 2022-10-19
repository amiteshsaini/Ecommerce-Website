package LoginPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword_Module {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.sab2web.com/");
	
		 driver.findElement(By.xpath("//*[@id=\"cookie-consent-button\"]")).click();
		 driver.findElement(By.xpath("//div[@class='header__utility']//i[@class='fal fa-user']")).click();	
		 driver.findElement(By.xpath("//a[normalize-space()='Forgot Password?']")).click();
		 
		 driver.findElement(By.name("email")).sendKeys("dongarwarrevati@gmail.com");
		 driver.findElement(By.xpath("//*[@id=\"form\"]/input[2]")).click();
		 
	}
}
