package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Degree_application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.ascdegreecollege.ac.in/degree-application-form/");
			driver.manage().window().maximize();
			
			WebElement drop_p=driver.findElement(By.xpath("//label[@for=\"wpforms-11388-field_3\"]"));
			Select ar=new Select(drop_p);
			ar.selectByValue("B.B.A");
			ar.selectByIndex(1);
			
			driver.findElement(By.xpath("//input[@name=\"wpforms[fields][0][first]\"]")).sendKeys("akhila");
			
			WebElement drop_c=driver.findElement(By.xpath("//label[@for=\"wpforms-11388-field_4\"])[1]"));
			Select a=new Select(drop_c);
			a.selectByValue("Male");
			
			driver.findElement(By.xpath("(//div[@class=\"wpforms-field-description\"])[1]")).sendKeys("22-11-2000");
			
			
			driver.findElement(By.xpath("//input[@id=\"wpforms-11388-field_1\"]")).sendKeys("akhila@gmail.com");
	}

}
