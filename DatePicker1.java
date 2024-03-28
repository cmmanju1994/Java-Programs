package GenPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker1 {
	
	public void SelectDate(String year,String month,String date)
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		
		// Approach 01 using send keys
		
		WebElement dateInput=driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateInput.click();
		//dateInput.sendKeys("25/05/2024");
		
		// Approach 2
		
		
		
		// For Selection Month and Year
		while(true)
		{
			String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && yr.equals(year))
			{
				break;
			}
			
			driver.findElement(By.linkText("Next")).click(); // Next Button
			
		}
		
	List<WebElement> allDates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));

	for(int i=0;i<allDates.size();i++)
	{
		if(allDates.get(i).getText().equals(date))
		{
			allDates.get(i).click();
			break;
		}
		
	}
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		//SelectDate dt=new SelectDate();
		DatePicker1 dt=new DatePicker1();
		dt.SelectDate("2025", "February", "35");
		

	}

}
