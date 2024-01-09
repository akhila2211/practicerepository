package practicepackage;

import java.util.List;
import java.time.Duration;
import java.util.Date;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\devi\\Downloads\\chromedriver_win32 (1) 113.0\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
//		Approach-1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/15/2025");//mm/dd/yyyy

		//Approach-2
		int year=2025;
		String year1=Integer.toString(year);
		String month="April";
		String Day="22";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();//input://input[@id="datepicker"]
		
		//present year
		int current_year=2023;
		
		//select month and year
		while(true)
		{
			//current month
			String Mnth=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();////span[@class="ui-datepicker-month"]
			//current year
			String yr=driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();////span[@class="ui-datepicker-year"]
			//checking the condition with the given data
			
			// year is greater than present year
			if(year>current_year) {
			if(yr.equals(year1) && Mnth.equals(month)) //2023.equals(2025) && may.equals(april)
			{
				
				break;
			}
			else {
			//next button
			driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]")).click();////span[@class="ui-icon ui-icon-circle-triangle-e"]
			
		}
			}
			//given year lessthan present year
			if(year<current_year) {
				//compare month and year
				if(yr.equals(year1) && Mnth.equals(month)) 
				{
					
					break;
			}
				else
				{
					driver.findElement(By.xpath("\"//span[@class=\\\"ui-icon ui-icon-circle-triangle-w\\\"]")).click();//prevous button
				}
			}
		}

		//selecting day
		List<WebElement> alldates=driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//td"));////table[@class="ui-datepicker-calendar"]//td
		for(WebElement dt:alldates) {
			if(dt.getText().equals(Day)) {
				dt.click();
				break;
			}
		}
	}

}
