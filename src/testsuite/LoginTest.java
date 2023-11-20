package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials() {
        //Enter username
        driver.findElement(By.name("username")).sendKeys("Admin");
        //Enter Password
        driver.findElement(By.name("password")).sendKeys("admin123");
        //Click on login button
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        //Verify the dashboard text
        String expectedText = "Dashboard";
        String actualText = driver.findElement(By.xpath("//h6")).getText();
        Assert.assertEquals(expectedText, actualText);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
