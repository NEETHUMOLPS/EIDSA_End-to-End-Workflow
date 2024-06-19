package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.NoAlertPresentException;

public class EConsent extends AbstractComponent{
	
	static WebDriver driver;
	public EConsent(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Subject menu
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='E-Consent']")
	WebElement EConsent;	
	
	//Search 
	@FindBy(xpath = "//select[@placeholder='Site code']")
	WebElement siteCode;
	@FindBy(xpath = "//input[@type='text']")
	WebElement subjectId;	
	@FindBy(xpath = "//span[@class='col-sm-12 col-lg-2 save_btn my-1 my-lg-0 mx-lg-1 align-self-end']")
	WebElement search;	
	
	//Invite status
	@FindBy(xpath = "(//button[contains(text(),'Pending')])[1]")
	WebElement pending;
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Invite']")
	WebElement invite; 
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> tableSiteCode;
	@FindBy(xpath = "//td[2]")
	List<WebElement> tableSubjectId;
	@FindBy(xpath = "//td[5]")
	List<WebElement> tableInviteStatus;
	
	
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickOnEConsent() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();;
		Thread.sleep(2000);
		EConsent.click();
		Thread.sleep(2000);
		
	}
	
	public void SearchSiteCode(String site) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(siteCode);
		sel.selectByVisibleText(site);		
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public void SearchSubId(String sub) throws InterruptedException
	{
		Thread.sleep(2000);
		subjectId.sendKeys(sub);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public Boolean siteCodeSearchValidation(String site) throws InterruptedException
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
				if (!(scode.contains(site))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean SubjectIdSearchValidation(String sub) throws InterruptedException
	{
		boolean st = true;
		int count =tableSubjectId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSubjectId.size();i++)
			{
				String scode=tableSubjectId.get(i).getText();
				if (!(scode.contains(sub))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void invite(String em) throws InterruptedException
	{
		Thread.sleep(2000);
		pending.click();
		Thread.sleep(2000);
		email.sendKeys(em);
		Thread.sleep(2000);
		invite.click();
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
