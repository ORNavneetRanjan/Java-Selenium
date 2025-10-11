package SeleniumIntroduction;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;

public class Introduction {

	public static void main(String[] args) {

//		Invoke browser
//		 webDriver interface 
//		 browser drivers implement the webDriver interface so that the functions name and behavior is same for different browsers
		
//		chromedriver.exe -> invokes the chrome browsers
//		it get installed automatically using Selenium manager
//		can be set manually like
//		System.setProperties("webdriver.chrome.driver", "/path of the exe file");
		
//		ChromeDriver driver = new ChromeDriver();
//		 driver object here has access to all the methods of Chrome deriver
		
		
		WebDriver driver = new ChromeDriver();
//		 driver1 object here has only the defined methods in the webDriver interface 
//		 good practice as it helps to write generic code which can we run for all kinds for supported browsers 
		driver.get("https://navneetranjan.netlify.app/"); 
		
		System.out.println(driver.getTitle());
//		driver.close();  closes the single tab 
		driver.quit(); // closes the entire window opened due to the automation run
		
//		FireFox Launch
//		geckoDriver is the file to invoke the fireFox browser
//		System.setProperty("webdriver.gecko.driver", "/path"); can be set like this
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://navneetranjan.netlify.app/#projects");
		driver1.quit();
		
//		Microsoft edge 
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://navneetranjan.netlify.app/#projects");
	}

}
