package com.EIDSA.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
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

public class SubjectTransfer extends AbstractComponent{
	static WebDriver driver;
	public SubjectTransfer(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Form Transfer
	@FindBy(xpath = "//span[normalize-space()='Study Administration']")
	WebElement studyAdministration;
	@FindBy(xpath = "//span[normalize-space()='Subject Transfer']")
	WebElement subjectTransfer;
	
	//Form Transfer
	@FindBy(xpath = "//label[@for='f2914bed-4f2f-4ed4-bb70-606ff58538a7']")
	WebElement S01a;
	@FindBy(xpath = "//label[@id='2944c4b4-7488-4157-bf07-9b28b1347f27']")
	WebElement P01a;
	
	@FindBy(xpath = "//label[@for='c2ec4ff1-eeb7-471f-ab5a-a8040ff718031']")
	WebElement S01b;
	
	@FindBy(xpath = "//span[@type='button']")
	WebElement transfer;
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
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
	
	public void subjectTransfer() throws InterruptedException
	{
		Thread.sleep(2000);
		studyAdministration.click();
		Thread.sleep(2000);
		subjectTransfer.click();
		Thread.sleep(2000);
		S01a.click();
		Thread.sleep(4000);
		P01a.click();
		Thread.sleep(4000);
		S01b.click();
		Thread.sleep(4000);
		transfer.click();
		Thread.sleep(3000);
	}
	
	public static boolean transferALert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to transfer this subject to the selected target site?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Subject has been transferred successfully."));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	
	

}
