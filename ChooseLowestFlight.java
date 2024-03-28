package GenPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChooseLowestFlight {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		
		WebElement btnFindFlights=driver.findElement(By.xpath("//input[@type=\"submit\"]"));
		btnFindFlights.submit();
		
		// Finding total columns
		
		List<WebElement> columns=driver.findElements(By.xpath("//table[@class=\"table\"]/thead/tr/th"));
		int toal_columns=columns.size();
		System.out.println(toal_columns);
		
		
		// finding price tag values
		
		
		
		List<WebElement> price=driver.findElements(By.xpath("//table[@class=\"table\"]/tbody/tr/td[6]"));
		List<Double> priceall=new ArrayList<Double>();
		
		for(WebElement pr:price)
		{
			String text=pr.getText();
			String act_text=text.substring(1);
			priceall.add(Double.parseDouble(act_text));
			
			
			//priceall.add(pr.getText());
		}
		
		System.out.println(priceall);
		
		Collections.sort(priceall);
		double lowestPrice=0;
		
		for(int i=0;i<priceall.size();i++)
		{
			 lowestPrice=priceall.get(0);
		}
		
		
		
		
		
		
		
		
	

	}

}
