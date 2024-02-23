package siri2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshots {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/v4");
		
		//complete screen
		TakesScreenshot TS=(TakesScreenshot)driver;
		File OP=TS.getScreenshotAs(OutputType.FILE);
		File TR=new File("C:\\Users\\siri\\eclipse-workspace\\siri2\\screenshot\\Login.png");
		FileUtils.copyFile(OP, TR);
		
		//Element
		
		
		WebElement guru99=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/table/tbody/tr"));
		File guru=guru99.getScreenshotAs(OutputType.FILE);
		File Gurutrg=new File("\"C:\\\\Users\\\\siri\\\\eclipse-workspace\\\\siri2\\\\screenshot\\\\Login.png\"");
		
		FileUtils.copyFile(guru, Gurutrg);
		
		
		
		
		
		

		
		
		
	
		

	}

}
