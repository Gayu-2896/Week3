package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//simple Alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
//pop - msg will be displayed which is not inspectable and allows only single action so using simple alert method
// swtich the driver focus to the aklert box using the code
		Alert alert = driver.switchTo().alert();//ctrl 2+l
//return type of alert is Alert
System.out.println(alert.getText());		
//need to accept the alert box
		alert.accept();
// need to get the text which is possible only before accept or dismiss the pop -up hence befor accept the alert we have to pass the get text directly in the sysout statement
	
//Confirmation Alert ; either accept or reject and can perform any one action and allows to get the text
// x-path for confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();	
//swtich to driver focus to the laert box using code but it is already created means then that is enough to handle it , no need to create again even if we are creating also its fine.	
		Alert alert2 = driver.switchTo().alert();//ctrl 2+l
		alert2.accept();
//user text from the dialog box
		String text = driver.findElement(By.id("result")).getText();//ctrl 2+l
		System.out.println(text);
//Prompt Alert : 	either accept or reject and can perform any one action and allows to get the text and also give user input into the alert	
// x-path for confirmation alert
       driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();	
//user input
       alert.sendKeys("testleaf");
      // alert.dismiss();
       alert.accept();
       String text2 = driver.findElement(By.id("confirm_result")).getText();//ctrl 2+l; 
       System.out.println(text2);
 // Sweet Alert : handle like normal webelement and it is insepectable and also cannot be ignored
 //no need to swtich to driver focus
 // write the xpath directly
       driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();    
 //inspectable,so directly wirte the x-path
       driver.findElement(By.xpath("//span[text()='Dismiss']")).click();     
       
	}
	
	
	

}
