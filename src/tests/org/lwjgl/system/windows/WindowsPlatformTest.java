package org.lwjgl.system.windows;

import org.lwjgl.Sys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class WindowsPlatformTest {

	public void test64Bit() {
		final WindowsPlatform platform = (WindowsPlatform)Sys.getPlatform();

		assertTrue(platform.has64Bit());
	}

	public void testHINSTANCE() {
		assertTrue(WindowsLibrary.HINSTANCE != 0);
	}

}