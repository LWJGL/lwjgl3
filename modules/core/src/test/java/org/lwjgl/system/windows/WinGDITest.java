/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.testng.annotations.Test;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.testng.Assert.*;

@Test
public class WinGDITest {

	public void testEnumObjects() {
		long dc = GetDC(0);
		EnumObjects(dc, OBJ_BRUSH, new EnumObjectsCallback() {
			@Override
			public int invoke(long logObject, long data) {
				assertTrue(logObject != 0L);
				return 1;
			}
		}, NULL);
	}

}