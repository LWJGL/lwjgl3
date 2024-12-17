/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows

import org.lwjgl.generator.*

// UNICODE is defined WindowsLWJGL.h, so all T* types below are UTF16.

val VOID = "VOID".void

val HANDLE = "HANDLE".handle

val BOOL = PrimitiveType("BOOL", PrimitiveMapping.BOOLEAN4)
val BYTE = IntegerType("BYTE", PrimitiveMapping.BYTE)
val WORD = IntegerType("WORD", PrimitiveMapping.SHORT, unsigned = true)
val SHORT = IntegerType("SHORT", PrimitiveMapping.SHORT)
val USHORT = IntegerType("USHORT", PrimitiveMapping.SHORT, unsigned = true)
val UINT = IntegerType("UINT", PrimitiveMapping.INT, unsigned = true)
val DWORD = IntegerType("DWORD", PrimitiveMapping.INT)
val LONG = IntegerType("LONG", PrimitiveMapping.INT)
val ULONG = IntegerType("ULONG", PrimitiveMapping.INT, unsigned = true)
val LONGLONG = IntegerType("LONGLONG", PrimitiveMapping.LONG)
val FLOAT = PrimitiveType("FLOAT", PrimitiveMapping.FLOAT)
val LDOUBLE = PrimitiveType("LDOUBLE", PrimitiveMapping.DOUBLE)

val ATOM = typedef(WORD, "ATOM")

val PULONG = typedef(ULONG.p, "PULONG")

val UINT_PTR = IntegerType("UINT_PTR", PrimitiveMapping.POINTER, unsigned = true)
val LONG_PTR = IntegerType("LONG_PTR", PrimitiveMapping.POINTER)
val ULONG_PTR = IntegerType("ULONG_PTR", PrimitiveMapping.POINTER, unsigned = true)

val LRESULT = typedef(LONG_PTR, "LRESULT")
val WPARAM = typedef(UINT_PTR, "WPARAM")
val LPARAM = typedef(LONG_PTR, "LPARAM")

val CHAR = CharType("CHAR", CharMapping.ASCII)
val WCHAR = CharType("WCHAR", CharMapping.UTF16)
val TCHAR = CharType("TCHAR", CharMapping.UTF16)

val LPCSTR = typedef(CHAR.const.p, "LPCSTR")
val LPCWSTR = typedef(WCHAR.const.p, "LPCWSTR")
val LPCTSTR = typedef(TCHAR.const.p, "LPCTSTR")
val LPWSTR = typedef(WCHAR.p, "LPWSTR")
val LPTSTR = typedef(TCHAR.p, "LPTSTR")

val FARPROC = "FARPROC".handle
val PROC = "PROC".handle
val PVOID = "PVOID".handle
val LPVOID = "LPVOID".handle

val HINSTANCE = typedef(HANDLE, "HINSTANCE")
val HLOCAL = typedef(HANDLE, "HLOCAL")
val HMODULE = typedef(HANDLE, "HMODULE")
val HWND = typedef(HANDLE, "HWND")
val HMENU = typedef(HANDLE, "HMENU")
val HDC = typedef(HANDLE, "HDC")
val HGLRC = typedef(HANDLE, "HGLRC")
val HBITMAP = typedef(HANDLE, "HBITMAP")
val HPALETTE = typedef(HANDLE, "HPALETTE")
val HICON = typedef(HANDLE, "HICON")
val HCURSOR = typedef(HANDLE, "HCURSOR")
val HBRUSH = typedef(HANDLE, "HBRUSH")
val HTOUCHINPUT = typedef(HANDLE, "HTOUCHINPUT")
val HMONITOR = typedef(HANDLE, "HMONITOR")
val DPI_AWARENESS_CONTEXT = typedef(HANDLE, "DPI_AWARENESS_CONTEXT")

val COLORREF = typedef(DWORD, "COLORREF")

val LARGE_INTEGER = union(Module.CORE_WINDOWS, "LARGE_INTEGER") {
    struct {
        DWORD("LowPart")
        LONG("HighPart")
    }("u")
    LONGLONG("QuadPart")
}

