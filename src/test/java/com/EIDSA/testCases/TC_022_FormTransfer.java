package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FormTransfer;

import Base.BaseClassTest;

public class TC_022_FormTransfer extends BaseClassTest {
	

	@Test(priority=1)
	public void formTransfer() throws IOException, InterruptedException
	{
		FormTransfer ft = new FormTransfer(driver);
		ft.selectStudy("IDS04");
		ft.formTransfer();
		ft.transferALert();
	}

}
