package demoselenium;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jdemo {

	public static void main(String[] args) {
		Logger log=Logger.getLogger(Log4jdemo.class);
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		log.info("Launch browser");
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		log.info("URL Lauched");
	
		
		String title=driver.getTitle();
		System.out.println("Title is: "+title);
		log.warn("check if title is correct");
		
		if(title.equals("Google")){
			System.out.println("Correct website");
			//log.info("Correct Title:Test case passed");
			log.error("Incorrect title:Test case failed");
		}
		else
		{
			System.out.println("Incorrect website");
			log.info("Incorrect title:Test case failed");
			log.error("Incorrect title:Test case failed");
		}
		driver.quit();

	}

}
