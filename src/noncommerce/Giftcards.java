package noncommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Giftcards {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		 //GIFT CARDS
			driver.get("https://demo.nopcommerce.com/gift-cards");
			 driver.manage().window().maximize();
			 
			 //$25 Virtual Gift Card
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"giftcard_43_RecipientName\"]")).sendKeys("hiii");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_43_RecipientEmail\"]")).sendKeys("akhila2211@gmail.com");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_43_SenderName\"]")).sendKeys("hello");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_43_SenderEmail\"]")).sendKeys("akhila@gmail.com");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_43_Message\"]")).sendKeys("how r u");
			 Thread.sleep(1000);
			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_43\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-43\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-43\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
			 Thread.sleep(3000);
			 //back to gift
driver.navigate().back();
			 Thread.sleep(2000);

			 
			 //$50 Physical Gift Card
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"giftcard_44_RecipientName\"]")).sendKeys("hiii");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_44_SenderName\"]")).sendKeys("akhila");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_44_Message\"]")).sendKeys("hello");
			 Thread.sleep(1000);
			 			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_44\"]")).sendKeys("2");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-44\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-44\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //back to gift
			 driver.navigate().back();
			 Thread.sleep(2000);
			 
			 
			 //$100 Physical Gift Card
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
			 Thread.sleep(2000);
			 //sending  Gift Card
			 driver.findElement(By.xpath("//*[@id=\"giftcard_45_RecipientName\"]")).sendKeys("saiii");
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_45_SenderName\"]")).sendKeys("akhila");
					 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"giftcard_45_Message\"]")).sendKeys("hello");
			 Thread.sleep(1000);
			 			//add cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_45\"]")).sendKeys("4");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-45\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-45\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //back to page
			 driver.navigate().back();
			 Thread.sleep(2000);
			 
			 
	}

}
