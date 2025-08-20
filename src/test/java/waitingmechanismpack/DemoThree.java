package waitingmechanismpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoThree {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		driver.findElement(By.linkText("Flipkart")).click();

	}

}
