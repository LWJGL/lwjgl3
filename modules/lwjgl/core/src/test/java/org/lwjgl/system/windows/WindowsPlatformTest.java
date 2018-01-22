/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows;

import org.testng.annotations.*;

import static org.testng.Assert.*;

@Test
public class WindowsPlatformTest {

    public void testHINSTANCE() {
        assertTrue(WindowsLibrary.HINSTANCE != 0);
    }

}