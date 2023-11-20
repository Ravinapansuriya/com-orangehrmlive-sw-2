package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void getUserShouldNavigateToForgotPasswordPageSuccessfully() {
        //Click on forgot password link
        driver.findElement(By.xpath("//p[text()='Forgot your password? ']")).click();
        //Verify the text Reset Password
        String expectedText = "Reset Password";
        String ectualText = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals(ectualText, expectedText);
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
