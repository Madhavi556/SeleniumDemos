package demoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","D:\\Seleniumlp10software\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("rekhabr1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		String expectedname="Demowebstore";
		String actualname=driver.getTitle();
		System.out.println(actualname);
		
		if(actualname.equals(expectedname)){
			System.out.println("U or on the correct page");
			
			driver.close();
		}
		else{
			System.out.println(("U or on the wrong page"));
			driver.quit();
		}
			
		
	}

}