/*val POINTFLOAT = struct(Binding.CORE_WINDOWS, "POINTFLOAT") {
    FLOAT("x")
    FLOAT("y")
}

val GLYPHMETRICSFLOAT = struct(Binding.CORE_WINDOWS, "GLYPHMETRICSFLOAT", mutable = false) {
    FLOAT("gmfBlackBoxX")
    FLOAT("gmfBlackBoxY")
    POINTFLOAT("gmfptGlyphOrigin")
    FLOAT("gmfCellIncX")
    FLOAT("gmfCellIncY")
}
val LPGLYPHMETRICSFLOAT = GLYPHMETRICSFLOAT.p("LPGLYPHMETRICSFLOAT")*/

val POINT = struct(Module.CORE_WINDOWS, "POINT") {
    LONG("x")
    LONG("y")
}
val LPPOINT = typedef(POINT.p, "LPPOINT")

val RECT = struct(Module.CORE_WINDOWS, "RECT") {
    LONG("left")
    LONG("top")
    LONG("right")
    LONG("bottom")
}
val LPRECT = typedef(RECT.p, "LPRECT")

val MSG = struct(Module.CORE_WINDOWS, "MSG") {
    nullable..HWND("hwnd")
    UINT("message")
    WPARAM("wParam")
    LPARAM("lParam")
    DWORD("time")
    POINT("pt")
}
val LPMSG = typedef(MSG.p, "LPMSG")

val PIXELFORMATDESCRIPTOR = struct(Module.CORE_WINDOWS, "PIXELFORMATDESCRIPTOR") {
    WORD("nSize")
    WORD("nVersion")
    DWORD("dwFlags")
    BYTE("iPixelType")
    BYTE("cColorBits")
    BYTE("cRedBits")
    BYTE("cRedShift")
    BYTE("cGreenBits")
    BYTE("cGreenShift")
    BYTE("cBlueBits")
    BYTE("cBlueShift")
    BYTE("cAlphaBits")
    BYTE("cAlphaShift")
    BYTE("cAccumBits")
    BYTE("cAccumRedBits")
    BYTE("cAccumGreenBits")
    BYTE("cAccumBlueBits")
    BYTE("cAccumAlphaBits")
    BYTE("cDepthBits")
    BYTE("cStencilBits")
    BYTE("cAuxBuffers")
    BYTE("iLayerType")
    BYTE("bReserved")
    DWORD("dwLayerMask")
    DWORD("dwVisibleMask")
    DWORD("dwDamageMask")
}
val LPPIXELFORMATDESCRIPTOR = typedef(PIXELFORMATDESCRIPTOR.p, "LPPIXELFORMATDESCRIPTOR")

val WNDPROC = Module.CORE_WINDOWS.callback {
    LRESULT(
        "WindowProc",

        HWND("hwnd"),
        UINT("uMsg"),
        WPARAM("wParam"),
        LPARAM("lParam"),

        nativeType = "WNDPROC"
    ) {}
}

val WNDCLASSEX = struct(Module.CORE_WINDOWS, "WNDCLASSEX") {
    UINT("cbSize")
    UINT("style")
    WNDPROC("lpfnWndProc")
    int("cbClsExtra")
    int("cbWndExtra")
    nullable..HINSTANCE("hInstance")
    nullable..HICON("hIcon")
    nullable..HCURSOR("hCursor")
    nullable..HBRUSH("hbrBackground")
    nullable..LPCTSTR("lpszMenuName")
    LPCTSTR("lpszClassName")
    nullable..HICON("hIconSm")
}

val WINDOWPLACEMENT = struct(Module.CORE_WINDOWS, "WINDOWPLACEMENT") {
    UINT("length")
    UINT("flags")
    UINT("showCmd")
    POINT("ptMinPosition")
    POINT("ptMaxPosition")
    RECT("rcNormalPosition")
}

val TOUCHINPUT = struct(Module.CORE_WINDOWS, "TOUCHINPUT", mutable = false) {
    LONG("x")
    LONG("y")
    HANDLE("hSource")
    DWORD("dwID")
    DWORD("dwFlags")
    DWORD("dwMask")
    DWORD("dwTime")
    ULONG_PTR("dwExtraInfo")
    DWORD("cxContact")
    DWORD("cyContact")
}
val PTOUCHINPUT = typedef(TOUCHINPUT.p, "PTOUCHINPUT")

