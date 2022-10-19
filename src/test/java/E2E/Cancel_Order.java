package E2E;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cancel_Order {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.sab2web.com/");
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"cookie-consent-button\"]")).click();
		 driver.findElement(By.xpath("//div[@class='header__utility']//i[@class='fal fa-user']")).click(); 
		 driver.findElement(By.name("email")).sendKeys("dongarwarrevati@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("revati@123");
		 driver.findElement(By.cssSelector("div.col-xs-7 ins")).click();
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/input")).click();
		 
		 driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[4]/ul/li[1]/a/i")).click();
		 driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/section[2]/div/div/div[1]/ul/li[3]/a/i")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"buyer-order-table\"]/tbody/tr[2]/td[2]/a[3]")).click();	
		 
		 driver.findElement(By.id("cancellation_reason_idSelectBoxItContainer")).click();
		 driver.findElement(By.xpath("//*[@id=\"cancellation_reason_idSelectBoxItOptions\"]/li[2]")).click();
		
		 driver.findElement(By.cssSelector("#myDynamicModal > div > div > div.modal-body > form > div:nth-child(4) > div > ul > li:nth-child(2) > div > ins")).click();
			
		 driver.findElement(By.id("description")).sendKeys("Order placed for testing automation");
		 driver.findElement(By.xpath("//*[@id=\"myDynamicModal\"]/div/div/div[2]/form/div[4]/div[2]/button")).click();
		 
	
			driver.quit();

}
}