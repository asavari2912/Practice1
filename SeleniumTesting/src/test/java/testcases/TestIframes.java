package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIframes {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		//driver.navigate().back();
		driver.switchTo().frame("iframeResult");
		 driver.findElement(By.xpath("/html/body/form/input[3]")).click();
	
		 
		 driver.switchTo().defaultContent();
//--------------- To Print number of frames on the Page--------------------------
		 
	List <WebElement> frames = driver.findElements(By.tagName("iframe"));
	
	System.out.println(frames.size());
	
for (WebElement frame: frames)
	{
	
	System.out.println(frame.getAttribute("id")); 
		 
		 
		 
		 
	}
		 
		 
		 
		 
		 
		 
		
		
		
		
		
		
		
		
		
	}

}
