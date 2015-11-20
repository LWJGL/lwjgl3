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

val BOOL = PrimitiveType("BOOL", PrimitiveMapping.INT) // Not boolean because of WinUser#GetMessage
val BYTE = IntegerType("BYTE", PrimitiveMapping.BYTE)
val WORD = IntegerType("WORD", PrimitiveMapping.SHORT)
val SHORT = IntegerType("SHORT", PrimitiveMapping.SHORT)
val UINT = IntegerType("UINT", PrimitiveMapping.INT, unsigned = true)
val DWORD = IntegerType("DWORD", PrimitiveMapping.INT)
val LONG = IntegerType("LONG", PrimitiveMapping.INT)
val FLOAT = PrimitiveType("FLOAT", PrimitiveMapping.FLOAT)

val UINT_p = UINT.p
val FLOAT_p = FLOAT.p

val CHAR = CharType("CHAR", CharMapping.ASCII)
val TCHAR = CharType("TCHAR", CharMapping.UTF16)

val LPCTSTR = CharSequenceType(
	name = "LPCTSTR",
	includesPointer = true,
	charMapping = CharMapping.UTF16
)

val LPCSTR = CharSequenceType("LPCSTR", includesPointer = true)
val HMODULE = "HMODULE".opaque_p
val FARPROC = "FARPROC".opaque_p
val HWND = "HWND".opaque_p
val HDC = "HDC".opaque_p
val HGLRC = "HGLRC".opaque_p
val PROC = "PROC".opaque_p
val LPVOID = "LPVOID".opaque_p

val POINTFLOAT = struct(WINDOWS_PACKAGE, "POINTFLOAT") {
	documentation = "Contains the x and y coordinates of a point."
	nativeImport ("WindowsLWJGL.h")
	FLOAT.member("x", "specifies the horizontal (x) coordinate of a point")
	FLOAT.member("y", "specifies the vertical (y) coordinate of a point")
}.nativeType

val LPGLYPHMETRICSFLOAT = StructType(
	name = "LPGLYPHMETRICSFLOAT",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "GLYPHMETRICSFLOAT", mutable = false) {
		documentation = "Contains information about the placement and orientation of a glyph in a character cell."
		nativeImport ("WindowsLWJGL.h")
		FLOAT.member("gmfBlackBoxX", "specifies the width of the smallest rectangle (the glyph's black box) that completely encloses the glyph")
		FLOAT.member("gmfBlackBoxY", "specifies the height of the smallest rectangle (the glyph's black box) that completely encloses the glyph")
		POINTFLOAT.member("gmfptGlyphOrigin", "specifies the x and y coordinates of the upper-left corner of the smallest rectangle that completely encloses the glyph")
		FLOAT.member("gmfCellIncX", "specifies the horizontal distance from the origin of the current character cell to the origin of the next character cell")
		FLOAT.member("gmfCellIncY", "specifies the vertical distance from the origin of the current character cell to the origin of the next character cell")
	}
)

private val POINT_STRUCT = struct(WINDOWS_PACKAGE, "POINT") {
	documentation = "Defines the x- and y- coordinates of a point."
	nativeImport ("WindowsLWJGL.h")
	LONG.member("x", "the x-coordinate of the point")
	LONG.member("y", "the y-coordinate of the point")
}
val LPPOINT = StructType(name = "LPPOINT", definition = POINT_STRUCT, includesPointer = true)

private val RECT_STRUCT = struct(WINDOWS_PACKAGE, "RECT") {
	documentation = "Defines the coordinates of the upper-left and lower-right corners of a rectangle."
	nativeImport ("WindowsLWJGL.h")
	LONG.member("left", "the x-coordinate of the upper-left corner of the rectangle")
	LONG.member("top", "the y-coordinate of the upper-left corner of the rectangle")
	LONG.member("right", "the x-coordinate of the lower-right corner of the rectangle")
	LONG.member("bottom", "the y-coordinate of the lower-right corner of the rectangle")
}
val RECT = RECT_STRUCT.nativeType

val PIXELFORMATDESCRIPTOR_STRUCT = struct(WINDOWS_PACKAGE, "PIXELFORMATDESCRIPTOR") {
	documentation = "Describes the pixel format of a drawing surface."
	nativeImport ("WindowsLWJGL.h")
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
}
val PIXELFORMATDESCRIPTOR = StructType(PIXELFORMATDESCRIPTOR_STRUCT)
val LPPIXELFORMATDESCRIPTOR = StructType(name = "LPPIXELFORMATDESCRIPTOR", definition = PIXELFORMATDESCRIPTOR_STRUCT, includesPointer = true)
val PIXELFORMATDESCRIPTOR_p = PIXELFORMATDESCRIPTOR.p