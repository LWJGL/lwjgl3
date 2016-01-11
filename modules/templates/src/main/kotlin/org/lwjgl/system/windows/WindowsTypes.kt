/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.windows

import org.lwjgl.generator.*

val WINDOWS_PACKAGE = "org.lwjgl.system.windows"

fun config() {
	packageInfo(
		WINDOWS_PACKAGE,
		"Contains bindings to native APIs specific to the Windows operating system."
	)
}

val SaveLastError = Code(nativeAfterCall = "\tsaveLastError();")

// UNICODE is defined WindowsLWJGL.h, so all T* types below are UTF16.

val VOID = NativeType("VOID", TypeMapping.VOID)

val HANDLE = "HANDLE".opaque_p
val HANDLE_p = HANDLE.p

val BOOL = PrimitiveType("BOOL", PrimitiveMapping.INT)
val BYTE = IntegerType("BYTE", PrimitiveMapping.BYTE)
val WORD = IntegerType("WORD", PrimitiveMapping.SHORT)
val SHORT = IntegerType("SHORT", PrimitiveMapping.SHORT)
val UINT = IntegerType("UINT", PrimitiveMapping.INT, unsigned = true)
val DWORD = IntegerType("DWORD", PrimitiveMapping.INT)
val LONG = IntegerType("LONG", PrimitiveMapping.INT)
val ULONG = IntegerType("ULONG", PrimitiveMapping.INT, unsigned = true)
val FLOAT = PrimitiveType("FLOAT", PrimitiveMapping.FLOAT)

val ATOM = PrimitiveType("ATOM", PrimitiveMapping.SHORT)

val UINT_p = UINT.p
val FLOAT_p = FLOAT.p
val PULONG = ULONG.p("PULONG")

val UINT_PTR = PrimitiveType("UINT_PTR", PrimitiveMapping.POINTER)
val LONG_PTR = PrimitiveType("LONG_PTR", PrimitiveMapping.POINTER)
val ULONG_PTR = PrimitiveType("ULONG_PTR", PrimitiveMapping.POINTER)

val LRESULT = typedef(LONG_PTR, "LRESULT")
val WPARAM = typedef(UINT_PTR, "WPARAM")
val LPARAM = typedef(LONG_PTR, "LPARAM")

val CHAR = CharType("CHAR", CharMapping.ASCII)
val TCHAR = CharType("TCHAR", CharMapping.UTF16)

val LPCTSTR = CharSequenceType(
	name = "LPCTSTR",
	includesPointer = true,
	charMapping = CharMapping.UTF16
)

val LPCSTR = CharSequenceType("LPCSTR", includesPointer = true)
val FARPROC = "FARPROC".opaque_p
val PROC = "PROC".opaque_p
val LPVOID = "LPVOID".opaque_p

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

val POINTFLOAT = struct(WINDOWS_PACKAGE, "POINTFLOAT") {
	documentation = "Contains the x and y coordinates of a point."

	FLOAT.member("x", "specifies the horizontal (x) coordinate of a point")
	FLOAT.member("y", "specifies the vertical (y) coordinate of a point")
}.nativeType

val GLYPHMETRICSFLOAT = struct(WINDOWS_PACKAGE, "GLYPHMETRICSFLOAT", mutable = false) {
	documentation = "Contains information about the placement and orientation of a glyph in a character cell."

	FLOAT.member("gmfBlackBoxX", "specifies the width of the smallest rectangle (the glyph's black box) that completely encloses the glyph")
	FLOAT.member("gmfBlackBoxY", "specifies the height of the smallest rectangle (the glyph's black box) that completely encloses the glyph")
	POINTFLOAT.member("gmfptGlyphOrigin", "specifies the x and y coordinates of the upper-left corner of the smallest rectangle that completely encloses the glyph")
	FLOAT.member("gmfCellIncX", "specifies the horizontal distance from the origin of the current character cell to the origin of the next character cell")
	FLOAT.member("gmfCellIncY", "specifies the vertical distance from the origin of the current character cell to the origin of the next character cell")
}.nativeType
val LPGLYPHMETRICSFLOAT = GLYPHMETRICSFLOAT.p("LPGLYPHMETRICSFLOAT")

