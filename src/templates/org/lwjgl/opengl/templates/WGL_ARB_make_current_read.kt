/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_ARB_make_current_read = "WGLARBMakeCurrentRead".nativeClassWGL("WGL_ARB_make_current_read", ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "wgl_make_current_read")} extension.

		The association of a separate "read" and "draw" DC with the current context allows for preprocessing of image data in an "off screen" DC which is then
		read into a visible DC for final display.

		Requires ${WGL_ARB_extensions_string.link}.
		"""

	IntConstant(
		"New errors returned by org.lwjgl.system.windows.WinBase##GetLastError().",

		"ERROR_INVALID_PIXEL_TYPE_ARB" _ 0x2043,
		"ERROR_INCOMPATIBLE_DEVICE_CONTEXTS_ARB" _ 0x2054
	).noPrefix()

	BOOL(
		"MakeContextCurrentARB",
		"""
		Associates the context {@code hglrc} with the device {@code drawDC} for draws and the device {@code readDC} for reads. All subsequent OpenGL calls made
		by the calling thread are drawn on the device identified by {@code drawDC} and read on the device identified by {@code readDC}.

		The {@code drawDC} and {@code readDC} parameters must refer to drawing surfaces supported by OpenGL. These parameters need not be the same {@code hdc}
		that was passed to org.lwjgl.system.windows.WGL#CreateContext() when {@code hglrc} was created. {@code drawDC} must have the same pixel format
		and be created on the same physical device as the {@code hdc} that was passed into wglCreateContext. {@code readDC} must be created on the same device
		as the {@code hdc} that was passed to wglCreateContext and it must support the same pixel type as the pixel format of the {@code hdc} that was passed to
		wglCreateContext.

		If {@code wglMakeContextCurrentARB} is used to associate a different device for reads than for draws, the "read" device will be used for the following
		OpenGL operations:
		${ol(
			"""
			Any pixel data that are sourced based on the value of GL11##GL_READ_BUFFER. Note, that accumulation operations use the value of
			{@code READ_BUFFER}, but are not allowed when a different device context is used for reads.  In this case, the accumulation operation will generate
			GL11##GL_INVALID_OPERATION.
			""",
			"""
			Any depth values that are retrieved by GL11##glReadPixels(), GL11##glCopyPixels(), or any OpenGL extension that sources
			depth images from the frame buffer in the manner of ReadPixels and CopyPixels.
			""",
			"""
			Any stencil values that are retrieved by ReadPixels, CopyPixels, or any OpenGL extension that sources stencil images from the framebuffer in the
			manner of ReadPixels and CopyPixels.
			"""
		)}
		These frame buffer values are taken from the surface associated with the device context specified by {@code readDC}.
		""",

		HDC.IN("drawDC", "the \"draw\" device context"),
		HDC.IN("readDC", "the \"read\" device context"),
		HGLRC.IN("hglrc", "the OpenGL context")
	)

	HDC("GetCurrentReadDCARB", "Returns the \"read\" device context for the current OpenGL context.")

}