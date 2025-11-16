package SetUp;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CertificateBypass {
    private static final String PROXY_HOST = "stg.checkproxy.rakuten-it.com";
    private static final String PORT_NAME = "9502";
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);

        Proxy proxy = new Proxy();
        proxy.setHttpProxy(PROXY_HOST + ":" + PORT_NAME);

        options.setProxy(proxy);

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://affiliate.co.jp/");
        driver.manage().window().minimize();
        driver.manage().deleteAllCookies();
        System.out.println(driver.getTitle());

        Thread.sleep(5000);
        driver.quit();
    }
}
