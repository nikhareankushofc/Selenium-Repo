package gettingstartedcommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSeventeen {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://tutorialsninja.com/demo/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
