package noncommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import practicepackage.WebElement;

public class Appreal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
						driver.get("https://demo.nopcommerce.com/apparel");
			 driver.manage().window().maximize();
			 
//			 sheos
					 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
			 Thread.sleep(1000);
//
////			 
////			 //adidas Consortium Campus 80s Running Shoes
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
			 Thread.sleep(2000);
			 //size
			 org.openqa.selenium.WebElement size=driver.findElement(By.xpath("//*[@id=\"product_attribute_9\"]"));
				Select co=new Select(size);
			co.selectByValue("22");
			//colour
			driver.findElement(By.xpath("//*[@id=\"color-squares-10\"]/li[3]/label/span/span")).click();
			 Thread.sleep(1000);
			 //add to cart
			 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_25\"]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-25\"]")).click();
			 Thread.sleep(1000);
			 //wishlist
			 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-25\"]")).click();
			 Thread.sleep(1000);
			 //added to compare list
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
			 Thread.sleep(1000);
			 //sending mail
			 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
			 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
			 ////mail sent
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
			 Thread.sleep(2000);
			 //bact to appreal
			 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
			 Thread.sleep(2000);	
//back to shoes
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
	 Thread.sleep(1000);
//	 
//	 //Nike Floral Roshe Customized Running Shoes
	 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
	 Thread.sleep(2000);
	 //size
	 org.openqa.selenium.WebElement size1=driver.findElement(By.xpath("//*[@id=\"product_attribute_6\"]"));
		Select cod=new Select(size1);
	cod.selectByValue("14");
	//colour
	 org.openqa.selenium.WebElement colour=driver.findElement(By.xpath("//*[@id=\"product_attribute_7\"]"));
		Select rc=new Select(colour);
	rc.selectByValue("18");
////	//print
//	driver.findElement(By.xpath("//*[@id=\"image-squares-8\"]/li[2]/label/span/span")).click();
//	 Thread.sleep(1000);
	 //add to cart
	 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_24\"]")).sendKeys("2");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-24\"]")).click();
	 Thread.sleep(3000);
	 //wishlist
	 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-24\"]")).click();
	 Thread.sleep(1000);
	 //added to compare list
	 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[2]/button")).click();
	 Thread.sleep(1000);
	 //sending mail
	 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[3]/button")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila22@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("hiii");
	 ////mail sent
	 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
	 Thread.sleep(2000);
	 //bact to appreal
	 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
	 Thread.sleep(2000);	
	//back to shoes
	 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
Thread.sleep(1000);
//
////Nike SB Zoom Stefan Janoski "Medium Mint"
//
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//add to cart
	 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_26\"]")).sendKeys("2");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-26\"]")).click();
	 Thread.sleep(3000);
	 //wishlist
	 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-26\"]")).click();
	 Thread.sleep(1000);
	 //added to compare list
	 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
	 Thread.sleep(1000);
	 //sending mail
	 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhilareddy22112000@gmail.com");
	 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
	 ////mail sent
	 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
	 Thread.sleep(2000);
	//bact to appreal
		 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
		 Thread.sleep(2000);
//	
			 //clothing
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")).click();
		 Thread.sleep(2000);
//		 
//		 //Custom T-Shirt
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
		 Thread.sleep(2000);
		 //adding reviews
//		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[1]")).click();
//		  Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
//		//////mail sent
//		 driver.findElement(By.xpath("//*[@id=\"addproductrating_4\"]")).click();
//		  Thread.sleep(1000);
//		  driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/button")).click();
//		 Thread.sleep(1000);
		 //enter text
		 driver.findElement(By.xpath("//*[@id=\"product_attribute_12\"]")).sendKeys("good");
		 		  Thread.sleep(1000);
		  Thread.sleep(1000);
		 //add to cart
		 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_29\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-29\"]")).click();
		 Thread.sleep(1000);
		 //wishlist
		 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-29\"]")).click();
		 Thread.sleep(1000);
		 //added to compare list
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
		 Thread.sleep(1000);
		 //sending mail
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila22112000@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
		 ////mail sent
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
		 Thread.sleep(2000);
		//bact to appreal
	 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
	 Thread.sleep(2000);
