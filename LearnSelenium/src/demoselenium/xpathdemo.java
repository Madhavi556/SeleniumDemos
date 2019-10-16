package demoselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
			
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();  //To maximize the window
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//ancestor::li//preceding-sibling::li//a[text()='WebTable']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//parent::li")).click();
		driver.findElement(By.xpath("//a[contains(text(),'SwitchTo')]//parent::li//child::ul//li//a[text()='Alerts']")).click();
	}

}

