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

public class StudyVisit extends AbstractComponent{
	
	static WebDriver driver;
	public StudyVisit(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Add visit
	@FindBy(xpath="//img[@alt='Add visit']")
	WebElement AddVisit;
	@FindBy(xpath="//input[@placeholder='Visit No.']")
	WebElement VisitNo ;
	@FindBy(xpath="//input[@placeholder='Visit Name']")
	WebElement VisitName ;
	@FindBy(xpath="//select[@placeholder='Visit Type']")
	WebElement VisitType ;
	@FindBy(xpath="//input[@placeholder='Pre-visit ']")
	WebElement PreVisit ;
	@FindBy(xpath="//input[@placeholder='Post-visit ']")
	WebElement PostVisit ;
	@FindBy(xpath="//input[@placeholder='Visit Period Days']")
	WebElement Day ;
	@FindBy(xpath="//input[@placeholder='Visit Period Weeks']")
	WebElement Week ;
	@FindBy(xpath="//input[@placeholder='Visit Period Months']")
	WebElement Month ;
	@FindBy(xpath="//input[@placeholder='Visit Period years']")
	WebElement Year ;
	@FindBy(xpath="//input[@placeholder='Visit Notes']")
	WebElement Notes ;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement Active ;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement PatientVisit ;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement Clear ;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement Save ;
	
	//Study menu
	@FindBy(xpath="//span[normalize-space()='Study List']")
	WebElement Study;
	
	//Search
	@FindBy(xpath="//input[@type='text']")
	WebElement StudyNameOrId;
	@FindBy(xpath="//select[@placeholder='Search']")
	WebElement StatusSearch ;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement searchVisitNo;	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement searchVisitName;	
	@FindBy(xpath="//span[@type='button']")
	WebElement Search ;
	
	//Assign template
	@FindBy(xpath="//select[@placeholder='Search by Status']")
	WebElement SelectTemplate;	
	@FindBy(xpath="//button[normalize-space()='Assign']")
	WebElement Assign;
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement AssignClose;	
	
	//Error
	@FindBy(xpath="//span[contains(text(),'Please enter visit no')]")
	WebElement err1;	
	@FindBy(xpath="//span[contains(text(),'Please enter visit/form name')]")
	WebElement err2;	
	@FindBy(xpath="//span[contains(text(),'Please select a visit type')]")
	WebElement err3;	
	
	//Web table	
	@FindBy(xpath="//td[1]")
	List<WebElement> TableStudyId;	
	@FindBy(xpath="//td[9]")
	List<WebElement> TableVisit;
	
	@FindBy(xpath="//td[1]")
	List<WebElement> TableVisitNo;	
	@FindBy(xpath="//td[2]")
	List<WebElement> TableVisitName;	
	@FindBy(xpath="//td[12]")
	List<WebElement> TableActive;
	@FindBy(xpath="//td[13]//i")
	List<WebElement> TableAssignTemplate;	
	@FindBy(xpath="//td[14]//i")
	List<WebElement> TableEdit;
	@FindBy(xpath="//td[15]//i")
	List<WebElement> TableDelete;
	
	public void clickStudy() throws InterruptedException
	{	
		Thread.sleep(2000);
		Study.click();
		Thread.sleep(2000);
	}
	
	public void visitIcon(String studId) throws InterruptedException
	{

		int count = TableStudyId.size();
		for(int i=0;i<count;i++)
		{

			String text =  TableStudyId.get(i).getText();
			if(text.contains(studId))
			{
				TableVisit.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void createVisit(String no,String name,String type) throws InterruptedException
	{
		Thread.sleep(2000);
		AddVisit.click();
		Thread.sleep(2000);
		VisitNo.sendKeys(no);
		Thread.sleep(2000);
		VisitName.sendKeys(name);
		Thread.sleep(2000);
		Select sel=new Select(VisitType);
		sel.selectByVisibleText(type);
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit added successfully."));
			alert1.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit updated successfully."));
			alert1.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this visit?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Visit deleted successfully."));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Template assigned successfully"));
			alert1.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert5() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a template"));
			alert1.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert6() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit No already exists."));
			alert1.accept();
			Thread.sleep(2000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
		
	public void searchVisitName(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		searchVisitName.sendKeys(name);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void VisitAdd_Negative() throws InterruptedException
	{
		Thread.sleep(2000);
		AddVisit.click();
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void AssignClick() throws InterruptedException
	{
		Thread.sleep(2000);
		Assign.click();
		Thread.sleep(2000);
	}
	
	public void AssignClose() throws InterruptedException
	{
		Thread.sleep(2000);
		AssignClose.click();
		Thread.sleep(2000);
	}
	
	public void templateAssigning(String temp) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(SelectTemplate);
		sel.selectByVisibleText(temp);
		Thread.sleep(2000);
		Assign.click();
		Thread.sleep(2000);
	}
	
	public void searchVisitNo(String no) throws InterruptedException
	{
		Thread.sleep(2000);
		searchVisitNo.sendKeys(no);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void StudyNameOrIdSearch(String id) throws InterruptedException
	{
		Thread.sleep(2000);
		StudyNameOrId.sendKeys(id);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void ClickSave() throws InterruptedException
	{
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public Boolean visitNameSearchValidation(String status) throws InterruptedException
	{
		boolean st = true;
		int count =TableVisitName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableVisitName.size();i++)
			{
				String stat=TableVisitName.get(i).getText();
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitNoSearchValidation(String status) throws InterruptedException
	{
		boolean st = true;
		int count =TableVisitNo.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableVisitNo.size();i++)
			{
				String stat=TableVisitNo.get(i).getText();
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void editStudyIcon(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<TableVisitNo.size();i++)
		{
			String text=TableVisitNo.get(i).getText();
			if(text.equals(nstudyid))
			{
				TableEdit.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void delete(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<TableVisitNo.size();i++)
		{
			String text=TableVisitNo.get(i).getText();
			if(text.equals(nstudyid))
			{
				TableDelete.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void assignTemplate(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<TableVisitNo.size();i++)
		{
			String text=TableVisitNo.get(i).getText();
			if(text.equals(nstudyid))
			{
				TableAssignTemplate.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public String ErrorMsg1()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public String ErrorMsg2()
	{
		elementWait(err2);
		return err2.getText();
	}
	
	public String ErrorMsg3()
	{
		elementWait(err3);
		return err3.getText();
	}

}