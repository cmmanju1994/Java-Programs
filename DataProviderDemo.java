package GenPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	WebDriver driver;
	
	@BeforeMethod()
	public void setbrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
	}
	
	@Test(dataProvider="My test data")

	public void searchFunctionality(String br)
	{
		driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]")).sendKeys(br);
		Actions act=new Actions(driver);
		act.keyDown(Keys.ENTER).perform();
		
	}
	
	@DataProvider(name="My test data")
	public  Object[][] setdata()
	{
		Object[][] data= {{"ipl 2024"},{"Kannada movies"}};
		return data;
		
	}

}
