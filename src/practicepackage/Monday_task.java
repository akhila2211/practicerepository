package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Monday_task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://formy-project.herokuapp.com/autocomplete");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@placeholder=\"Enter address\"]")).sendKeys("hyd");
			driver.findElement(By.xpath("//input[@placeholder=\"Street address\"]")).sendKeys("abc");
			driver.findElement(By.xpath("//input[@placeholder=\"Street address 2\"]")).sendKeys("bng");
				driver.findElement(By.xpath("//input[@placeholder=\"City\"]")).sendKeys("ptc");
			driver.findElement(By.xpath("//input[@placeholder=\"State\"]")).sendKeys("ts");
			driver.findElement(By.xpath("//input[@placeholder=\"Zip code\"]")).sendKeys("12345");
			driver.findElement(By.xpath("//input[@placeholder=\"Country\"]")).sendKeys("india");
			driver.findElement(By.xpath("//input[@placeholder=\"Enter first name\"]")).sendKeys("akhila");
			   	     Thread.sleep(4000);	
			   	     
			   	//form     
		driver.navigate().to("https://formy-project.herokuapp.com/form");
			   	  System.out.println(driver.getTitle());
			   	  System.out.println(driver.getCurrentUrl());
//		driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("reddy");
		driver.findElement(By.xpath("//input[@id=\"job-title\"]")).sendKeys("it");
	driver.findElement(By.xpath("//input[@id=\"radio-button-1\"]")).click();
	driver.findElement(By.xpath("//input[@id=\\\"checkbox-2\\\"]")).click();

	
	//radio buttons
			   	  driver.navigate().to("https://formy-project.herokuapp.com/radiobutton");
			   	  System.out.println(driver.getTitle());
			   	  System.out.println(driver.getCurrentUrl());
				//	driver.manage().window().maximize();
				driver.findElement(By.xpath("//label[@for=\"radio-button-1\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//label[@for=\"radio-button-2\"]")).click();
					Thread.sleep(2000);
					driver.findElement(By.xpath("//label[@for=\"radio-button-3\"]")).click();

	}			


}
