package GenPractice;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DynamicWebTable12 {

	public static void main(String[] args) {

		ChromeOptions opt=new ChromeOptions();
		opt.addExtensions(new File("I:\\Ecommerce\\Extensions\\adblock.crx"));
		WebDriver driver=new ChromeDriver(opt);
		//WebDriver driver=new EdgeDriver();
		driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();
        
        // total structure values
        
        int total_structures=driver.findElements(By.xpath("//table[@class=\"tsc_table_s13\"]/tbody/tr")).size();
        
        
        
        
	}

}
