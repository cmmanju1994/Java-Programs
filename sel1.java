package GenPractice;

import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sel1 {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		
		List<WebElement> options=driver.findElements(By.xpath("//label[@class=\"checkbox\"]"));
		
		for(int i=0;i<options.size();i++)
		{
			 if(options.get(i).getText().equalsIgnoreCase("HTML") || options.get(i).getText().equalsIgnoreCase("CSS"))
			 {
				 if(options.get(i).isSelected()==false)
				 {
					options.get(i).click();
					break;
				 }
				 else
				 {
					 System.out.println("Given options are already selected");
				 }
			 }
			
		}
		
		
		
		
	}

}
