package mouseKeyboardInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        Actions a  = new Actions(driver);
        a.moveToElement(driver.findElement(By.id("nav-link-accountList")))
                .build().perform();

        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Navneet")
                        .build().perform();

        Thread.sleep(5000);
        driver.quit();


    }
}
