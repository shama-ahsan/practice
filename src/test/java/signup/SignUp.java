package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import setup.SetUp;

import java.util.concurrent.TimeUnit;


public class SignUp extends SetUp {

    @Test

    public void SignUp(){

        WebElement Register = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div[1]/div[1]/div[2]/div[2]/ul/li[2]/a"));
        Register.click();

        WebElement Username = driver.findElement(By.id("ContentPlaceHolder1_Nametxt"));
        WebElement Contact  = driver.findElement(By.id("ContentPlaceHolder1_Faxtxt"));
        WebElement Email = driver.findElement(By.id("ContentPlaceHolder1_Emailtxt"));
        WebElement Password = driver.findElement((By.id("ContentPlaceHolder1_txtPassword")));
        WebElement Cpassword = driver.findElement((By.id("ContentPlaceHolder1_ConfirmPasswordtxt")));


       Username.clear();
       Username.sendKeys("testuser");
       Contact.clear();
       Contact.sendKeys("03455061283");
       Email.clear();
       Email.sendKeys("shama.ahsan@gmail.com");
       Password.clear();
       Password.sendKeys("tester123.");
       Cpassword.clear();
       Cpassword.sendKeys("tester123.");

       WebElement Chkbox = driver.findElement((By.name("ctl00$ContentPlaceHolder1$CheckBox2")));
       Chkbox.click();
       WebElement Reg = driver.findElement((By.xpath("//*[@id=\"ContentPlaceHolder1_Register_btn\"]")));
       Reg.click();


    }
}
