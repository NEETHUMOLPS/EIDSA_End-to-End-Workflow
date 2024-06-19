package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AbstractComponents.AbstractComponent;

public class ChangeUnscheduledTemplate extends AbstractComponent{
	static WebDriver driver;
	public ChangeUnscheduledTemplate(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Select ChangeUnscheduledTemplate
	@FindBy(xpath = "//span[normalize-space()='Study Administration']")
	WebElement studyAdministration;
	@FindBy(xpath = "//span[normalize-space()='Change Schedule Template']")
	WebElement changeUnscheduledTemplate;
	
	//Change Schedule Template
	@FindBy(xpath = "(//select[@class='form-select'])[1]")
	WebElement siteCode;
	@FindBy(xpath = "(//select[@class='form-select'])[2]")
	WebElement subjectId;
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement visitName;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement visitNo;
	@FindBy(xpath = "//span[@type='button']")
	WebElement search;
	
	//Web table
	@FindBy(xpath = "(//i[@class='fa fa-edit editicon'])[2]")
	WebElement tableEdit;;
	
	//Assign template
	@FindBy(xpath = "//select[@placeholder='Search by Status']")
	WebElement template;
	@FindBy(xpath = "//button[normalize-space()='Assign']")
	WebElement assign;
	
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	public void clickChangeUnscheduledTemplate() throws InterruptedException
	{
		Thread.sleep(2000);
		studyAdministration.click();
		Thread.sleep(2000);
		changeUnscheduledTemplate.click();
		Thread.sleep(2000);
	}
	
	

	
	public void SearchSitecode(String code) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(siteCode);
		sel.selectByVisibleText(code);
		Thread.sleep(2000);
	}
	
	public void SearchSubjectId(String id) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(subjectId);
		sel.selectByVisibleText(id);
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
	
	public void editTemplate(String temp) throws InterruptedException
	{
		Thread.sleep(2000);
		tableEdit.click();
		Thread.sleep(2000);
		Select sel=new Select(template);
		sel.selectByVisibleText(temp);
		Thread.sleep(2000);
		assign.click();
		Thread.sleep(2000);
	}

	

}
