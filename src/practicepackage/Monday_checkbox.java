package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Monday_checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://formy-project.herokuapp.com");
		driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
	   	  System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		
		
	   	//form     
		driver.navigate().to("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
			   	  System.out.println(driver.getTitle());
			   	  System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("reddy");
		driver.findElement(By.xpath("//input[@id=\"job-title\"]")).sendKeys("it");
	driver.findElement(By.xpath("//input[@value=\"radio-button-2\"]")).click();
	Thread.sleep(2000);
   driver.findElement(By.xpath("//input[@value=\"checkbox-2\"]")).click();
	Thread.sleep(2000);
		
		
		//check box
	
	driver.get("https://formy-project.herokuapp.com/checkbox");
		driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
	   	  System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//input[@id=\"checkbox-1\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id=\"checkbox-2\"]")).click();
	Thread.sleep(2000);
driver.findElement(By.xpath("//input[@id=\"checkbox-3\"]")).click();

		
		
	}

}
