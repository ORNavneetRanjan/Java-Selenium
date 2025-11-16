package SetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        SoftAssert softAssert = new SoftAssert();

        List<String> list = new ArrayList<>();
        for(WebElement we : driver.findElements(By.cssSelector("#gf-BIG a"))){
            list.add(we.getAttribute("href"));
        }
        //Java methods will call URL's and gets you the status code
        int count = 0;
        for(String links : list){
            HttpURLConnection connection = (HttpURLConnection) new URL(links).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            softAssert.assertTrue(connection.getResponseCode() < 400, "The link " + links + " is broken");
        }
        softAssert.assertAll();
        System.out.println("Total broken links are : " + count);
        driver.quit();

    }
}
