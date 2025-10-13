package seleniumLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class MoreLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Hello@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("Hello@123");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@human.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9931330202");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());

		String name = "rahul";
		String password = func(driver);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.cssSelector("button[class='submit signInBtn']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("H2")).getText(), "Hello " + name +",");
		Thread.sleep(2000);
	}
	
	private static String func(WebDriver driver) {
		String s = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] arr = s.split("'");
	
		return arr[1];
	}

}
