package GenPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.qafox.com/selenium-java-interview-questions-and-answers-part-8/");

		driver.manage().window().maximize();
		
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File source=srcshot.getScreenshotAs(OutputType.FILE);
		//File dest=new File(‪"I://OpenCart_Automation//OpenCart//srcshot//test121.png");
		File destFile=new File("I://OpenCart_Automation//OpenCart//srcshot//test121.png");
		
		FileUtils.copyFile(source, destFile);
	}

}
