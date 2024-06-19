package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

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

public class Visit extends AbstractComponent{
	static WebDriver driver;
	public Visit(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Search
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Visits']")
	WebElement visit;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement visitNo;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement visitName;
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	WebElement Search;
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> tableVisitNo;
	@FindBy(xpath = "//td[2]")
	List<WebElement> tableVisitName;
	@FindBy(xpath = "//td[14]//i")
	List<WebElement> tableView;
	@FindBy(xpath = "//td[13]//i")
	List<WebElement> tableAssignTemplate;
	
	//Assign template
	@FindBy(xpath = "//select[@placeholder='Search by Status']")
	WebElement assignTemplate;
	@FindBy(xpath = "//button[normalize-space()='Assign']")
	WebElement assign;
	@FindBy(xpath = "//i[@class='fa fa-times']")
	WebElement assignClose;
	@FindBy(xpath = "(//select[@name='changelanguage'])[1]")
	WebElement availableLanguage;
	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	WebElement language;
	@FindBy(xpath = "//span[@type='button']")
	WebElement translate;
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickVisit() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		visit.click();
		Thread.sleep(2000);
	}
	
	public void SearchVisitNo(String no) throws InterruptedException
	{
		Thread.sleep(2000);
		visitNo.sendKeys(no);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void assign() throws InterruptedException
	{
		Thread.sleep(2000);
		assign.click();
		Thread.sleep(2000);
	}
	
	public void language(String lan1,String lan2) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(availableLanguage);
		sel.selectByVisibleText(lan1);
		Thread.sleep(2000);
		Select sel1=new Select(language);
		sel1.selectByVisibleText(lan2);
		Thread.sleep(2000);
	}
	
	public void Translate() throws InterruptedException
	{
		Thread.sleep(2000);
		translate.click();
		Thread.sleep(2000);
	}
	
	public void assignclose() throws InterruptedException
	{
		Thread.sleep(2000);
		assignClose.click();
		Thread.sleep(2000);
	}
	
	public void SearchVisitName(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		visitName.sendKeys(name);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void TemplateAssigning(String temp) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(assignTemplate);
		sel.selectByVisibleText(temp);	
		Thread.sleep(2000);
	}
	
	public Boolean visitNoSearchValidation(String num) throws InterruptedException
	{
		boolean st = true;
		int count =tableVisitNo.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitNo.size();i++)
			{
				String scode=tableVisitNo.get(i).getText();
				if (!(scode.contains(num))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitNameSearchValidation(String name) throws InterruptedException
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
				if (!(scode.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
			

	
	public boolean assignTemp(String subject) throws InterruptedException
	{
		boolean sub=false;
		int count = tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitName.get(i).getText();
			if(text.contains(subject))
			{
				tableAssignTemplate.get(i).click();
				Thread.sleep(2000);
				sub=true;
				break;
			}
		}
		return sub;
	}
	
	public boolean view(String subject) throws InterruptedException
	{
		boolean sub=false;
		int count = tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitName.get(i).getText();
			if(text.contains(subject))
			{
				tableView.get(i).click();
				Thread.sleep(2000);
				sub=true;
				break;
			}
		}
		return sub;
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