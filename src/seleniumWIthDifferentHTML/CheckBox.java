package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class CheckBox {
    public static void main(String... args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //direct access
        driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
        Thread.sleep(1000);

        //css selector regx
        System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm'")).isSelected());
        driver.findElement(By.cssSelector("input[id*='IndArm'")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='IndArm'")).isSelected());

        //find total number of check box in a whole html page
        List<WebElement> list = driver.findElements(By.cssSelector("input[type='checkbox'"));
        System.out.println("Total number of checkboxs are  " + list.size());
        System.out.println(list.get(5).getLocation());



        Thread.sleep(5000);
        driver.quit();
    }
}
