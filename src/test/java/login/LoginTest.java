package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import setup.SetUp;

import java.util.concurrent.TimeUnit;

public class LoginTest extends SetUp {

    @Test
    public void loginTest() {

        //Sign Up

        WebElement Register = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[1]/div[2]/div[2]/ul/li[2]/a"));
        Register.click();

      WebElement username = driver.findElement(By.id("ContentPlaceHolder1_Nametxt"));
      WebElement Contact = driver.findElement(By.id("ContentPlaceHolder1_Faxtxt"));
      WebElement Email = driver.findElement(By.id("ContentPlaceHolder1_Emailtxt"));
      WebElement Password = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
      WebElement Cpassword = driver.findElement(By.id("ContentPlaceHolder1_ConfirmPasswordtxt"));
      WebElement ChkboxBtn = driver.findElement(By.id("ctl00$ContentPlaceHolder1$CheckBox2"));
      WebElement RegisterBtn = driver.findElement(By.id("//*[@id=\"ContentPlaceHolder1_Register_btn\"]"));

      username.sendKeys("Shama");
      Contact.sendKeys("03455961283");
      Email.sendKeys("shama.ahsan@gmail.com");
      Password.sendKeys("Test1234");
      Cpassword.sendKeys("Test1234");
      ChkboxBtn.isSelected();
      RegisterBtn.click();


       // Login

        //WebElement userName = driver.findElement(By.id("username"));
       // WebElement passWord = driver.findElement(By.id("password"));
       // WebElement signinBtn = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/div/div[4]/div/input"));

       //  userName.sendKeys("shama.ahsan@test.com");
        // passWord.sendKeys("test1234");
        // signinBtn.submit();







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
