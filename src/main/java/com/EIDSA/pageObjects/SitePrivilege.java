package com.EIDSA.pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class SitePrivilege extends AbstractComponent{
	static WebDriver driver;
	public SitePrivilege(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Site privilege
	@FindBy(xpath = "//span[contains(text(),'Site privilege')]")
	WebElement sitePrivilege;
	@FindBy(xpath = "//select[@placeholder='select a user']")
	WebElement user;
	@FindBy(xpath = "//a[normalize-space()='001']")
	WebElement study;
	@FindBy(xpath = "//input[@id='77b675a9-f339-494d-a7ef-5df5ae81f27b']")
	WebElement site;
	@FindBy(xpath = "//thead/tr[1]/th[1]/button[1]/i[1]")
	WebElement save;
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	public void clickSitePrivilege() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(sitePrivilege);
		sitePrivilege.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
	}
	
	
	public void sitePrivilegeSetting(String username) throws InterruptedException
	{
		
		Thread.sleep(2000);
		user.sendKeys(username);
		Thread.sleep(5000);
		study.click();
		Thread.sleep(2000);
		site.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public String Alert() throws InterruptedException
	{
		Thread.sleep(3000);
		Alert alert=driver.switchTo().alert();
		String msg=alert.getText();
		alert.accept();
		return msg;	
	}

}
