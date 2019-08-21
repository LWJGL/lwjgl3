/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.windows

import org.lwjgl.generator.*

val SaveLastError = Code(nativeAfterCall = "${t}saveLastError();")

// UNICODE is defined WindowsLWJGL.h, so all T* types below are UTF16.

val VOID = "VOID".void

val HANDLE = "HANDLE".handle

val BOOL = PrimitiveType("BOOL", PrimitiveMapping.BOOLEAN4)
val BYTE = IntegerType("BYTE", PrimitiveMapping.BYTE)
val WORD = IntegerType("WORD", PrimitiveMapping.SHORT)
val SHORT = IntegerType("SHORT", PrimitiveMapping.SHORT)
val USHORT = IntegerType("USHORT", PrimitiveMapping.SHORT, unsigned = true)
val UINT = IntegerType("UINT", PrimitiveMapping.INT, unsigned = true)
val DWORD = IntegerType("DWORD", PrimitiveMapping.INT)
val LONG = IntegerType("LONG", PrimitiveMapping.INT)
val ULONG = IntegerType("ULONG", PrimitiveMapping.INT, unsigned = true)
val FLOAT = PrimitiveType("FLOAT", PrimitiveMapping.FLOAT)
val LDOUBLE = PrimitiveType("LDOUBLE", PrimitiveMapping.DOUBLE)

val ATOM = PrimitiveType("ATOM", PrimitiveMapping.SHORT)

val PULONG = typedef(ULONG.p, "PULONG")

val UINT_PTR = IntegerType("UINT_PTR", PrimitiveMapping.POINTER, unsigned = true)
val LONG_PTR = IntegerType("LONG_PTR", PrimitiveMapping.POINTER)
val ULONG_PTR = IntegerType("ULONG_PTR", PrimitiveMapping.POINTER, unsigned = true)

val LRESULT = typedef(LONG_PTR, "LRESULT")
val WPARAM = typedef(UINT_PTR, "WPARAM")
val LPARAM = typedef(LONG_PTR, "LPARAM")

val CHAR = CharType("CHAR", CharMapping.ASCII)
val WCHAR = CharType("CHAR", CharMapping.UTF16)
val TCHAR = CharType("TCHAR", CharMapping.UTF16)

val LPCSTR = typedef(CHAR.const.p, "LPCSTR")
val LPCWSTR = typedef(WCHAR.const.p, "LPCWSTR")
val LPCTSTR = typedef(TCHAR.const.p, "LPCTSTR")

val FARPROC = "FARPROC".handle
val PROC = "PROC".handle
val LPVOID = "LPVOID".handle

val HINSTANCE = typedef(HANDLE, "HINSTANCE")
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

/*val POINTFLOAT = struct(Binding.CORE_WINDOWS, "POINTFLOAT") {
    documentation = "Contains the x and y coordinates of a point."

    FLOAT("x", "specifies the horizontal (x) coordinate of a point")
    FLOAT("y", "specifies the vertical (y) coordinate of a point")
}

val GLYPHMETRICSFLOAT = struct(Binding.CORE_WINDOWS, "GLYPHMETRICSFLOAT", mutable = false) {
    documentation = "Contains information about the placement and orientation of a glyph in a character cell."

    FLOAT("gmfBlackBoxX", "specifies the width of the smallest rectangle (the glyph's black box) that completely encloses the glyph")
    FLOAT("gmfBlackBoxY", "specifies the height of the smallest rectangle (the glyph's black box) that completely encloses the glyph")
    POINTFLOAT("gmfptGlyphOrigin", "specifies the x and y coordinates of the upper-left corner of the smallest rectangle that completely encloses the glyph")
    FLOAT("gmfCellIncX", "specifies the horizontal distance from the origin of the current character cell to the origin of the next character cell")
    FLOAT("gmfCellIncY", "specifies the vertical distance from the origin of the current character cell to the origin of the next character cell")
}
val LPGLYPHMETRICSFLOAT = GLYPHMETRICSFLOAT.p("LPGLYPHMETRICSFLOAT")*/

val POINT = struct(Module.CORE_WINDOWS, "POINT") {
    documentation = "Defines the x- and y- coordinates of a point."

    LONG("x", "the x-coordinate of the point")
    LONG("y", "the y-coordinate of the point")
}
val LPPOINT = typedef(POINT.p, "LPPOINT")

