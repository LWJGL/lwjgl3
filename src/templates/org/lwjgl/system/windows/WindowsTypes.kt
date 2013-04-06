/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows

import org.lwjgl.generator.*

val WINDOWS_PACKAGE = "org.lwjgl.system.windows"

// UNICODE is defined WindowsLWJGL.h, so all T* types below are UTF16.

val voidptr = PointerType("void") // Naked pointer, used for DLL function pointers.

val VOID = NativeType("VOID", TypeMapping.VOID)
val PVOID = PointerType("PVOID", includesPointer = true) // A pointer to any type

val HANDLE = PointerType("HANDLE", includesPointer = true)
val HANDLE_p = PointerType(HANDLE)

val BOOL = PrimitiveType("BOOL", PrimitiveMapping.INT) // Not boolean because of WinUser#GetMessage
val BOOL_p = PointerType(BOOL)

val BYTE = PrimitiveType("BYTE", PrimitiveMapping.BYTE)
val WORD = PrimitiveType("WORD", PrimitiveMapping.SHORT)
val DWORD = PrimitiveType("DWORD", PrimitiveMapping.INT)
val UINT = PrimitiveType("UINT", PrimitiveMapping.INT)
val FLOAT = PrimitiveType("FLOAT", PrimitiveMapping.FLOAT)

val short = PrimitiveType("short", PrimitiveMapping.SHORT)
val SHORT = PrimitiveType("SHORT", PrimitiveMapping.SHORT)
val int = PrimitiveType("int", PrimitiveMapping.INT)
val LONG = PrimitiveType("LONG", PrimitiveMapping.INT)
private val LONGLONG = PrimitiveType("LONGLONG", PrimitiveMapping.LONG) // Only LARGE_INTEGER uses this

val LONG_PTR = PrimitiveType("LONG_PTR", PrimitiveMapping.PTR)
val ULONG_PTR = PrimitiveType("ULONG_PTR", PrimitiveMapping.PTR)
val DWORD_PTR = PrimitiveType("DWORD_PTR", PrimitiveMapping.PTR)
val SIZE_T = PrimitiveType("SIZE_T", ULONG_PTR)

val int_p = PointerType("int", PointerMapping.DATA_INT)
val UINT_p = PointerType("UINT", PointerMapping.DATA_INT)
val FLOAT_p = PointerType("FLOAT", PointerMapping.DATA_FLOAT)

val LRESULT = PointerType("LRESULT", includesPointer = true)
val WPARAM = PrimitiveType("WPARAM", PrimitiveMapping.PTR)
val LPARAM = PrimitiveType("LPARAM", PrimitiveMapping.PTR)

val HRESULT = PrimitiveType("HRESULT", PrimitiveMapping.INT)

val TCHAR = CharType("TCHAR", CharMapping.UTF16)

val LPCTSTR = CharSequenceType(
	name = "LPCTSTR",
	includesPointer = true,
	charMapping = CharMapping.UTF16,
	nullTerminated = true
)

val LPCSTR = CharSequenceType("LPCSTR", includesPointer = true)
val HMODULE = PointerType("HMODULE", includesPointer = true)
val FARPROC = PointerType("FARPROC", includesPointer = true)
val HWND = PointerType("HWND", includesPointer = true)
val HMENU = PointerType("HMENU", includesPointer = true)
val HINSTANCE = PointerType("HINSTANCE", includesPointer = true)
val LPVOID = PointerType("LPVOID", includesPointer = true)
val HDC = PointerType("HDC", includesPointer = true)
val HGLRC = PointerType("HGLRC", includesPointer = true)
val HGDIOBJ = PointerType("HGDIOBJ", includesPointer = true)
val PROC = PointerType("PROC", includesPointer = true)
val HGLOBAL = PointerType("HGLOBAL", includesPointer = true)

val POINTFLOAT = StructType(
	struct(WINDOWS_PACKAGE, "POINTFLOAT") {
		nativeImport ("WindowsLWJGL.h")
		FLOAT.member("x")
		FLOAT.member("y")
	}
)

