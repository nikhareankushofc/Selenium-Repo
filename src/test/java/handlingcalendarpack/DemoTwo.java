package handlingcalendarpack;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTwo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement dateField = driver.findElement(By.id("datepicker"));
		jse.executeScript("arguments[0].value='01/02/2026'",dateField);
	}

}
