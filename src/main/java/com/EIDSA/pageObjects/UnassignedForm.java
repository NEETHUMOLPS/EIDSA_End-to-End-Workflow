package com.EIDSA.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class UnassignedForm extends AbstractComponent{
	static WebDriver driver;
	public UnassignedForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Unassigned forms
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Unassigned Forms']")
	WebElement unassignedForms;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/i[1]")
	WebElement form1;
	@FindBy(xpath = "(//select[@name='account'])[2]")
	WebElement siteCode;
	@FindBy(xpath = "(//select[@name='account'])[3]")
	WebElement subjectId;
	@FindBy(xpath = "(//span[@type='button'])[1]")
	WebElement mapFrom;
	

	
	
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickOnUnassignedForms() throws InterruptedException 
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		unassignedForms.click();
		Thread.sleep(2000);
	}
	
	
	public void mapping(String site, String sub) throws InterruptedException 
	{
		Thread.sleep(2000);
		Select sel=new Select(siteCode);
		sel.selectByVisibleText(site);
		Thread.sleep(2000);
		Select sel1=new Select(subjectId);
		sel1.selectByVisibleText(sub);
		Thread.sleep(2000);
		mapFrom.click();
		Thread.sleep(2000);
	}
	
	public void selectForm1() throws InterruptedException 
	{
		Thread.sleep(2000);
		form1.click();
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
	
	public static boolean Alert1() throws InterruptedException
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
	

}
