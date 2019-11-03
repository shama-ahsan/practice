package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import setup.SetUp;

import java.util.concurrent.TimeUnit;

public class LoginTest extends SetUp {

    @Test
    public void loginTest() {


       // Login
        WebElement logBtn = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[1]/div[1]/div[2]/div[2]/ul/li[1]/a"));
        logBtn.click();


        WebElement userName = driver.findElement(By.id("ContentPlaceHolder1_UserNameTxt"));
        WebElement passWord = driver.findElement(By.id("ContentPlaceHolder1_Passwordtxt"));
        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_LinkButton1\"]"));

       userName.sendKeys("shama ahsan");
       passWord.sendKeys("Dexter1234");
        loginBtn.submit();

       // WebElement msg = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[1]/div[1]/div[2]/div[2]/ul/div/div/span"));
        //msg.sendKeys("Welcome shama ahsan");








        //System.setProperty("web driver.chrome.driver","src/main/resources/chromedriver/chromedriver.exe");
        //driver = new ChromeDriver();
       // driver.findElement(By.name("q")).clear();
       // driver.findElement(By.name("q")).sendKeys("test");


         //WebElement signinBtn = driver.findElement(By.linkText("Sign in"));

        // WebElement username = driver.findElement(By.id("username"));
        // WebElement password = driver.findElement(By.id("password"));
         //WebElement button = driver.findElement(By.xpath("//input[@type ='submit']"0)).click();
                // driver.findElement(By.name("shama")).clear();


                //Enter Username

        //username.sendKeys("");
        //password.sendKeys("Engro@1122");
                // driver.findElement(By.name("username")).sendKeys("raehsan");
                 //Enter Password
                // driver.findElement(By.name("password")).sendKeys("Engro@1122");
                 //Wait for page to load
                // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
                 // Click on Login button
               // driver.findElement(By.xpath("//input[@type ='submit']")).click();
        //WebElement button = driver.findElement(By.xpath("//input[@type ='submit']")).click();
                 //driver.findElement(By.id("button")).click();

                 //test comment selenium



    }
}
