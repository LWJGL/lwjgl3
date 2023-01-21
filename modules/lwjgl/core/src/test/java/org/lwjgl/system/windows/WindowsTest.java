/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.windows;

import org.lwjgl.system.*;
import org.testng.annotations.*;

import java.nio.*;

import static org.lwjgl.system.windows.Crypt32.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WindowsLibrary.*;
import static org.testng.Assert.*;

@Test
public class WindowsTest {

    public void testLWJGLInstance() {
        assertEquals(
            GetModuleHandle(Library.JNI_LIBRARY_NAME),
            HINSTANCE
        );
    }

    public void testCryptProtectBindings() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            ByteBuffer buffer = stack.calloc(4 * CRYPTPROTECTMEMORY_BLOCK_SIZE);

            assertTrue(CryptProtectMemory(buffer, CRYPTPROTECTMEMORY_SAME_PROCESS));
            assertTrue(CryptUnprotectMemory(buffer, CRYPTPROTECTMEMORY_SAME_PROCESS));
        }
    }

    public void testDefWindowProc() {
        long user32 = GetModuleHandle("User32.dll");
        assertTrue(user32 != 0);

        long dwp = GetProcAddress(user32, "DefWindowProcW");
        assertTrue(dwp != 0);
    }

}