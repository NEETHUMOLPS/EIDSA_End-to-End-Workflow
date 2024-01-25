package com.EIDSA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent{
	static WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Login
	@FindBy(xpath="//form[@role='form']//input[@placeholder='Username']")
	@CacheLookup
	WebElement txtUsername;
	@FindBy(xpath="//input[@placeholder='Email']")
	@CacheLookup
	WebElement txtEmail;	
	@FindBy(xpath="//div[@class='form-group position-relative']//input[@placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;	
	@FindBy(xpath="//span[normalize-space()='Login']")
	@CacheLookup
	WebElement btnLogin;
	
	
	//Logout
	@FindBy(xpath="//img[@alt='User Profile Image']")
	@CacheLookup
	WebElement userProfile;	
	@FindBy(xpath="//span[normalize-space()='Logout']")
	@CacheLookup
	WebElement btnLogout;
	
	//Error
	@FindBy(xpath="//div[contains(text(),'Invalid email or password.')]")
	@CacheLookup
	WebElement err1;	
	@FindBy(xpath="//div[contains(text(),'The username is not associated with this account.')]")
	@CacheLookup
	WebElement err2;
	@FindBy(xpath="//span[contains(text(),'The username field is required')]")
	@CacheLookup
	WebElement err3;
	@FindBy(xpath="//span[contains(text(),'The email field is required')]")
	@CacheLookup
	WebElement err4;
	@FindBy(xpath="//span[contains(text(),'The password field is required')]")
	@CacheLookup
	WebElement err5;
	
	
	public void login(String username,String em,String pwd) throws InterruptedException
	{
		Thread.sleep(2000);
		txtUsername.sendKeys(username);
		Thread.sleep(2000);
		txtEmail.sendKeys(em);
		Thread.sleep(2000);
		txtPassword.sendKeys(pwd);
		Thread.sleep(2000);
		btnLogin.click();		
		Thread.sleep(8000);
	}
	
	public void clearLoginCredentials() throws InterruptedException
	{
		Thread.sleep(2000);
		txtUsername.clear();
		Thread.sleep(2000);
		txtEmail.clear();
		Thread.sleep(2000);
		txtPassword.clear();
		Thread.sleep(2000);
	}
	
	public void clearUsername() throws InterruptedException
	{
		Thread.sleep(2000);
		txtUsername.clear();
		Thread.sleep(2000);
	}
	
	public void clearEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		txtEmail.clear();
		Thread.sleep(2000);
	}
	
	public void clearPassword() throws InterruptedException
	{
		Thread.sleep(2000);
		txtPassword.clear();
		Thread.sleep(2000);
	}
	
		
	public String ErrorMsg1()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public String ErrorMsg2()
	{
		elementWait(err2);
		return err2.getText();
	}
	
	public String ErrorMsg3()
	{
		elementWait(err3);
		return err3.getText();
	}
	
	public String ErrorMsg4()
	{
		elementWait(err4);
		return err4.getText();
	}
	
	public String ErrorMsg5()
	{
		elementWait(err5);
		return err5.getText();
	}
		
	public void logout() throws InterruptedException
	{
		Thread.sleep(2000);
		userProfile.click();
		Thread.sleep(2000);
		btnLogout.click();
		Thread.sleep(2000);
	}
}