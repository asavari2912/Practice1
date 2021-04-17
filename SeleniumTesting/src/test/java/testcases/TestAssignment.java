package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAssignment {
	
	public static WebDriver driver; 
	
	public static boolean isElementPresent(By by)
	{
	
	
	int size= driver.findElements(by).size();
	if (size==0){
		//System.out.println("False Condition");
		return false;
				
		
	}else {
		return true;
	}
	}


	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(driver, 15);
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
/*
		driver.get("https://google.com");

		Wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")))
				.sendKeys("Way2Automation");

		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3/span")).click();
		
		
		
//-------------------------printing Links----------------------------------------/
		
		
		
		
		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("Printing Links-----------------");

		System.out.println("Total Links are:  " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getText() + "----URL Is-----" + link.getAttribute("href")); 

		}   */

		
	driver.get("http://way2automation.com/way2auto_jquery/index.php");	
	//driver.findElement(By.xpath("//*[@id=\"toggleNav\"]/li[6]/a")).click();
	
	//Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"load_form\\\"]/fieldset[1]/input"))).sendKeys("Asavari");

	driver.findElement(By.name("city")).sendKeys("Pune");
	
	
	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[4]/select")).sendKeys("Hong Kong");
	driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[1]/input")).sendKeys("Asavari");
		
		
		
		

		
		
		
		
		
		
		
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
