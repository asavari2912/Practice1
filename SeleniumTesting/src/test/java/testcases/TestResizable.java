package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestResizable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(driver, 5);
	// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
		
		
//----------------------Assignment 4----------------------------------------------------------
		
		
		/*	
		Dimension d = new Dimension(100,300);
		
		Dimension d2 = new Dimension (500,800);
		
		driver.manage().window().setSize(d);
		
		driver.manage().window().setSize(d2);  */
		
//-----------------------------------------------------------------------------------------------------		
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
		WebElement resizable = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		Actions temp = new Actions(driver);
		temp.dragAndDropBy(resizable, 400, 400).perform();
	}

}
