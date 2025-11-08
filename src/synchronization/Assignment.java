package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Assignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("learning");
        driver.findElement(By.className("form-check-inline")).findElement(By.cssSelector("input[value = 'user']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.modal-content")));

        driver.findElement(By.id("okayBtn")).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.modal-content")));

        Select select = new Select(driver.findElement(By.cssSelector("div.form-group select[data-style = 'btn-info")));

        select.selectByIndex(2);

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();
        wait.until(ExpectedConditions.titleIs("ProtoCommerce"));

        for(WebElement we: driver.findElements(By.tagName("app-card"))){
            we.findElement(By.cssSelector("button")).click();
        }

        driver.findElement(By.cssSelector("div#navbarResponsive ul")).click();

        Thread.sleep(5000);
        driver.quit();


    }
}
