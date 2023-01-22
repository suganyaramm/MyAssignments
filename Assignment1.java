package week2.day1.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {
	
	    public static void main(String[] args) {
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
				
				//click on lead
				driver.findElement(By.linkText("Create Lead")).click();
				
		//company
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
				
		//first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
				
		//last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rammohan");
				
				
		//click create lead
			//	driver.findElement(By.className("smallSubmit")).click();
				
			//	first name local
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sugan");
				
				
//				department field
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
				
//				description field
				driver.findElement(By.id("createLeadForm_description")).sendKeys("company product is the best");
				
		//		Email id
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("qualitysm@gmail.com");
				
				//click create lead
				driver.findElement(By.className("smallSubmit")).click();
				
				//click on edit
				driver.findElement(By.className("subMenuButton")).click();
				
				//cleardescription field
				driver.findElement(By.id("createLeadForm_description")).clear();
				
				//important note field
				
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("qualiy check is important");
				
				//click on update
				driver.findElement(By.className("smallSubmit")).click();
				//get title
				System.out.println(driver.getTitle());
				
				
				
			
				
				
				
				
				
				
} 
}



