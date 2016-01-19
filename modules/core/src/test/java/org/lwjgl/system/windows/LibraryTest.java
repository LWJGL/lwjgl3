/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.SharedLibrary;
import org.testng.annotations.Test;

import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test
public class LibraryTest {

	public void testLifecycle() {
		SharedLibrary lib = new WindowsLibrary("opengl32.dll");
		assertEquals(lib.getName(), "opengl32.dll");
		lib.release();
	}

	public void testGetProcAddress() {
		SharedLibrary lib = new WindowsLibrary("opengl32.dll");
		assertTrue(lib.getFunctionAddress("wglGetProcAddress") != NULL);
		lib.release();
	}

}