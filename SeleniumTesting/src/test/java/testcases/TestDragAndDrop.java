package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDragAndDrop {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
	WebElement draggable = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement droppable = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	
	Actions action = new Actions(driver);
	action.dragAndDrop(draggable, droppable).perform();

//-------------- To drag at any point on web page--------------------------------
	
//	 action.dragAndDropBy(draggable, 200, 300).perform();
		
		
		
		
		
		
		
		
	}

}
