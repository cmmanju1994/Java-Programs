package GenPractice;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicWebTable1 {

	public static void main(String[] args) {
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.addExtensions(new File("I:\\Ecommerce\\Extensions\\adblock.crx"));
		WebDriver driver=new ChromeDriver(opt);
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
        
        // Find total rows
        
       List<WebElement> rows= driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr"));
	   int total_rows= rows.size();
	   System.out.println("rows "+total_rows);
	   
	   
	   // total columns
	   
	  List  <WebElement> columns =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr/th"));
	  int total_columns=columns.size();
	  System.out.println("columns "+total_columns);
	  
	  
	  // scroll down
	  
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,5000)", (""));
	  
	  // to print all data from the table
	  
	  for(int r=2;r<=total_rows;r++)
	  {
		  for(int c=1;c<total_columns;c++)
		  {
			String text=  driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+r+"]/td["+c+"]")).getText();
			System.out.println(text);
		  }
	  }
	  
	  // to find location of meta
	  
	  for(int r=2;r<total_rows;r++)
	  {
		 String company= driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+r+"]/td[1]")).getText();
		 if(company.equals("Adobe"))
		 {
			String location=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr[\"+r+\"]/td[3]")).getText();
			 System.out.println(company+":"+location);

		 }
		 
	  }
	  
	  
	  driver.quit();
	  
	}
	

}
