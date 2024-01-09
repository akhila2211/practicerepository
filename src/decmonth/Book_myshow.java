package decmonth;

import java.time.Duration;
import java.util.List;

import javax.swing.JList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Book_myshow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://in.bookmyshow.com/explore/home/hyderabad");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.findElement(By.xpath("//span[@class=\"bwc__sc-1nbn7v6-10 cntvL ellipsis\"]")).click();
		List<WebElement> list=	 driver.findElements(By.xpath("//ul[@class=\"bwc__sc-ttnkwg-15 gZrltM\"]/li"));
		for(WebElement cityname : list) {
			String S="Pune";
			if(cityname.getText().contains(S))
				cityname.click();
		}
			 
	}

}
