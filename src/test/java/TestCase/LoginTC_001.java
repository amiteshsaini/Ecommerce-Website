package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTC_001 {
	WebDriver driver;

	@BeforeClass
	public void testSetup()
	{
	System.setProperty("webdriver.chrome.driver", "/Users/abhinavsaini/eclipse-workspace/Project/src/test/java/Resources/chromedriver_105");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();

	}

	@BeforeMethod
	public void openBrowser()
	{
	driver.get("https://www.sab2web.com/");
	driver.findElement(By.xpath("//div[@class='header__utility']//i[@class='fal fa-user']")).click();
	System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
	}

	@Test(description="This method validates the Login functionality")
	public void Login()
	{
		 driver.findElement(By.name("email")).sendKeys("dongarwarrevati@gmail.com");
		 driver.findElement(By.id("password")).sendKeys("revati@123");
		 driver.findElement(By.cssSelector("div.col-xs-7 ins")).click();
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[3]/div[2]/input")).click();
	}

	@AfterMethod
	public void postLogin()
	{
	System.out.println(driver.getCurrentUrl());

	}

	@AfterClass
	public void afterClass()
	{
	driver.quit();
	}

}
