package E2E;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderWishlist {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.sab2web.com/");
		 driver.findElement(By.xpath("//*[@id=\"cookie-consent-button\"]")).click();
		 driver.findElement(By.xpath("//div[@class='header__utility']//i[@class='fal fa-user']")).click(); 
		 driver.findElement(By.name("email")).sendKeys("dongarwarrevati@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("revati@123");
		 driver.findElement(By.cssSelector("div.col-xs-7 ins")).click();
			
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/input")).click();
		 driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//div[1]//div[1]//a[1]")).click();
		 driver.findElement(By.xpath("//*[@id=\"single-product-wrapper\"]/div[2]/div[1]/div[1]//div[1]/div[3]/div[1]/a/i")).click();

		
		
	
	}

}


