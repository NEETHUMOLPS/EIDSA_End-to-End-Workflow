package com.EIDSA.pageObjects;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

public class DMS extends AbstractComponent{
	static WebDriver driver;
	public DMS(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
			//Menu
			@FindBy(xpath = "//span[normalize-space()='DMS']")
			WebElement DMS;
			@FindBy(xpath = "//span[normalize-space()='Document Upload']")
			WebElement documentUpload;
			@FindBy(xpath = "//span[normalize-space()='Document Summary']")
			WebElement documentSummary;
			@FindBy(xpath = "//span[normalize-space()='Document Approval']")
			WebElement documentApproval;
			@FindBy(xpath = "//span[normalize-space()='Documents']")
			WebElement documents;
	
			//Folder creation
			@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div[1]/div/div[1]/div/img")
			WebElement AddFolder;
			@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/input")
			WebElement FolderName;
			@FindBy(xpath="//button[contains(text(),'Add')]")
			WebElement FolderAdd;
			@FindBy(xpath="//label[normalize-space()='01']")
			WebElement clickOnFolder1;
			@FindBy(xpath="//i[@class='fa fa-times']")
			WebElement close;
			
			//Folder edit
			@FindBy(xpath="//img[@alt='Edit folder name']")
			WebElement editFolder1;
			@FindBy(xpath="//input[@placeholder='Enter Folder Name']")
			WebElement editFolder2;
			@FindBy(xpath="//img[@alt='Save folder name']")
			WebElement editFolder3;
			
			//Document upload
			@FindBy(xpath="//img[@alt='upload document']")
			WebElement upload;
			@FindBy(xpath="//textarea[@placeholder='Description']")
			WebElement description;
			@FindBy(xpath="//div[@class='multiselect multiselect-theme']")
			WebElement appr1;
			@FindBy(xpath="//span[normalize-space()='Neethumol P S']")
			WebElement appr2;
			@FindBy(xpath="//div[@id='page-wrapper']/div[4]/div/div[2]/div[2]/div/div/span[2]")
			WebElement appr3;
			@FindBy(xpath="//input[@id='InPutFile']")
			WebElement chooseFile;
			@FindBy(xpath="//button[@type='button']//div[contains(text(),'Add')]")
			WebElement AddFile;
			
			//View and approve the document
			@FindBy(xpath="//i[@class='fa fa-eye edit-delete']")
			WebElement view;
			
			@FindBy(xpath="//img[@alt='Approve document']")
			WebElement approve;
			@FindBy(xpath="//img[@alt='Reject document']")
			WebElement reject;
			
			
			public static boolean folderCreationAlert() throws InterruptedException
			{
				try
				{
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
					wait1.until(ExpectedConditions.alertIsPresent());
					Alert alert1 = driver.switchTo().alert();
					Assert.assertTrue(alert1.getText().contains("Folder created successfully"));
					alert1.accept();
					return true;
				} catch (NoAlertPresentException e) {
					return false;
				}
				
			}
			
			public static boolean folderUpdationAlert() throws InterruptedException
			{
				try
				{
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
					wait1.until(ExpectedConditions.alertIsPresent());
					Alert alert1 = driver.switchTo().alert();
					Assert.assertTrue(alert1.getText().contains("Folder updated successfully"));
					alert1.accept();
					return true;
				} catch (NoAlertPresentException e) {
					return false;
				}
				
			}
			
			public static boolean documentCreationAlert() throws InterruptedException
			{
				try
				{
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
					wait1.until(ExpectedConditions.alertIsPresent());
					Alert alert1 = driver.switchTo().alert();
					Assert.assertTrue(alert1.getText().contains("Document created successfully"));
					alert1.accept();
					return true;
				} catch (NoAlertPresentException e) {
					return false;
				}
				
			}
			
			public void selFolder1() throws InterruptedException
			{
				Thread.sleep(2000);
				clickOnFolder1.click();
				Thread.sleep(2000);
			}
			
			public void approveDocument() throws InterruptedException
			{
				Thread.sleep(2000);
				approve.click();
				Thread.sleep(2000); 
			}
			
			public static boolean approveDocumentAlert() throws InterruptedException
			{
				try
				{
					WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
					wait1.until(ExpectedConditions.alertIsPresent());
					Alert alert1 = driver.switchTo().alert();
					Assert.assertTrue(alert1.getText().contains("Are you sure you want to approve this document?"));
					alert1.accept();
					Thread.sleep(2000);
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
					wait.until(ExpectedConditions.alertIsPresent());
					Alert alert = driver.switchTo().alert();
					Assert.assertTrue(alert.getText().contains("Document Approved"));
					alert.accept();
					return true;
				} catch (NoAlertPresentException e) {
					return false;
				}
				
			}
			
			public void viewDocument() throws InterruptedException
			{
				Thread.sleep(2000);
				view.click();
				Thread.sleep(2000);
			}
			
			
			public void DMS() throws InterruptedException
			{
				Thread.sleep(2000);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,800)");
				Thread.sleep(2000);
				elementWait(DMS);
				DMS.click();
				Thread.sleep(2000);
			}
			
			public void documentUpload() throws InterruptedException
			{
				Thread.sleep(2000);
				documentUpload.click();
				Thread.sleep(2000);
			}
			
			public void documentApproval() throws InterruptedException
			{
				Thread.sleep(2000);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,800)");
				Thread.sleep(2000);
				elementWait(documentApproval);
				documentApproval.click();
				Thread.sleep(2000);
			}
			
			public void FolderCreation(String fol) throws InterruptedException
			{
				Thread.sleep(2000);	
				AddFolder.click();
				FolderName.sendKeys(fol);
				Thread.sleep(2000);	
				FolderAdd.click();
				Thread.sleep(2000);
			}
			
			public void DocumentUpload() throws InterruptedException, AWTException
			{
				Thread.sleep(2000);
				upload.click();
				Thread.sleep(2000);
				appr1.click();
				Thread.sleep(2000);
				appr2.click();
				Thread.sleep(2000);
				appr3.click();
				Thread.sleep(2000);
				WebElement uploadbtn=driver.findElement(By.xpath("//input[@id='InPutFile']"));
				uploadbtn.sendKeys("C:\\Users\\NeethumolPS\\Downloads\\UAT EIDSA - E-Consent(1).docx");
				AddFile.click();
			    Thread.sleep(2000);
			}
			
			public void folderEdit(String nm) throws InterruptedException
			{
				Thread.sleep(2000);
				clickOnFolder1.click();
				Thread.sleep(2000);
				editFolder1.click();
				Thread.sleep(2000);
				editFolder2.clear();
				Thread.sleep(2000);
				editFolder2.sendKeys(nm);
				Thread.sleep(2000);
				editFolder3.click();
				Thread.sleep(2000);
			}

}
