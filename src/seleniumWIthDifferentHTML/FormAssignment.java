package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FormAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //Name
        driver.findElement(By.cssSelector(".form-group input[name='name']")).sendKeys("Navneet Ranjan");
        driver.findElement(By.cssSelector(".form-group input[name='email']")).sendKeys("navneet.ranjan@example.com");
        driver.findElement(By.cssSelector(".form-group input[type='password']")).sendKeys("Hello@123");

        driver.findElement(By.id("exampleCheck1")).click();

        //Gender dropdown
        Select genderDropdown = new Select( driver.findElement(By.id("exampleFormControlSelect1")));
        genderDropdown.selectByVisibleText("Male");
        driver.findElement(By.id("inlineRadio1")).click();

//       <input type="date"> elements expect the date in ISO format (yyyy-MM-dd)
        driver.findElement(By.cssSelector(".form-group input[name='bday']")).sendKeys("2003-12-11");
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        Thread.sleep(1000);

        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
        Thread.sleep(5000);
        driver.quit();
    }
}
