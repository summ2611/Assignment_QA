package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver = null;
    By singIn = By.xpath("//a[normalize-space()='Sign in']");
    By contactUs  = By.xpath("//a[@title='Contact Us']");


   public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void signIn()
    {
        driver.findElement(singIn).click();
    }
    public void contactUs()
    {
        driver.findElement(contactUs).click();
    }
}