val LPGLYPHMETRICSFLOAT = StructType(
	name = "LPGLYPHMETRICSFLOAT",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "GLYPHMETRICSFLOAT") {
		javaDoc("Contains information about the placement and orientation of a glyph in a character cell.")
		nativeImport ("WindowsLWJGL.h")
		FLOAT.member("gmfBlackBoxX", "blackBoxX")
		FLOAT.member("gmfBlackBoxY", "blockBoxY")
		POINTFLOAT.member("gmfptGlyphOrigin", "glyphOrigin")
		FLOAT.member("gmfCellIncX", "cellIncX")
		FLOAT.member("gmfCellIncY", "cellIncY")
	}
)

val PIXELFORMATDESCRIPTOR_STRUCT = struct(WINDOWS_PACKAGE, "PIXELFORMATDESCRIPTOR") {
	javaDoc("Describes the pixel format of a drawing surface.")
	nativeImport ("WindowsLWJGL.h")
	WORD.member("nSize", "size")
	WORD.member("nVersion", "version")
	DWORD.member("dwFlags", "flags")
	BYTE.member("iPixelType", "pixelType")
	BYTE.member("cColorBits", "colorBits")
	BYTE.member("cRedBits", "redBits")
	BYTE.member("cRedShift", "redShirt")
	BYTE.member("cGreenBits", "greenBits")
	BYTE.member("cGreenShift", "greenShift")
	BYTE.member("cBlueBits", "blueBits")
	BYTE.member("cBlueShift", "blueShift")
	BYTE.member("cAlphaBits", "alphaBits")
	BYTE.member("cAlphaShift", "alphaShift")
	BYTE.member("cAccumBits", "accumBits")
	BYTE.member("cAccumRedBits", "accumRedBits")
	BYTE.member("cAccumGreenBits", "accumGreenBits")
	BYTE.member("cAccumBlueBits", "accumBlueBits")
	BYTE.member("cAccumAlphaBits", "accumAlphaBits")
	BYTE.member("cDepthBits", "depthBits")
	BYTE.member("cStencilBits", "stencilBits")
	BYTE.member("cAuxBuffers", "auxBuffers")
	BYTE.member("iLayerType", "layerType")
	BYTE.member("bReserved", "reserved")
	DWORD.member("dwLayerMask", "layerMask")
	DWORD.member("dwVisibleMask", "visibleMask")
	DWORD.member("dwDamageMask", "damageMask")
}
val PIXELFORMATDESCRIPTOR = StructType(PIXELFORMATDESCRIPTOR_STRUCT)
val LPPIXELFORMATDESCRIPTOR = StructType(name = "LPPIXELFORMATDESCRIPTOR", definition = PIXELFORMATDESCRIPTOR_STRUCT, includesPointer = true)
val PIXELFORMATDESCRIPTOR_p = PointerType(PIXELFORMATDESCRIPTOR)

val WNDPROC = PointerType(name = "WNDPROC", includesPointer = true)

val HICON = PointerType(name = "HICON", includesPointer = true)
val HCURSOR = PointerType(name = "HCURSOR", includesPointer = true)
val HBRUSH = PointerType(name = "HBRUSH", includesPointer = true)

val ATOM = PrimitiveType("ATOM", PrimitiveMapping.SHORT)

private val WNDCLASSEX_STRUCT = struct(WINDOWS_PACKAGE, "WNDCLASSEX") {
	javaDoc("Contains the window class attributes that are registered by the {@link WinUser#RegisterClassEx} function.")
	nativeImport ("WindowsLWJGL.h")
	UINT.member("cbSize", "size")
	UINT.member("style")
	WNDPROC.member("lpfnWndProc", "wndProc")
	int.member("cbClsExtra", "clsExtra")
	int.member("cbWndExtra", "wndExtra")
	HINSTANCE.member("hInstance", "instance")
	HICON.member("hIcon", "icon")
	HCURSOR.member("hCursor", "cursor")
	HBRUSH.member("hbrBackground", "background")
	LPCTSTR.member("lpszMenuName", "menuName")
	LPCTSTR.member("lpszClassName", "className")
	HICON.member("hIconSm", "iconSm")
}

val WNDCLASSEX = StructType(WNDCLASSEX_STRUCT)
val LPWNDCLASSEX = StructType(name = "LPWNDCLASSEX", definition = WNDCLASSEX_STRUCT, includesPointer = true)
val WNDCLASSEX_p = PointerType(WNDCLASSEX)

