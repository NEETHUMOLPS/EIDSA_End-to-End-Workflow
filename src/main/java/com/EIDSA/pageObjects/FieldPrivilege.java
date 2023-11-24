package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

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

public class FieldPrivilege extends AbstractComponent{
	static WebDriver driver;
	public FieldPrivilege(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//menu
	@FindBy(xpath = "//span[contains(text(),'Field Privileges')]")
	WebElement FieldPrivilege;
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> tableTemplateName;
	@FindBy(xpath = "//td[7]")
	List<WebElement> tableSetPrivilege;
	
	@FindBy(xpath = "//select[@id='study']")
	WebElement Study;
	@FindBy(xpath = "//select[@id='rolelist']")
	WebElement roles;	
	@FindBy(xpath = "//div[@class='flexContainer']//div[1]//div[1]//div[1]//input[1]")
	WebElement siteIdCode;
	@FindBy(xpath = "//input[@id='exampleRadios1']")
	WebElement masking;
	@FindBy(xpath = "//input[@id='exampleRadios2']")
	WebElement view;
	@FindBy(xpath = "//input[@id='Edit']")
	WebElement edit;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save;
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a privilege"));
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
			Assert.assertTrue(alert1.getText().contains("Please select a role"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}

	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Privilege added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickFieldPrivilege() throws InterruptedException
	{	
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(FieldPrivilege);
		FieldPrivilege.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
		
	}
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(Study);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public boolean clickSetPrivilege(String subjectid) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableTemplateName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableTemplateName.get(i).getText();
			if(text.contains(subjectid))
			{
				tableSetPrivilege.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
		return sub;
	}
	
	public void setPrivilege(String role) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(roles);
		sel.selectByVisibleText(role);
		Thread.sleep(2000);
		siteIdCode.click();
		Thread.sleep(2000);
		masking.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public void negative(String role) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(roles);
		sel.selectByVisibleText(role);
		Thread.sleep(2000);
		siteIdCode.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public void negative1() throws InterruptedException
	{
		Thread.sleep(2000);
		siteIdCode.click();
		Thread.sleep(2000);
	}
	
	
}
