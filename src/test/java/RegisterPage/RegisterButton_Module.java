package RegisterPage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterButton_Module {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/abhinavsaini/eclipse-workspace/Ecommerce_WEB/TEST_CASES/DRIVER/chromedriver_105");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.sab2web.com/");	
		 driver.findElement(By.xpath("//*[@id=\"cookie-consent-button\"]")).click();
		 driver.findElement(By.xpath("/html/body/div/header/div[2]/div/div/div[2]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("//a[2]")).click();
		 driver.findElement(By.xpath("//*[@id=\"form\"]/div[6]/div[2]/input")).click();
		 
		 driver.quit();
	}
}