val LPOSVERSIONINFO = StructType(
	name = "LPOSVERSIONINFO",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "OSVERSIONINFOEX") {
		javaDoc("""
			Contains operating system version information. The information includes major and minor
			version numbers, a build number, a platform identifier, and information about product
			suites and the latest Service Pack installed on the system.
		""")
		nativeImport ("WindowsLWJGL.h")
		DWORD.member("dwOSVersionInfoSize", "osVersionInfoSize")
		DWORD.member("dwMajorVersion", "majorVersion")
		DWORD.member("dwMinorVersion", "minorVersion")
		DWORD.member("dwBuildNumber", "buildNumber")
		DWORD.member("dwPlatformId", "platformId")
		TCHAR.member("szCSDVersion", "csdVersion", 128, true)
		WORD.member("wServicePackMajor", "servicePackMajor")
		WORD.member("wServicePackMinor", "servicePackMinor")
		WORD.member("wSuiteMask", "suiteMask")
		BYTE.member("wProductType", "productType")
		//BYTE.member("wReserved", "reserved")
	}
)

private val POINT_STRUCT = struct(WINDOWS_PACKAGE, "POINT") {
	javaDoc("Defines the x- and y- coordinates of a point.")
	nativeImport ("WindowsLWJGL.h")
	LONG.member("x")
	LONG.member("y")
}
val POINT = StructType(POINT_STRUCT)
val LPPOINT = StructType (name = "LPPOINT", definition = POINT_STRUCT, includesPointer = true)

private val RECT_STRUCT = struct(WINDOWS_PACKAGE, "RECT") {
	javaDoc("Defines the coordinates of the upper-left and lower-right corners of a rectangle.")
	nativeImport ("WindowsLWJGL.h")
	LONG.member("left")
	LONG.member("top")
	LONG.member("right")
	LONG.member("bottom")
}
val RECT = StructType(RECT_STRUCT)
val LPRECT = StructType(name = "LPRECT", definition = RECT_STRUCT, includesPointer = true)
val RECT_p = PointerType(RECT)

private val MSG_STRUCT = struct(WINDOWS_PACKAGE, "MSG") {
	javaDoc("Contains message information from a thread's message queue.")
	nativeImport ("WindowsLWJGL.h")
	HWND.member("hwnd", "window");
	UINT.member("message")
	WPARAM.member("wParam")
	LPARAM.member("lParam")
	DWORD.member("time")
	POINT.member("pt", "point")
}
val MSG = StructType(MSG_STRUCT)
val LPMSG = StructType(name = "LPMSG", definition = MSG_STRUCT, includesPointer = true)
val MSG_p = PointerType(MSG)

val POINTL = StructType (
	name = "POINTL",
	definition = struct(WINDOWS_PACKAGE, "POINTL") {
		javaDoc("Contains the coordinates of a point.")
		nativeImport ("WindowsLWJGL.h")
		LONG.member("x")
		LONG.member("y")
	}
)

