import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\arunk\\\\eclipse-workspace\\\\SELENIUMTESTING\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.close();
        

	}

}
