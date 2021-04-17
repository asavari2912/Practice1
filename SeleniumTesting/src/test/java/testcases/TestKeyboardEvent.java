package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestKeyboardEvent {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("dudhe.asavari@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[1]")).click();

		Actions action = new Actions (driver);
		action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
		action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
		
		
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).click();
		
	action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
		
	}

}