val RECT = struct(Module.CORE_WINDOWS, "RECT") {
    documentation = "Defines the coordinates of the upper-left and lower-right corners of a rectangle."

    LONG("left", "the x-coordinate of the upper-left corner of the rectangle")
    LONG("top", "the y-coordinate of the upper-left corner of the rectangle")
    LONG("right", "the x-coordinate of the lower-right corner of the rectangle")
    LONG("bottom", "the y-coordinate of the lower-right corner of the rectangle")
}
val LPRECT = typedef(RECT.p, "LPRECT")

val MSG = struct(Module.CORE_WINDOWS, "MSG") {
    documentation = "Contains message information from a thread's message queue."

    nullable..HWND(
        "hwnd",
        "a handle to the window whose window procedure receives the message. This member is #NULL when the message is a thread message."
    )
    UINT("message", "the message identifier. Applications can only use the low word; the high word is reserved by the system.")
    WPARAM("wParam", "additional information about the message. The exact meaning depends on the value of the message member.")
    LPARAM("lParam", "additional information about the message. The exact meaning depends on the value of the message member.")
    DWORD("time", "the time at which the message was posted")
    POINT("pt", "the cursor position, in screen coordinates, when the message was posted.")
}
val LPMSG = typedef(MSG.p, "LPMSG")

val PIXELFORMATDESCRIPTOR = struct(Module.CORE_WINDOWS, "PIXELFORMATDESCRIPTOR") {
    documentation = "Describes the pixel format of a drawing surface."

    WORD("nSize", "specifies the size of this data structure. This value should be set to PIXELFORMATDESCRIPTOR#SIZEOF.")
    WORD("nVersion", "specifies the version of this data structure. This value should be set to 1")
    DWORD("dwFlags", "a set of bit flags that specify properties of the pixel buffer")
    BYTE("iPixelType", "specifies the type of pixel data")
    BYTE(
        "cColorBits",
        """
        specifies the number of color bitplanes in each color buffer. For RGBA pixel types, it is the size of the color buffer, excluding the alpha bitplanes.
        For color-index pixels, it is the size of the color-index buffer.
        """
    )
    BYTE("cRedBits", "specifies the number of red bitplanes in each RGBA color buffer")
    BYTE("cRedShift", "specifies the shift count for red bitplanes in each RGBA color buffer")
    BYTE("cGreenBits", "specifies the number of green bitplanes in each RGBA color buffer")
    BYTE("cGreenShift", "specifies the shift count for green bitplanes in each RGBA color buffer")
    BYTE("cBlueBits", "specifies the number of blue bitplanes in each RGBA color buffer")
    BYTE("cBlueShift", "specifies the shift count for blue bitplanes in each RGBA color buffer")
    BYTE("cAlphaBits", "specifies the number of alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported")
    BYTE("cAlphaShift", "specifies the shift count for alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported")
    BYTE("cAccumBits", "specifies the total number of bitplanes in the accumulation buffer")
    BYTE("cAccumRedBits", "specifies the number of red bitplanes in the accumulation buffer")
    BYTE("cAccumGreenBits", "specifies the number of green bitplanes in the accumulation buffer")
    BYTE("cAccumBlueBits", "specifies the number of blue bitplanes in the accumulation buffer")
    BYTE("cAccumAlphaBits", "specifies the number of alpha bitplanes in the accumulation buffer")
    BYTE("cDepthBits", "specifies the depth of the depth (z-axis) buffer")
    BYTE("cStencilBits", "specifies the depth of the stencil buffer")
    BYTE("cAuxBuffers", "specifies the number of auxiliary buffers. Auxiliary buffers are not supported")
    BYTE("iLayerType", "Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.")
    BYTE(
        "bReserved",
        """
        specifies the number of overlay and underlay planes. Bits 0 through 3 specify up to 15 overlay planes and bits 4 through 7 specify up to 15 underlay
        planes
        """
    )
    DWORD("dwLayerMask", "Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.")
    DWORD(
        "dwVisibleMask",
        """
        specifies the transparent color or index of an underlay plane. When the pixel type is RGBA, {@code dwVisibleMask} is a transparent RGB color value.
        When the pixel type is color index, it is a transparent index value.
        """
    )
    DWORD("dwDamageMask", "Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.")
}
val LPPIXELFORMATDESCRIPTOR = typedef(PIXELFORMATDESCRIPTOR.p, "LPPIXELFORMATDESCRIPTOR")

