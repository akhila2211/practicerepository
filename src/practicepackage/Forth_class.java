package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Forth_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.out.println("hi all");
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
			driver.manage().window().maximize();
			WebElement drop_d=driver.findElement(By.xpath("//select[@id=\"first\"]"));
			Select sc=new Select(drop_d);
			sc.selectByIndex(1);
			Thread.sleep(2000);
			sc.selectByValue("Microsoft");
			Thread.sleep(2000);
			sc.selectByVisibleText("Yahoo");
			WebElement drop_p=driver.findElement(By.xpath("//select[@id=\"animals\"]"));
			Select ar=new Select(drop_p);
			ar.selectByIndex(0);
			Thread.sleep(2000);
			ar.selectByValue("big baby cat");
			Thread.sleep(2000);
			ar.selectByVisibleText("Baby Cat");
			Thread.sleep(2000);
			WebElement drop_c=driver.findElement(By.xpath("//select[@id=\"second\"]"));
			Select a=new Select(drop_c);
			a.selectByIndex(1);
			Thread.sleep(2000);
			a.selectByValue("pizza");
			Thread.sleep(2000);
			a.selectByVisibleText("Bonda");
			Thread.sleep(2000);
			a.deselectByIndex(1);
			Thread.sleep(2000);
			a.deselectAll();
			
			
}
}