package com.EIDSA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class StudyProfile extends AbstractComponent{
	
	static WebDriver driver;
	public StudyProfile(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Menu
	@FindBy(xpath="//ul[@id='administrationmenu']/li/a/span")
	WebElement Study;
	
	//Study Profile
	@FindBy(xpath="//span[normalize-space()='Study Profile']")
	WebElement studyProfile;
	
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
	
	//Create Visit
	@FindBy(xpath="//span[normalize-space()='Create Visit']")
	WebElement createVisit;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement visitNo;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement visitName;
	@FindBy(xpath="//select[@class='form-select']")
	WebElement visitType;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement preVisit1;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement postVisit1;
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement days1;
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement weeks1;
	@FindBy(xpath="(//input[@type='number'])[3]")
	WebElement months1;
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement years1;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement visitNotes;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement active1;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement patientVisit;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear1;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save1;
	
	//Create site
	@FindBy(xpath="//span[normalize-space()='Create Visit']")
	WebElement createSite;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement siteCode;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement siteName;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement siteContactName;
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement siteContactEmail;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement noOfSubjects2;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement siteNotes;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement active2;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear2;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save2;
	
	//Create Subject
	@FindBy(xpath="//span[normalize-space()='Create Subject']")
	WebElement createSubject;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement siteCode3;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement subjectId;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement enrolmentDate;
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement investigator;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement preVisit3;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement postVisit3;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement country;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement city;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement postCode;
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement language;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement subjectNotes;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement active3;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement createSchedule;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear3;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save3;
	
	//
	

}
