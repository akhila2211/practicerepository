package practicepackage;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_p4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Click on date and time input box
		
		driver.findElement(By.id("dateAndTimePickerInput") ).click();
		
		// Store expected date and time
		
		String exp_year="2024";
		String exp_month="November";
		String exp_day="5";
		String exp_time="06:15";
		
		// Get current month and year frome calendar
		
		
		
		
		// Year and month
		
		while(true) {
			String cur_month_year=driver.findElement(By.xpath("//*[contains(@class,\"current-mont\")]")).getText();
			String[] cur_month_year_arr=cur_month_year.split(" ");
			String cur_month=cur_month_year_arr[0];
			String cur_year=cur_month_year_arr[1];
			
			if (exp_year.equals(cur_year) && exp_month.equals(cur_month)) {
				break;
			}
			
			driver.findElement(By.xpath("//button[text()=\"Next Month\"]")).click();
			
		}
		
		// day 
		
		List<org.openqa.selenium.WebElement> day_li=driver.findElements(By.xpath("//*[@class=\"react-datepicker__month\"]//div"));
		
		for(org.openqa.selenium.WebElement day:day_li) {
			if (day.getText().equals(exp_day)) {
				day.click();
				break;
			}
		}
		
		// Time
		
		List<org.openqa.selenium.WebElement> times_li=driver.findElements(By.xpath("//ul[contains(@class,\"time-list\")]//li"));
		
		for(org.openqa.selenium.WebElement time:times_li) {
			
			if(time.getText().equals(exp_time)) {
				time.click();
				break;
			}
		}



         }
	}


