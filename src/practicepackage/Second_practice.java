package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Second_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
			driver.get("https://demoqa.com/automation-practice-form");
		//	driver.manage().window().maximize();
			//driver.findElement(By.id("firstName")).sendKeys("akhila");
		//	driver.findElement(By.id("lastName")).sendKeys("reddy");
          //  driver.findElement(By.id("userEmail")).sendKeys("akhila@gmail.com");
           // driver.findElement(By.id("userNumber")).sendKeys("123456");
            //css selector
          /*  1.tag and id
            2.tag and class 
            3.tag and class and attribute
            4.tag and attribute*/
			driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("akhila");
			driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("reddy");
			driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("akhila@gmail.com");
			//driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]")).click();
			driver.findElement(By.xpath("//input[@placeholder=\"Mobile Number\"]")).sendKeys("123456");
	driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]")).sendKeys("hyd");
			
			
			
	}

}
