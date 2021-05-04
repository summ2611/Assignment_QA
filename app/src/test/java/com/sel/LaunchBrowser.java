package com.sel;

import io.github.bonigarcia.wdm.WebDriverManager;
import mystore.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AddToCart;
import pages.HomePage;
import pages.LoginPage;
import pages.SingUpPage;

import java.util.Base64;
import java.util.concurrent.TimeUnit;

public class LaunchBrowser extends BaseTest {
    @Test

    public void browserlaunch() throws InterruptedException {
           /* WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("http://automationpractice.com/index.php");

            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); */
            //Assert.assertEquals(driver.getTitle().trim(),);
             HomePage hp=new HomePage(driver);
             LoginPage lp = new LoginPage(driver);
             AddToCart ac = new AddToCart(driver);
             SingUpPage sp = new SingUpPage(driver);
             //sign in
             hp.signIn();
             lp.emailBox("summr384@gmail.com");
             lp.pwdBox("12345");
             lp.submitLogin();
             String loggedIn=driver.findElement(By.xpath("//p[@class='info-account']")).getText().trim();
             Assert.assertEquals(loggedIn,"Welcome to your account. Here you can manage all of your personal information and orders.","logged in");
             //add to cart
             ac.searchBox("Blouse");
             ac.searchButton();
             ac.selectColour();
             ac.more();
             ac.addCart();
             ac.proceedCart1();
             ac.proceedCart2();
             ac.processAddr();
             ac.checkBox();
             ac.processCarrier();
             ac.payByCheck();
             ac.confirmOrder();
            String orderPlaced=driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText().trim();
            Assert.assertEquals(orderPlaced,"Your order on My Store is complete.","order confirmed");

            //singing up
            sp.singOut();
            sp.singIn();
            sp.emailAddr("umma@gmail.com");
            sp.createAcc();
            sp.gender();
            sp.firstName("Umme");
            sp.lastName("Haani");
            sp.password("12211");
            sp.addrFirstLine("richmond town");
            sp.city("bangalore");
            sp.state();
            sp.pincode(56002);
            sp.phone(7879797);
            sp.submitAccount();
        String accountCreated=driver.findElement(By.xpath("//h1[normalize-space()='My account']")).getText().trim();
        Assert.assertEquals(orderPlaced,"MY ACCOUNT","Registered");
            Thread.sleep(2000);
        }
   }


