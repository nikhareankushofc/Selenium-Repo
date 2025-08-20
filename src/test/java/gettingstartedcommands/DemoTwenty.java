package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwenty {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		String tag = driver.findElement(By.id("ta1")).getTagName();
		System.out.println(tag);
		
		driver.quit();
		
		
	}

}
