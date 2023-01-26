package week2.day2.assignments;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
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
							
				//click on   Contacts button
				driver.findElement(By.linkText("Contacts")).click();
				
				//click on  create Contacts button
				driver.findElement(By.linkText("Create Contact")).click();
				
				//firstname mandatory
				driver.findElement(By.id("firstNameField")).sendKeys("Pranav");
				
		
				
		//last namemandatory
				driver.findElement(By.id("lastNameField")).sendKeys("Rammohan");
				
				
				
				
		//firstname
				driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Suganya");
				
		
				
		//last name
				driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Rammohan");
				
		
				
//				department field
				driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Sales");
				
//				description field
				driver.findElement(By.id("createContactForm_description")).sendKeys("company product is the best");
				
		//		Email id
				driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("qualitysm@gmail.com");
			
				// select source
				WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
				Select select1 = new Select(findElement);
				select1.selectByValue("NY");
								
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				
											
				//click on create contact

				//driver.findElement(By.xpath("[@className='smallSubmit'])")).click();
				driver.findElement(By.className("smallSubmit")).click();
				
				
				//click on edit 
				driver.findElement(By.className("subMenuButton")).click();
				
				//clear the description field
				driver.findElement(By.id("updateContactForm_description")).clear();
				
				
				//fill important note field
				driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Quality is the best");
				
				
				//update
				driver.findElement(By.xpath("//div[@class='fieldgroup-body']//input[@value='Update']")).click();
				
				//get title
				System.out.println(driver.getTitle());
				
				
				
			
				
						
				
				
				
} 
}



