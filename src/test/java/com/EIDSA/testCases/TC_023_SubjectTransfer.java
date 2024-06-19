package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubjectTransfer;

import Base.BaseClassTest;

public class TC_023_SubjectTransfer extends BaseClassTest {
	

	@Test(priority=1)
	public void SubjectTransfer() throws IOException, InterruptedException
	{
		SubjectTransfer st = new SubjectTransfer(driver);
		st.selectStudy("IDS04");
		st.subjectTransfer();
		st.transferALert();
	}

}
