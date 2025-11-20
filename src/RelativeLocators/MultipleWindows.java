package RelativeLocators;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class MultipleWindows {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.TAB);

        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        String parentWindowId = it.next();
        String childWindowId = it.next();

        driver.switchTo().window(childWindowId);
        driver.get("https://navneetranjan.netlify.app/");

        Thread.sleep(1000);
        WebElement heroSection = driver.findElement(By.id("hero"));
        File file = heroSection.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("hero.png"));

        //get Height & width of a web element
        System.out.println(heroSection.getRect().height + " " + heroSection.getRect().width);


        String name = driver.findElements(By.xpath("//*[@id = 'hero']//span")).get(1).getText();
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.cssSelector(".form-group input[name='name']")).sendKeys(name);
        System.out.println(name);
        Thread.sleep(5000);
        driver.quit();
    }
}