val WNDPROC = Module.CORE_WINDOWS.callback {
    LRESULT(
        "WindowProc",
        "Will be called for each message sent to the window.",

        HWND("hwnd", "a handle to the window procedure that received the message"),
        UINT("uMsg", "the message"),
        WPARAM("wParam", "additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter."),
        LPARAM("lParam", "additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter."),

        nativeType = "WNDPROC"
    ) {
        documentation = "An application-defined function that processes messages sent to a window."
    }
}

val WNDCLASSEX = struct(Module.CORE_WINDOWS, "WNDCLASSEX") {
    documentation = "Contains the window class attributes that are registered by the #RegisterClassEx() function."

    UINT("cbSize", "the size, in bytes, of this structure")
    UINT("style", "the class style(s)")
    WNDPROC("lpfnWndProc", "a pointer to the window procedure")
    int("cbClsExtra", "the number of extra bytes to allocate following the window-class structure. The system initializes the bytes to zero.")
    int("cbWndExtra", "the number of extra bytes to allocate following the window instance. The system initializes the bytes to zero.")
    HINSTANCE("hInstance", "a handle to the instance that contains the window procedure for the class")
    nullable..HICON(
        "hIcon",
        "a handle to the class icon. This member must be a handle to an icon resource. If this member is #NULL, the system provides a default icon."
    )
    nullable..HCURSOR(
        "hCursor",
        """
        a handle to the class cursor. This member must be a handle to a cursor resource. If this member is #NULL, an application must explicitly set the cursor
        shape whenever the mouse moves into the application's window.
        """
    )
    nullable..HBRUSH(
        "hbrBackground",
        """
        a handle to the class background brush. This member can be a handle to the brush to be used for painting the background, or it can be a color value.
        When this member is #NULL, an application must paint its own background whenever it is requested to paint in its client area.
        """
    )
    nullable..LPCTSTR(
        "lpszMenuName",
        """
        pointer to a null-terminated character string that specifies the resource name of the class menu, as the name appears in the resource file.  If this
        member is #NULL, windows belonging to this class have no default menu.
        """
    )
    LPCTSTR("lpszClassName", "a pointer to a null-terminated string or is an atom")
    nullable..HICON(
        "hIconSm",
        """
        a handle to a small icon that is associated with the window class. If this member is #NULL, the system searches the icon resource specified by the
        {@code hIcon} member for an icon of the appropriate size to use as the small icon.
        """
    )
}

val WINDOWPLACEMENT = struct(Module.CORE_WINDOWS, "WINDOWPLACEMENT") {
    documentation = "Contains information about the placement of a window on the screen."

    UINT(
        "length",
        """
        the length of the structure, in bytes. Before calling the #GetWindowPlacement() or #SetWindowPlacement() functions, set this member to
        WINDOWPLACEMENT#SIZEOF.
        """
    )
    UINT(
        "flags",
        "the flags that control the position of the minimized window and the method by which the window is restored. This member can be one or more of the" +
        "following values:<br>#WPF_SETMINPOSITION #WPF_RESTORETOMAXIMIZED #WPF_ASYNCWINDOWPLACEMENT"
    )
    UINT("showCmd", "the current show state of the window")
    POINT("ptMinPosition", "the coordinates of the window's upper-left corner when the window is minimized")
    POINT("ptMaxPosition", "the coordinates of the window's upper-left corner when the window is maximized")
    RECT("rcNormalPosition", "the window's coordinates when the window is in the restored position")
}

