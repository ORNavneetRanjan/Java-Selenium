package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println("rows: " + driver.findElements(By.cssSelector("#product.table-display tbody tr")).size());
        System.out.println("columns: " + driver.findElements(By.cssSelector("#product tbody tr th")).size());
        System.out.println("Second entry: ");
        for(WebElement we : driver.findElements(By.xpath("//*[@id = 'product' and contains(@class, 'table-display')]/tbody/tr[3]/td"))){
            System.out.println(we.getText());
        }

        Thread.sleep(5000);
        driver.quit();

    }
}
