package noncommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Books {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		 //Books
			driver.get("https://demo.nopcommerce.com/books");
			 driver.manage().window().maximize();
			 
//			 //Fahrenheit 451 by Ray Bradbury
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			 //add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_37\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-37\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-37\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila2211@gmail.com");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila@gmail.com");
			 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
			 ////mail sent
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
			 Thread.sleep(2000);
			 //back to books
			 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
//			 
//			 //First Prize Pies
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_38\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-38\"]")).click();
			 Thread.sleep(1000);
			 //adress to ship
			 driver.findElement(By.xpath("//*[@id=\"open-estimate-shipping-popup-38\"]/span")).click();
			 Thread.sleep(2000);
//		      //adress to ship
		      WebElement Country=driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
				Select Co=new Select(Country);
				Co.selectByValue("1");
		      Thread.sleep(1000);
	      WebElement State=driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]"));
				Select Te=new Select(State);
				Te.selectByValue("0");
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("44101");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-38\"]/div[4]/div[1]/div/div[2]")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-38\"]/div[4]/div[1]/div/div[3]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-38\"]/div[4]/div[1]/div/div[4]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-38\"]/div[5]/button")).click();
		 Thread.sleep(2000);
		 			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-38\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila2211@gmail.com");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]"));
			 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
			 ////mail sent
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
			 Thread.sleep(2000);
			 //back to books
			 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
			 
			 //Pride and Prejudice
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_39\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-39\"]")).click();
			 Thread.sleep(1000);
			 //adress to ship
			 driver.findElement(By.xpath("//*[@id=\"open-estimate-shipping-popup-39\"]/span")).click();
			 Thread.sleep(3000);
//		      //adress to ship
		      WebElement Country1=driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
				Select Cou=new Select(Country1);
				Cou.selectByValue("239");
		      Thread.sleep(1000);
	      WebElement State1=driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]"));
				Select Tel=new Select(State1);
				Tel.selectByValue("0");
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("1001");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-39\"]/div[4]/div[1]/div/div[2]")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-39\"]/div[4]/div[1]/div/div[3]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-39\"]/div[4]/div[1]/div/div[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-39\"]/div[5]/button")).click();
		 Thread.sleep(2000);
		 			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-39\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila2211@gmail.com");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila@gmail.com");
			 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
			 ////mail sent
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
			 Thread.sleep(2000);
			 
	}
}
