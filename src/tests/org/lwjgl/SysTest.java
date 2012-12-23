package org.lwjgl;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class SysTest {

	@BeforeSuite
	private void sysInit() {
		Sys.touch();
	}

}