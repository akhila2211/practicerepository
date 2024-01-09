package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Fb_sign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
			driver.manage().window().maximize();
			WebElement drop_d=driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
			Select sc=new Select(drop_d);
			sc.selectByIndex(1);
			WebElement drop_p=driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));
			Select ar=new Select(drop_p);
			ar.selectByIndex(0);
			WebElement drop_c=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
			Select a=new Select(drop_c);
			a.selectByIndex(4);
			WebElement drop_e=driver.findElement(By.xpath("(//input[@name=\"sex\"])"));
			Select b=new Select(drop_e);
			b.selectByValue("Female");
	}

}
