package noncommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.netty.util.AsciiString;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		 
			driver.get("https://magento.softwaretestingboard.com/");
			 driver.manage().window().maximize();
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("akhila");
			 
			 driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("akhila");
			 
			WebElement ab= driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
           ab.sendKeys("akhila2211200012@gmail.com");
           
           driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("akhila@123");
           driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]")).sendKeys("akhila@123");
           Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span")).click();
			 Thread.sleep(2000);
			 WebElement D= driver.findElement(By.xpath("//p[text()=\"akhila2211200012@gmail.com\"]"));
			 D.getText();
			 System.out.println("D");
			 
//			 if((D.equals("akhila22112000@gmail.com")){
//				 System.out.println(ab.getText());
//			 }
//	
//	
	

	}
	}

