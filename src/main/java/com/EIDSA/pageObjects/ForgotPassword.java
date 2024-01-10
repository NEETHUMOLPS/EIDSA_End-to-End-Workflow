package com.EIDSA.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class ForgotPassword extends AbstractComponent{
	static WebDriver driver;
	public ForgotPassword(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Forgot password
	@FindBy(xpath = "//a[normalize-space()='Forgot password/username?']")
	WebElement forgotPassword;
	@FindBy(xpath = "//input[@placeholder='Account Email']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit;
	@FindBy(xpath = "//span[contains(text(),'Please enter a valid email address.')]")
	WebElement err;
	
	//Forgot username
	@FindBy(xpath = "//a[normalize-space()='Username']")
	WebElement username;
	
	public void clickForgotPassword_ForgotUsername() throws InterruptedException
	{
		Thread.sleep(2000);
		forgotPassword.click();
		Thread.sleep(2000);
	}
	
	public void clickUsername() throws InterruptedException
	{
		Thread.sleep(2000);
		username.click();
		Thread.sleep(2000);
	}
	
	public void clickEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		email.click();
		Thread.sleep(2000);
	}
	
	public void setEmail(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		email.sendKeys(nm);
		Thread.sleep(2000);
	}
	
	public void clickSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public String ErrorMsg()
	{
		elementWait(err);
		return err.getText();
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("We have sent you a password reset link. Please check your email."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("We have send you a mail containing username check your mail"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}

}
