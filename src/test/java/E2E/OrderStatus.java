package E2E;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrderStatus {

	
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
			 
			 File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				File DestFile1=new File(System.getProperty("user.dir")+"/Screenshot/OrderStatus.jpg");
				FileUtils.copyFile(file1, DestFile1);
				
				driver.quit();

	}

}
