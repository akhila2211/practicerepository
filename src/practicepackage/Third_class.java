package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Third_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://seleniumbase.io/demo_page");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id=\"myTextInput\"]")).sendKeys("akhila");
			driver.findElement(By.xpath("//textarea[@id=\"myTextarea\"]")).sendKeys("reddy");
			WebElement ref=driver.findElement(By.xpath("//input[@id=\"placeholderText\"]"));
			ref.clear();
			ref.sendKeys("sai");
			driver.findElement(By.xpath("//input[@id=\"radioButton2\"]")).click();
			WebElement ref1=driver.findElement(By.xpath("//*[@iid=\"myButton\"]"));
			ref.clear();
			ref.click();
			

}
}