package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver = null;
    By emailBox = By.xpath("//input[@id='email']");
    By pwdBox   = By.xpath("//input[@id='passwd']");
    By submitLogin   = By.id("SubmitLogin");
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void emailBox(String userName)
    {
        driver.findElement(emailBox).sendKeys(userName);
    }
    public void pwdBox(String password)
    {
        driver.findElement(pwdBox).sendKeys(password);
    }
    public void submitLogin()
    {
        driver.findElement(submitLogin).click();
    }
}
