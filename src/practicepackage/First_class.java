package practicepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class First_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  System.out.println("hi all");
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"); 
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	

//	driver.findElement(By.cssSelector("input[placeholder=\"Email address or phone number\"]")).sendKeys("cssselectorcombination");
//	driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("457678");
	//driver.findElement(By.xpath("//input[@placeholder=\"Email address or phone number\"]")).sendKeys("akhila@gmail.com");

//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("password");
driver.findElement(By.xpath("//*[starts-with(@id,\"pass\")]")).sendKeys("password");
driver.findElement(By.xpath("//input[contains(@placeholder,\"Email address or phone number\")]")).sendKeys("akhila@gmail.com");
driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
driver.findElement(By.xpath("(//input[@name=\"sex\"])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@name=\"sex\"])[2]")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@title=\"Day\"]")).sendKeys("21");
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@id=\"month\"]")).sendKeys("nov");
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@title=\"Year\"]")).sendKeys("2000");

			}
}