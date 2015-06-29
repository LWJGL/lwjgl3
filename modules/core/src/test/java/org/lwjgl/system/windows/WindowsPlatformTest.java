/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class WindowsPlatformTest {

	public void testHINSTANCE() {
		assertTrue(WindowsLibrary.HINSTANCE != 0);
	}

}