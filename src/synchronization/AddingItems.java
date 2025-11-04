package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddingItems {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        String[] arr = {"Cucumber", "Carrot", "Tomato", "Brinjal"};
        int[] quantity = {1, 5, 2, 1};
        addToCart(driver, arr, quantity);

        //Checkout
        driver.findElement(By.cssSelector("div.cart a.cart-icon")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.cart-preview button[type='button']")));
        driver.findElement(By.cssSelector("div.cart-preview button[type='button']")).click();
        driver.findElement(By.cssSelector("input.promocode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        //wait for the api call (more than implicit wait)
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


        Thread.sleep(5000);
        driver.quit();

    }

    private static void addToCart(WebDriver driver ,String[] items, int[] quantity){
        for(int i = 0;i<items.length;i++) {
            WebElement parent = driver.findElement(By.xpath("//div/h4[text()='" + items[i] + " - 1 Kg']/parent::div"));
            parent.findElement(By.cssSelector("button[type='button']")).click();
            WebElement input = parent.findElement(By.className("quantity"));
            input.clear();
            input.sendKeys(String.valueOf(quantity[i]));
        }
    }
}
