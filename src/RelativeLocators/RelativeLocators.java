package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        // above
        WebElement input = driver.findElement(By.cssSelector("input[name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(input)).getText());

        //left
        WebElement label = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(label)).click();

        //below
        WebElement dob = driver.findElement(By.cssSelector("[for='dateofBirth']"));
        driver.findElement(with(By.tagName("input")).below(dob)).click();

        //right
        WebElement inputIcon = driver.findElement(By.id("inlineRadio1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(inputIcon)).getText());

        Thread.sleep(5000);
        driver.quit();
    }
}
