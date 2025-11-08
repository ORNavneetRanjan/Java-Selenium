package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.function.Function;

class FluentWaitExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.cssSelector("#start button")).click();

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30L))
                .pollingEvery(Duration.ofSeconds(3L))
                .ignoring(NoSuchElementException.class);

        WebElement foo = wait.until((new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver driver) {

                return driver.findElement(By.cssSelector("#finish h4")).isDisplayed() ?
                        driver.findElement(By.cssSelector("#finish h4")) : null;
            }
        }));

        System.out.println(driver.findElement(By.cssSelector("#finish h4")).getText());

        Thread.sleep(5000);
        driver.quit();
    }
}
