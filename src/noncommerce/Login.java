package noncommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
						driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fcomputers");
			 driver.manage().window().maximize();
			 
			 //register
			 driver.findElement(By.linkText("Register")).click();
			 driver.findElement(By.xpath("//input[@id=\"gender-female\"]")).click();
			 driver.findElement(By.xpath("//input[@id=\"FirstName\"]")).sendKeys("Akhila");
			 driver.findElement(By.xpath("//input[@id=\"LastName\"]")).sendKeys("Reddy");
			 
              //calender
				WebElement drop_p=driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
				Select ar=new Select(drop_p);
				ar.selectByValue("1");
				Thread.sleep(2000);
				WebElement drop_q=driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
				Select as=new Select(drop_q);
				as.selectByValue("3");
				Thread.sleep(2000);
				WebElement drop_r=driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
				Select at=new Select(drop_r);
				at.selectByValue("2000");
				
				WebElement ref= driver.findElement(By.xpath("//input[@type=\"email\"]"));
						ref.sendKeys("akhilareddy22112000@gmail.com");
				 driver.findElement(By.xpath("//input[@id=\"Company\"]")).sendKeys("charani");
				// driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("akhilareddy");
				// driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("akhilareddy");
				// driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();
					Thread.sleep(2000);
					// driver.findElement(By.xpath("//a[@class=\"button-1 register-continue-button\"]")).click();
					driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("akhilareddy");
					 driver.findElement(By.xpath("//input[@id=\"ConfirmPassword\"]")).sendKeys("akhilareddy");
						 driver.findElement(By.xpath("//button[@name=\"register-button\"]")).click();
							Thread.sleep(2000);
							
							
							//login
							 driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
							 driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys("akhilareddy22112000@gmail.com");
										 driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys("akhilareddy");
							 driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
								Thread.sleep(2000);
								 //	 computer
						           Thread.sleep(2000);
						            
						           driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
						            
						           driver.findElement(By.xpath("(//a[text()=\"Desktops \"])[3]")).click();
						      
					               Thread.sleep(2000);
					               
					               driver.findElement(By.xpath("//img[@alt=\"Picture of Build your own computer\"]")).click();
					               
					               Thread.sleep(3000);
					               
					               
					     //INSPECTING THE ELEMENT
					               
					               
					             WebElement com= driver.findElement(By.xpath("//select[@id=\"product_attribute_1\"]"));
					             
					             Select Processer=new Select(com);
					             
					             Processer.selectByVisibleText("2.2 GHz Intel Pentium Dual-Core E2200");
					             
				 
///HDD
 
driver.findElement(By.id("product_attribute_3_6")).click();

Thread.sleep(2000);

driver.findElement(By.id("product_attribute_3_7")).click();

Thread.sleep(2000);

//OS

  driver.findElement(By.id("product_attribute_4_9")).click();
  
  Thread.sleep(2000);
  
  driver.findElement(By.id("product_attribute_4_8")).click();
  
  Thread.sleep(2000);
  
//  
////SOFTWARE
//  
  	driver.findElement(By.id("product_attribute_5_11")).click();
  	
  	Thread.sleep(2000);
  	
  	driver.findElement(By.id("product_attribute_5_12")).click();
  	
  	Thread.sleep(2000);
  	
  	driver.findElement(By.id("product_attribute_5_10")).click();
  	
	Thread.sleep(2000);
//  	
////ADD TO CARD
//  	 	
 	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-1\"]")).click();
//  	
//  	//  	/  	////ELEMENT NUMBER TWO
//  	
////NOTEBOOK==
//  	
  	driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
  	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[text()=\"Notebooks \"])[3]")).click();
	
	Thread.sleep(2000);
//	
////CPU TYPE ==========
	
	driver.findElement(By.id("attribute-option-6")).click();
	
	Thread.sleep(1000);
	
	driver.findElement(By.id("attribute-option-7")).click();
	
	Thread.sleep(2000);
//   
////MEMORY
//	
	driver.findElement(By.id("attribute-option-8")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("attribute-option-9")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.id("attribute-option-10")).click();
	
	Thread.sleep(3000);
//	
//	////SORT BYY
WebElement	s1=	driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

	Select Sortby=new Select(s1);
	
	Sortby.selectByVisibleText("Created on");
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-8\"]")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-8\"]")).click();
	
////SOFTWARE ELEMENT NUMBER THREE
//	
	driver.findElement(By.xpath("(//a[text()=\"Computers \"])[1]")).click();
  	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//a[text()=\"Software \"])[3]")).click();
	Thread.sleep(2000);
