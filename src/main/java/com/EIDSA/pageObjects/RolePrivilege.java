package com.EIDSA.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class RolePrivilege extends AbstractComponent{
	static WebDriver driver;
	public RolePrivilege(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Role privilege menu	
	@FindBy(xpath="//span[normalize-space()='Role Privileges']")
	WebElement rolePrivilege;

	//Role
	@CacheLookup
	@FindBy(xpath="//select[@placeholder='Select Role']")
	WebElement SelectRole;
	
	//Screen
	@FindBy(xpath="//input[@id='selectall']")
	WebElement Screens1;
	@FindBy(xpath="//input[@id='f6a161dd-0d2f-432e-911b-5df7830b5043']")
	WebElement subject1;
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement Save;
	
	//Error
	@FindBy(xpath="//span[contains(text(),'Please select a role')]")
	@CacheLookup
	WebElement err;
		
	public void ClickSave() throws InterruptedException
	{
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void clickScreen() throws InterruptedException
	{
		Thread.sleep(2000);
		Screens1.click();
		Thread.sleep(2000);
	}
	
	public void clickSave() throws InterruptedException
	{
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	
	public String errMsg()
	{
		elementWait(err);
		return err.getText();
	}	
	
	public void clickRolePrivilege() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(rolePrivilege);
		rolePrivilege.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	}
	
	public void setRolePrivilege(String role) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(SelectRole);
		sel.selectByVisibleText(role);
		Thread.sleep(2000);
		Screens1.click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		elementWait(Save);
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void clickSave_negative() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		elementWait(Save);
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-2000)");
		
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Role screen privilege updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	
}
