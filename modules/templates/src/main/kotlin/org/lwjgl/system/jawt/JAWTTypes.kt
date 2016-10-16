/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.system.jawt

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*
import org.lwjgl.system.windows.*

val JAWT_PACKAGE = "org.lwjgl.system.jawt"

val JAWT_Rectangle = struct(JAWT_PACKAGE, "JAWTRectangle", nativeName = "JAWT_Rectangle") {
	documentation = "Structure for a native rectangle."

	jint.member("x", "the rectangle X axis coordinate")
	jint.member("y", "the rectangle Y axis coordinate")
	jint.member("width", "the rectangle width")
	jint.member("height", "the rectangle height")
}
val JAWT_Rectangle_p = JAWT_Rectangle.p

val JAWT_DrawingSurface_p = struct(JAWT_PACKAGE, "JAWTDrawingSurface", nativeName = "JAWT_DrawingSurface", mutable = false) {
	documentation =
		"""
		Structure for containing the underlying drawing information of a component.

		All operations on a JAWT_DrawingSurface MUST be performed from the same thread as the call to {@code GetDrawingSurface}.
		"""

	JNIEnv_p.member(
		"env",
		"""
		Cached reference to the Java environment of the calling thread.

        If Lock(), Unlock(), GetDrawingSurfaceInfo() or FreeDrawingSurfaceInfo() are called from a different thread, this data member should be set before
        calling those functions.
		"""
	)
	jobject_p.member("target", "Cached reference to the target object.")
	voidptr.member("Lock", "")
	voidptr.member("GetDrawingSurfaceInfo", "")
	voidptr.member("FreeDrawingSurfaceInfo", "")
	voidptr.member("Unlock", "")
}.p

val JAWT_DrawingSurfaceInfo_p = struct(JAWT_PACKAGE, "JAWTDrawingSurfaceInfo", nativeName = "JAWT_DrawingSurfaceInfo", mutable = false) {
	voidptr.member(
		"platformInfo",
		"""
		Pointer to the platform-specific information. This can be safely cast to a {@code JAWT_Win32DrawingSurfaceInfo} on Windows or a
		{@code JAWT_X11DrawingSurfaceInfo} on Solaris. On Mac OS X this is a pointer to a {@code NSObject} that conforms to the {@code JAWT_SurfaceLayers}
		protocol.
		"""
	)
	JAWT_DrawingSurface_p.member("ds", "Cached pointer to the underlying drawing surface.")
	JAWT_Rectangle.member("bounds", "Bounding rectangle of the drawing surface.")
	AutoSize("clip")..jint.member("clipSize", "Number of rectangles in the clip.")
	JAWT_Rectangle_p.buffer("clip", "Clip rectangle array.")
}.p

val JAWT_p = struct(JAWT_PACKAGE, "JAWT") {
	documentation = "Structure for containing native AWT functions."

	jint.member("version", "Version of this structure. This must always be set before calling JAWT_GetAWT()")
	nullable..voidptr.member("GetDrawingSurface", "")
	nullable..voidptr.member("FreeDrawingSurface", "")
	nullable..voidptr.member("Lock", "")
	nullable..voidptr.member("Unlock", "")
	nullable..voidptr.member("GetComponent", "")
	nullable..voidptr.member("CreateEmbeddedFrame", "")
	nullable..voidptr.member("SetBounds", "")
	nullable..voidptr.member("SynthesizeWindowActivation", "")
}.p

val Component = NativeType("jobject", TypeMapping("jobject", java.awt.Component::class.java, java.awt.Component::class.java))
val Frame = NativeType("jobject", TypeMapping("jobject", java.awt.Frame::class.java, java.awt.Frame::class.java))

fun config() {
	packageInfo(
		JAWT_PACKAGE,
		"Contains bindings to the AWT native interface (jawt.h)."
	)

	struct(JAWT_PACKAGE, "JAWTX11DrawingSurfaceInfo", nativeName = "JAWT_X11DrawingSurfaceInfo", mutable = false) {
		documentation = "X11-specific declarations for AWT native interface."

		Drawable.member("drawable", "the drawable")
		Display_p.member("display", "the connection to the X server")
		VisualID.member("visualID", "the VisualID")
		Colormap.member("colormapID", "the colormap")
		int.member("depth", "the depth")
	}

	struct(JAWT_PACKAGE, "JAWTWin32DrawingSurfaceInfo", nativeName = "JAWT_Win32DrawingSurfaceInfo", mutable = false) {
		javaImport("org.lwjgl.system.windows.User32")

		documentation = "Win32-specific declarations for AWT native interface."

		union {
			HWND.member("hwnd", "the native window handle")
			HBITMAP.member("hbitmap", "the DDB handle")
			void_p.member("pbits", "the DIB handle")
		}
		HDC.member(
			"hdc",
			"the device context handle. This HDC should always be used instead of the HDC returned from {@code BeginPaint()} or any calls to User32#GetDC()."
		)
		HPALETTE.member("hpalette", "the palette handle")
	}
}