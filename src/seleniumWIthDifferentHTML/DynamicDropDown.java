package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class DynamicDropDown {
    public static void main(String... args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();


        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
       

        driver.findElement(By.xpath("//a[@value='AMD']")).click();
        
        // Using parent child relationship of x path instead of hard coding index
        
        //driver.findElement(By.xpath("(//a[@value='BHO'])[2]")).click();
        
        driver.findElement(By.xpath("//div[@id = 'glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BKK']")).click();

        System.out.println("Successfully selected FROM and TO cities.");
        Thread.sleep(5000);
        driver.quit();
    }
}
