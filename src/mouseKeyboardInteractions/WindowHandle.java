package mouseKeyboardInteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2L));
        driver.findElement(By.className("blinkingText")).click();

        Set<String> set = driver.getWindowHandles();
        for (String s : set){
            System.out.println(s);
        }
        Iterator <String> it = set.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        String UserName  = driver.findElement(By.cssSelector("#interview-material-container a")).getText();
        driver.switchTo().window(parent);
        driver.findElement(By.id("username")).sendKeys(UserName);

        Thread.sleep(5000);
        driver.quit();

    }
}

class Assignment4{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.cssSelector("#content .example a")).click();

        Set<String> set = driver.getWindowHandles();
        Iterator<String> it = set.iterator();
        String parent = it.next();
        String child = it.next();

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.cssSelector("#content .example h3")).getText());

        Thread.sleep(5000);
        driver.quit();
    }
}