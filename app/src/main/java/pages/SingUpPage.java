package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SingUpPage {
    WebDriver driver = null;
    By signOut = By.xpath("//a[@title='Log me out']");
    By signIn = By.xpath("//a[normalize-space()='Sign in']");
    By emailAddr = By.id("email_create");
    By createAcc = By.id("SubmitCreate");
    By gender = By.id("id_gender2");
    By firstName = By.id("customer_firstname");
    By lastName = By.id("customer_lastname");
    By password = By.id("passwd");
    By addrFirstLine = By.id("address1");
    By city = By.id("city");
    By state = By.id("id_state");
    By pincode = By.id("postcode");
  // By country = By.id("id_country");
    By phone = By.id("phone_mobile");
  //  By alias = By.id("alias");
    By submitAccount = By.id("submitAccount");
    public SingUpPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void singOut()
    {
        driver.findElement(signOut).click();
    }
    public void singIn()
    {
        driver.findElement(signIn).click();
    }
    public void emailAddr(String email)
    {
        driver.findElement(emailAddr).sendKeys(email);
    }
    public void createAcc()
    {
        driver.findElement(createAcc).click();
    }
    public void gender()
    {
        driver.findElement(gender).click();
    }
    public void firstName(String fname)
    {
        driver.findElement(firstName).sendKeys(fname);
    }
    public void lastName(String lname)
    {
        driver.findElement(lastName).sendKeys(lname);
    }
    public void password(String pwd)
    {
        driver.findElement(password).sendKeys(pwd);
    }
    public void addrFirstLine(String aline)
    {
        driver.findElement(addrFirstLine).sendKeys(aline);
    }
    public void city(String citybox)
    {
        driver.findElement(city).sendKeys(citybox);
    }
    public void state()
    {
        Select s = new Select(driver.findElement(state));
        s.selectByValue("5");
    }
    public void pincode(int pin)
    {
        driver.findElement(pincode).sendKeys(Integer.toString(pin));
    }
    /*public void country()
    {
        driver.findElement(country).click().;
        country.selectByIndex(5);
    }*/
    public void phone(int ph)
    {
        driver.findElement(phone).sendKeys(Integer.toString(ph));
    }
  /*  public void alias(String al)
    {
        driver.findElement(alias).sendKeys(al);
    }*/
    public void submitAccount()
    {
        driver.findElement(submitAccount).click();
    }

}