val TOUCHINPUT = struct(Module.CORE_WINDOWS, "TOUCHINPUT", mutable = false) {
    documentation = "Encapsulates data for touch input."

    LONG(
        "x",
        "the x-coordinate (horizontal point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates."
    )
    LONG("y", "the y-coordinate (vertical point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates.")
    HANDLE("hSource", "a device handle for the source input device. Each device is given a unique provider at run time by the touch input provider.")
    DWORD(
        "dwID",
        """
        a touch point identifier that distinguishes a particular touch input. This value stays consistent in a touch contact sequence from the point a contact
        comes down until it comes back up. An ID may be reused later for subsequent contacts.
        """
    )
    DWORD(
        "dwFlags",
        """
        a set of bit flags that specify various aspects of touch point press, release, and motion. The bits in this member can be any reasonable combination of
        the values in the Remarks section.
        """
    )
    DWORD(
        "dwMask",
        """
        a set of bit flags that specify which of the optional fields in the structure contain valid values. The availability of valid information in the
        optional fields is device-specific. Applications should use an optional field value only when the corresponding bit is set in {@code dwMask}. This
        field may contain a combination of the {@code dwMask} flags mentioned in the Remarks section.
        """
    )
    DWORD(
        "dwTime",
        """
        the time stamp for the event, in milliseconds. The consuming application should note that the system performs no validation on this field; when the
        #TOUCHINPUTMASKF_TIMEFROMSYSTEM flag is not set, the accuracy and sequencing of values in this field are completely dependent on the touch input
        provider.
        """
    )
    ULONG_PTR("dwExtraInfo", "an additional value associated with the touch event.")
    DWORD(
        "cxContact",
        """
        the width of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
        the #TOUCHINPUTMASKF_CONTACTAREA flag set.
        """
    )
    DWORD(
        "cyContact",
        """
        the height of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
        the #TOUCHINPUTMASKF_CONTACTAREA flag set.
        """
    )
}
val PTOUCHINPUT = typedef(TOUCHINPUT.p, "PTOUCHINPUT")

val MONITORINFOEX = struct(Module.CORE_WINDOWS, "MONITORINFOEX", mutable = false) {
    documentation = "Contains information about a display monitor."

    DWORD(
        "cbSize",
        """
        the size, in bytes, of the structure.

        Set this member to MONITORINFOEX#SIZEOF before calling the #GetMonitorInfo() function. Doing so lets the function determine the type of structure you
        are passing to it.
        """
    ).mutable()
    RECT(
        "rcMonitor",
        """
        a ##RECT structure that specifies the display monitor rectangle, expressed in virtual-screen coordinates. Note that if the monitor is not the primary
        display monitor, some of the rectangle's coordinates may be negative values.
        """
    )
    RECT(
        "rcWork",
        """
        a ##RECT structure that specifies the work area rectangle of the display monitor that can be used by applications, expressed in virtual-screen
        coordinates. Windows uses this rectangle to maximize an application on the monitor. The rest of the area in {@code rcMonitor} contains system windows
        such as the task bar and side bars. Note that if the monitor is not the primary display monitor, some of the rectangle's coordinates may be negative
        values.
        """
    )
    DWORD("dwFlags", "the attributes of the display monitor. May be:<br>#MONITORINFOF_PRIMARY")
    TCHAR("szDevice", "a string that specifies the device name of the monitor being used")[32]
}
val LPMONITORINFOEX = typedef(MONITORINFOEX.p, "LPMONITORINFOEX")

val POINTL = struct(Module.CORE_WINDOWS, "POINTL") {
    documentation = "Contains the coordinates of a point."

    LONG("x", "the horizontal (x) coordinate of the point")
    LONG("y", "the vertical (y) coordinate of the point.")
}

