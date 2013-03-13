/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.lwjgl.LWJGLUtil;
import org.lwjgl.Sys;
import org.testng.annotations.Test;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.windows.WinBase.*;
import static org.lwjgl.system.windows.WinGDI.*;
import static org.lwjgl.system.windows.WinUser.*;
import static org.lwjgl.system.windows.WindowsDisplay.*;
import static org.lwjgl.system.windows.WindowsLibrary.*;
import static org.testng.Assert.*;

@Test
public class WindowsTest {

	public void testGetStockObject() {
		long systemFont = GetStockObject(SYSTEM_FONT);
		assertTrue(systemFont != 0);
	}

	public void testLoadIcon() {
		assertTrue(nLoadIcon(0, IDI_APPLICATION) != 0);
	}

	public void testLoadCursor() {
		assertTrue(nLoadCursor(0, IDC_ARROW) != 0);
	}

	@Test(enabled = false)
	public static void main(String[] args) {
		Sys.touch();
		new WindowsTest().testCreateWindow();
		//new WindowsTest().testOSVERSIONINFOEX();
	}

	public void testLWJGLInstance() {
		assertEquals(
			GetModuleHandle(memEncodeUTF16(Sys.getNativeLibrary())),
			HINSTANCE
		);
	}

	public void testDefWindowProc() {
		final long user32 = GetModuleHandle(memEncodeUTF16("User32.dll"));
		assertTrue(user32 != 0);

		final long dwp = GetProcAddress(user32, memEncodeASCII("DefWindowProcW"));
		assertTrue(dwp != 0);

		assertEquals(dwp, DEF_WINDOW_PROC);
	}

	public void testOSVERSIONINFOEX() {
		final ByteBuffer versionInfo = OSVERSIONINFOEX.malloc();

		OSVERSIONINFOEX.osVersionInfoSizeSet(versionInfo, OSVERSIONINFOEX.SIZEOF);

		final int success = GetVersionEx(versionInfo);
		assertTrue(success != 0);

		// We support Windows 2000 or higher
		assertTrue(OSVERSIONINFOEX.majorVersionGet(versionInfo) >= 5);

		// Tests char array struct members
		OSVERSIONINFOEX.csdVersionSet(versionInfo, "Service Pack X");
		assertEquals(OSVERSIONINFOEX.csdVersionGets(versionInfo), "Service Pack X");
	}

	public void testWNDCLASSEX() {
		final String menuName = null;
		final String className = "LWJGL";

		final ByteBuffer in = WNDCLASSEX.malloc();

		WNDCLASSEX.sizeSet(in, WNDCLASSEX.SIZEOF);
		WNDCLASSEX.styleSet(in, CS_OWNDC);
		WNDCLASSEX.wndProcSet(in, DEF_WINDOW_PROC);
		WNDCLASSEX.clsExtraSet(in, 0);
		WNDCLASSEX.wndExtraSet(in, 0);
		WNDCLASSEX.instanceSet(in, HINSTANCE);
		WNDCLASSEX.iconSet(in, nLoadIcon(0, IDI_APPLICATION));
		WNDCLASSEX.cursorSet(in, nLoadCursor(0, IDC_ARROW));
		WNDCLASSEX.backgroundSet(in, 0);
		WNDCLASSEX.menuNameSet(in, menuName);
		WNDCLASSEX.classNameSet(in, className);
		WNDCLASSEX.iconSmSet(in, 0);

		final short classAtom = RegisterClassEx(in);
		assertTrue(classAtom != 0);

		final ByteBuffer out = WNDCLASSEX.malloc();
		WNDCLASSEX.sizeSet(out, WNDCLASSEX.SIZEOF);

		final int success = GetClassInfoEx(HINSTANCE, className, out);
		assertTrue(success != 0);

		assertEquals(WNDCLASSEX.styleGet(out), WNDCLASSEX.styleGet(in));
		assertEquals(WNDCLASSEX.wndProcGet(out), WNDCLASSEX.wndProcGet(in));
		assertEquals(WNDCLASSEX.clsExtraGet(out), WNDCLASSEX.clsExtraGet(in));
		assertEquals(WNDCLASSEX.wndExtraGet(out), WNDCLASSEX.wndExtraGet(in));
		assertEquals(WNDCLASSEX.instanceGet(out), WNDCLASSEX.instanceGet(in));
		assertEquals(WNDCLASSEX.iconGet(out), WNDCLASSEX.iconGet(in));
		assertEquals(WNDCLASSEX.cursorGet(out), WNDCLASSEX.cursorGet(in));
		assertEquals(WNDCLASSEX.backgroundGet(out), WNDCLASSEX.backgroundGet(in));
		assertEquals(WNDCLASSEX.menuNameGets(out), menuName);
		assertEquals(WNDCLASSEX.classNameGets(out), className);
		assertEquals(WNDCLASSEX.iconSmGet(out), WNDCLASSEX.iconSmGet(in));
	}

	@Test(
		dependsOnMethods = "testWNDCLASSEX" // Make sure the class is registered
	)
	public void testCreateWindow() {
		final long hwnd = CreateWindowEx(
			WS_EX_APPWINDOW,
			"LWJGL",
			"LWJGL Test",
			//WS_OVERLAPPED | WS_BORDER | WS_CAPTION | WS_MINIMIZEBOX | WS_SYSMENU | WS_CLIPCHILDREN | WS_CLIPSIBLINGS,
			WS_OVERLAPPEDWINDOW,
			0, 0, 640, 480,
			0, 0, HINSTANCE, 0
		);
		assertTrue(hwnd != 0);

		ShowWindow(hwnd, SW_SHOWDEFAULT);

		DestroyWindow(hwnd);
	}

}