package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import setup.SetUp;

import java.util.concurrent.TimeUnit;


public class SignUp extends SetUp {

    @Test

    public void SignUp(){


        //Sign Up

       // WebElement Register = driver.findElement(By.xpath("/html/body/form/div[3]/div[1]/div[1]/div[2]/div[2]/ul/li[2]/a"));
       // Register.click();

        WebElement name = driver.findElement(By.id("name"));
        WebElement phone = driver.findElement(By.id("phone"));
        //WebElement Email = driver.findElement(By.id("ContentPlaceHolder1_Emailtxt"));
       // WebElement Password = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
        //WebElement Cpassword = driver.findElement(By.id("ContentPlaceHolder1_ConfirmPasswordtxt"));
       // WebElement ChkboxBtn = driver.findElement(By.id("ctl00$ContentPlaceHolder1$CheckBox2"));
       // WebElement RegisterBtn = driver.findElement(By.id("//*[@id=\"ContentPlaceHolder1_Register_btn\"]"));

        name.sendKeys("Test");
        phone.sendKeys("03455061283");
        //Email.sendKeys("shama.ahsan@gmail.com");
        //Password.sendKeys("Test1234");
        //Cpassword.sendKeys("Test1234");
        //ChkboxBtn.isSelected();
        //RegisterBtn.click();

    }
}
