package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//to get the address of the current window
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);// o/p- 805A51A3DB19B1A5004BD72A1A19C170 if we run again the address will get change becoz to aviod duplicates each and every time it wil provide unique id
		//title of the parent
				System.out.println(driver.getTitle());
				//click open
		driver.findElement(By.xpath("//span[text()='Open']")).click(); //--->navigated to child window
			//for multiple windows 	 we need to use getwindowhandles method(parent and child)
		//get all the windows
		Set<String> windowHandles = driver.getWindowHandles();
		//convert set into list( set window is not available in set hence converting to list)
		//list syntax
		List <String> childwindow = new ArrayList <String> (windowHandles);//import to java util ---> reference of set we need to pass as a value in the aruguments
	/**
	 * multiple windows then go or iteration
	 */
	//navigate to my child window
		driver.switchTo().window(childwindow.get(1));//----> switch over the window from child to parent window and pass the index using get method
		//to get the address of the current window (childwindow)
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		//title of the parent
		System.out.println(driver.getTitle());
	driver.close(); //----> current will get closed
		//driver.switchTo().window(childwindow.get(1)); //---> eg. after driver.close given and still we are trying to handle means no such window exception error will throw
	driver.quit(); //---> all the opened windows will get closed and exception occurs
	//Exceptions
			//1.No such window exception----ther is no window and we are trying to handle it
	}

}
