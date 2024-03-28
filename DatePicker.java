package GenPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {
	
	public void SelectDate()
	{
WebDriver driver=new ChromeDriver(STr);
		
		String MonthYear="August 2024",day="15";
		
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		
		//System.out.println(monthYear);
		
		while(true)
		{
			
			String monthYear=driver.findElement(By.xpath("(//div[@class=\"DayPicker-Caption\"])[1]")).getText();

			if(monthYear.equalsIgnoreCase(MonthYear))
			{
				break;
			}
			
			WebElement nextButton=driver.findElement(By.xpath("(//span[@role=\"button\"])[2]"));
			nextButton.click();
		}
		
		List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class=\"DayPicker-Month\"])[1]//div[@class=\"dateInnerCell\"]"));
		
		for(WebElement dt:allDates)
		{
			if(dt.getText().equals(day))
			{
				dt.click();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		
		
	
		
		
	
		
		
		
		
	}

}
