package seleniumLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingParentTraverse {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ele = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));
		System.out.println(ele.getText());
		WebElement ele1 = driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header/a/following-sibling::a"));
		System.out.println(ele1.getText());
		
		

	}

}
