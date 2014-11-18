/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

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
		new WindowsTest().testCreateWindow();
		//new WindowsTest().testOSVERSIONINFOEX();
	}

	public void testLWJGLInstance() {
		assertEquals(
			GetModuleHandle("lwjgl"),
			HINSTANCE
		);
	}

	public void testDefWindowProc() {
		long user32 = GetModuleHandle(memEncodeUTF16("User32.dll"));
		assertTrue(user32 != 0);

		long dwp = GetProcAddress(user32, memEncodeASCII("DefWindowProcW"));
		assertTrue(dwp != 0);

		assertEquals(dwp, DEF_WINDOW_PROC);
	}

	public void testOSVERSIONINFOEX() {
		ByteBuffer versionInfo = OSVERSIONINFOEX.malloc();

		OSVERSIONINFOEX.osVersionInfoSize(versionInfo, OSVERSIONINFOEX.SIZEOF);

		int success = GetVersionEx(versionInfo);
		assertTrue(success != 0);

		// We support Windows 2000 or higher
		assertTrue(OSVERSIONINFOEX.majorVersion(versionInfo) >= 5);

		// Tests char array struct members
		OSVERSIONINFOEX.csdVersionSet(versionInfo, "Service Pack X");
		assertEquals(OSVERSIONINFOEX.csdVersionGets(versionInfo), "Service Pack X");
	}

	public void testWNDCLASSEX() {
		String menuName = null;
		String className = "LWJGL";

		ByteBuffer in = WNDCLASSEX.malloc();

		WNDCLASSEX.size(in, WNDCLASSEX.SIZEOF);
		WNDCLASSEX.style(in, CS_OWNDC);
		WNDCLASSEX.wndProc(in, DEF_WINDOW_PROC);
		WNDCLASSEX.clsExtra(in, 0);
		WNDCLASSEX.wndExtra(in, 0);
		WNDCLASSEX.instance(in, HINSTANCE);
		WNDCLASSEX.icon(in, nLoadIcon(0, IDI_APPLICATION));
		WNDCLASSEX.cursor(in, nLoadCursor(0, IDC_ARROW));
		WNDCLASSEX.background(in, 0);
		WNDCLASSEX.menuNameSet(in, menuName);
		WNDCLASSEX.classNameSet(in, className);
		WNDCLASSEX.iconSm(in, 0);

		short classAtom = RegisterClassEx(in);
		assertTrue(classAtom != 0);

		ByteBuffer out = WNDCLASSEX.malloc();
		WNDCLASSEX.size(out, WNDCLASSEX.SIZEOF);

		int success = GetClassInfoEx(HINSTANCE, className, out);
		assertTrue(success != 0);

		assertEquals(WNDCLASSEX.style(out), WNDCLASSEX.style(in));
		assertEquals(WNDCLASSEX.wndProc(out), WNDCLASSEX.wndProc(in));
		assertEquals(WNDCLASSEX.clsExtra(out), WNDCLASSEX.clsExtra(in));
		assertEquals(WNDCLASSEX.wndExtra(out), WNDCLASSEX.wndExtra(in));
		assertEquals(WNDCLASSEX.instance(out), WNDCLASSEX.instance(in));
		assertEquals(WNDCLASSEX.icon(out), WNDCLASSEX.icon(in));
		assertEquals(WNDCLASSEX.cursor(out), WNDCLASSEX.cursor(in));
		assertEquals(WNDCLASSEX.background(out), WNDCLASSEX.background(in));
		assertEquals(WNDCLASSEX.menuNameGets(out), menuName);
		assertEquals(WNDCLASSEX.classNameGets(out), className);
		assertEquals(WNDCLASSEX.iconSm(out), WNDCLASSEX.iconSm(in));
	}

	@Test(
		dependsOnMethods = "testWNDCLASSEX" // Make sure the class is registered
	)
	public void testCreateWindow() {
		long hwnd = CreateWindowEx(
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