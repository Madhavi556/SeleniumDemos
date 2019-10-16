package demoselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtabledemo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumlp10software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		
		//To locate table
		WebElement mytable=driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div"));
		
		//To locate rows of table
		List<WebElement>rows_table=mytable.findElements(By.tagName("tr"));
		
		//calculate the no. of rows in the table
		int rows_count=rows_table.size();
		
		for(int row=0;row<rows_count;row++){
			List<WebElement>Columns_row=rows_table.get(row).findElements(By.tagName("td"));
			
			int columns_count=Columns_row.size();
			System.out.println("Number of cell in row"+row+  "are"  +columns_count);
			
			for(int column=0;column<columns_count;column++){
				String celltext=Columns_row.get(column).getText();
				System.out.println("Cell value of row number:" +row+ "and column number" +column+ " Is" +celltext);
			}
			
		}
		
		

	}

}
