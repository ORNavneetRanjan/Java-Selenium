package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EndToEndTicketBooking {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
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

        Thread.sleep(2000);

        //Currency
        Select currency = new Select(driver.findElement(By.cssSelector("div.currency-dropdown select")));
        currency.selectByIndex(1);

        //Passengers details
        driver.findElement(By.cssSelector(".row1.adult-infant-child"));
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

        for (int i = 1; i <= 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
            Thread.sleep(300);
        }

        for(int i = 1;i<=3;i++) {
            driver.findElement(By.id("hrefIncChd")).click();
            Thread.sleep(200);
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        //Search
        driver.findElement(By.cssSelector("input[value='Search']")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
