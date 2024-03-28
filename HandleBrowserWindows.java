package GenPractice;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowHandles=driver.getWindowHandles();// it consists of 2 id's
		
		System.out.println(windowHandles);
		
		//Approach 01:Converting to List and get
		
		List<String> windowIds=new ArrayList(windowHandles);
		String parentWindow=windowIds.get(0);
		String childWindow=windowIds.get(1);
		
		driver.switchTo().window(childWindow);
		WebElement contactSales=driver.findElement(By.xpath("(//button[text()=\"Contact Sales\"])[2]"));
		contactSales.click();
		
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		
		
		

	}

}
