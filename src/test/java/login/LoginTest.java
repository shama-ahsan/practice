package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import setup.SetUp;

public class LoginTest extends SetUp {

    @Test
    public void loginTest() {
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver/chromedriver.exe");
        //driver = new ChromeDriver();
       // driver.findElement(By.name("q")).clear();
       // driver.findElement(By.name("q")).sendKeys("test");


        WebElement username = driver.findElement(By.id("username"));
         WebElement password = driver.findElement(By.id("password"));
                // driver.findElement(By.name("shama")).clear();
                 driver.findElement(By.name("shama")).sendKeys("shama.ahsan@gmail.com");
                 driver.findElement(By.name("password")).sendKeys("Mommyislove");


    }
}
