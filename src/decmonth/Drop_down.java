package decmonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.openqa.selenium.support.ui.Select;



public class Drop_down {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
			 driver.manage().window().maximize();
//			
//			WebElement drop_p=driver.findElement(By.xpath("//select[@id=\"country-list\"]"));
//			Select ar=new Select(drop_p);
//			ar.selectByValue("1");
//			Thread.sleep(2000);
//
//			WebElement drop_s=driver.findElement(By.xpath("//select[@id=\"state-list\"]"));
//			Select r=new Select(drop_s);
//			r.selectByValue("16");
			 
	}

}