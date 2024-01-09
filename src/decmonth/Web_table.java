package decmonth;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Web_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
						driver.get("https://testautomationpractice.blogspot.com/");
			 driver.manage().window().maximize();
			 
			 //rows count
			int rows= driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
			System.out.println("number of R="+rows);
			
			//total coloumn count
			int col= driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();
			System.out.println("number of C="+col);
			
			//specific element finding
			String element= driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[4]//td[2]")).getText();
			System.out.println(element);
			
			//4) Read data from all the rows & columns
					System.out.println("Book Name"+"     "+"Author"+"    "+"Subject"+"       "+"Price");
						for(int r=2;r<=rows;r++)
			{
				for(int c=1;c<=col;c++)
				{
					String value1=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
					System.out.print(value1+"\t"); 
				}
				System.out.println();
				
				//author
				for(int r1=2;r1<=rows;r1++)
				{
				String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]/td[2]")).getText();
				
				if(author.equals("Amit"))
				{
					String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]/td[1]")).getText();
					System.out.println(author+"    "+bookname);
				}
				
			}
				//subject
//				for(int r1=2;r1<=rows;r1++)
//				{
//				String subject=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r1+"]//td[3]")).getText();
//				
//				if(subject.equals("Javascript"))
//				{
//					String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]/td[2]")).getText();
//					System.out.println(subject+"    "+author);
//				}
//				
//			}
				int sum=0;
				for(int r1=2;r1<=rows;r1++)
				{
					String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r1+"]/td[4]")).getText();
					sum=sum+Integer.parseInt(price);//sum=0+300 =300+500=800
					
				}
				
				System.out.println("Total price of books:"+sum);
			}
			}
	}		
				


