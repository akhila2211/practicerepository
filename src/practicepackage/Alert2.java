package practicepackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
			driver.manage().window().maximize();
			
		driver.findElement(By.xpath("//button[@onclick=\"alertFunction()\"]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@onclick=\"confirmFunction()\"]")).click();
			driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
			driver.findElement(By.id("promptBox")).click();
			 Alert ref= driver.switchTo().alert();
			  String retrived_from_alert=ref.getText();
			  System.out.println(retrived_from_alert);
			  ref.sendKeys("hi");

}
}