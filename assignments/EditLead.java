package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead{
	
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
				
				//click on first lead
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
				//verify title
				
				driver.getTitle();
				System.out.println(driver.getTitle());
				
				//click on edit
				driver.findElement(By.linkText("Edit")).click();
				//clear
				driver.findElement(By.id("updateLeadForm_companyName")).clear();
			
				//update company
				
				driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
				
				Thread.sleep(3000);
				
				//click on update
				driver.findElement(By.className("smallSubmit")).click();
				
				String changetxt = driver.findElement(By.id("viewLead_companyName_sp")).getText();
				System.out.println(changetxt);
				
				//close the browser
				driver.close();
				
				
				
				
				
	    }
}
				
		