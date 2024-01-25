package com.EIDSA.pageObjects;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;

public class StudyPage extends AbstractComponent{
	
	static WebDriver driver;
	public StudyPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	

	
	//Web table
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[1]")
	List<WebElement> studyid;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[2]")
	List<WebElement> studynames;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[3]")
	List<WebElement> studyStatus;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[9]//i")
	List<WebElement> visiticon;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[10]//i")
	List<WebElement> activeCheckbox;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[11]/i")
	List<WebElement> studyEdit;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[13]/i")
	List<WebElement> studyDelete;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[12]/i")
	List<WebElement> audit;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[14]/i")
	List<WebElement> documentIcon;
	
	//Study creation
	@FindBy(xpath="//i[@class='fa fa-plus-square-o text-white fs-2']")
	WebElement createStudy;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement StudyId;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement StudyName;
	@FindBy(xpath="//input[@type='email']")
	WebElement Sponsor;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement saveStudy;
		
		
	//Study Profile
	@FindBy(xpath="//span[normalize-space()='Study Profile']")
	WebElement studyProfile;
	
	//Study list
	@FindBy(xpath="//span[normalize-space()='Study List']")
	WebElement studyList;
		
	//Edit study
	@FindBy(xpath="//i[@class='fa fa-edit fs-5']")
	WebElement editStudy;
		
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement studyId;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement studyName;
	@FindBy(xpath="//input[@type='email']")
	WebElement sponsor;
	@FindBy(xpath="//select[@class='form-select']")
	WebElement status;
	@FindBy(xpath="//input[@type='test']")
	WebElement studyNotes;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement preVisit;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement postVisit;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement noOfSites;
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement noOfSubjects;
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement duration;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement active;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	//Web table
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[1]")
	List<WebElement> studyid1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[2]")
	List<WebElement> studynames1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[3]")
	List<WebElement> studyStatus1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[9]//i")
	List<WebElement> visiticon1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[10]//i")
	List<WebElement> activeCheckbox1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[11]/i")
	List<WebElement> studyEdit1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[13]/i")
	List<WebElement> studyDelete1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[12]/i")
	List<WebElement> audit1;
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[14]/i")
	List<WebElement> documentIcon1;
	
	//Search
	@FindBy(xpath="//label[contains(text(),'ID')]//following-sibling::input[1]")
	WebElement studyidsearch;
	@FindBy(xpath="//label[contains(text(),'Status')]//following-sibling::select")
	WebElement studystatusSearch;
	@FindBy(xpath="//span[@type='button']")
	WebElement studySearch;
	
	public void clickStudyList() throws InterruptedException
	{
		
		Thread.sleep(2000);
		studyList.click();
		Thread.sleep(2000);
	}
	
	public void delStudyIcon(String sid) throws InterruptedException
	{
		int count=studyid1.size();
		for(int i=0;i<count;i++)
		{
			String studylist=studyid1.get(i).getText();
			System.out.println(studylist+i);
			if(studylist.contains(sid))
			{
				System.out.println(studyDelete1.get(i));
				studyDelete1.get(i).click();
				break;
			}
		}
	}
	
	public void searchStudyId(String studysearch) throws InterruptedException
	{
		Thread.sleep(2000);
		studyidsearch.sendKeys(studysearch);
		Thread.sleep(2000);
		studySearch.click();
		Thread.sleep(2000);
	}
	public static boolean deleteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this study?"));
			alert1.accept();
			Thread.sleep(1000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Deleted successfully."));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}

		
	
	public void StudyCreation(String id,String nm) throws InterruptedException
	{	
		Thread.sleep(2000);
		createStudy.click();
		Thread.sleep(2000);
		StudyId.sendKeys(id);
		Thread.sleep(2000); 
		StudyName.sendKeys(nm);
		Thread.sleep(2000); 
		saveStudy.click();
		Thread.sleep(2000); 
	}
	
	public static boolean studyCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
		
		public void clickOnStudyProfile() throws InterruptedException
		{		
			Thread.sleep(2000);
			studyProfile.click();
			Thread.sleep(2000);;
		}
		
		public void editStudy(String notes) throws InterruptedException
		{		
			Thread.sleep(2000);
			editStudy.click();
			Thread.sleep(2000);
			studyNotes.sendKeys(notes);
			Thread.sleep(2000);
			save.click();
			Thread.sleep(2000);
		}
		
		public static boolean studyEditAlert() throws InterruptedException
		{
			try
			{
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Study updated successfully."));
				alert1.accept();
				return true;
			} catch (NoAlertPresentException e) {
				return false;
			}		
		}
		
	
	}
	

	

	

	

	

	

	

	
	
	