val DEVMODE = struct(Module.CORE_WINDOWS, "DEVMODE", mutable = false) {
    documentation = "Contains information about the initialization and environment of a printer or a display device."

    TCHAR(
        "dmDeviceName",
        """
        A zero-terminated character array that specifies the "friendly" name of the printer or display; for example, "PCL/HP LaserJet" in the case of PCL/HP
        LaserJet. This string is unique among device drivers. Note that this name may be truncated to fit in the {@code dmDeviceName} array.
        """
    )[32]
    WORD(
        "dmSpecVersion",
        """
        the version number of the initialization data specification on which the structure is based. To ensure the correct version is used for any operating
        system, use #DM_SPECVERSION.
        """
    ).mutable()
    WORD("dmDriverVersion", "the driver version number assigned by the driver developer")
    WORD(
        "dmSize",
        """
        specifies the size, in bytes, of the {@code DEVMODE} structure, not including any private driver-specific data that might follow the structure's
        public members. Set this member to DEVMODE#SIZEOF to indicate the version of the {@code DEVMODE} structure being used.
        """
    ).mutable()
    WORD(
        "dmDriverExtra",
        """
        contains the number of bytes of private driver-data that follow this structure. If a device driver does not use device-specific information, set this
        member to zero.
        """
    ).mutable()
    DWORD(
        "dmFields",
        """
        specifies whether certain members of the {@code DEVMODE} structure have been initialized. If a member is initialized, its corresponding bit is set
        otherwise the bit is clear. A driver supports only those {@code DEVMODE} members that are appropriate for the printer or display technology.
        """
    )

    val PRINTER_ONLY = "for printer devices only"
    union {
        struct {
            short("dmOrientation", PRINTER_ONLY)
            short("dmPaperSize", PRINTER_ONLY)
            short("dmPaperLength", PRINTER_ONLY)
            short("dmPaperWidth", PRINTER_ONLY)
            short("dmScale", PRINTER_ONLY)
            short("dmCopies", PRINTER_ONLY)
            short("dmDefaultSource", PRINTER_ONLY)
            short("dmPrintQuality", PRINTER_ONLY)
        }
        struct {
            POINTL(
                "dmPosition",
                """
                for display devices only, a ##POINTL structure that indicates the positional coordinates of the display device in reference to the desktop
                area. The primary display device is always located at coordinates (0,0).
                """
            )
            DWORD(
                "dmDisplayOrientation",
                """
                for display devices only, the orientation at which images should be presented. If #DM_DISPLAYORIENTATION is not set, this member must be
                zero. If #DM_DISPLAYORIENTATION is set, this member must be one of the following values:<br>#DMDO_DEFAULT, #DMDO_90, #DMDO_180, #DMDO_270

                To determine whether the display orientation is portrait or landscape orientation, check the ratio of {@code dmPelsWidth} to
                {@code dmPelsHeight}.
                """
            )
            DWORD(
                "dmDisplayFixedOutput",
                """
                for fixed-resolution display devices only, how the display presents a low-resolution mode on a higher-resolution display. For example, if a
                display device's resolution is fixed at 1024 x 768 pixels but its mode is set to 640 x 480 pixels, the device can either display a 640 x 480
                image somewhere in the interior of the 1024 x 768 screen space or stretch the 640 x 480 image to fill the larger screen space. If
                #DM_DISPLAYFIXEDOUTPUT is not set, this member must be zero. If #DM_DISPLAYFIXEDOUTPUT is set, this member must be one of the
                following values:<br>#DMDFO_DEFAULT, #DMDFO_CENTER, #DMDFO_STRETCH
                """
            )
        }
    }
    short("dmColor", PRINTER_ONLY)
    short("dmDuplex", PRINTER_ONLY)
    short("dmYResolution", PRINTER_ONLY)
    short("dmTTOption", PRINTER_ONLY)
    short("dmCollate", PRINTER_ONLY)
    TCHAR("dmFormName", PRINTER_ONLY)[32]

    WORD("dmLogPixels", "the number of pixels per logical inch")
    DWORD(
        "dmBitsPerPel",
        """
        specifies the color resolution, in bits per pixel, of the display device (for example: 4 bits for 16 colors, 8 bits for 256 colors, or 16 bits for
        65,536 colors)
        """
    )
    DWORD("dmPelsWidth", "specifies the width, in pixels, of the visible device surface")
    DWORD("dmPelsHeight", "specifies the height, in pixels, of the visible device surface")
    union {
        DWORD("dmDisplayFlags", "specifies the device's display mode, one or more of:<br>#DM_INTERLACED, #DMDISPLAYFLAGS_TEXTMODE")
        DWORD("dmNup", PRINTER_ONLY)
    }
    DWORD(
        "dmDisplayFrequency",
        """
        specifies the frequency, in hertz (cycles per second), of the display device in a particular mode. This value is also known as the display device's
        vertical refresh rate.

        When you call the #EnumDisplaySettingsEx() function, the {@code dmDisplayFrequency} member may return with the value 0 or 1. These values
        represent the display hardware's default refresh rate. This default rate is typically set by switches on a display card or computer motherboard, or by
        a configuration program that does not use display functions such as {@code ChangeDisplaySettingsEx}.
        """
    )
    DWORD("dmICMMethod", PRINTER_ONLY)
    DWORD("dmICMIntent", PRINTER_ONLY)
    DWORD("dmMediaType", PRINTER_ONLY)
    DWORD("dmDitherType", PRINTER_ONLY)

    DWORD("dmReserved1", "not used; must be zero")
    DWORD("dmReserved2", "not used; must be zero")

    DWORD("dmPanningWidth", "this member must be zero")
    DWORD("dmPanningHeight", "this member must be zero")
}

