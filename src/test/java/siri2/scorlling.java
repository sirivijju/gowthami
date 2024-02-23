package siri2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scorlling {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver. get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		//driver.manage().window().maximize();
		
		JavascriptExecutor JS=(JavascriptExecutor)driver;
		JS.executeScript("Window,scrollBy(0,500)","");
				
		
		System.out.println(JS.executeScript("return window.pageYOffset;"));
	
		WebElement flag = driver.findElement(By.xpath("//img[@alt='flag of TurKey']"));
		
		
		JS.executeScript("arguments[0].scrollIntoView();", flag);
		System.out.println(JS.executeScript("return window.pageYOffset;"));
		
		JS.executeScript("window.scrollBy(0.document.body.scrollHeight)"); //scroll till last
		
		
		System.out.println(JS.executeScript("return window.pageYOffset;"));//value return
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
