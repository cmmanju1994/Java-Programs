package GenPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPaste {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		String s=driver.findElement(By.xpath("//input[@placeholder=\"Full Name\"]")).getAttribute("placeholder");
	   
		System.out.println(s);
		
		
		WebElement FullName=driver.findElement(By.xpath("//input[@id='userName']"));
		FullName.sendKeys("Anvita");
		
		WebElement Email=driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("Anvita@gmail.com");
		
		WebElement CurrentAddress=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CurrentAddress.sendKeys("Anita Doni At Shirur Post Jantli Dist Gadag Tq Mundaragi karnatak "
				+ "Pin 582113");
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

		act.keyDown(Keys.TAB).keyUp(Keys.TAB);
		
		act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
		
		
		
		
		
		
		
		
		

	}

}
