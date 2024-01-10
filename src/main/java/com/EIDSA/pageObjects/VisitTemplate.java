package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
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

public class VisitTemplate extends AbstractComponent{
	static WebDriver driver;
	public VisitTemplate(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Menu
	@FindBy(xpath = "//span[normalize-space()='Visit Template']")
	WebElement visitTemplate;
	
	//Search
	@FindBy(xpath = "(//select[@class='form-select'])[1]")
	WebElement SiteCode;
	@FindBy(xpath = "(//select[@class='form-select'])[2]")
	WebElement SubjectId;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement VisitName;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement VisitNo;
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	WebElement Search;
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> tableSiteCode;
	@FindBy(xpath = "//td[2]")
	List<WebElement> tableSub;
	@FindBy(xpath = "//td[3]")
	List<WebElement> tableVisitNo;
	@FindBy(xpath = "//td[4]")
	List<WebElement> tableVisitName;
	@FindBy(xpath = "//td[11]//i")
	List<WebElement> tableEdit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[4]/div/div[2]/div[1]/select")
	WebElement template;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[4]/div/div[1]/div/i")
	WebElement close;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[4]/div/div[2]/div[2]/button")
	WebElement assign;
	
	public void clickVisitTemplate() throws InterruptedException
	{
		Thread.sleep(2000);
		visitTemplate.click();
		Thread.sleep(2000);
	}
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickAssign() throws InterruptedException
	{
		Thread.sleep(2000);
		assign.click();
		Thread.sleep(2000);
	}
	
	public void SearchVisitName(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		VisitName.sendKeys(name);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void SearchVisitNo(String no) throws InterruptedException
	{
		Thread.sleep(2000);
		VisitNo.sendKeys(no);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void SiteCode(String code) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(SiteCode);
		sel.selectByVisibleText(code);
		Thread.sleep(2000);
	}
	
	public void SubId(String id) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(SubjectId);
		sel.selectByVisibleText(id);
		Thread.sleep(2000);
	}
	
	public void Template(String temp) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(template);
		sel.selectByVisibleText(temp);	
		Thread.sleep(2000);
		assign.click();
		Thread.sleep(2000);
	}
	
	public Boolean siteCodeSearchValidation(String name) throws InterruptedException
	{
		boolean st = true;
		int count =tableSiteCode.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSiteCode.size();i++)
			{
				String scode=tableSiteCode.get(i).getText();
				if (!(scode.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean subjectIdSearchValidation(String name) throws InterruptedException
	{
		boolean st = true;
		int count =tableSub.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSub.size();i++)
			{
				String scode=tableSub.get(i).getText();
				if (!(scode.contains(name))) 
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
	
	public Boolean visitNumSearchValidation(String num) throws InterruptedException
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
	
	
	public static boolean AssignAlert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Template assigned successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean AssignAlert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a template"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public boolean edit(String editname) throws InterruptedException
	{
		boolean sub=false;
		int count = tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitName.get(i).getText();
			if(text.contains(editname))
			{
				tableEdit.get(i).click();
				Thread.sleep(2000);
				sub=true;
				break;
			}
		}
		return sub;
	}
	


}
