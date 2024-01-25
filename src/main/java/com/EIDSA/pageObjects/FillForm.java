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
	@FindBy(xpath = "//td[6]")
	List<WebElement> TableSubmitForm;
	
	@FindBy(xpath = "//i[@class='fa fa-plus-square edit-delete']")
	WebElement reviewAndSubmitForm;
	@FindBy(xpath = "//i[@class='fa fa-plus-square edit-delete']")
	WebElement saveForm;
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	WebElement Save;
	@FindBy(xpath = "(//button[normalize-space()='Review And Submit'])[1]")
	WebElement ReviewAndSubmit;
	
	@FindBy(xpath = "//input[@type='textbox']")
	WebElement nameField;
	
	//Partially filled forms
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Partially Filled Forms']")
	WebElement partiallyFilledForms;
	
	@FindBy(xpath = "//td[1]")
	List<WebElement> TableSiteCode1;
	@FindBy(xpath = "//td[2]")
	List<WebElement> TableSubId1;
	@FindBy(xpath = "//td[3]")
	List<WebElement> TableVisitName1;
	@FindBy(xpath = "//i[@class='fa fa-eye editicon']")
	WebElement view1;
	
	//Data entry
	@FindBy(xpath = "//a[normalize-space()='001 - 001']")
	WebElement dataEntry;
	
	//Map unassigned form
	@FindBy(xpath = "//span[normalize-space()='Unassigned Forms']")
	WebElement unassignedForms;
	
	@FindBy(xpath = "(//i[@class='fa fa-eye editicon'])[1]")
	WebElement view2;
	@FindBy(xpath = "(//select[@name='account'])[2]")
	WebElement SiteCode;
	@FindBy(xpath = "(//select[@name='account'])[3]")
	WebElement SubjectId;
	@FindBy(xpath = "//span[@type='button']")
	WebElement MapForm;
	
	public void unassignedForms(String site,String sub) throws InterruptedException
	{
		Thread.sleep(2000);
		unassignedForms.click();
		Thread.sleep(2000);
		view2.click();
		Thread.sleep(2000);
		Select sel = new Select(SiteCode);
		sel.selectByVisibleText(site);
		Thread.sleep(2000);
		Select sel1 = new Select(SubjectId);
		sel1.selectByVisibleText(sub);
		Thread.sleep(2000);
		MapForm.click();
		Thread.sleep(2000);
		
	}
	
	
	public void selectStudy1(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void partiallyFilledForms() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		partiallyFilledForms.click();
		Thread.sleep(2000);
		view1.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		ReviewAndSubmit.click();
		Thread.sleep(2000);
		
	}
	
	public void dataEntry(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		FillForm.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		dataEntry.click();
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		ReviewAndSubmit.click();
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
	
	public void reviewAndSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		ReviewAndSubmit.click();
		Thread.sleep(2000);
	}
	
	public void save() throws InterruptedException
	{
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void selectForm1() throws InterruptedException 
	{
		Thread.sleep(2000);
		reviewAndSubmitForm.click();
		Thread.sleep(2000);
	}
	
	public void selectForm2() throws InterruptedException 
	{
		Thread.sleep(2000);
		saveForm.click();
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
		elementWait(Save);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void fillFormReviewAndSubmit(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		Thread.sleep(2000);
		ReviewAndSubmit.click();
		Thread.sleep(2000);
	}
	

}
