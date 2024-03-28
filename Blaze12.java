package GenPractice;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blaze12 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1
			driver.get("https://blazedemo.com/");
			driver.manage().window().maximize();
			
			// click on find flights button
			
			driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

			
			// find total columns 
			
			List<WebElement> all_headers=driver.findElements(By.xpath("//table[@class=\"table\"]/thead/tr[1]/th"));
			int total_columns=all_headers.size();
			
			System.out.println(total_columns);
			
			// find total rows
			
			List<WebElement> all_rows=driver.findElements(By.xpath("//table[@class=\"table\"]/tbody/tr"));
			int total_rows=all_rows.size();
			System.out.println(total_rows);
			
			// To identify the price tage
		
			List<WebElement> headers=driver.findElements(By.xpath("//table[@class=\"table\"]/thead/tr/th"));
			int priceLocation=0;
		for(int i=0;i<total_columns;i++)
			
		{
			if(headers.get(i).getText().equals("Price"))
			{
				priceLocation=i;
				break;
			}
		}
		
		System.out.println(priceLocation);
		
	
		//List<WebElement> headers=driver.findElements(By.xpath("//table[@class=\"table\"]/thead/tr/th"));
		
		/*for(WebElement we:headers)
		{
			System.out.println(we.getText());
		}*/
			
		// get all the prices
		
		
		String priceArr[]=new String[total_rows];
		for(int r=1;r<=total_rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr["+r+"]/td["+(6)+"]")).getText().substring(1);
	
			priceArr[r-1]=price;
			
		}
		
		//System.out.println(priceArr);
		
		// to print array values
		
		/*for(String l:priceArr)
		{
			//System.out.println("Values of price array");
			System.out.println(l);
		}*/
		
		
		
		
		Arrays.sort(priceArr);
		
		for(String m:priceArr)
		{
			//System.out.println("Values of price array");
			System.out.println(m);
		}
		
		String lowestPrice=priceArr[0];
		
		System.out.println("Lowest price is "+lowestPrice);
		
		// to click on lowest price flight
		
		for(int r=1;r<=total_rows;r++)
		{
			if(driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr["+r+"]/td["+(6)+"]")).getText().substring(1).equals(lowestPrice))
			{
				driver.findElement(By.xpath("//table[@class=\"table\"]/tbody/tr["+r+"]/td[1]")).click();
				break;
			}
		}
		
		
		System.out.println("Current URL is "+ driver.getCurrentUrl());
		
		
		
		
		
		driver.quit();	
			

	}

}
