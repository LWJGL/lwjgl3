/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.testng.Assert.*;

@Test
public class LibraryTest {

    public void testLifecycle() {
        SharedLibrary lib = new WindowsLibrary("opengl32.dll");
        assertEquals(lib.getName(), "opengl32.dll");
        lib.free();
    }

    public void testGetProcAddress() {
        SharedLibrary lib = new WindowsLibrary("opengl32.dll");
        assertTrue(lib.getFunctionAddress("wglGetProcAddress") != NULL);
        lib.free();
    }

}