package GenPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Exwcutor {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		//driver.get("www.google.com");// invalid argument exception
		
		/*WebElement search=driver.findElement(By.id("APjFqb"));
		search.sendKeys(Keys.ENTER);
		Actions act=new Actions(driver);
		driver.wait(5);*/
		
		//act.keyDown(Keys.ENTER).build().perform();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('APjFqb').value='ipl 2024'");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.ENTER).perform();
		
		// Create the  JavascriptExecutor object 
		JavascriptExecutor js1=(JavascriptExecutor)driver; 

		// find element using id attribute 
		WebElement username= driver.findElement(By.id("dimg_1")); 

		// call the executeScript method 
		js1.executeScript("arguments[0].setAttribute('style,'border: solid 2px red'');", username);
		
		driver.get(driver.getCurrentUrl());
	}

}
