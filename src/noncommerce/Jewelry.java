package noncommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Jewelry {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		 //jewelry
			driver.get("https://demo.nopcommerce.com/jewelry");
			 driver.manage().window().maximize();
			 
//			 //Elegant Gemstone Necklace (rental)
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
//			 //date
//			 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[4]")).click();
//			 Thread.sleep(3000);
//			 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]")).click();
//			 Thread.sleep(1000);
			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_40\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-40\"]")).click();
			 Thread.sleep(1000);
			 //adress to ship
			 driver.findElement(By.xpath("//*[@id=\"open-estimate-shipping-popup-40\"]/span")).click();
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
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-40\"]/div[4]/div[1]/div/div[2]")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-40\"]/div[4]/div[1]/div/div[3]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-40\"]/div[4]/div[1]/div/div[4]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-40\"]/div[5]/button")).click();
		 Thread.sleep(2000);
		 			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-40\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila2211@gmail.com");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila@gmail.com");
			 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
			 ////mail sent
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
			 Thread.sleep(2000);
			 //back to jewelry
			 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
			 Thread.sleep(2000);
			 
			 //Flower Girl Bracelet
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_41\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-41\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-41\"]")).click();
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
			 //back to jewelry
			 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
			 Thread.sleep(2000);
			 
			 //Vintage Style Engagement Ring
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_42\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-42\"]")).click();
			 Thread.sleep(1000);
			 //adress to ship
			 driver.findElement(By.xpath("//*[@id=\"open-estimate-shipping-popup-42\"]/span")).click();
			 Thread.sleep(3000);
//		      //adress to ship
		      WebElement Country2=driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
				Select Coun=new Select(Country2);
				Coun.selectByValue("133");
		      Thread.sleep(1000);
	      WebElement State2=driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]"));
				Select Tela=new Select(State2);
				Tela.selectByValue("0");
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"ZipPostalCode\"]")).sendKeys("502319");
		      Thread.sleep(3000);
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-42\"]/div[4]/div[1]/div/div[2]")).click();
		      Thread.sleep(2000);
		      driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-42\"]/div[4]/div[1]/div/div[3]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-42\"]/div[4]/div[1]/div/div[4]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"estimate-shipping-popup-42\"]/div[5]/button")).click();
		 Thread.sleep(2000);
		 			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-42\"]")).click();
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
			 //back to jewelry
			 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();

			 
	}

}
