package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Drop_downpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://demo.automationtesting.in/Register.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).sendKeys("akhila");
			driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys("reddy");
			driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys("hyd");
			driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys("abc@gmail.com");
			driver.findElement(By.xpath("//input[@type=\"tel\"]")).sendKeys("1234567890");
			driver.findElement(By.xpath("//input[@id=\"firstpassword\"]")).sendKeys("1234567890");
			driver.findElement(By.xpath("//input[@id=\"secondpassword\"]")).sendKeys("1234567890");
			driver.findElement(By.xpath("//input[@value=\"Male\"]")).click();
			driver.findElement(By.xpath("//input[@value=\"Movies\"]")).click();
			
			WebElement drop_p=driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
			Select ar=new Select(drop_p);
			ar.selectByValue("Analytics");
			
			WebElement drop_c=driver.findElement(By.xpath("//select[@id=\"country\"]"));
			Select a=new Select(drop_c);
			a.selectByValue("Australia");
			
			WebElement drop_d=driver.findElement(By.xpath("//select[@placeholder=\"Year\"]"));
			Select c=new Select(drop_d);
			c.selectByValue("2000");
			

			WebElement drop_a=driver.findElement(By.xpath("//select[@placeholder=\"Month\"]"));
			Select b=new Select(drop_a);
			b.selectByIndex(2);
			

			WebElement drop_e=driver.findElement(By.xpath("//select[@placeholder=\"Day\"]"));
			Select s=new Select(drop_e);
			s.selectByIndex(1);
				}

}
