package noncommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Digital_downloads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		 //Digital downloads
						driver.get("https://demo.nopcommerce.com/digital-downloads");
			 driver.manage().window().maximize();
//			 
//			 	 			 //If You Wait (donation)
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			//adding reviews
//			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")).click();
//			 Thread.sleep(1000);
//			 driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
//			 driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
//			 ////mail sent
//			 driver.findElement(By.xpath("//*[@id=\"addproductrating_2\"]")).click();
//			 Thread.sleep(1000);
//			 driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/button")).click();
//			 Thread.sleep(1000);
//			 driver.navigate().back();
			 //download sample
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[5]/a")).click();
			 Thread.sleep(3000);
			 //price
			 driver.findElement(By.xpath("//*[@id=\"addtocart_35_CustomerEnteredPrice\"]")).sendKeys("200");
			 Thread.sleep(2000);
			 			//add to cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_35\"]")).sendKeys("20");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-35\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-35\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[7]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[7]/div[3]/button")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila2211@gmail.com");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila@gmail.com");
			 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
			 ////mail sent
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
			 Thread.sleep(2000);
			 //back to digital again
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/a")).click();

			 
			 //Night Visions
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			//download sample
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[5]/a")).click();
			 Thread.sleep(3000);
			 			 			//add to cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_34\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-34\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-34\"]")).click();
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
			 //back to digital again
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/a")).click();

			 
			 //Science & Faith
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			 //price
			 driver.findElement(By.xpath("//*[@id=\"addtocart_36_CustomerEnteredPrice\"]")).sendKeys("20");
			 Thread.sleep(2000);
			 			 			//add to cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_36\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-36\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-36\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[6]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[6]/div[3]/button")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila2211@gmail.com");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila@gmail.com");
			 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
			 ////mail sent
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
			 Thread.sleep(2000);
			 //back to digital again

	}

}
