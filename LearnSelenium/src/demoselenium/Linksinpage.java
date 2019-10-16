package demoselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linksinpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		
		//To find the number of links
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println("No. of links is: "+linklist.size());
		
		//To print the link names
		for(int i=0;i<linklist.size();i++){
			System.out.println(linklist.get(i).getText());
		}
		
		driver.close();
		
}
}
