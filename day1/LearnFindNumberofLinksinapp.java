package week3.day1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindNumberofLinksinapp {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));
		//find no. of links in the application
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));//RETURN TYPE OF FIND ELEMENTS IS LIST WEB ELEMENTS
        //find the size
		int size = allLinks.size();
		System.out.println(size);
		//retrive single link using get method
		WebElement name = allLinks.get(1);
		String text = name.getText();// to get the text
		System.out.println(text);
		//collection cocept will use for each loop and it has to store in the list format(arraylist); for this frst we need to declare the list
		List <String> list = new ArrayList <String>();
		
		for (WebElement i : allLinks) {
			String text2 = i.getText();
			//System.out.println(text2);
			list.add(text2);// to add list using add method
			}
		System.out.println(list);	//in case if it is empty link then it will show as ,
		}
	
	}