val POINT = struct(WINDOWS_PACKAGE, "POINT") {
	documentation = "Defines the x- and y- coordinates of a point."

	LONG.member("x", "the x-coordinate of the point")
	LONG.member("y", "the y-coordinate of the point")
}.nativeType
val LPPOINT = POINT.p("LPPOINT")

val RECT = struct(WINDOWS_PACKAGE, "RECT") {
	documentation = "Defines the coordinates of the upper-left and lower-right corners of a rectangle."

	LONG.member("left", "the x-coordinate of the upper-left corner of the rectangle")
	LONG.member("top", "the y-coordinate of the upper-left corner of the rectangle")
	LONG.member("right", "the x-coordinate of the lower-right corner of the rectangle")
	LONG.member("bottom", "the y-coordinate of the lower-right corner of the rectangle")
}.nativeType
val LPRECT = RECT.p("LPRECT")

val MSG = struct(WINDOWS_PACKAGE, "MSG") {
	documentation = "Contains message information from a thread's message queue."

	HWND.member("hwnd", "a handle to the window whose window procedure receives the message. This member is $NULL when the message is a thread message.");
	UINT.member("message", "the message identifier. Applications can only use the low word; the high word is reserved by the system.")
	WPARAM.member("wParam", "additional information about the message. The exact meaning depends on the value of the message member.")
	LPARAM.member("lParam", "additional information about the message. The exact meaning depends on the value of the message member.")
	DWORD.member("time", "the time at which the message was posted")
	POINT.member("pt", "the cursor position, in screen coordinates, when the message was posted.")
}.nativeType
val LPMSG = MSG.p("LPMSG")
val MSG_p = MSG.p

val PIXELFORMATDESCRIPTOR = struct(WINDOWS_PACKAGE, "PIXELFORMATDESCRIPTOR") {
	documentation = "Describes the pixel format of a drawing surface."

	WORD.member("nSize", "specifies the size of this data structure. This value should be set to PIXELFORMATDESCRIPTOR#SIZEOF.")
	WORD.member("nVersion", "specifies the version of this data structure. This value should be set to 1")
	DWORD.member("dwFlags", "a set of bit flags that specify properties of the pixel buffer")
	BYTE.member("iPixelType", "specifies the type of pixel data")
	BYTE.member(
		"cColorBits",
		"""
		specifies the number of color bitplanes in each color buffer. For RGBA pixel types, it is the size of the color buffer, excluding the alpha bitplanes.
		For color-index pixels, it is the size of the color-index buffer.
		"""
	)
	BYTE.member("cRedBits", "specifies the number of red bitplanes in each RGBA color buffer")
	BYTE.member("cRedShift", "specifies the shift count for red bitplanes in each RGBA color buffer")
	BYTE.member("cGreenBits", "specifies the number of green bitplanes in each RGBA color buffer")
	BYTE.member("cGreenShift", "specifies the shift count for green bitplanes in each RGBA color buffer")
	BYTE.member("cBlueBits", "specifies the number of blue bitplanes in each RGBA color buffer")
	BYTE.member("cBlueShift", "specifies the shift count for blue bitplanes in each RGBA color buffer")
	BYTE.member("cAlphaBits", "specifies the number of alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported")
	BYTE.member("cAlphaShift", "specifies the shift count for alpha bitplanes in each RGBA color buffer. Alpha bitplanes are not supported")
	BYTE.member("cAccumBits", "specifies the total number of bitplanes in the accumulation buffer")
	BYTE.member("cAccumRedBits", "specifies the number of red bitplanes in the accumulation buffer")
	BYTE.member("cAccumGreenBits", "specifies the number of green bitplanes in the accumulation buffer")
	BYTE.member("cAccumBlueBits", "specifies the number of blue bitplanes in the accumulation buffer")
	BYTE.member("cAccumAlphaBits", "specifies the number of alpha bitplanes in the accumulation buffer")
	BYTE.member("cDepthBits", "specifies the depth of the depth (z-axis) buffer")
	BYTE.member("cStencilBits", "specifies the depth of the stencil buffer")
	BYTE.member("cAuxBuffers", "specifies the number of auxiliary buffers. Auxiliary buffers are not supported")
	BYTE.member("iLayerType", "Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.")
	BYTE.member(
		"bReserved",
		"""
		specifies the number of overlay and underlay planes. Bits 0 through 3 specify up to 15 overlay planes and bits 4 through 7 specify up to 15 underlay
		planes
		"""
	)
	DWORD.member("dwLayerMask", "Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.")
	DWORD.member(
		"dwVisibleMask",
		"""
		specifies the transparent color or index of an underlay plane. When the pixel type is RGBA, {@code dwVisibleMask} is a transparent RGB color value.
		When the pixel type is color index, it is a transparent index value.
		"""
	)
	DWORD.member("dwDamageMask", "Ignored. Earlier implementations of OpenGL used this member, but it is no longer used.")
}.nativeType
val LPPIXELFORMATDESCRIPTOR = PIXELFORMATDESCRIPTOR.p("LPPIXELFORMATDESCRIPTOR")
val PIXELFORMATDESCRIPTOR_p = PIXELFORMATDESCRIPTOR.p

