package GenPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
//		//driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
//
//        
//		driver.manage().window().maximize();
//		
//		// printing the headers
//		
//		List<WebElement> headers=driver.findElements(By.xpath("//table[@class=\"dataTable\"]/thead/tr/th"));
//        
//		// creating an array to store the headers
//		
//		String head[]=new String[headers.size()];
//		
//		/*for(WebElement x:headers)
//		{
//			//System.out.println(x.getText());
//			head[i]=x.getText();
//		}*/
//		
//		for(int i=0;i<headers.size();i++)
//		{
//			head[i]=headers.get(i).getText();
//		}
//		
//		for(String h:head)
//		{
//		    System.out.println(h);
//		}
//		
//	// click on Uflex Ltd
//		String expected_company="Uflex Ltd";
//		
//		List<WebElement> Companies=driver.findElements(By.xpath("//table[@class=\"dataTable\"]//tr/td[1]"));
//		
//		for(int i=0;i<Companies.size();i++)
//		{
//			
//			
//		if(	Companies.get(i).getText().equals("Indraprastha Gas"))
//		{
//			Companies.get(i).click();
//		}
//		}
//		
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// to print all details
		
		driver.findElement(By.xpath(null))
		
		
		
		//driver.quit();
		
		
	}

}
