package com.zm.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class FacebookHomePage {
    WebDriver driver;
 
    public FacebookHomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath="//*[contains(text(),'Create Post')]")
    WebElement CreatePost;
    
    @FindBy(xpath="//*[contains(@class,'_1mf _1mj')]")
    WebElement postmsg;
     
    @FindBy (xpath = "//button[contains(.,'Post')]")
    WebElement postButton;
 
    public void postStatus(String textStatus) throws InterruptedException{
    	CreatePost.click();
    	Thread.sleep(6000);
    	postmsg.click();
    	Thread.sleep(2000);
    	Actions actions = new Actions(driver);
    	actions.moveToElement(postmsg);
    	actions.click();
    	actions.sendKeys(textStatus);
    	actions.build().perform();
    	Thread.sleep(2000);
    	postButton.click();
    	Thread.sleep(2000);
    }
}