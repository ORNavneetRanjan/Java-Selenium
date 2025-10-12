package seleniumLocator;

import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://affiliate.rakuten.co.jp/");
		driver.findElement(By.xpath("//a[@class='navbar-link']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("ar-navneet.d.kumar@rakuten.com");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.id("user_id")).sendKeys("test.traffic@rakuten.com");

	}

}
