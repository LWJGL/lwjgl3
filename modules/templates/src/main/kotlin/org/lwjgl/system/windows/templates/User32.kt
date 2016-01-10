/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows.templates

import org.lwjgl.generator.*
import org.lwjgl.system.windows.*

val User32 = "User32".nativeClass(WINDOWS_PACKAGE, binding = simpleBinding("user32", callingConvention = CallingConvention.STDCALL)) {
	nativeImport (
		"WindowsLWJGL.h"
	)

	documentation = "Native bindings to user32.dll"

	IntConstant(
		"Window Styles",
		"WS_OVERLAPPED"..0x00000000,
		"WS_POPUP"..0x80000000.i,
		"WS_CHILD"..0x40000000,
		"WS_MINIMIZE"..0x20000000,
		"WS_VISIBLE"..0x10000000,
		"WS_DISABLED"..0x08000000,
		"WS_CLIPSIBLINGS"..0x04000000,
		"WS_CLIPCHILDREN"..0x02000000,
		"WS_MAXIMIZE"..0x01000000,
		"WS_CAPTION"..0x00C00000, /* WS_BORDER | WS_DLGFRAME  */
		"WS_BORDER"..0x00800000,
		"WS_DLGFRAME"..0x00400000,
		"WS_VSCROLL"..0x00200000,
		"WS_HSCROLL"..0x00100000,
		"WS_SYSMENU"..0x00080000,
		"WS_THICKFRAME"..0x00040000,
		"WS_GROUP"..0x00020000,
		"WS_TABSTOP"..0x00010000,

		"WS_MINIMIZEBOX"..0x00020000,
		"WS_MAXIMIZEBOX"..0x00010000,

		// Common Window Styles
		"WS_OVERLAPPEDWINDOW" expr "WS_OVERLAPPED | WS_CAPTION | WS_SYSMENU | WS_THICKFRAME | WS_MINIMIZEBOX | WS_MAXIMIZEBOX",
		"WS_POPUPWINDOW" expr "WS_POPUP | WS_BORDER | WS_SYSMENU",
		"WS_CHILDWINDOW" expr "WS_CHILD",

		"WS_TILED" expr "WS_OVERLAPPED",
		"WS_ICONIC" expr "WS_MINIMIZE",
		"WS_SIZEBOX" expr "WS_THICKFRAME",
		"WS_TILEDWINDOW" expr "WS_OVERLAPPEDWINDOW"
	)

	IntConstant(
		"Extended Window Styles",
		"WS_EX_DLGMODALFRAME"..0x00000001,
		"WS_EX_NOPARENTNOTIFY"..0x00000004,
		"WS_EX_TOPMOST"..0x00000008,
		"WS_EX_ACCEPTFILES"..0x00000010,
		"WS_EX_TRANSPARENT"..0x00000020,
		"WS_EX_MDICHILD"..0x00000040,
		"WS_EX_TOOLWINDOW"..0x00000080,
		"WS_EX_WINDOWEDGE"..0x00000100,
		"WS_EX_CLIENTEDGE"..0x00000200,
		"WS_EX_CONTEXTHELP"..0x00000400,

		"WS_EX_RIGHT"..0x00001000,
		"WS_EX_LEFT"..0x00000000,
		"WS_EX_RTLREADING"..0x00002000,
		"WS_EX_LTRREADING"..0x00000000,
		"WS_EX_LEFTSCROLLBAR"..0x00004000,
		"WS_EX_RIGHTSCROLLBAR"..0x00000000,

		"WS_EX_CONTROLPARENT"..0x00010000,
		"WS_EX_STATICEDGE"..0x00020000,
		"WS_EX_APPWINDOW"..0x00040000,

		"WS_EX_OVERLAPPEDWINDOW" expr "WS_EX_WINDOWEDGE | WS_EX_CLIENTEDGE",
		"WS_EX_PALETTEWINDOW" expr "WS_EX_WINDOWEDGE | WS_EX_TOOLWINDOW | WS_EX_TOPMOST",

		"WS_EX_LAYERED"..0x00080000,

		"WS_EX_NOINHERITLAYOUT"..0x00100000, // Disable inheritence of mirroring by children
		"WS_EX_LAYOUTRTL"..0x00400000, // Right to left mirroring

		"WS_EX_COMPOSITED"..0x02000000, // WIN32_WINNT >= 0x0501

		"WS_EX_NOACTIVATE"..0x08000000
	)

	IntConstant(
		"May be used in #CreateWindowEx() for the x, y, width, height parameters.",
		"CW_USEDEFAULT"..0x80000000.i
	)

	IntConstant(
		"Class styles",
		"CS_VREDRAW"..0x0001,
		"CS_HREDRAW"..0x0002,
		"CS_DBLCLKS"..0x0008,
		"CS_OWNDC"..0x0020,
		"CS_CLASSDC"..0x0040,
		"CS_PARENTDC"..0x0080,
		"CS_NOCLOSE"..0x0200,
		"CS_SAVEBITS"..0x0800,
		"CS_BYTEALIGNCLIENT"..0x1000,
		"CS_BYTEALIGNWINDOW"..0x2000,
		"CS_GLOBALCLASS"..0x4000,

		"CS_IME"..0x00010000,
		"CS_DROPSHADOW"..0x00020000 // _WIN32_WINNT >="..0x0501,
	)

	NativeName("RegisterClassExW")..SaveLastError..ATOM(
		"RegisterClassEx",
		"Registers a window class for subsequent use in calls to the #CreateWindowEx() function.",

		const..WNDCLASSEX_p.IN(
			"wndClassEx",
			"a ##WNDCLASSEX structure. You must fill the structure with the appropriate class attributes before passing it to the function."
		)
	)

	NativeName("UnregisterClassW")..SaveLastError..BOOL(
		"UnregisterClass",
		"Unregisters a window class, freeing the memory required for the class.",

		LPCTSTR.IN(
			"className",
			"""
			a null-terminated string or a class atom. If {@code className} is a string, it specifies the window class name. This class name must have been
			registered by a previous call to the #RegisterClassEx() function. System classes, such as dialog box controls, cannot be unregistered. If this
			parameter is an atom, it must be a class atom created by a previous call to the #RegisterClassEx() function. The atom must be in the low-order
			word of {@code className}; the high-order word must be zero.
			"""
		),
		nullable..HINSTANCE.IN("instance", "a handle to the instance of the module that created the class")
	)

	NativeName("CreateWindowExW")..SaveLastError..HWND(
		"CreateWindowEx",
		"Creates an overlapped, pop-up, or child window with an extended window style; otherwise, this function is identical to the CreateWindow function.",

		DWORD.IN("exStyle", "the extended window style of the window being created"),
		LPCTSTR.IN("className", "a null-terminated string or a class atom created by a previous call to the #RegisterClassEx() function."),
		LPCTSTR.IN("windowName", "the window name. If the window style specifies a title bar, the window title pointed to by {@code windowName} is displayed in the title bar."),
		DWORD.IN("style", "the style of the window being created"),
		int.IN("x", "the initial horizontal position of the window"),
		int.IN("y", "the initial vertical position of the window"),
		int.IN("width", "the width, in device units, of the window"),
		int.IN("height", "the height, in device units, of the window"),
		nullable..HWND.IN("parent", "a handle to the parent or owner window of the window being created. To create a child window or an owned window, supply a valid window handle."),
		nullable..HMENU.IN("menu", "a handle to a menu, or specifies a child-window identifier, depending on the window style"),
		nullable..HINSTANCE.IN("instance", "a handle to the instance of the module to be associated with the window"),
		nullable..LPVOID.IN("param", "a value to be passed to the window through the ##CREATESTRUCT structure ({@code createParams} member) pointed to by the {@code lParam} param of the WM_CREATE message.")
	)

	SaveLastError..BOOL(
		"DestroyWindow",
		"""
		Destroys the specified window. The function sends WM_DESTROY and WM_NCDESTROY messages to the window to deactivate it and remove the keyboard focus from
		it. The function also destroys the window's menu, flushes the thread message queue, destroys timers, removes clipboard ownership, and breaks the
		clipboard viewer chain (if the window is at the top of the viewer chain).

		If the specified window is a parent or owner window, DestroyWindow automatically destroys the associated child or owned windows when it destroys the
		parent or owner window. The function first destroys child or owned windows, and then it destroys the parent or owner window.
		""",

		HWND.IN("window", "a handle to the window to be destroyed")
	)

	NativeName("DefWindowProcW")..LRESULT(
		"DefWindowProc",
		"""
		Calls the default window procedure to provide default processing for any window messages that an application does not process. This function ensures
		that every message is processed. DefWindowProc is called with the same parameters received by the window procedure.
		""",

		HWND.IN("window", "a handle to the window that received the message"),
		UINT.IN("msg", "the message"),
		WPARAM.IN("wParam", "additional message information. The content of this parameter depends on the value of the {@code msg} parameter."),
		LPARAM.IN("lParam", "additional message information. The content of this parameter depends on the value of the {@code msg} parameter.")
	)

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