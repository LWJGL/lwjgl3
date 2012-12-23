package org.lwjgl.system.windows;

import org.lwjgl.Sys;
import org.testng.annotations.Test;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.testng.Assert.*;

@Test
public class WinGDITest {

	public void testEnumObjects() {
		final long dc = GetDC(0);
		EnumObjects(dc, OBJ_BRUSH, new EnumObjectsProc() {
			public int invoke(final long logObject) {
				assertTrue(logObject != 0L);
				return 1;
			}
		});
	}

	public void testUseFontBitmaps() {
		/*long hwnd = CreateWindowEx(
			0,
			memEncodeUTF16(""),
			memEncodeUTF16("LWJGL Test"),
			0,
			0, 0, 640, 480,
			0, 0, 0, 0
		);
		assertTrue(hwnd != 0);

		long hdc = 0;

		long hglrc = wglCreateContext(hdc);
		assertTrue(hglrc != 0);

		wglMakeCurrent(hdc, hglrc);

		SelectObject(hdc, GetStockObject(SYSTEM_FONT));

		wglUseFontBitmaps(hdc, 0, 255, 1000);*/
	}

}