val MONITORINFOEX = struct(Module.CORE_WINDOWS, "MONITORINFOEX", mutable = false) {
    DWORD("cbSize").mutable()
    RECT("rcMonitor")
    RECT("rcWork")
    DWORD("dwFlags")
    TCHAR("szDevice")[32]
}
val LPMONITORINFOEX = typedef(MONITORINFOEX.p, "LPMONITORINFOEX")

val POINTL = struct(Module.CORE_WINDOWS, "POINTL") {
    LONG("x")
    LONG("y")
}

val DEVMODE = struct(Module.CORE_WINDOWS, "DEVMODE", mutable = false) {
    TCHAR("dmDeviceName")[32]
    WORD("dmSpecVersion").mutable()
    WORD("dmDriverVersion")
    WORD("dmSize").mutable()
    WORD("dmDriverExtra").mutable()
    DWORD("dmFields")

    union {
        struct {
            short("dmOrientation")
            short("dmPaperSize")
            short("dmPaperLength")
            short("dmPaperWidth")
            short("dmScale")
            short("dmCopies")
            short("dmDefaultSource")
            short("dmPrintQuality")
        }
        struct {
            POINTL("dmPosition")
            DWORD("dmDisplayOrientation")
            DWORD("dmDisplayFixedOutput")
        }
    }
    short("dmColor")
    short("dmDuplex")
    short("dmYResolution")
    short("dmTTOption")
    short("dmCollate")
    TCHAR("dmFormName")[32]

    WORD("dmLogPixels")
    DWORD("dmBitsPerPel")
    DWORD("dmPelsWidth")
    DWORD("dmPelsHeight")
    union {
        DWORD("dmDisplayFlags")
        DWORD("dmNup")
    }
    DWORD("dmDisplayFrequency")
    DWORD("dmICMMethod")
    DWORD("dmICMIntent")
    DWORD("dmMediaType")
    DWORD("dmDitherType")

    DWORD("dmReserved1")
    DWORD("dmReserved2")

    DWORD("dmPanningWidth")
    DWORD("dmPanningHeight")
}

val DISPLAY_DEVICE = struct(Module.CORE_WINDOWS, "DISPLAY_DEVICE", mutable = false) {
    DWORD("cb").mutable()
    TCHAR("DeviceName")[32]
    TCHAR("DeviceString")[128]
    DWORD("StateFlags")
    TCHAR("DeviceID")[128]
    TCHAR("DeviceKey")[128]
}
val PDISPLAY_DEVICE = typedef(DISPLAY_DEVICE.p, "PDISPLAY_DEVICE")

val SECURITY_ATTRIBUTES = struct(Module.CORE_WINDOWS, "SECURITY_ATTRIBUTES") {
    DWORD("nLength")
    LPVOID("lpSecurityDescriptor")
    BOOL("bInheritHandle")
}

val MOUSEINPUT = struct(Module.CORE_WINDOWS, "MOUSEINPUT") {
    LONG("dx")
    LONG("dy")
    DWORD("mouseData")
    DWORD("dwFlags")
    DWORD("time")
    ULONG_PTR("dwExtraInfo")
}

val KEYBDINPUT = struct(Module.CORE_WINDOWS, "KEYBDINPUT") {
    WORD("wVk")
    WORD("wScan")
    DWORD("dwFlags")
    DWORD("time")
    ULONG_PTR("dwExtraInfo")
}

val HARDWAREINPUT = struct(Module.CORE_WINDOWS, "HARDWAREINPUT") {
    DWORD("uMsg")
    WORD("wParamL")
    WORD("wParamH")
}

val INPUT = struct(Module.CORE_WINDOWS, "INPUT") {
    DWORD("type")
    union {
        MOUSEINPUT("mi")
        KEYBDINPUT("ki")
        HARDWAREINPUT("hi")
    }("DUMMYUNIONNAME")
}
val LPINPUT = typedef(INPUT.p, "PINPUT")

val DATA_BLOB = struct(Module.CORE_WINDOWS, "DATA_BLOB") {
    AutoSize("pbData")..DWORD("cbData")
    BYTE.p("pbData")
}

val CRYPTPROTECT_PROMPTSTRUCT = struct(Module.CORE_WINDOWS, "CRYPTPROTECT_PROMPTSTRUCT", skipBuffer = true) {
    Expression("SIZEOF")..DWORD("cbSize")
    DWORD("dwPromptFlags")
    HWND("hwndApp")
    LPCWSTR("szPrompt")
}