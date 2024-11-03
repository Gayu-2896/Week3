package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentOnFrames {

	public static void main(String[] args) {
		
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.switchTo().frame("iframeResult");//pass the aruguments by swtich to frame(web element)
          
            driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();
            driver.switchTo().alert().accept();
            String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
            System.out.println(text);
            if (text.contains("You pressed OK!")) {
				System.out.println("Verified");
			} else {
				System.out.println("Not Verified");
			}

	}

}
