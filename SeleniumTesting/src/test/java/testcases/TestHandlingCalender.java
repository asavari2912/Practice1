package testcases;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestHandlingCalender {

	public static WebDriver driver; 
	static int targetDay=0,
			   targetMonth=0,
			   targetYear=0;
	
			   
	static int currentDay=0,
			   currentMonth=0,
			   currentYear=0;
	
	static int jumpMonthsBy=0;
	
	static boolean increment = true;

	
public static void main(String[] args) throws InterruptedException {
	
                  String dateToset = "25/12/2020";

                 //get current date  
                  getCurrentDateMonthAndYear();          
                  System.out.println(currentDay+" "+currentMonth+" "+currentYear+" ");
                  
                //get current date
                  getTargetDateMonthAndYear(dateToset);
                  System.out.println(targetDay+" "+targetMonth+" "+targetYear+" ");
                  
                //get current date   
                  calculateHowmanyMonthsToJump();
                  System.out.println(jumpMonthsBy);
                  System.out.println(increment);
      
                  
                  
                  WebDriverManager.chromedriver().setup();           
                  ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.w3big.com/try/try.php?filename=jqueryui-example-datepicker");
        driver.switchTo().frame("iframeResult");
         //driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                  
         driver.findElement(By.className("hasDatepicker")).click();
         
         
         for (int i = 0; i<jumpMonthsBy; i++)
         {
        	 
        	 if(increment) {
        		 
        		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
        	 }
        	 
        	 else {
        		 
        		 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
        	 }
        	 
        	 Thread.sleep(1000);    
         }
                  
             
    driver.findElement(By.linkText(Integer.toString(targetDay))).click(); // To print the date in textbox
                  
}

public static void getCurrentDateMonthAndYear() {
	 
	
	Calendar cal = Calendar.getInstance();
	
	currentDay = cal.get(Calendar.DAY_OF_MONTH);
	currentMonth = cal.get(Calendar.MONTH)+1; // As system calendar is Gregorian it shows one month previous to current month,hence add 1
	currentYear = cal.get(Calendar.YEAR);
	
}


public static void getTargetDateMonthAndYear(String dateString) {
	
	int firstIndex= dateString.indexOf("/");
	int lastIndex=  dateString.lastIndexOf("/");
	
	String day = dateString.substring(0, firstIndex);
	targetDay = Integer.parseInt(day);
	
	String month = dateString.substring(firstIndex+1, lastIndex);
	targetMonth = Integer.parseInt(month);
	
	String year= dateString.substring(lastIndex+1, dateString.length());
	targetYear = Integer.parseInt(year);
	
}

public static void calculateHowmanyMonthsToJump()
{
	
if((targetMonth-currentMonth)>0) {
	
	jumpMonthsBy= (targetMonth-currentMonth);
}

else{

	jumpMonthsBy= (currentMonth-targetMonth);
	increment=false;
	
}







}









}
