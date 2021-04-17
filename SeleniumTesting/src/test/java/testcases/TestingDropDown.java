package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingDropDown {

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
		 WebDriverWait Wait = new WebDriverWait(driver,5);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.com");
		System.out.println(driver.getTitle());
		//driver.findElement(By.id("searchLanguage")).sendKeys("Eesti");
		
		 
		WebElement dropdown = driver.findElement(By.id("searchLanguage"));
		Select select = new Select(dropdown);
		
		select.selectByValue("en");
		
		driver.findElement(By.id("searchInput")).sendKeys("Nature");
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i")).click();
	Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[56]/ul/li[1]/a")));
		
		driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/div[56]/ul/li[1]/a")).click();
		
		WebElement Block = driver.findElement(By.xpath("//*[@id=\"toc\"]/ul"));
		
		//System.out.println(Block.findElement(By.xpath("//*[@id=\"toc\"]/ul/li[1]")).getText());
		
		int i = 1;
	
	while(isElementPresent(By.xpath("//*[@id=\"toc\"]/ul/li["+i+"]")))
	{
		System.out.println(Block.findElement(By.xpath("//*[@id=\"toc\"]/ul/li["+i+"]")).getText());
		i++;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//-------------------------- Printing all values from Drop Down----------------------------
	/*	
		List <WebElement> value = driver.findElements(By.tagName("option"));
		
		System.out.println("Size is: "+value.size());
		
		for(int i=0;i<value.size();i++)
		{
			System.out.println(value.get(i).getText());
		}
		
		*/
//----------------Printing all Links on web Page---------------------------------------		
		
	/*	
		List <WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("Printing Links-----------------");
		
		System.out.println("Total Links are:  "+links.size());
		
		for(WebElement link: links)
		{
			System.out.println(link.getText()+"----URL Is-----"+link.getAttribute("href"));

	}*/

		
		
		
		
		
}
}