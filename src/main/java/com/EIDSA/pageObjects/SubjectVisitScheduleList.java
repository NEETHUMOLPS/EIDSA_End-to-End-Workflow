package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.awt.AWTException;
import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat; 
import java.text.ParseException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

public class SubjectVisitScheduleList extends AbstractComponent{
	static WebDriver driver;
	public SubjectVisitScheduleList(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Menu
	@FindBy(xpath = "//span[contains(text(),'Items')]")
	WebElement items;
	@FindBy(xpath = "//span[contains(text(),'Subjects')]")
	WebElement subject;
	@FindBy(xpath = "//a[contains(text(),'Unscheduled Visit')]")
	WebElement unscheduledVisit;
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Unscheduled visit
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement visitNumber;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement visitName;
	@FindBy(xpath = "//select[@placeholder='Visit Type']")
	WebElement visitType;
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement preVisit;
	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement postVisit;
	@FindBy(xpath = "//select[@name='popupaccount']")
	WebElement investigator;
	@FindBy(xpath = "(//input[@type='date'])[3]")
	WebElement visitDate;
	@FindBy(xpath = "//select[@placeholder='Select a template']")
	WebElement visitTemplate;
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement patientVisit;
	@FindBy(xpath = "//span[normalize-space()='Save']")
	WebElement save;
	
	//Search -  Subject
	@FindBy(xpath = "//select[@placeholder='Site code']")
	WebElement searchSiteCode;
	@FindBy(xpath = "//label[contains(text(),'Subject ID')]/following-sibling::input[1]")
	WebElement searchSubId;
	@FindBy(xpath = "//select[@placeholder='Search']")
	WebElement searchStatus;
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	WebElement search;
	
	//Search -  Unscheduled visit
	@FindBy(xpath="//label[contains(text(),'Visit Name')]/following-sibling::input[1]")
	WebElement searchVisitName;
	@FindBy(xpath="//select[@class='form-select my-2 my-lg-0']")
	WebElement searchVisitSchedule;
	@FindBy(xpath="(//input[@type='date'])[1]")
	WebElement searchVisitDate1;
	@FindBy(xpath="(//input[@type='date'])[2]")
	WebElement searchVisitDate2;
	@FindBy(xpath="//span[contains(text(),'Search')]")
	WebElement visitSearch;
	
	//Web table - Subject
	@FindBy(xpath="//td[1]")
	List<WebElement> tableSiteCode1;
	@FindBy(xpath="//td[2]")
	List<WebElement> tableSubId1;
	@FindBy(xpath="//td[3]")
	List<WebElement> tableStatus1;
	@FindBy(xpath="//td[9]")
	List<WebElement> tableSchedule1;
	
	//Web table - Unscheduled visit
	@FindBy(xpath="//td[1]")
	List<WebElement> tableSiteCode;
	@FindBy(xpath="//td[2]")
	List<WebElement> tableSubId;
	@FindBy(xpath="//td[3]")
	List<WebElement> tableVisitNo;
	@FindBy(xpath="//td[12]//i")
	List<WebElement> tableEdit;
	@FindBy(xpath="//td[13]//i")
	List<WebElement> tableView1;
	@FindBy(xpath="//td[4]")
	List<WebElement> tableVisitName;
	@FindBy(xpath="//td[14]//i")
	List<WebElement> tableWithdraw;
	@FindBy(xpath="//td[9]")
	List<WebElement> tableVisitStatus;
	@FindBy(xpath="//td[7]")
	List<WebElement> tableVisitDate;
	@FindBy(xpath="//td[10]")
	List<WebElement> TableInvestigator;
	@FindBy(xpath="//td[11]")
	List<WebElement> TableVisitCompletedDate;
	
	//Visit schedule -  Edit
	@FindBy(xpath="//i[@class='fa fa-save edit-delete my-1 mr-2']")
	WebElement saveVisitSchedule;
	
	
	public void clickSubject() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		subject.click();
		Thread.sleep(2000);
	}
	
	public void clickSubject1() throws InterruptedException
	{
		Thread.sleep(2000);
		subject.click();
		Thread.sleep(2000);
	}
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickUnscheduleVisit() throws InterruptedException
	{
		Thread.sleep(2000);
		unscheduledVisit.click();
		Thread.sleep(2000);
	}
	
	public void searchSubID(String sub) throws InterruptedException
	{
		Thread.sleep(2000);
		searchSubId.sendKeys(sub);
		Thread.sleep(2000);
		search.click();	
		Thread.sleep(2000);
	}
	