//
//	//SORT BYEE
//	
          WebElement A1= driver.findElement(By.xpath("//select[@id=\"products-orderby\"]"));

          Select Sortby1=new Select(A1);
          
          Thread.sleep(2000);
          
          Sortby1.selectByVisibleText("Created on");
          
          Thread.sleep(1000);
          
          driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
          
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-11\"]")).click();
          
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button")).click();
          
          Thread.sleep(3000);
          
          driver.findElement(By.id("FriendEmail")).sendKeys("akhila@gmail.com");
          
          Thread.sleep(2000);
          
          driver.findElement(By.id("YourEmailAddress"));
          
          Thread.sleep(2000);
          
          driver.findElement(By.id("PersonalMessage")).sendKeys("HELLO BUDDY ");
          
          Thread.sleep(2000);
          
          driver.findElement(By.name("send-email")).click();
          Thread.sleep(2000);
//  	
////electronics
//             
              driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
              Thread.sleep(1000);
              //camera$photo
            driver.findElement(By.xpath("(//a[text()=\"Camera & photo \"])[3]")).click();
           Thread.sleep(2000);
           //nikson
        driver.findElement(By.xpath("//img[@alt=\"Picture of Nikon D5500 DSLR\" ]")).click();
        Thread.sleep(2000);
        //added to compare list
        driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]")).click();
        Thread.sleep(1000);
        //adding email to friend
        driver.findElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class=\"friend-email\"]")).sendKeys("akhila@gmail.com");
        driver.findElement(By.xpath("//textarea[@class=\"your-email\"]"));
       //mail sent
       driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
        Thread.sleep(1000);
      //bact to electronics
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//a[text()=\"Camera & photo \"])[3]")).click();
        Thread.sleep(2000);
        //nikson
     driver.findElement(By.xpath("//img[@alt=\"Picture of Nikon D5500 DSLR\" ]")).click();
     Thread.sleep(2000);
//        
//        //Nikon D5500 DSLR - Black
        driver.findElement(By.xpath("//input[@id=\"product_enteredQuantity_14\"]")).sendKeys("2");
        //add to cart
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-14\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id=\"open-estimate-shipping-popup-14\"]")).click();
        //adress to ship
        WebElement country=driver.findElement(By.xpath("(//select[@class=\"estimate-shipping-address-control\"])[1]"));
		Select co=new Select(country);
		co.selectByValue("133");
        Thread.sleep(1000);
        WebElement state=driver.findElement(By.xpath("(//select[@placeholder=\"State / province\"])[1]"));
		Select te=new Select(state);
		te.selectByValue("0");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder=\"Zip / postal code\"])[1]")).sendKeys("500072");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class=\"estimate-shipping-row-item shipping-item\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//button[@class=\"button-2 apply-shipping-button\"])[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-14\"]")).click();
        
//      //Nikon D5500 DSLR - red
        driver.findElement(By.xpath("//input[@id=\"product_enteredQuantity_15\"]")).sendKeys("1");
        //add to cart
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-15\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id=\"open-estimate-shipping-popup-15\"]")).click();
        //adress to ship
        WebElement Country=driver.findElement(By.xpath("((//select[@class=\"estimate-shipping-address-control\"])[1])"));
		Select Co=new Select(Country);
		Co.selectByValue("134");
        Thread.sleep(1000);
        WebElement State=driver.findElement(By.xpath("(//select[@placeholder=\"State / province\"])[1]"));
		Select Tes=new Select(State);
		Tes.selectByValue("0");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@placeholder=\"Zip / postal code\"])[1]")).sendKeys("500072");
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[@class=\"estimate-shipping-row-item shipping-item shipping-header-item\"])[1]")).click();
        driver.findElement(By.xpath("(//button[@class=\"button-2 apply-shipping-button\"])[1]")).click();
        Thread.sleep(2000);
        //wishlist
        driver.findElement(By.xpath("//button[@id=\"add-to-wishlist-button-15\"]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(2000);
//        //Apple iCam
        driver.findElement(By.xpath("//strong[@class=\"current-item\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@alt=\"Picture of Apple iCam\"]")).click();
        Thread.sleep(2000);
        //added to compare list
        driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]")).click();
        Thread.sleep(1000);
        //adding email to friend
      driver.findElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]")).click();
       Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder=\"Enter friend's email.\"]")).sendKeys("akhila@gmail.com");
       driver.findElement(By.xpath("//textarea[@placeholder=\"Enter personal message (optional).\"]")).sendKeys("hello");
//        //mail sent
       driver.findElement(By.xpath("//button[@name=\"send-email\"]")).click();
      Thread.sleep(1000);
//again electronics
      driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
      Thread.sleep(1000);
      //camera$photo
    driver.findElement(By.xpath("(//a[text()=\"Camera & photo \"])[3]")).click();
   Thread.sleep(2000);
   
