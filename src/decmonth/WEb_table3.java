package decmonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WEb_table3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
						driver.get("https://cosmocode.io/automation-practice-webtable/");
			 driver.manage().window().maximize();
			 
			 //rows count
			int rows= driver.findElements(By.xpath("//table[@id=\"countries\"]//tr")).size();
			System.out.println("number of R="+rows);
			
			//total coloumn count
			int col= driver.findElements(By.xpath("//table[@id=\"countries\"]//td")).size();
			System.out.println("number of C="+col);
			//specific element
//			String element= driver.findElement(By.xpath("(//td[@style=\"width: 122.667px;\"])[5]")).getText();
//			System.out.println(element);
//			
			
for(int r=2;r<=rows;r++) {
	String lang=driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[5]")).getText();
	if(lang.equals("English")) {
		
		driver.findElement(By.xpath("//table[@id=\"countries\"]//tr["+r+"]//td[1]//input")).click();
		String country=	driver.findElement(By.xpath("//table[@id=\"countries\"]//tr[\"+r\"]//td[1]")).getText();
		System.out.println(lang+ ":" +country);

	}
}
				
			}
			
	
	}


