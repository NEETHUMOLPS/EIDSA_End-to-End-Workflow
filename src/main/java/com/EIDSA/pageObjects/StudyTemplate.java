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

public class StudyTemplate extends AbstractComponent{
	static WebDriver driver;
	public StudyTemplate(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Menu
	@FindBy(xpath = "//span[contains(text(),'Study Template')]")
	WebElement StudyTemplate;
	
	@FindBy(xpath = "//select[@placeholder='Search by Status']")
	WebElement Study;
	
	//Web table
	@FindBy(xpath = "//input[@type='checkbox']")
	List<WebElement> tableSelect;
	@FindBy(xpath = "//td[2]")
	List<WebElement> tableTemplateName;
	@FindBy(xpath = "//td[7]")
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement save;
	

	public void selectStudy1(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study template updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickStudyTemplate() throws InterruptedException
	{	
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(2000);
		elementWait(StudyTemplate);
		StudyTemplate.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(2000);		
	}
	
	public void selectStudy(String study) throws InterruptedException
	{	
		Thread.sleep(2000);
		Select sel=new Select(Study);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
		public boolean clickSelect(String subjectid) throws InterruptedException 
		{
			boolean sub=false;
			int count = tableTemplateName.size();
			for(int i=0;i<count;i++)
			{
				
				String text =  tableTemplateName.get(i).getText();
				if(text.contains(subjectid))
				{
					tableSelect.get(i).click();
					Thread.sleep(2000);
					break;	
				}
			}
			return sub;
		}
		
		public void save() throws InterruptedException
		{
			Thread.sleep(2000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");
			Thread.sleep(2000);
			elementWait(save);
			save.click();	
			Thread.sleep(2000);
		}


	
}
