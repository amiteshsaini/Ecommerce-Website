package E2E;


import java.io.File;
import java.io.IOException;	
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Order_Purchase {


	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.sab2web.com/");
		 driver.findElement(By.xpath("//*[@id=\"cookie-consent-button\"]")).click();
		 driver.findElement(By.xpath("//div[@class='header__utility']//i[@class='fal fa-user']")).click(); 
		 driver.findElement(By.name("email")).sendKeys("dongarwarrevati@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("revati@123");
		 
		 File file1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile1=new File(System.getProperty("user.dir")+"/Screenshot/BeforeLogin.jpg");
			FileUtils.copyFile(file1, DestFile1);
			
		 driver.findElement(By.cssSelector("div.col-xs-7 ins")).click();
		 
		 File file2 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile2=new File(System.getProperty("user.dir")+"/Screenshot/AfterLogin.jpg");
			FileUtils.copyFile(file2, DestFile2);
			
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/input")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/section[7]/div/div/div/div/div[3]/div/div[2]/div[2]/div/div[2]/div/div[1]/a")).click();
		 driver.findElement(By.xpath("//*[@id=\"single-product-wrapper\"]/div[2]/div[1]/div[2]/a")).click();
		 driver.findElement(By.xpath("/html/body/div/header/div[3]/div/div/div[4]/ul/li[3]/a/i")).click();
		 
		 File file3 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile3=new File(System.getProperty("user.dir")+"/Screenshot/ProductCeckout.jpg");
			FileUtils.copyFile(file3, DestFile3);
		 
		 driver.findElement(By.xpath("//*[@id=\"checkout-btn236\"]")).click();
		 File file4 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile4=new File(System.getProperty("user.dir")+"/Screenshot/ProductPurchasePage.jpg");
			FileUtils.copyFile(file4, DestFile4);
		 
		 driver.findElement(By.xpath("//*[@id=\"cartId236\"]/div[3]/div[3]/a")).click();
		 Select se = new Select(driver.findElement(By.xpath("//*[@id=\"myDynamicModal\"]/div/div/div[2]/form/div[1]/select")));	
		se.selectByVisibleText("Billing");
		
		 driver.findElement(By.xpath("//*[@id=\"myDynamicModal\"]/div/div/div[2]/form/div[2]/div[1]/input")).sendKeys("9876543210");
		 driver.findElement(By.name("zip_code")).sendKeys("452011");
		 driver.findElement(By.name("address_line_1")).sendKeys("325/10");
		 driver.findElement(By.name("address_line_2")).sendKeys("Meghdoot Nagar	")		;
		 driver.findElement(By.name("city")).sendKeys("Indore");
		 driver.findElement(By.name("phone")).sendKeys("9876543120");
		 
		 driver.findElement(By.xpath("//*[@id=\"myDynamicModal\"]/div/div/div[2]/form/button/i")).click();
		 File file5 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile5=new File(System.getProperty("user.dir")+"/Screenshot/ProductPurchasePage_Adressinput.jpg");
			FileUtils.copyFile(file5, DestFile5);
		 
		 
		
		 driver.findElement(By.cssSelector("#cartId236 > div.col-md-3 > div:nth-child(2) > div:nth-child(2) > label > div > ins")).click();
		 driver.findElement(By.xpath("//*[@id=\"pay-now-btn\"]")).click();
		 	 
		 
		 File file6 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			File DestFile6=new File(System.getProperty("user.dir")+"/Screenshot/ProductPurchaseDone.jpg");
			FileUtils.copyFile(file6, DestFile6);
			
			 driver.quit();
		 

		
			 
	}

}