/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows

import org.lwjgl.generator.*

val WINDOWS_PACKAGE = "org.lwjgl.system.windows"

// UNICODE is defined WindowsLWJGL.h, so all T* types below are UTF16.

val VOID = NativeType("VOID", TypeMapping.VOID)
val PVOID = PointerType("PVOID", includesPointer = true) // A pointer to any type

val HANDLE = PointerType("HANDLE", includesPointer = true)
val HANDLE_p = PointerType(HANDLE)

val BOOL = PrimitiveType("BOOL", PrimitiveMapping.INT) // Not boolean because of WinUser#GetMessage
val BOOL_p = PointerType(BOOL)

val BYTE = IntegerType("BYTE", PrimitiveMapping.BYTE)
val WORD = IntegerType("WORD", PrimitiveMapping.SHORT)
val SHORT = IntegerType("SHORT", PrimitiveMapping.SHORT)
val UINT = IntegerType("UINT", PrimitiveMapping.INT, unsigned = true)
val DWORD = IntegerType("DWORD", PrimitiveMapping.INT)
val LONG = IntegerType("LONG", PrimitiveMapping.INT)
val FLOAT = PrimitiveType("FLOAT", PrimitiveMapping.FLOAT)
private val LONGLONG = PrimitiveType("LONGLONG", PrimitiveMapping.LONG) // Only LARGE_INTEGER uses this

val UINT_PTR = PrimitiveType("UINT_PTR", PrimitiveMapping.PTR)
val LONG_PTR = PrimitiveType("LONG_PTR", PrimitiveMapping.PTR)
val ULONG_PTR = PrimitiveType("ULONG_PTR", PrimitiveMapping.PTR)
val DWORD_PTR = PrimitiveType("DWORD_PTR", PrimitiveMapping.PTR)
val SIZE_T = typedef(ULONG_PTR, "SIZE_T")

val UINT_p = PointerType(UINT)
val FLOAT_p = PointerType(FLOAT)

val LRESULT = typedef(LONG_PTR, "LRESULT")
val WPARAM = typedef(UINT_PTR, "WPARAM")
val LPARAM = typedef(LONG_PTR, "LPARAM")

val HRESULT = typedef(LONG, "HRESULT")
val MMRESULT = typedef(UINT, "MMRESULT")

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

val POINTFLOAT = struct(WINDOWS_PACKAGE, "POINTFLOAT") {
	nativeImport ("WindowsLWJGL.h")
	FLOAT.member("x")
	FLOAT.member("y")
}.nativeType

val LPGLYPHMETRICSFLOAT = StructType(
	name = "LPGLYPHMETRICSFLOAT",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "GLYPHMETRICSFLOAT") {
		documentation = "Contains information about the placement and orientation of a glyph in a character cell."
		nativeImport ("WindowsLWJGL.h")
		FLOAT.member("gmfBlackBoxX", "blackBoxX")
		FLOAT.member("gmfBlackBoxY", "blockBoxY")
		POINTFLOAT.member("gmfptGlyphOrigin", "glyphOrigin")
		FLOAT.member("gmfCellIncX", "cellIncX")
		FLOAT.member("gmfCellIncY", "cellIncY")
	}
)

