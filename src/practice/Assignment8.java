package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assignment8 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("bel");
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#ui-id-1")));
        driver.findElement(By.xpath("//*[@id = 'ui-id-1']/li/div[text() = 'Belgium']")).click();



        Thread.sleep(5000);
        driver.quit();

    }
}
