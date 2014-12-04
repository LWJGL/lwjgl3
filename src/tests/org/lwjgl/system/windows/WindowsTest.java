/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows;

import org.testng.annotations.Test;

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
		OSVERSIONINFOEX versionInfo = new OSVERSIONINFOEX();

		versionInfo.setOsVersionInfoSize(OSVERSIONINFOEX.SIZEOF);

		int success = GetVersionEx(versionInfo.buffer());
		assertTrue(success != 0);

		// We support Windows 2000 or higher
		assertTrue(versionInfo.getMajorVersion() >= 5);

		// Tests char array struct members
		versionInfo.setCsdVersion("Service Pack X");
		assertEquals(versionInfo.getCsdVersionStr(), "Service Pack X");
	}

	public void testWNDCLASSEX() {
		String menuName = null;
		String className = "LWJGL";

		WNDCLASSEX in = new WNDCLASSEX();

		in.setSize(WNDCLASSEX.SIZEOF);
		in.setStyle(CS_OWNDC);
		in.setWndProc(DEF_WINDOW_PROC);
		in.setClsExtra(0);
		in.setWndExtra(0);
		in.setInstance(HINSTANCE);
		in.setIcon(nLoadIcon(0, IDI_APPLICATION));
		in.setCursor(nLoadCursor(0, IDC_ARROW));
		in.setBackground(0);
		in.setMenuName(menuName);
		in.setClassName(className);
		in.setIconSm(0);

		short classAtom = RegisterClassEx(in.buffer());
		assertTrue(classAtom != 0);

		WNDCLASSEX out = new WNDCLASSEX();
		out.setSize(WNDCLASSEX.SIZEOF);

		int success = GetClassInfoEx(HINSTANCE, className, out.buffer());
		assertTrue(success != 0);

		assertEquals(out.getStyle(), in.getStyle());
		assertEquals(out.getWndProc(), in.getWndProc());
		assertEquals(out.getClsExtra(), in.getClsExtra());
		assertEquals(out.getWndExtra(), in.getWndExtra());
		assertEquals(out.getInstance(), in.getInstance());
		assertEquals(out.getIcon(), in.getIcon());
		assertEquals(out.getCursor(), in.getCursor());
		assertEquals(out.getBackground(), in.getBackground());
		assertEquals(out.getMenuNameStr(), menuName);
		assertEquals(out.getClassNameStr(), className);
		assertEquals(out.getIconSm(), in.getIconSm());
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