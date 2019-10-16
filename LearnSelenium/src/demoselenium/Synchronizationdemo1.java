package demoselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronizationdemo1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://realestatem1.upskills.in/admin");
		driver.manage().window().maximize();
		
		
				
		driver.findElement(By.id("user_login")).sendKeys("admin");
		
		
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		
		//Explicit wait
		WebDriverWait buttonwait=new WebDriverWait(driver, 10);
		buttonwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='login']")));
		
		
		
		
		driver.findElement(By.name("login")).click();
		
		
		WebElement admin1=driver.findElement(By.xpath("//img[@class='avatar avatar-26 photo']"));
		Actions act=new Actions(driver);
		act.moveToElement(admin1).build().perform();
		
	
		
		driver.findElement(By.xpath("//a[@class='ab-item'][contains(text(),'Log Out')]")).click();
		
		driver.close();


	}

}