val PIXELFORMATDESCRIPTOR_STRUCT = struct(WINDOWS_PACKAGE, "PIXELFORMATDESCRIPTOR") {
	documentation = "Describes the pixel format of a drawing surface."
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
val PIXELFORMATDESCRIPTOR_p = StructType(PIXELFORMATDESCRIPTOR)

val WNDPROC = CallbackType(callback(
	WINDOWS_PACKAGE, LRESULT, "WindowProc",
	"Will be called for each message sent to the window.",
	HWND.IN("hwnd", "a handle to the window procedure that received the message"),
    UINT.IN("uMsg", "the message"),
    WPARAM.IN("wParam", "additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter."),
    LPARAM.IN("lParam", "additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter."),
    samConstructor = "WinUser"
) {
	documentation = "An application-defined function that processes messages sent to a window."
	CALL_CONVENTION_SYSTEM
}, "WNDPROC")

val HICON = PointerType("HICON", includesPointer = true)
val HCURSOR = PointerType("HCURSOR", includesPointer = true)
val HBRUSH = PointerType("HBRUSH", includesPointer = true)

val ATOM = PrimitiveType("ATOM", PrimitiveMapping.SHORT)

private val WNDCLASSEX_STRUCT = struct(WINDOWS_PACKAGE, "WNDCLASSEX") {
	documentation = "Contains the window class attributes that are registered by the WinUser#RegisterClassEx() function."
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
val WNDCLASSEX_p = StructType(WNDCLASSEX)

private val POINT_STRUCT = struct(WINDOWS_PACKAGE, "POINT") {
	documentation = "Defines the x- and y- coordinates of a point."
	nativeImport ("WindowsLWJGL.h")
	LONG.member("x")
	LONG.member("y")
}
val POINT = StructType(POINT_STRUCT)
val LPPOINT = StructType (name = "LPPOINT", definition = POINT_STRUCT, includesPointer = true)

private val RECT_STRUCT = struct(WINDOWS_PACKAGE, "RECT") {
	documentation = "Defines the coordinates of the upper-left and lower-right corners of a rectangle."
	nativeImport ("WindowsLWJGL.h")
	LONG.member("left")
	LONG.member("top")
	LONG.member("right")
	LONG.member("bottom")
}
val RECT = StructType(RECT_STRUCT)
val LPRECT = StructType(name = "LPRECT", definition = RECT_STRUCT, includesPointer = true)
val RECT_p = StructType(RECT)

private val MSG_STRUCT = struct(WINDOWS_PACKAGE, "MSG") {
	documentation = "Contains message information from a thread's message queue."
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
val MSG_p = StructType(MSG)

val POINTL = StructType (
	name = "POINTL",
	definition = struct(WINDOWS_PACKAGE, "POINTL") {
		documentation = "Contains the coordinates of a point."
		nativeImport ("WindowsLWJGL.h")
		LONG.member("x")
		LONG.member("y")
	}
)

val DEVMODE = struct(WINDOWS_PACKAGE, "DEVMODE") {
	documentation = "Contains information about the initialization and environment of a printer or a display device."
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
}.nativeType
val DEVMODE_p = StructType(DEVMODE)

val PDISPLAY_DEVICE = StructType(
	name = "PDISPLAY_DEVICE",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "DISPLAY_DEVICE") {
		documentation = "Receives information about the display device specified by the devNum parameter of the WinUser#EnumDisplayDevices() function."
		nativeImport("WindowsLWJGL.h")
		DWORD.member("cb")
		TCHAR.member(nativeName = "DeviceName", size = 32, nullTerminated = true)
		TCHAR.member(nativeName = "DeviceString", size = 128, nullTerminated = true)
		DWORD.member("StateFlags")
		TCHAR.member(nativeName = "DeviceID", size = 128, nullTerminated = true)
		TCHAR.member(nativeName = "DeviceKey", size = 128, nullTerminated = true)
	}
)

val GOBJENUMPROC = CallbackType(callback(
	WINDOWS_PACKAGE, int, "EnumObjectsCallback",
	"Will be called for each available object.",
	LPVOID.IN("logObject", "a pointer to a {@link LOGPEN} or {@link LOGBRUSH} structure describing the attributes of the object"),
	LPARAM.IN("data", "a pointer to the application-defined data passed by the WinGDI##EnumObjects() function"),
	samConstructor = "WinGDI"
) {
	documentation = "Instances of this interface may be passed to the WinGDI##EnumObjects() method."
	CALL_CONVENTION_SYSTEM
}, "GOBJENUMPROC")

val LPTRACKMOUSEEVENT = StructType(
	name = "LPTRACKMOUSEEVENT",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "TRACKMOUSEEVENT") {
		documentation =
			"""
			Used by the WinUser#TrackMouseEvent() function to track when the mouse pointer leaves a window or hovers over a window for a specified amount
			of time.
			"""
		nativeImport("WindowsLWJGL.h")
		DWORD.member("cbSize", "size")
		DWORD.member("dwFlags", "flags")
		HWND.member("hwndTrack")
		DWORD.member("dwHoverTime", "hoverTime")
	}
)

val LARGE_INTEGER = struct(WINDOWS_PACKAGE, "LARGE_INTEGER") {
	nativeImport ("WindowsLWJGL.h")
	// LARGE_INTEGER is a union really, but we don't care about the other stuff.
	LONGLONG.member("QuadPart")
}.nativeType
val LARGE_INTEGER_p = StructType(LARGE_INTEGER)

val LPJOYCAPS = StructType(
	name = "LPJOYCAPS",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "JOYCAPS") {
		documentation = "Contains information about the joystick capabilities."
		nativeImport("WindowsLWJGL.h")

		val MAXPNAMELEN = 32
		val MAX_JOYSTICKOEMVXDNAME = 260

		WORD.member("wMid", "mid")
		WORD.member("wPid", "pid")
		TCHAR.member("szPname", "pname", size = MAXPNAMELEN, nullTerminated = true)
		UINT.member("wXmin", "xmin")
		UINT.member("wXmax", "xmax")
		UINT.member("wYmin", "ymin")
		UINT.member("wYmax", "ymax")
		UINT.member("wZmin", "zmin")
		UINT.member("wZmax", "zmax")
		UINT.member("wNumButtons", "numButtons")
		UINT.member("wPeriodMin", "periodMin")
		UINT.member("wPeriodMax", "periodMax")
		UINT.member("wRmin", "rmin")
		UINT.member("wRmax", "rmax")
		UINT.member("wUmin", "umin")
		UINT.member("wUmax", "umax")
		UINT.member("wVmin", "vmin")
		UINT.member("wVmax", "vmax")
		UINT.member("wCaps", "caps")
		UINT.member("wMaxAxes", "maxAxes")
		UINT.member("wNumAxes", "numAxes")
		UINT.member("wMaxButtons", "maxButtons")
		TCHAR.member("szRegKey", "regKey", size = MAXPNAMELEN, nullTerminated = true)
		TCHAR.member("szOEMVxD", "OEMVxD", size = MAX_JOYSTICKOEMVXDNAME, nullTerminated = true)
	}
)

