/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val User32 = "User32".nativeClass(WINDOWS_PACKAGE, binding = simpleBinding("user32", callingConvention = CallingConvention.STDCALL)) {
	documentation = "Native bindings to user32.dll"

	HDC(
		"GetDC",
		"""
		Retrieves a handle to a device context (DC) for the client area of a specified window or for the entire screen. You can use the returned handle in
		subsequent GDI functions to draw in the DC. The device context is an opaque data structure, whose values are used internally by GDI.
		""",

		nullable..HWND.IN("hWnd", "a handle to the window whose DC is to be retrieved. If this value is $NULL, GetDC retrieves the DC for the entire screen.")
	)

	int(
		"ReleaseDC",
		"""
		Releases a device context (DC), freeing it for use by other applications. The effect of the ReleaseDC function depends on the type of DC. It frees only
		common and window DCs. It has no effect on class or private DCs.
		""",

		HWND.IN("hWnd", "a handle to the window whose DC is to be released"),
		HDC.IN("hDC", "a handle to the DC to be released")
	)
}