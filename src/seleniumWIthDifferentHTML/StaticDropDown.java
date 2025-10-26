package seleniumWIthDifferentHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement ele = driver.findElement(By.className("blinkingText"));
		
		((JavascriptExecutor) driver).executeScript("arguments[0].hidden = true;", ele);
		
		//dropDown with select tag
		WebElement select = driver.findElement(By.cssSelector("div.currency-dropdown select"));
		Select dropdown = new Select(select);
		dropdown.selectByIndex(2);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		Thread.sleep(5000);
		driver.quit();

		
	}

}