val LPJOYINFO = StructType(
	name = "LPJOYINFO",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "JOYINFO") {
		documentation = "Contains information about the joystick position and button state."
		nativeImport("WindowsLWJGL.h")
		UINT.member("wXpos", "xPos")
		UINT.member("wYpos", "yPos")
		UINT.member("wZpos", "zPos")
		UINT.member("wButtons", "buttons")
	}
)

val LPJOYINFOEX = StructType(
	name = "LPJOYINFOEX",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "JOYINFOEX") {
		documentation = "Contains extended information about the joystick position, point-of-view position, and button state."
		nativeImport("WindowsLWJGL.h")

		DWORD.member("dwSize", "size")
		DWORD.member("dwFlags", "flags")
		DWORD.member("dwXpos", "xPos")
		DWORD.member("dwYpos", "yPos")
		DWORD.member("dwZpos", "zPos")
		DWORD.member("dwRpos", "rPos")
		DWORD.member("dwUpos", "uPos")
		DWORD.member("dwVpos", "vPos")
		DWORD.member("dwButtons", "buttons")
		DWORD.member("dwButtonNumber", "buttonNumber")
		DWORD.member("dwPOV", "POV")
		DWORD.member("dwReserved1", "reserved1")
		DWORD.member("dwReserved2", "reserved2")
	}
)

val GUID = struct(WINDOWS_PACKAGE, "GUID") {
	documentation = "GUID"
	nativeImport("WindowsLWJGL.h")
}
val LPGUID = StructType(
	name = "LPGUID",
	includesPointer = true,
	definition = GUID
)

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