package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.PartiallyFilledForms;

import Base.BaseClassTest;

public class TC_018_PartiallyFilledForms extends BaseClassTest {
	

	@Test(priority=1)
	public void signAndUnsign() throws IOException, InterruptedException
	{
		PartiallyFilledForms pf = new PartiallyFilledForms(driver);
		pf.selectStudy("IDS04");
		pf.clickOnPartiallyFilledForms();
		pf.selectForm1();
		pf.sign("neethumolp@datamatica.uk", "Neethu@11");
		pf.unSign("neethumolp@datamatica.uk", "Neethu@11");
	}
	
	@Test(priority=2)
	public void submitForm() throws IOException, InterruptedException
	{
		PartiallyFilledForms pf = new PartiallyFilledForms(driver);
		pf.fillFormReviewAndSubmit("Neethumol");
		Assert.assertEquals(pf.Alert(),"Form submitted successfully.");
		driver.navigate().back();
		pf.selectForm2();
		pf.fillFormReviewAndSubmit("Neethumol");
		Assert.assertEquals(pf.Alert(),"Form submitted successfully.");
	}

}
