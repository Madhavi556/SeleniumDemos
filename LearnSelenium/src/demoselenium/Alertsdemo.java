package demoselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();  //To maximize the window
		
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert=driver.switchTo().alert();
		
		String alertmessage=driver.switchTo().alert().getText();
		
		System.out.println(alertmessage);
		
		alert.accept();
		
		
		
		

	}

}
