package week4.day1.assignments;




import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

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
		Thread.sleep(3000);
		//click on   Merge Contacts 
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[text()='Merge Contacts']")).click();

		//driver.getWindowHandle();
		//click on widget from contact
		driver.findElement(By.xpath("//input[@id='partyIdFrom']/following-sibling::a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String windowHandle1 = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String>windows=new	ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		//click on first contact
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(windowHandle1);
		driver.findElement(By.xpath("(//div[@class='subSectionBlock']//a)[2]")).click();
		
		
		String windowHandle2 = driver.getWindowHandle();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String>windows2=new	ArrayList<String>(windowHandles2);
		driver.switchTo().window(windows2.get(1));
		
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		



		driver.switchTo().window(windowHandle1);
		//click on merge
		driver.findElement(By.linkText("Merge")).click();


		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		driver.getErrorHandler();
			alert2.accept();
			
	    System.out.println(driver.getTitle());
			




	}
}