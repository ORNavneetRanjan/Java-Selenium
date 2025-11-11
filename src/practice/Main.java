package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement footerDriver = driver.findElement(By.id("gf-BIG"));
        System.out.println("Total links in footer: " + footerDriver.findElements(By.tagName("a")).size());

        WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        List<WebElement> links = columnDriver.findElements(By.tagName("a"));
        System.out.println("Links in first column: " + links.size());

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            js.executeScript("window.open(arguments[0], '_blank');", url);
        }

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.numberOfWindowsToBe(links.size() + 1));

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
            System.out.println("Page title: " + driver.getTitle());
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
