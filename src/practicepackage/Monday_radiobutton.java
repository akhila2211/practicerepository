package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Monday_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		//radio buttons
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
	   	  System.out.println(driver.getCurrentUrl());
	driver.findElement(By.xpath("//input[@id=\"radio-button-1\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"option2\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value=\"option3\"]")).click();
		
		//buttons
		driver.get("https://formy-project.herokuapp.com/buttons");
		driver.manage().window().maximize();
		 System.out.println(driver.getTitle());
	   	  System.out.println(driver.getCurrentUrl());
	   	  driver.findElement(By.xpath("(//button[@class=\"btn btn-lg btn-primary\"])[1]")).click();
			Thread.sleep(2000);
		   	  driver.findElement(By.xpath("//button[@class=\"btn btn-lg btn-success\"]")).click();
				Thread.sleep(2000);
			   	  driver.findElement(By.xpath("//button[@class=\"btn btn-lg btn-danger\"]")).click();
					Thread.sleep(2000);
	   	  driver.findElement(By.xpath("(//button[@class=\"btn btn-lg btn-primary\"])[3]")).click();
			Thread.sleep(2000);
		   	  driver.findElement(By.xpath("//button[@data-toggle=\"dropdown\"]")).click();



	}

}