	public void searchSiteCode(String site) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sitecode=new Select(searchSiteCode);
		sitecode.selectByVisibleText(site);
		Thread.sleep(2000);
		search.click();	
		Thread.sleep(2000);
	}
	
	public void unScheduleVisit_negative() throws InterruptedException
	{
		Thread.sleep(2000);
		preVisit.clear();
		Thread.sleep(2000);
		preVisit.sendKeys("+!");
		Thread.sleep(2000);
		postVisit.clear();
		Thread.sleep(2000);
		postVisit.sendKeys("+!");
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public boolean findSubId(String subid) throws InterruptedException
	{
		boolean sub=false;
		int count = tableSubId1.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableSubId1.get(i).getText();
			if(text.contains(subid))
			{
				tableSchedule1.get(i).click();
				Thread.sleep(2000);
				sub=true;
				break;
			}
		}
		return sub;	
	}
	
	public void createUnScheduleVisit(String visitno,String visitname,String type,String previsit,String postvisit,String name,String date,String temp) throws InterruptedException
	{
		Thread.sleep(2000);
		unscheduledVisit.click();
		Thread.sleep(2000);
		visitNumber.sendKeys(visitno);
		Thread.sleep(2000);
		visitName.sendKeys(visitname);
		Thread.sleep(2000);
		visitType.click();
		Thread.sleep(2000);
		Select type1=new Select(visitType);
		type1.selectByVisibleText(type);
		Thread.sleep(2000);
		preVisit.clear();
		Thread.sleep(2000);
		preVisit.sendKeys(previsit);
		Thread.sleep(2000);
		postVisit.clear();
		Thread.sleep(2000);
		postVisit.sendKeys(postvisit);
		Thread.sleep(2000);
		investigator.click();
		Thread.sleep(2000);
		Select invs=new Select(investigator);
		invs.selectByVisibleText(name);
		Thread.sleep(2000);
		visitDate.sendKeys(date);
		Thread.sleep(2000);
		visitTemplate.click();
		Thread.sleep(2000);
		Select temp1=new Select(visitTemplate);
		temp1.selectByVisibleText(temp);
		Thread.sleep(2000);
		save.click();	
		Thread.sleep(2000);
	}
		
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit number already exists"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean creationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Unscheduled visit added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	public boolean verifyUnscheduledVisit(String visitno) throws InterruptedException 
	{
		boolean sub=false;
		int count = tableVisitNo.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitNo.get(i).getText();
			if(text.contains(visitno))
			{
				sub=true;
				break;
			}
		}
		return sub;
	}
	
	public void SearchVisitName(String visitname) throws InterruptedException
	{
		Thread.sleep(2000);
		searchVisitName.sendKeys(visitname);
		Thread.sleep(2000);
		visitSearch.click();
		Thread.sleep(2000);
	}
	
	public void SearchVisitSchedule(String sch) throws InterruptedException
	{
		Thread.sleep(2000);
		Select type1=new Select(searchVisitSchedule);
		type1.selectByVisibleText(sch);
		Thread.sleep(2000);
		visitSearch.click();
		Thread.sleep(2000);
	}
	
	public void SearchVisitDate(String date1,String date2) throws InterruptedException
	{
		Thread.sleep(2000);
		searchVisitDate1.sendKeys(date1);
		Thread.sleep(2000);
		searchVisitDate2.sendKeys(date2);
		Thread.sleep(2000);
		visitSearch.click();
		Thread.sleep(2000);
	}
	
	public Boolean visitNameSearchValidation(String visitname) throws InterruptedException
	{
		boolean st = true;
		int count =tableVisitName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitName.size();i++)
			{
				String scode=tableVisitName.get(i).getText();
				if (!(scode.contains(visitname))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitScheduleSearchValidation(String visitschedule) throws InterruptedException
	{
		boolean st = true;
		int count =tableVisitStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitStatus.size();i++)
			{
				String scode=tableVisitStatus.get(i).getText();
				if (!(scode.contains(visitschedule))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean dateSearchValidation(String date) throws InterruptedException
	{
		boolean st = true;
		int count =tableVisitDate.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitDate.size();i++)
			{
				String scode=tableVisitDate.get(i).getText();
				if (!(scode.contains(date))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	public void withdraw(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableVisitName.size();i++)
		{
			String text=tableVisitName.get(i).getText();
			if(text.equals(subcode))
			{
				Thread.sleep(2000);
				tableWithdraw.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void edit(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableVisitName.size();i++)
		{
			String text=tableVisitName.get(i).getText();
			if(text.equals(subcode))
			{
				Thread.sleep(2000);
				tableEdit.get(i).click();
				Thread.sleep(2000);
				saveVisitSchedule.click();
				Thread.sleep(2000);;
				break;	
			}
		}
	}
	
	public void view(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableVisitName.size();i++)
		{
			String text=tableVisitName.get(i).getText();
			if(text.equals(subcode))
			{
				tableView1.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	
	public void editVisit() throws InterruptedException
	{
	
	}
	
	public static boolean withdrawAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to withdraw this visit?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	
}