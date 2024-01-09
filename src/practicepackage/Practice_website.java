package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Practice_website {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://formstone.it/components/dropdown/demo/");
			driver.manage().window().maximize();
			WebElement drop_d=driver.findElement(By.xpath("(//label[@class=\"form_label\"])[1]"));
			Select sc=new Select(drop_d);
			sc.selectByIndex(1);
			Thread.sleep(2000);
			

	}

}
