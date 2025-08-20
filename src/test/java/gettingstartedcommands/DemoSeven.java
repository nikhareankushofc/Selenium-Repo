package gettingstartedcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSeven {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement textField = driver.findElement(By.id("textbox1"));
		
		Thread.sleep(2000);
		
		textField.clear();
		
		Thread.sleep(2000);
		
		textField.sendKeys("Arun Motoori");
		
		Thread.sleep(2000);
		
		textField.clear();
		
		Thread.sleep(2000);
		
		textField.sendKeys("Java");
		
	
	}

}
