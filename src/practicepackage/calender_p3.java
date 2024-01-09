package practicepackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class calender_p3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		

		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		// Click on input date box
		
		driver.findElement(By.xpath("//*[@id=\"datepicker2\"]")).click();
		
		// select year
		
		WebElement el_year=driver.findElement(By.xpath("(//select[@class=\"datepick-month-year\"])[2]"));
		Select se_year=new Select(el_year);
		se_year.selectByIndex(4); // 2014
		
		// select month
		
		WebElement el_month=driver.findElement(By.xpath("//*[contains(@title,\"the month\")]"));
		Select se_month=new Select(el_month);
		se_month.selectByIndex(6);// june
		
		// select day
		
		List<WebElement> li=driver.findElements(By.xpath("//*[@class=\"datepick-month\"]//table//td"));
		
		for (WebElement day:li) {
			
			if (day.getText().equals("23")) {
				day.click();
				break;
			}
	}

	}
}
