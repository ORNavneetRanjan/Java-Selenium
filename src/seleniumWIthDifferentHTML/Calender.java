package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Objects;

public class Calender {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='AMD']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BKK']")).click();

        List<WebElement> list = driver.findElements(By.cssSelector("td a.ui-state-default"));
        for(WebElement we : list){
            if(we.getText().equals("23")){
                we.click();
                break;
            }
        }
        //      This function don't perform well in the modern websites as when we click on it , its automatically getting enabled
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

        //Alternate or way around approach
        Assert.assertTrue(Objects.requireNonNull(driver.findElement(By.id("Div1")).getDomAttribute("style")).contains("0.5"));
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style"));
        Assert.assertTrue(Objects.requireNonNull(driver.findElement(By.id("Div1")).getDomAttribute("style")).contains("1"));

        Thread.sleep(5000);
        driver.quit();
    }
}
