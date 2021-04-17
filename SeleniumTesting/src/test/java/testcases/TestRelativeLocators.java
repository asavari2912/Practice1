package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRelativeLocators {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://way2automation.com/way2auto_jquery/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"load_form\"]/fieldset[3]/input")).sendKeys("adc@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"load_form\"]/div/div[2]/input")).click();
		//driver.findElement(RelativeLocator.withTagName("input").toRightOf(By.linkText("Signin"))).click();
		driver.findElement(withTagName("input").below(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input"))).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
