package javaStreamsAndSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;
import java.util.Objects;

public class WebTableSorting {
    private static String  getPriceVeggie(WebElement we){
        return we.findElement(By.xpath("//following-sibling::td[1]")).getText();
    }

    private static void validateSearch(WebDriver driver){
        String key = "a";
        driver.findElement(By.id("search-field")).sendKeys(key);
        List<String> totalElements;
        WebElement nextButton = driver.findElement(By.cssSelector("a[aria-label='Next']"));
        do {
            totalElements = driver.findElements(By.xpath("//tr/td[1]")).stream().map(WebElement::getText).toList();
            totalElements.forEach(s -> Assert.assertTrue(s.toLowerCase().contains(key)));
            if(Objects.equals(nextButton.getDomAttribute("aria-disabled"), "false")) nextButton.click();
        }while(Objects.requireNonNull(nextButton
                .getDomAttribute("aria-disabled")).contains("false"));
    }

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        List<String> list;
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//tr/th[1]")).click();
        do {
            List<WebElement> originalList = driver.findElements(By.xpath("//tr/td[1]"));
            List<String> original = originalList.stream().map(s -> s.getText()).toList();
            List<String> sortedList = originalList.stream().map(s -> s.getText()).sorted().toList();
            Assert.assertEquals(original, sortedList);

            // scan the name column and fetch its sibling price
            list  = originalList.stream().filter(s -> s.getText().contains("Rice"))
                    .map(s -> getPriceVeggie(s)).toList();
            list.forEach(System.out::println);
            if(!Objects.equals(driver.findElement(By.cssSelector("a[aria-label='Next']")).getDomAttribute("aria-disabled"), "true")){
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            };
        }while(list.isEmpty());

        validateSearch(driver);

    }


}
