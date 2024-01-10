package com.EIDSA.testCases.Positive;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyTemplate;

import Base.BaseClassTest;

public class TC_030_StudyTemplate_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void StudyTemplate() throws IOException, InterruptedException
	{
		StudyTemplate st = new StudyTemplate(driver);
		st.selectStudy1("Study - 001");
		st.clickStudyTemplate();
		st.selectStudy("Study - 001");
		st.clickSelect("Informed Consent");
		st.save();
		st.Alert1();
		logger.info("Study template updated successfully");
		
		
	}
}
