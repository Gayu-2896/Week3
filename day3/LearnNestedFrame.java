package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//handle parent frame ---> child frame ---> then interact with the element
		//swtich to parent frame
		WebElement parentframe = driver.findElement(By.xpath("//h5[contains (text(),'Click Me (Inside Nested frame)')]/following::iframe"));
        driver.switchTo().frame(parentframe);//pass the aruguments by swtich to frame(web element)
      //swtich to child frame
        driver.switchTo().frame("frame2");//pass the aruguments by swtich to frame(id/name)
      //click using xpath(element locators)
        driver.findElement(By.id("Click")).click();
      //default content--->come out of all the frames and switch back to the main page
        //driver.switchTo().defaultContent();
      		//parent frame--->switch back to the immediate frame
      		//exceptions
      		//1.no such element exception --->invalid x-path and not handling any frame 
      		//2.no such frame exception ----> no frame
        //3.invalid selector exception ---> any invalid syntax
	}

}
