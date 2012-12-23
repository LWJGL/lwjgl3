package org.lwjgl.system.windows;

import org.lwjgl.system.Library;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class LibraryTest {

	public void testLifecycle() {
		Library lib = new WindowsLibrary("opengl32.dll");
		assertEquals(lib.getName(), "opengl32.dll");
		lib.destroy();
	}

	public void testGetProcAddress() {
		Library lib = new WindowsLibrary("opengl32.dll");
		assertTrue(lib.getProcAddress("wglGetProcAddress") != 0L);
		lib.destroy();
	}

}