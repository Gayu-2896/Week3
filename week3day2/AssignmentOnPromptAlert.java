package week3day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnPromptAlert {

	public static void main(String[] args) {
         ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Leaftaps");
		alert1.accept();
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		
		
		
		
	}

}
