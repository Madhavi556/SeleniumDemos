package demoselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();  //To maximize the window
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Rekha");
		
		String FN=driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("class");
		System.out.println(FN);
		
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("BR");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('firstpassword').scrollIntoView()");
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("Indiranagar");
		//Identify and select the value of radio button
		
		driver.findElement(By.xpath("//*[@name='radiooptions' and @value='FeMale']")).click();
		
		driver.findElement(By.xpath("//*[@id='checkbox2' and @value='Movies']")).click();
		
		//Select year from Drop down
		WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));
		Select sel1=new Select(year);
		sel1.selectByVisibleText("1918");
		
		//Select month from drop down
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select sel2=new Select(month);
		
		List<WebElement> monthcount=sel2.getOptions(); //To get the count of values in drop down
		System.out.println(monthcount.size());
		for(int i=0;i<monthcount.size();i++){
			System.out.println(monthcount.get(i).getText());
		}
			
		sel2.selectByIndex(6);
		
		//Select Day from Drop down
		WebElement day=driver.findElement(By.xpath("//select[@id='daybox']"));
		Select sel3=new Select(day);
		sel3.selectByValue("5");
		
		
	}

}
