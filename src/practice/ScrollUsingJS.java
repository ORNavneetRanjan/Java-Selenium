package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class ScrollUsingJS {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> list = driver.findElements(By.xpath("//*[@id = 'product']/tbody/tr/td[4]"));
        System.out.println(list.size());
        int totalProduct = 0;
        for(WebElement we : list){
            totalProduct += Integer.parseInt(we.getText());
        }
        System.out.println(totalProduct);
        String fetchTotal = driver.findElement(By.className("totalAmount")).getText().split(": ")[1];
        Assert.assertEquals(Integer.toString(totalProduct), fetchTotal);
        System.out.println(fetchTotal);
        Thread.sleep(5000);
        driver.quit();
    }
}