//				 //clothing
			 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")).click();
		 Thread.sleep(2000);
			 
//		 //Levi's 511 Jeans
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
		 Thread.sleep(2000);
//		//adding reviews
//		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")).click();
//		  Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
//		 Thread.sleep(1000);
//		 driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
//		//////mail sent
//		 driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[2]/div/div[3]/div[2]/div[2]")).click();
//		  Thread.sleep(1000);
//		  driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/button")).click();
//		 Thread.sleep(1000);
			 //add to cart
		 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_30\"]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-30\"]")).click();
		 Thread.sleep(1000);
//		 //wishlist
		 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-30\"]")).click();
		 Thread.sleep(1000);
		 //added to compare list
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
		 Thread.sleep(1000);
		 //sending mail
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila22112000@gmail.com");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
		 ////mail sent
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
		 Thread.sleep(2000);
		//bact to appreal
	 driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
	 Thread.sleep(2000);
	 //clothing
	 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")).click();
 Thread.sleep(2000);
//// 
// //Nike Tailwind Loose Short-Sleeve Running Shirt
 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
 Thread.sleep(2000);
 //size
 org.openqa.selenium.WebElement Size=driver.findElement(By.xpath("//*[@id=\"product_attribute_11\"]"));
	Select Te=new Select(Size);
	Te.selectByValue("30");
	 //add to cart
	 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_27\"]")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-27\"]")).click();
	 Thread.sleep(1000);
	 //wishlist
	 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-27\"]")).click();
	 Thread.sleep(1000);
	 //added to compare list
	 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
	 Thread.sleep(1000);
	 //sending mail
	 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[3]/button")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]")).sendKeys("akhila22112000@gmail.com");
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
	 ////mail sent
	 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
	 Thread.sleep(2000);
	//bact to appreal
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")).click();
Thread.sleep(2000);
////clothing
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")).click();
Thread.sleep(2000);	 
//
////Oversized Women T-Shirt
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[4]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//add to cart
	 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_28\"]")).sendKeys("2");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-28\"]")).click();
	 Thread.sleep(1000);
	 //wishlist
	 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-28\"]")).click();
	 Thread.sleep(1000);
	 //added to compare list
	 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
	 Thread.sleep(2000);
	driver.navigate().back();
	
	
	//accessories
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/ul/li[3]/a")).click();
	 Thread.sleep(1000);
	 
//	 //Obey Propaganda Hat
	 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
	Thread.sleep(2000);
	//size
	org.openqa.selenium.WebElement Size11=driver.findElement(By.xpath("//*[@id=\"product_attribute_13\"]"));
	Select fe=new Select(Size11);
	fe.selectByValue("34");
//	////add to cart
		 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_31\"]")).sendKeys("2");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-31\"]")).click();
	 Thread.sleep(1000);
//		 //wishlist
		 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-31\"]")).click();
		 Thread.sleep(1000);
		 //added to compare list
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
		 Thread.sleep(2000);
		driver.navigate().back();
	
	 //Ray Ban Aviator Sunglasses
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
		 Thread.sleep(1000);
		 //add to cart
		 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_33\"]")).sendKeys("2");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-33\"]")).click();
	 Thread.sleep(1000);
		 //wishlist
		 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-33\"]")).click();
		 Thread.sleep(1000);
		 //added to compare list
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
		 Thread.sleep(2000);
		driver.navigate().back();
		
		//Reversible Horseferry Check Belt
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
		 Thread.sleep(3000);
		 //add to cart
		 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_32\"]")).sendKeys("2");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
	 Thread.sleep(1000);
		 //wishlist
		 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-32\"]")).click();
		 Thread.sleep(2000);
		 //added to compare list
		 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
		 Thread.sleep(1000);
		driver.navigate().back();
	}
}
