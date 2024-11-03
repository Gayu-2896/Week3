package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonListexample {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Search Phones
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles", Keys.ENTER);
		// Prices
		List<WebElement> allprices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		//create a list
		List <Integer> list = new ArrayList <Integer>();
		for (WebElement i : allprices) {
			String text = i.getText();
			//System.out.println(text);
			//need to replace the , becoz in prices , is reflecting using replaceall method
			String replaceAll = text.replaceAll(",", "");
			System.out.println(replaceAll);
			//string to integer
			int ParseInt = Integer.parseInt(replaceAll);
			//System.out.println(ParseInt);
			//add list
			list.add(ParseInt);
			//System.out.println(list);
			//sort the list, why? becoz list is ordered list using collections.sort method
			Collections.sort(list);//print the list(sorting)
				
		}		
System.out.println(list);
	}

}
