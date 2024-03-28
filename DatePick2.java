package GenPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePick2 {
	
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("dob")).click();
		
		WebElement year=driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		WebElement month=driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		
		Select selectmonth=new Select(month);
		selectmonth.selectByIndex(6);
		
		Select selectyear=new Select(year);
		selectyear.selectByVisibleText(1994);
		

		
		
		
		
		
		
		
		
	}

}
