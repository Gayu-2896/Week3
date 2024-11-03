package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@name='USERNAME']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		//Click on the widget of the "From Contact".
		driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[1]")).click();
		//for multiple windows 	 we need to use getwindowhandles method(parent and child)
				//get all the windows
		
				Set<String> windowHandles = driver.getWindowHandles();
				//convert set into list( set window is not available in set hence converting to list)
				//list syntax
				List <String> childwindow = new ArrayList <String> (windowHandles);//import to java util ---> reference of set we need to pass as a value in the aruguments
				driver.switchTo().window(childwindow.get(1));
				driver.findElement(By.xpath("//a[text()='DemoCustomer']")).click();
				driver.switchTo().window(childwindow.get(0));
	//Click on the widget of the "To Contact
				driver.findElement(By.xpath("(//input[@id='partyIdFrom']/following::a)[2]")).click();
				Set<String> windowHandles1 = driver.getWindowHandles();
				//convert set into list( set window is not available in set hence converting to list)
				//list syntax
				List <String> childwindow1 = new ArrayList <String> (windowHandles1);//import to java util ---> reference of set we need to pass as a value in the aruguments
				driver.switchTo().window(childwindow1.get(1));
				driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
				driver.switchTo().window(childwindow1.get(0));
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				//Accept the alert
				Alert alert = driver.switchTo().alert();
				alert.accept();
				//Verify the title of the page
				String title = driver.getTitle();
				System.out.println(title);
					
	}

}
