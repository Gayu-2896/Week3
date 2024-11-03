package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentList {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement element = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		element.sendKeys("mobiles and entries");
		element.sendKeys(Keys.ENTER);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		int size = allLinks.size();
		System.out.println(size);
	
		List <String> list = new ArrayList <String>();
		for (WebElement i : allLinks) {
			String text = i.getText();
			list.add(text);

}
		System.out.println(list);
	}
}
