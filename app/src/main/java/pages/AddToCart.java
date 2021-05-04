package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class AddToCart {
    WebDriver driver=null;
    By searchBox =By.id("search_query_top");
    By searchButton =By.xpath("//button[@name='submit_search']");
    By selectColour = By.xpath("//ul[@class='color_to_pick_list clearfix']");
    By more = By.xpath("//span[normalize-space()='More']");
    By addCart = By.xpath("//span[normalize-space()='Add to cart']");
    By proceedCart1 = By.xpath("//span[normalize-space()='Proceed to checkout']");
    By proceedCart2 = By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");
    By processAddr =By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
    By checkBox = By.xpath("//input[@id='cgv']");
    By processCarrier =By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");
    By payByCheck = By.xpath("//a[@title='Pay by check.']");
    By confirmOrder = By.xpath("//span[normalize-space()='I confirm my order']");
    public AddToCart(WebDriver driver)
    {
        this.driver=driver;
    }
    public void searchBox(String product)
    {
        driver.findElement(searchBox).sendKeys(product);
    }
    public void searchButton()
    {
        driver.findElement(searchButton).click();
    }
    public void selectColour()
    {
        driver.findElement(selectColour).click();
    }
    public void more()
    {
        driver.findElement(more).click();
    }
    public void addCart()
    {
        driver.findElement(addCart).click();
    }
    public void proceedCart1()
    {
        driver.findElement(proceedCart1).click();
    }
    public void proceedCart2()
    {
        driver.findElement(proceedCart2).click();
     }

    public void processAddr()
    {
        driver.findElement(processAddr).click();
    }
    public void checkBox()
    {
        driver.findElement(checkBox).click();
    }
    public void processCarrier()
    {
        driver.findElement(processCarrier).click();
    }
    public void payByCheck()
    {
        driver.findElement(payByCheck).click();
    }
    public void confirmOrder()
    {
        driver.findElement(confirmOrder).click();
    }



   // String orderPlaced=driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText().trim();
   // Assert.assertEquals(orderPlaced,"Your order on My Store is complete.","order confirmed");

}



