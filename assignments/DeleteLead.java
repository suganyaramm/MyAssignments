package week2.day2.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead{
	
	    public static void main(String[] args) throws InterruptedException {
		//		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browesr
		driver.manage().window().maximize();
		
		//username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				
		//password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
		//Login
				driver.findElement(By.className("decorativeSubmit")).click();
				
	   //click on CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//click leads
				driver.findElement(By.linkText("Leads")).click();
				
				//click on find lead
				driver.findElement(By.linkText("Find Leads")).click();
				
				//click on find phone
				driver.findElement(By.linkText("Phone")).click();
				
				//click on find phone
				driver.findElement(By.name("phoneNumber")).sendKeys("987654321");
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
				
				//click on find leads
				driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
				
				 Thread.sleep(3000);
				 //click on firstlead
				//driver.findElement(By.xpath("//div[text()='Lead ID']/following::a[text()[normalize-space()='11281']]")).click();
				//driver.findElement(By.xpath("((//div[text()='Lead ID']//following::a[@class='linktext'])[1]")).click();
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
			 //delete
				driver.findElement(By.linkText("Delete")).click();
				
				
				//click on find lead
				driver.findElement(By.linkText("Find Leads")).click();
				
				
				
				//click on lead id
				driver.findElement(By.name("id")).sendKeys("12426");
         Thread.sleep(3000);
				
				
				//click on find leads
				driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
				//WebElement findElement1= driver.findElement(By.xpath("//div[@class='x-paging-info']"));
				//String findElement1= driver.findElement(By.className("x-paging-info")).getAttribute(findElement1);
				//String noRecordsTo = driver.findElement(By.className("x-paging-info")).getText();
				String noRecordsTo1 = driver.findElement(By.xpath("//div[@class='x-toolbar x-small-editor']//div[1]")).getText();
				
				//
				System.out.println(noRecordsTo1);
				//System.out.println(findElement1);
				
				
				
							
				
				//close the browser
				driver.close();
				
				
		
				
				
	    }
	
	    
}