val DISPLAY_DEVICE = struct(Module.CORE_WINDOWS, "DISPLAY_DEVICE", mutable = false) {
    documentation =
        """
        Receives information about the display device specified by the {@code iDevNum} parameter of the #EnumDisplayDevices() function.

        The four string members are set based on the parameters passed to {@code EnumDisplayDevices}. If the {@code lpDevice} param is #NULL, then
        {@code DISPLAY_DEVICE} is filled in with information about the display adapter(s). If it is a valid device name, then it is filled in with information
        about the monitor(s) for that device.
        """

    DWORD(
        "cb",
        "size, in bytes, of the {@code DISPLAY_DEVICE} structure. This must be initialized prior to calling #EnumDisplayDevices()."
    ).mutable()
    TCHAR("DeviceName", "an array of characters identifying the device name. This is either the adapter device or the monitor device.")[32]
    TCHAR(
        "DeviceString",
        "an array of characters containing the device context string. This is either a description of the display adapter or of the display monitor."
    )[128]
    DWORD("StateFlags", "device state flags")
    TCHAR("DeviceID", "not used")[128]
    TCHAR("DeviceKey", "reserved")[128]
}
val PDISPLAY_DEVICE = typedef(DISPLAY_DEVICE.p, "PDISPLAY_DEVICE")

val SECURITY_ATTRIBUTES = struct(Module.CORE_WINDOWS, "SECURITY_ATTRIBUTES") {
    documentation =
        """
        Contains the security descriptor for an object and specifies whether the handle retrieved by specifying this structure is inheritable. This structure
        provides security settings for objects created by various functions, such as {@code CreateFile}, {@code CreatePipe}, {@code CreateProcess},
        {@code RegCreateKeyEx}, or {@code RegSaveKeyEx}.
        """

    DWORD("nLength", "the size, in bytes, of this structure. Set this value to SECURITY_ATTRIBUTES#SIZEOF.")
    LPVOID(
        "lpSecurityDescriptor",
        """
        a pointer to a {@code SECURITY_DESCRIPTOR} structure that controls access to the object. If the value of this member is #NULL, the object is assigned
        the default security descriptor associated with the access token of the calling process. This is not the same as granting access to everyone by
        assigning a #NULL discretionary access control list (DACL). By default, the default DACL in the access token of a process allows access only to the
        user represented by the access token.
        """
    )
    BOOL(
        "bInheritHandle",
        "specifies whether the returned handle is inherited when a new process is created. If this member is {@code TRUE}, the new process inherits the handle."
    )
}

