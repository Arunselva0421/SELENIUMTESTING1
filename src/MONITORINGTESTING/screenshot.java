package MONITORINGTESTING;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.print.PrintOptions;

import com.google.common.io.Files;

public class screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\arunk\\\\eclipse-workspace\\\\SELENIUMTESTING\\\\chromedriver\\\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://app.autointelli.com:3000/d/e54484db-d381-4bd4-8a47-5bfdbb89b879/unified-enterprise-application-dashboard?orgId=1&kiosk&from=1716608865168&to=1716621241385");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        File screenshotfolder1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        File dest =new File("./screenshotfolder1/screenshot3.png");
        FileHandler.copy(screenshotfolder1, dest);
        Thread.sleep(5000);
       driver.findElement(By.id(":rd:")).click();
       Thread.sleep(5000);
        File elesrc= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
        File eledest =new File("./screenshotfolder1/screenshot4.png");
        FileHandler.copy(elesrc, eledest);
        driver.close();

	}

}