val DEVMODE = StructType(
	struct(WINDOWS_PACKAGE, "DEVMODE") {
		javaDoc("Contains information about the initialization and environment of a printer or a display device.")
		nativeImport("WindowsLWJGL.h")
		TCHAR.member("dmDeviceName", "deviceName", 32, true)
		WORD.member("dmSpecVersion", "specVersion")
		WORD.member("dmDriverVersion", "driverVersion")
		WORD.member("dmSize", "size")
		WORD.member("dmDriverExtra", "driverExtra")
		DWORD.member("dmFields", "fields")
		//union {
		//struct {
		/*
		short.member("dmOrientation", "orientation")
		short.member("dmPaperSize", "paperSize")
		short.member("dmPaperLength", "paperLength")
		short.member("dmPaperWidth", "paperWidth")
		short.member("dmScale", "scale")
		short.member("dmCopies", "copies")
		short.member("dmDefaultSource", "defaultSource")
		short.member("dmPrintQuality", "printQuality")
		*/
		//}
		//struct {
		POINTL.member("dmPosition", "position")
		//DWORD.member("dmDisplayOrientation", "displayOrientation") // Not supported on win2k
		//DWORD.member("dmDisplayFixedOutput", "displayFixedOutput") // Not supported on win2k
		//}
		//}
		/*
		short.member("dmColor", "color")
		short.member("dmDuplex", "duplex")
		short.member("dmYResolution", "yResolution")
		short.member("dmTTOption", "ttOption")
		short.member("dmCollate", "collate")
		TCHAR.member("dmFormName", "formName", 32, true)
		*/
		WORD.member("dmLogPixels", "logPixels")
		DWORD.member("dmBitsPerPel", "bitsPerPel")
		DWORD.member("dmPelsWidth", "pelsWidth")
		DWORD.member("dmPelsHeight", "pelsHeight")
		//union {
		DWORD.member("dmDisplayFlags", "displayFlags")
		//DWORD.member("dmNup", "nup")
		//}
		DWORD.member("dmDisplayFrequency", "displayFrequency")
		/*
		DWORD.member("dmICMMethod", "icmMethod")
		DWORD.member("dmICMIntent", "icmIntent")
		DWORD.member("dmMediaType", "mediaType")
		DWORD.member("dmDitherType", "ditherType")
		*/

		/*
		DWORD.member("dmReserved1", "reserved1")
		DWORD.member("dmReserved2", "reserved2")

		DWORD.member("dmPanningWidth", "panningWidth")
		DWORD.member("dmPanningHeight", "panningHeight")
		*/
	}
)
val DEVMODE_p = PointerType(DEVMODE)

val PDISPLAY_DEVICE = StructType(
	name = "PDISPLAY_DEVICE",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "DISPLAY_DEVICE") {
		javaDoc("Receives information about the display device specified by the devNum parameter of the {@link WinUser#EnumDisplayDevices} function.")
		nativeImport("WindowsLWJGL.h")
		DWORD.member("cb")
		TCHAR.member(nativeName = "DeviceName", size = 32, nullTerminated = true)
		TCHAR.member(nativeName = "DeviceString", size = 128, nullTerminated = true)
		DWORD.member("StateFlags")
		TCHAR.member(nativeName = "DeviceID", size = 128, nullTerminated = true)
		TCHAR.member(nativeName = "DeviceKey", size = 128, nullTerminated = true)
	}
)

val GOBJENUMPROC = PointerType(name = "GOBJENUMPROC", includesPointer = true)

val LPTRACKMOUSEEVENT = StructType(
	name = "LPTRACKMOUSEEVENT",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "TRACKMOUSEEVENT") {
		javaDoc(
			"""
			Used by the {@link WinUser#TrackMouseEvent} function to track when the mouse pointer leaves a window or hovers over a window for a specified amount
			of time.
			"""
		)
		nativeImport("WindowsLWJGL.h")
		DWORD.member("cbSize", "size")
		DWORD.member("dwFlags", "flags")
		HWND.member("hwndTrack")
		DWORD.member("dwHoverTime", "hoverTime")
	}
)

val LARGE_INTEGER = StructType(
	struct(WINDOWS_PACKAGE, "LARGE_INTEGER") {
		nativeImport ("WindowsLWJGL.h")
		// LARGE_INTEGER is a union really, but we don't care about the other stuff.
		LONGLONG.member("QuadPart")
	}
)
val LARGE_INTEGER_p = PointerType(LARGE_INTEGER)

fun config() {
	val COLORREF = PrimitiveType("COLORREF", PrimitiveMapping.INT)

	struct(WINDOWS_PACKAGE, "LOGPEN") {
		nativeImport ("WindowsLWJGL.h")
		UINT.member("lopnStyle")
		POINT.member("lopnWidth")
		COLORREF.member("lopnColor")
	}

	struct(WINDOWS_PACKAGE, "LOGBRUSH") {
		nativeImport ("WindowsLWJGL.h")
		UINT.member("lbStyle");
        COLORREF.member("lbColor");
        ULONG_PTR.member("lbHatch");
	}

	struct(WINDOWS_PACKAGE, "WINDOWPOS") {
		nativeImport ("WindowsLWJGL.h")
		HWND.member("hwnd")
		HWND.member("hwndInsertAfter")
		int.member("x")
		int.member("y")
		int.member("cx")
		int.member("cy")
		UINT.member("flags")
	}
}