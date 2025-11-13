package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Calender {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        String date = "12", month = "November", year = "2003";
        String[] expectedList = {month,date,year};
        driver.findElement(By.className("react-date-picker__calendar-button")).click();
        driver.findElement(By.className("react-calendar__navigation__label")).click();
        driver.findElement(By.className("react-calendar__navigation__label")).click();
        driver.findElement(By.className("react-calendar__navigation__prev-button")).click();
        driver.findElement(By.className("react-calendar__navigation__prev-button")).click();
        driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
        driver.findElement(By.xpath("//button/abbr[text()='" + month + "']")).click();
        driver.findElement(By.xpath("//abbr[text()='" + date +"']")).click();
        List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

        for(int i =0; i<actualList.size();i++)

        {

            System.out.println(actualList.get(i).getAttribute("value"));

            Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

        }

        Thread.sleep(5000);
        driver.quit();
    }
}
