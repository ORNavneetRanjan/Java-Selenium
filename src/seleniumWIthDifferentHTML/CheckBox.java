package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import java.util.List;

public class CheckBox {
    public static void main(String... args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //direct access
        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        Thread.sleep(1000);

        //css selector regx
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm'")).isSelected(), "The button is not clicked");
        driver.findElement(By.cssSelector("input[id*='IndArm'")).click();
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm'")).isSelected(),
                "The checkbox is clicked now ");

        //find total number of check box in a whole html page
        List<WebElement> list = driver.findElements(By.cssSelector("input[type='checkbox'"));
        Assert.assertEquals(6 ,list.size());
        Assert.assertEquals(list.get(5).getLocation(), new Point(596, 298));




        Thread.sleep(5000);
        driver.quit();
    }
}
