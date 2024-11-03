package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
/**
 * No such element exception checks:
 * element location
 * wait statement
 * element is present insiode the frame or not
 */
		//swtich over the frame
		driver.switchTo().frame(0);// index starts from 0
		//click using xpath(element locators)
		driver.findElement(By.id("Click")).click();
	}

}
