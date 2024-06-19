package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.UnassignedForm;

import Base.BaseClassTest;

public class TC_019_UnassignedForm extends BaseClassTest {
	

	@Test(priority=1)
	public void mapping() throws IOException, InterruptedException
	{
		UnassignedForm uf = new UnassignedForm(driver);
		uf.selectStudy("IDS04");
		uf.clickOnUnassignedForms();
		uf.selectForm1();
		uf.mapping("S01", "P04");
		uf.Alert1();
	}

}