val WNDPROC = "WNDPROC".callback(
	WINDOWS_PACKAGE, LRESULT, "WindowProc",
	"Will be called for each message sent to the window.",
	HWND.IN("hwnd", "a handle to the window procedure that received the message"),
	UINT.IN("uMsg", "the message"),
	WPARAM.IN("wParam", "additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter."),
	LPARAM.IN("lParam", "additional message information. The content of this parameter depends on the value of the {@code uMsg} parameter.")
) {
	documentation = "An application-defined function that processes messages sent to a window."
	useSystemCallConvention()
}

val WNDCLASSEX_p = struct_p(WINDOWS_PACKAGE, "WNDCLASSEX") {
	documentation = "Contains the window class attributes that are registered by the User32#RegisterClassEx() function."

	UINT.member("cbSize", "")
	UINT.member("style", "")
	WNDPROC.member("lpfnWndProc", "")
	int.member("cbClsExtra", "")
	int.member("cbWndExtra", "")
	HINSTANCE.member("hInstance", "")
	HICON.member("hIcon", "")
	HCURSOR.member("hCursor", "")
	HBRUSH.member("hbrBackground", "")
	LPCTSTR.member("lpszMenuName", "")
	LPCTSTR.member("lpszClassName", "")
	HICON.member("hIconSm", "")
}

val TOUCHINPUT = struct(WINDOWS_PACKAGE, "TOUCHINPUT", mutable = false) {
	documentation = "Encapsulates data for touch input."

	LONG.member(
		"x",
		"the x-coordinate (horizontal point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates."
	)
	LONG.member("y", "the y-coordinate (vertical point) of the touch input. This member is indicated in hundredths of a pixel of physical screen coordinates.")
	HANDLE.member("hSource", "a device handle for the source input device. Each device is given a unique provider at run time by the touch input provider.")
	DWORD.member(
		"dwID",
		"""
		a touch point identifier that distinguishes a particular touch input. This value stays consistent in a touch contact sequence from the point a contact
		comes down until it comes back up. An ID may be reused later for subsequent contacts.
		"""
	)
	DWORD.member(
		"dwFlags",
		"""
		a set of bit flags that specify various aspects of touch point press, release, and motion. The bits in this member can be any reasonable combination of
		the values in the Remarks section.
		"""
	)
	DWORD.member(
		"dwMask",
		"""
		a set of bit flags that specify which of the optional fields in the structure contain valid values. The availability of valid information in the
		optional fields is device-specific. Applications should use an optional field value only when the corresponding bit is set in {@code dwMask}. This
		field may contain a combination of the {@code dwMask} flags mentioned in the Remarks section.
		"""
	)
	DWORD.member(
		"dwTime",
		"""
		the time stamp for the event, in milliseconds. The consuming application should note that the system performs no validation on this field; when the
		User32#TOUCHINPUTMASKF_TIMEFROMSYSTEM flag is not set, the accuracy and sequencing of values in this field are completely dependent on the touch input
		provider.
		"""
	)
	ULONG_PTR.member("dwExtraInfo", "an additional value associated with the touch event.")
	DWORD.member(
		"cxContact",
		"""
		the width of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
		the User32#TOUCHEVENTFMASK_CONTACTAREA flag set.
		"""
	)
	DWORD.member(
		"cyContact",
		"""
		the height of the touch contact area in hundredths of a pixel in physical screen coordinates. This value is only valid if the {@code dwMask} member has
		the User32#TOUCHEVENTFMASK_CONTACTAREA flag set.
		"""
	)
}.nativeType
val PTOUCHINPUT = TOUCHINPUT.p("PTOUCHINPUT")