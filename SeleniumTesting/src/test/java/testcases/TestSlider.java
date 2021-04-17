package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSlider {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		WebDriverWait Wait = new WebDriverWait(driver, 5);
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		 WebElement mainslider = driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		 WebElement slider = driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		 
		int width=  mainslider.getSize().width/3;
		 
		 
		 Actions temp = new Actions(driver);
		 temp.dragAndDropBy(slider, width, 0).perform();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
