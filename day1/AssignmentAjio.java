package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentAjio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search Bags
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("bags", Keys.ENTER);
		//To the left of the screen under "Gender" click on "Men"
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(3000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[contains(text(),'Fashion')]")).click();
		// Print the count of the items found using getText method
		WebElement itemsfound = driver.findElement(By.xpath("//div[@class='length']"));
		String text = itemsfound.getText();
		System.out.println(text);
		//create a list
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		//create another list
		List<WebElement> bag = driver.findElements(By.xpath("//div[@class='nameCls']"));
		List<String> list = new ArrayList <String>();
		//iteration using for each loop
		for (WebElement each : brand) {
			String text1 = each.getText();
			//declare the list
			list.add(text1);
	}
		System.out.println(list);
		//iteration using for each loop
		List<String> list2 = new ArrayList <String>();
		for (WebElement each2 : bag) {
			String text2 = each2.getText();
			//declare the list
			list2.add(text2);
		
		}
		System.out.println(list2);
	}
	

}
