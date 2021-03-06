package com.zm.PageObject;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	 
	public class FacebookLoginPage  {
	    WebDriver driver;
	 
	    public FacebookLoginPage(WebDriver driver){
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	 
	    @FindBy(id = "email")
	    WebElement emailField;
	 
	    @FindBy(id = "pass")
	    WebElement passwordField;
	 
	    @FindBy(id = "loginbutton")
	    WebElement loginButton;
	 
	    public void login(String username, String password){
	        emailField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();
	       
	    }
	}

