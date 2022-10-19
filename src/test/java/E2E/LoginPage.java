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

public class LoginPage 	{

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.sab2web.com/");
		 driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//*[@id=\"cookie-consent-button\"]")).click();
		 driver.findElement(By.xpath("//div[@class='header__utility']//i[@class='fal fa-user']")).click(); 
		 driver.findElement(By.name("email")).sendKeys("dongarwarrevati@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("revati@123");
		 driver.findElement(By.cssSelector("div.col-xs-7 ins")).click();
		 File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile=new File(System.getProperty("user.dir")+"/Screenshot/Beforelogin.jpg");
			FileUtils.copyFile(file, DestFile);
			
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/input")).click();

			File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile1=new File(System.getProperty("user.dir")+"/Screenshot/Afterlogin.jpg");
			FileUtils.copyFile(file1, DestFile1);
			
			
		
			Thread.sleep(1000);
			driver.quit();
		 
	
	}

}

