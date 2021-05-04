package Listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class utility {
    public static void takeScreenshot(WebDriver driver,String screenshot) {
        try {
            TakesScreenshot ts = (TakesScreenshot)driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src,new File("./Snapshots/" + screenshot + ".png"));
            System.out.println("Failed Test screenshot taken");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
