package com.zm.test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.zm.PageObject.FacebookHomePage;
import com.zm.PageObject.FacebookLoginPage;

public class FacebookPostTest extends BaseSetup{
   FacebookLoginPage objLogin;
   FacebookHomePage objHome;

   @Test
   @Parameters({"userName","password"})
   public void FacebookPost(String userName, String password) throws InterruptedException{
       driver.get("https:\\www.facebook.com");
       driver.manage().window().maximize();
       objLogin = new FacebookLoginPage(driver);
       objHome = new FacebookHomePage(driver);
       objLogin.login(userName, password);
      Thread.sleep(5000);
       driver.navigate().refresh();
       objHome.postStatus("Hello World");
   }
}