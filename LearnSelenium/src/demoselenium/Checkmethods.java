package demoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkmethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		
		boolean checkpresence=driver.findElement(By.xpath("//input[@id='Email']")).isDisplayed();
		System.out.println(checkpresence);
		
		boolean checkenable=driver.findElement(By.xpath("//input[@id='Email']")).isEnabled();
		System.out.println(checkenable);
		
		if(checkpresence==true && checkenable==true){
			driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rekhabr@gmail.com");
		}

	}

}
