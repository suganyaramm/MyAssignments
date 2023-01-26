package week2.day2.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	
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
							
							//click on email
							driver.findElement(By.xpath("//span[text()='Email']")).click();
							
							//find email
							driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("quality.s@gmail.com");
							//click on find leads
							driver.findElement(By.xpath("//td[@class='x-btn-center']//button[text()='Find Leads']")).click();
							
							Thread.sleep(3000);
							
							//click on first lead
							driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
							//get captured leadid
							String changetxt = driver.findElement(By.id("viewLead_companyName_sp")).getText();
							System.out.println(changetxt);


							//click on duplicate lead
							driver.findElement(By.linkText("Duplicate Lead")).click();

							//Verify title

							String title = driver.getTitle();
							String cap = "Duplicate Lead";
							boolean sametitle;
							if (title.equals(cap)){
							System.out.println("Title is verified");
									 };
									 Thread.sleep(3000);
									 
							//click create lead
							 driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
									 
							//verify the duplicate lead is same as captured lead
							 String changetxt1 = driver.findElement(By.id("viewLead_companyName_sp")).getText();
							System.out.println(changetxt1);
										
										
						    boolean sameid;
										
							if (changetxt1.equals(changetxt)){
								System.out.println("Samename is verified");
								}
							else {
								System.out.println("id is different");
												 };
												 
										
							
	    }
}