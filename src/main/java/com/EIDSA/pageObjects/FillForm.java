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

public class FillForm extends AbstractComponent{
	static WebDriver driver;
	public FillForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Menu
	@FindBy(xpath = "//span[normalize-space()='Fill Form']")
	WebElement FillForm;
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> TableSiteCode;
	@FindBy(xpath = "//td[2]")
	List<WebElement> TableSubId;
	@FindBy(xpath = "//td[3]")
	List<WebElement> TableVisitName;
	@FindBy(xpath = "//tbody/tr[1]/td[6]/i[1]")
	WebElement TableSubmitForm1;
	@FindBy(xpath = "//tbody/tr[2]/td[6]/i[1]")
	WebElement TableSubmitForm2;
	
	@FindBy(xpath = "//button[normalize-space()='Review And Submit']")
	WebElement reviewAndSubmitForm;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement saveForm;

	
	@FindBy(xpath = "//input[@type='textbox']")
	WebElement nameField;
	
	//Data entry
	@FindBy(xpath = "//a[normalize-space()='V01 - V01']")
	WebElement dataEntry;
	
	
	
	public void selectStudy1(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	
	public void dataEntry(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		dataEntry.click();
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		reviewAndSubmitForm.click();
		Thread.sleep(2000);
		
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form saved successfully"));
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
			Assert.assertTrue(alert1.getText().contains("Form submitted successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form submitted successfully."));
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
			Assert.assertTrue(alert1.getText().contains("Form saved successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert5() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("A form is already saved/submitted against this visit for the selected subject, do you want to replace the existing form?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Form mapped successfully."));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickFillForm() throws InterruptedException
	{
		Thread.sleep(2000);
		FillForm.click();
		Thread.sleep(2000);
	}
	
	
	public void selectForm1() throws InterruptedException 
	{
		Thread.sleep(2000);
		TableSubmitForm1.click();
		Thread.sleep(2000);
	}
	
	public void selectForm2() throws InterruptedException 
	{
		Thread.sleep(2000);
		TableSubmitForm2.click();
		Thread.sleep(2000);
	}
	
	public void fillFormSave(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(2000);
		elementWait(saveForm);
		saveForm.click();
		Thread.sleep(2000);
	}
	
	public void fillFormReviewAndSubmit(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		nameField.clear();
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)");
		elementWait(reviewAndSubmitForm);
		reviewAndSubmitForm.click();
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
