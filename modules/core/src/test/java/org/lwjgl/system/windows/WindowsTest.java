/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.Sys;
import org.testng.annotations.Test;

import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsLibrary.*;
import static org.testng.Assert.*;

@Test
public class WindowsTest {

	public void testLWJGLInstance() {
		assertEquals(
			GetModuleHandle(Sys.JNI_LIBRARY_NAME),
			HINSTANCE
		);
	}

	public void testDefWindowProc() {
		long user32 = GetModuleHandle("User32.dll");
		assertTrue(user32 != 0);

		long dwp = GetProcAddress(user32, "DefWindowProcW");
		assertTrue(dwp != 0);
	}

}