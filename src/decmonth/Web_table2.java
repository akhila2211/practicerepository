package decmonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_table2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
						driver.get("https://testautomationpractice.blogspot.com/");
			 driver.manage().window().maximize();
			 
			 //rows count
			int rows= driver.findElements(By.xpath("//table[@id=\"productTable\"]//tr")).size();
			System.out.println("number of R="+rows);
			
			//total coloumn count
			int col= driver.findElements(By.xpath("//table[@id=\"productTable\"]//th")).size();
			System.out.println("number of C="+col);
			
			//specific element finding
			String element= driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr[5]//td[2]")).getText();
			System.out.println(element);
			
			//4) Read data from all the rows & columns
			System.out.println("ID"+"     "+"NAME"+"    "+"PRICE"+"       "+"SELECT");
				for(int r=1;r<=rows;r++)
					
					{
						for(int c=1;c<=col;c++)
						{
							String value=driver.findElement(By.xpath("//table[@id=\"productTable\"]//tr["+r+"]//td["+c+"]")).getText();
							System.out.print(value+"\t"); 
						}
						System.out.println();
	}

}
}