val MOUSEINPUT = struct(Module.CORE_WINDOWS, "MOUSEINPUT") {
    documentation = "Contains information about a simulated mouse event."

    LONG(
        "dx",
        """
        the absolute position of the mouse, or the amount of motion since the last mouse event was generated, depending on the value of the {@code dwFlags}
        member.
        
        Absolute data is specified as the x coordinate of the mouse; relative data is specified as the number of pixels moved.
        """
    )
    LONG(
        "dy",
        """
        the absolute position of the mouse, or the amount of motion since the last mouse event was generated, depending on the value of the {@code dwFlags}
        member.
        
        Absolute data is specified as the y coordinate of the mouse; relative data is specified as the number of pixels moved.
        """
    )
    DWORD(
        "mouseData",
        """
        If {@code dwFlags} contains #MOUSEEVENTF_WHEEL, then {@code mouseData} specifies the amount of wheel movement. A positive value indicates that the
        wheel was rotated forward, away from the user; a negative value indicates that the wheel was rotated backward, toward the user. One wheel click is
        defined as #WHEEL_DELTA, which is 120.

        Windows Vista: If {@code dwFlags} contains #MOUSEEVENTF_HWHEEL, then {@code dwData} specifies the amount of wheel movement. A positive value indicates
        that the wheel was rotated to the right; a negative value indicates that the wheel was rotated to the left. One wheel click is defined as
        {@code WHEEL_DELTA}, which is 120.

        If {@code dwFlags} does not contain #MOUSEEVENTF_WHEEL, #MOUSEEVENTF_XDOWN, or #MOUSEEVENTF_XUP, then {@code mouseData} should be zero.

        If {@code dwFlags} contains #MOUSEEVENTF_XDOWN or #MOUSEEVENTF_XUP, then {@code mouseData} specifies which X buttons were pressed or released. This
        value may be any combination of the following flags: #XBUTTON1, #XBUTTON2
        """
    ).links("XBUTTON\\w+")
    DWORD(
        "dwFlags",
        """
        A set of bit flags that specify various aspects of mouse motion and button clicks.

        The bit flags that specify mouse button status are set to indicate changes in status, not ongoing conditions. For example, if the left mouse button is
        pressed and held down, #MOUSEEVENTF_LEFTDOWN is set when the left button is first pressed, but not for subsequent motions. Similarly,
        #MOUSEEVENTF_LEFTUP is set only when the button is first released.

        You cannot specify both the #MOUSEEVENTF_WHEEL flag and either #MOUSEEVENTF_XDOWN or #MOUSEEVENTF_XUP flags simultaneously in the {@code dwFlags}
        parameter, because they both require use of the {@code mouseData} field.
        """
    ).links("MOUSEEVENTF_\\w+")
    DWORD("time", "the time stamp for the event, in milliseconds. If this parameter is 0, the system will provide its own time stamp.")
    ULONG_PTR(
        "dwExtraInfo",
        "an additional value associated with the mouse event. An application calls #GetMessageExtraInfo() to obtain this extra information."
    )
}

val KEYBDINPUT = struct(Module.CORE_WINDOWS, "KEYBDINPUT") {
    documentation = "Contains information about a simulated keyboard event."

    WORD(
        "wVk",
        """
        A virtual-key code.
        
        The code must be a value in the range 1 to 254. If the {@code dwFlags} member specifies #KEYEVENTF_UNICODE, {@code wVk} must be 0.
        """
    )
    WORD(
        "wScan",
        """
        A hardware scan code for the key.
        
        If {@code dwFlags} specifies #KEYEVENTF_UNICODE, {@code wScan} specifies a Unicode character which is to be sent to the foreground application.
        """
    )
    DWORD("dwFlags", "specifies various aspects of a keystroke").links("KEYEVENTF_\\w+")
    DWORD("time", "the time stamp for the event, in milliseconds. If this parameter is zero, the system will provide its own time stamp.")
    ULONG_PTR("dwExtraInfo", "an additional value associated with the keystroke. Use the #GetMessageExtraInfo() function to obtain this information.")
}

val HARDWAREINPUT = struct(Module.CORE_WINDOWS, "HARDWAREINPUT") {
    documentation = "Contains information about a simulated message generated by an input device other than a keyboard or mouse."

    DWORD("uMsg", "the message generated by the input hardware")
    WORD("wParamL", "the low-order word of the {@code lParam} parameter for {@code uMsg}")
    WORD("wParamH", "the high-order word of the {@code lParam} parameter for {@code uMsg}")
}

val INPUT = struct(Module.CORE_WINDOWS, "INPUT") {
    documentation = "Used by #SendInput() to store information for synthesizing input events such as keystrokes, mouse movement, and mouse clicks."

    DWORD("type", "the type of the input event").links("INPUT_\\w+")
    union {
        MOUSEINPUT("mi", "the information about a simulated mouse event")
        KEYBDINPUT("ki", "the information about a simulated keyboard event")
        HARDWAREINPUT("hi", "the information about a simulated hardware event")
    }("DUMMYUNIONNAME", "")
}
val LPINPUT = typedef(INPUT.p, "PINPUT")