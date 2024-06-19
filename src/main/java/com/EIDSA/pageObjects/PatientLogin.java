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

public class PatientLogin extends AbstractComponent{
	static WebDriver driver;
	public PatientLogin(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	
	//Menu
	@FindBy(xpath = "//span[normalize-space()='Study Administration']")
	WebElement studyAdministration;
	@FindBy(xpath = "//span[normalize-space()='Patient Login']")
	WebElement patientLogin;
	
	//Search
	@FindBy(xpath = "//select[@placeholder='Site code']")
	WebElement searchSiteCode;
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchSubjectId;
	@FindBy(xpath = "//select[@placeholder='Search']")
	WebElement searchStatus;
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	WebElement search;
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> tableSiteCode;
	@FindBy(xpath = "//td[2]")
	List<WebElement> tableSubjectId;
	@FindBy(xpath = "//td[6]")
	List<WebElement> tableStatus;
	@FindBy(xpath = "//td[7]//i")
	List<WebElement> tableAddLogin;
	
	//Set login
	@FindBy(xpath = "//div[@class='col-lg-12 text-center mt-2']//input[@type='text']")
	WebElement email;
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	WebElement submit;
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickPatientLogin() throws InterruptedException
	{
		Thread.sleep(2000);
		studyAdministration.click();
		Thread.sleep(2000);
		patientLogin.click();
		Thread.sleep(2000);
	}
	
	public void Submit() throws InterruptedException
	{
		Thread.sleep(2000);
		submit.click();
		Thread.sleep(2000);
	}
	
	public void SearchSiteCode(String site) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(searchSiteCode);
		sel.selectByVisibleText(site);		
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	

	
	public void SearchSubId(String sub) throws InterruptedException
	{
		Thread.sleep(2000);
		searchSubjectId.sendKeys(sub);
		Thread.sleep(2000);
		search.click();
		Thread.sleep(5000);
	}
	
	public void exsEmail(String sub) throws InterruptedException
	{
		Thread.sleep(2000);
		email.sendKeys(sub);
		Thread.sleep(2000);
	}
	
	public void SearchStatus(String stat) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(searchStatus);
		sel.selectByVisibleText(stat);
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
	
	public Boolean StatusSearchValidation(String stat) throws InterruptedException
	{
		boolean st = true;
		int count =tableStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableStatus.size();i++)
			{
				String scode=tableStatus.get(i).getText();
				if (!(scode.contains(stat))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public boolean findSubId(String subject) throws InterruptedException
	{
		boolean sub=false;
		int count = tableSubjectId.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableSubjectId.get(i).getText();
			if(text.contains(subject))
			{
				tableAddLogin.get(i).click();
				Thread.sleep(2000);
				sub=true;
				break;
			}
		}
		return sub;
	}
		
		public void AddLogin(String emailid) throws InterruptedException
		{
			Thread.sleep(2000);
			email.clear();
			Thread.sleep(2000);
			email.sendKeys(emailid);
			Thread.sleep(2000);
			submit.click();
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
