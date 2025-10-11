package seleniumLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/*
<input 
aria-label="Phone number, username, or email" 
aria-required="true"
autocapitalize="off" 
autocorrect="off" 
maxlength="75" 
class="_aa4b _add6 _ac4d _ap35" 
dir="" 
type="text"
value=""
name="username"
>

<div 
class="xkmlbd1 xvs91rp xd4r4e8 x1anpbxc x11gldyt xyorhqc x11hdunq x2b8uid">Sorry, your password was incorrect. Please double-check your password.
</div>
*/
public class Formfilling {
	public static void main(String... args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://hitaskflow.netlify.app/index.html");
		driver.findElement(By.id("name")).sendKeys("navneet");
		driver.findElement(By.id("dob")).sendKeys("12112020");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println(driver.findElement(By.id("error-dob")).getText());
		driver.quit();
		
		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver1.get("https://www.instagram.com/");
		driver1.findElement(By.name("username")).sendKeys("navneet");
		driver1.findElement(By.name("password")).sendKeys("Hello@123");
		driver1.findElement(By.cssSelector("button._aswp._aswr._aswu._asw_._asx2")).click();

	}
	
}
