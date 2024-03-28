package GenPractice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleBrowserWindow1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(10000);
		
		// scroll into view java script
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		
		js.executeScript("window.scrollBy(0,3000)","");
		
		WebElement facebooklogo=driver.findElement(By.xpath("//img[@alt='facebook logo']"));
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(30));
		mywait.until(ExpectedConditions.elementToBeClickable(facebooklogo));
		
		
	Set<String> handls=driver.getWindowHandles();
	
	for (String x:handls)
	{
		System.out.println(x);
	}
	
		
		
		
		
		
		
		
		
		
		
		

	}

}