//      //Leica T Mirrorless Digital Camera
   
      driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
      Thread.sleep(2000);
      //add to cart
      driver.findElement(By.xpath("//input[@id=\"product_enteredQuantity_16\"]")).sendKeys("1");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-16\"]")).click();
      //adress to ship
      driver.findElement(By.xpath("//*[@id=\"open-estimate-shipping-popup-16\"]/span")).click();
      Thread.sleep(1000);
      WebElement Country1=driver.findElement(By.xpath("((//select[@class=\"estimate-shipping-address-control\"])[1])"));
		Select Co1=new Select(Country1);
		Co1.selectByValue("134");
      Thread.sleep(1000);
      WebElement State1=driver.findElement(By.xpath("(//select[@placeholder=\"State / province\"])[1]"));
		Select Te1=new Select(State1);
		Te1.selectByValue("0");
      Thread.sleep(1000);
      driver.findElement(By.xpath("(//input[@placeholder=\"Zip / postal code\"])[1]")).sendKeys("500072");
      Thread.sleep(1000);
      driver.findElement(By.xpath("(//div[@class=\"estimate-shipping-row-item shipping-item shipping-header-item\"])[1]")).click();
      driver.findElement(By.xpath("(//button[@class=\"button-2 apply-shipping-button\"])[1]")).click();
     Thread.sleep(2000);
    //wishlist
      driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-16\"]")).click();
      Thread.sleep(1000);
      //added to compare list
      driver.findElement(By.xpath("//button[@class=\"button-2 add-to-compare-list-button\"]")).click();
      Thread.sleep(1000);
      //adding email to friend
    driver.findElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]")).click();
     Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@placeholder=\"Enter friend's email.\"]")).sendKeys("akhila@gmail.com");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//input[@placeholder=\"Enter your email address.\"]")).sendKeys("akhilareddy@gmail.com");
      Thread.sleep(1000);
     driver.findElement(By.xpath("//textarea[@placeholder=\"Enter personal message (optional).\"]")).sendKeys("hello");
//      //mail sent
     driver.findElement(By.xpath("//button[@name=\"send-email\"]")).click();
    Thread.sleep(1000);
    driver.navigate().back();

//   
////cellphones
//
   driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
   Thread.sleep(1000);
//    //cell
//    //HTC One M8 Android L 5.0 Lollipop
              
  driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[2]/a")).click();
 Thread.sleep(2000);
 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
 Thread.sleep(2000);
//add to cart
 driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_18\"]")).click();
 Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-18\"]")).click();
 //wishlist
 driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-18\"]")).click();
 Thread.sleep(1000);
 //added to compare list
 driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
 Thread.sleep(1000);
 //adding reviews
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")).click();
Thread.sleep(1000);
 driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
// //mail sent
driver.findElement(By.xpath("//*[@id=\"addproductrating_3\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/button")).click();
Thread.sleep(1000);
////bact to electronics
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[2]/a")).click();
Thread.sleep(2000);

////HTC One Mini Blue
//
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//add to cart
driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_19\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-19\"]")).click();
//wishlist
driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-19\"]")).click();
Thread.sleep(1000);
//added to compare list
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
Thread.sleep(1000);
//adding reviews
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
////mail sent
driver.findElement(By.xpath("//*[@id=\"addproductrating_4\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[2]/button")).click();
Thread.sleep(1000);
//bact to electronics
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[2]/a")).click();
Thread.sleep(2000);

////Nokia Lumia 1020
//
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//add to cart
driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_20\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-20\"]")).click();
//wishlist
driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-20\"]")).click();
Thread.sleep(1000);
//added to compare list
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
Thread.sleep(1000);
//adding reviews
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
////mail sent
driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[1]/div/div[3]/div[2]/div[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[2]/button")).click();
Thread.sleep(1000);
//bacK to electronics
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
Thread.sleep(2000);

//OtHER
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[3]/a")).click();
Thread.sleep(1000);
//Beats Pill 2.0 Wireless Speaker

driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//add to cart
driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_21\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-21\"]")).click();
Thread.sleep(1000);
//wishlist
driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-21\"]")).click();
Thread.sleep(1000);
//added to compare list
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[9]/div[2]/button")).click();
Thread.sleep(1000);
//adding reviews
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
////mail sent
driver.findElement(By.xpath("//*[@id=\"addproductrating_4\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/form/div[2]/button")).click();
Thread.sleep(1000);
//bact to electronics
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
Thread.sleep(2000);

//OtHER
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[3]/a")).click();
Thread.sleep(1000);

