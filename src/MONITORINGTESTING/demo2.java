package MONITORINGTESTING;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2 {

	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\arunk\\\\eclipse-workspace\\\\SELENIUMTESTING\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        String Instatitle =driver.getTitle();
        Thread.sleep(2000);
        System.out.println("instatitle");
        Thread.sleep(2000);
        driver.close();
	}

}
