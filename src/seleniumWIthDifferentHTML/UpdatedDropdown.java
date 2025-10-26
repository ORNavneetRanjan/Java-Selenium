package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
        // Click on the passenger info box to make buttons visible
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
        
        
       
        Thread.sleep(5000);
        driver.quit();
    }
}