//Portable Sound Speakers
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//add to cart
driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_23\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-23\"]")).click();
Thread.sleep(1000);
//wishlist
driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-23\"]")).click();
Thread.sleep(1000);
//added to compare list
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
Thread.sleep(1000);
//sending mail
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
////mail sent
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
Thread.sleep(2000);
//bact to electronics
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
Thread.sleep(2000);
//OtHER
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[2]/ul/li[3]/a")).click();
Thread.sleep(1000);

//Universal 7-8 Inch Tablet Cover
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//add to cart
driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_22\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-22\"]")).click();
Thread.sleep(1000);
//wishlist
driver.findElement(By.xpath("//*[@id=\"add-to-wishlist-button-22\"]")).click();
Thread.sleep(1000);
//added to compare list
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[2]/button")).click();
Thread.sleep(1000);
//sending mail
driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[8]/div[3]/button")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"FriendEmail\"]")).sendKeys("akhila@gmail.com");
driver.findElement(By.xpath("//*[@id=\"PersonalMessage\"]")).sendKeys("hiii");
////mail sent
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")).click();
Thread.sleep(2000);
//bact to electronics
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[2]/a")).click();
Thread.sleep(3000);	



//apparel
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
Thread.sleep(2000);	


//sheos
		 driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[1]/div/div/a/img")).click();
Thread.sleep(1000);
//
////
//////adidas Consortium Campus 80s Running Shoes
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//size
org.openqa.selenium.WebElement siz=driver.findElement(By.xpath("//*[@id=\"product_attribute_9\"]"));
	Select cot=new Select(siz);
cot.selectByValue("22");
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
////Nike Floral Roshe Customized Running Shoes
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
//////print
//driver.findElement(By.xpath("//*[@id=\"image-squares-8\"]/li[2]/label/span/span")).click();
//Thread.sleep(1000);
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
////Custom T-Shirt
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//adding reviews
//driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[1]")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
////////mail sent
//driver.findElement(By.xpath("//*[@id=\"addproductrating_4\"]")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/button")).click();
//Thread.sleep(1000);
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
//	 //clothing
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[1]/div/div[2]/div/div/a/img")).click();
Thread.sleep(2000);

////Levi's 511 Jeans
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[1]/a/img")).click();
Thread.sleep(2000);
////adding reviews
//driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
////////mail sent
//driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[2]/div/div[3]/div[2]/div[2]")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/button")).click();
//Thread.sleep(1000);
//add to cart
driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_30\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-30\"]")).click();
Thread.sleep(1000);
////wishlist
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
////Nike Tailwind Loose Short-Sleeve Running Shirt
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//size
WebElement Size4=driver.findElement(By.xpath("//*[@id=\"product_attribute_11\"]"));
Select Ten=new Select(Size4);
Ten.selectByValue("30");
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

////Obey Propaganda Hat
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
Thread.sleep(2000);
//size
org.openqa.selenium.WebElement Size11=driver.findElement(By.xpath("//*[@id=\"product_attribute_13\"]"));
Select fe=new Select(Size11);
fe.selectByValue("34");
//////add to cart
driver.findElement(By.xpath("//*[@id=\"product_enteredQuantity_31\"]")).sendKeys("2");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-31\"]")).click();
Thread.sleep(1000);
////wishlist
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



//digital downloads
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div[1]/div[2]/ul/li[4]/a")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[1]/a/img")).click();
Thread.sleep(1000);
//adding reviews
//driver.findElement(By.xpath("//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[3]/div[2]/a[2]")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"AddProductReview_Title\"]")).sendKeys("akhila");
//driver.findElement(By.xpath("//*[@id=\"AddProductReview_ReviewText\"]")).sendKeys("ok");
//////mail sent
//driver.findElement(By.xpath("//*[@id=\"addproductrating_2\"]")).click();
//Thread.sleep(1000);
//driver.findElement(By.xpath("//*[@id=\"review-form\"]/form/div[3]/button")).click();
//Thread.sleep(1000);
//driver.navigate().back();
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
driver.findElement(By.xpath("//*[@id=\"YourEmailAddress\"]"));
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



//books
driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
Thread.sleep(2000);

//Fahrenheit 451 by Ray Bradbury
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
////First Prize Pies
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
// //adress to ship
 WebElement Countryi=driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
	Select Cot1=new Select(Countryi);
	Cot1.selectByValue("1");
 Thread.sleep(1000);
WebElement States=driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]"));
	Select Te=new Select(States);
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
// //adress to ship
 WebElement Country11=driver.findElement(By.xpath("//*[@id=\"CountryId\"]"));
	Select Cou=new Select(Country11);
	Cou.selectByValue("239");
 Thread.sleep(1000);
WebElement State11=driver.findElement(By.xpath("//*[@id=\"StateProvinceId\"]"));
	Select Tel=new Select(State11);
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


