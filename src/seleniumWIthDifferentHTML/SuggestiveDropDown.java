package seleniumWIthDifferentHTML;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class SuggestiveDropDown {
    public static void main(String... args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//ul[@id='ui-id-1']/a[@value = 'British Indian Ocean Territory']")).click();
        System.out.println(driver.findElement(By.id("ui-id-1")).getCssValue("display"));

        List<WebElement> list = driver.findElements(By.cssSelector("ul[id='ui-id-1'] a"));
        for(WebElement we: list){
            if(we.getText().equals("india")){
                we.click();
                break;
            };
        }

        Thread.sleep(6000);
        driver.quit();

    }
}
