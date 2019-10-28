package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import setup.SetUp;

import java.util.concurrent.TimeUnit;

public class LoginTest extends SetUp {

    @Test
    public void loginTest() {
        //System.setProperty("web driver.chrome.driver","src/main/resources/chromedriver/chromedriver.exe");
        //driver = new ChromeDriver();
       // driver.findElement(By.name("q")).clear();
       // driver.findElement(By.name("q")).sendKeys("test");


         WebElement username = driver.findElement(By.id("username"));
         WebElement password = driver.findElement(By.id("password"));
         //WebElement button = driver.findElement(By.xpath("//input[@type ='submit']"0)).click();
                // driver.findElement(By.name("shama")).clear();


                //Enter Username
                 driver.findElement(By.name("username")).sendKeys("raehsan");
                 //Enter Password
                 driver.findElement(By.name("password")).sendKeys("Engro@1122");
                 //Wait for page to load
                 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                 // Click on Login button
               WebElement button = driver.findElement(By.xpath("//input[@type ='submit']"'0')).click();
                 driver.findElement(By.id("button")).click();

                 //test comment selenium



    }
}
