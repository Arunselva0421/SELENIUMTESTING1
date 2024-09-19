package MONITORINGTESTING;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\arunk\\\\eclipse-workspace\\\\SELENIUMTESTING\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.get("http://app.autointelli.com:3000/d/e54484db-d381-4bd4-8a47-5bfdbb89b879/unified-enterprise-application-dashboard?orgId=1&kiosk&from=1716608865168&to=1716621241385");
        //to scroll down to TypeCasting for JSE
        
        JavascriptExecutor Jse =(JavascriptExecutor)driver;
        Jse.executeScript("window.scrollBy(0,30000)");
        
        
        

	}

}
