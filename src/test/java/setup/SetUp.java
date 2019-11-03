package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUp {

    protected  static WebDriver driver;

    /*public void browserConfig(){

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();

    }*/

    @BeforeTest
    public void browserConfig() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
       // driver.get("https://www.google.com/");
        //driver.get("https://www.linkedin.com/");
        driver.get("https://www.readings.com.pk/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

    }

    @AfterTest

    public void closeBrowser()
    {
        //driver.close();
    }

}
