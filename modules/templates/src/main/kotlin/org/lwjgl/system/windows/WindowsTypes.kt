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

val TCHAR = CharType("TCHAR", CharMapping.UTF16)

val LPCTSTR = CharSequenceType(
	name = "LPCTSTR",
	includesPointer = true,
	charMapping = CharMapping.UTF16,
	nullTerminated = true
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
	nativeImport ("WindowsLWJGL.h")
	FLOAT.member("x")
	FLOAT.member("y")
}.nativeType

val LPGLYPHMETRICSFLOAT = StructType(
	name = "LPGLYPHMETRICSFLOAT",
	includesPointer = true,
	definition = struct(WINDOWS_PACKAGE, "GLYPHMETRICSFLOAT", mutable = false) {
		documentation = "Contains information about the placement and orientation of a glyph in a character cell."
		nativeImport ("WindowsLWJGL.h")
		FLOAT.member("gmfBlackBoxX", "blackBoxX")
		FLOAT.member("gmfBlackBoxY", "blockBoxY")
		POINTFLOAT.member("gmfptGlyphOrigin", "glyphOrigin")
		FLOAT.member("gmfCellIncX", "cellIncX")
		FLOAT.member("gmfCellIncY", "cellIncY")
	}
)

private val POINT_STRUCT = struct(WINDOWS_PACKAGE, "POINT") {
		documentation = "Defines the x- and y- coordinates of a point."
		nativeImport ("WindowsLWJGL.h")
		LONG.member("x")
		LONG.member("y")
	}
val LPPOINT = StructType(name = "LPPOINT", definition = POINT_STRUCT, includesPointer = true)

private val RECT_STRUCT = struct(WINDOWS_PACKAGE, "RECT") {
	documentation = "Defines the coordinates of the upper-left and lower-right corners of a rectangle."
	nativeImport ("WindowsLWJGL.h")
	LONG.member("left")
	LONG.member("top")
	LONG.member("right")
	LONG.member("bottom")
}
val RECT = RECT_STRUCT.nativeType

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
val PIXELFORMATDESCRIPTOR_p = PIXELFORMATDESCRIPTOR.p