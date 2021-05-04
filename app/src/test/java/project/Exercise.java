package project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exercise {
    @BeforeMethod
    public void befMethod()
    {
        System.out.println("in before method");
    }
    @AfterMethod
    public void aftMethod()
    {
        System.out.println("in after method");
    }
    @Test
    public void loginTestCase()
    {
        System.out.println("****** in loginTestCase ******");
    }
    @Test
    public void userNameTest()
    {
        System.out.println("****** in userNameTest ******");
    }


}
