/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

val WGL_ARB_buffer_region = "WGLARBBufferRegion".nativeClassWGL("WGL_ARB_buffer_region", ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "wgl_buffer_region")} extension.

		The buffer region extension is a mechanism that allows an area of an OpenGL window to be saved in off-screen memory for quick restores. The off-screen
		memory can either be frame buffer memory or system memory, although frame buffer memory might offer optimal performance.

		A buffer region can be created for the front color, back color, depth, and/or stencil buffer.  Multiple buffer regions for the same buffer type can
		exist.
		"""

	HANDLE(
		"CreateBufferRegionARB",
		"Creates a buffer region and returns a handle associated with it.",

		HDC.IN("hdc", "the device context for the device on which the buffer region is created"),
		int.IN(
			"layerPlane",
			"the layer plane. Positive values identify overlay planes, negative values identify underlay planes. A value of 0 identifies the main plane."
		),
		UINT.IN(
			"type",
			"""
			a bitwise OR of any of the following values indicating which buffers can be saved or restored.  Multiple bits can be set and may result in better
			performance if multiple buffers are saved or restored.
			""",
			"#FRONT_COLOR_BUFFER_BIT_ARB #BACK_COLOR_BUFFER_BIT_ARB #DEPTH_BUFFER_BIT_ARB #STENCIL_BUFFER_BIT_ARB"
		)
	)

	VOID(
		"DeleteBufferRegionARB",
		"Deletes a buffer region.",

		HANDLE.IN("region", "a handle to a buffer region previously created with #CreateBufferRegionARB().")
	)

	BOOL(
		"SaveBufferRegionARB",
		"""
		Saves image, depth, and stencil data into the buffer region.

		Data outside the window for the specified rectangle is undefined. The OpenGL coordinate system is used for specifying the rectangle ({@code x} and
		{@code y} specify the lower-left corner of the rectangle).

		If an RC is current to the calling thread, a flush will occur before the save operation.

		The saved buffer region area can be freed by calling {@code wglSaveBufferRegionARB} with {@code width} or {@code height} set to a value of 0.
		""",

		HANDLE.IN("region", "a handle to a buffer region previously created with #CreateBufferRegionARB()."),
		int.IN("x", "the window x-coordinate for the source rectangle"),
		int.IN("y", "the window y-coordinate for the source rectangle"),
		int.IN("width", "the source rectangle width"),
		int.IN("height", "the source rectangle height")
	)

	BOOL(
		"RestoreBufferRegionARB",
		"Restores a previously saved buffer region.",

		HANDLE.IN("region", "a handle to a buffer region previously created with #CreateBufferRegionARB()."),
		int.IN("x", "the window x-coordinate for the destination rectangle"),
		int.IN("y", "the window y-coordinate for the destination rectangle"),
		int.IN("width", "the destination rectangle width"),
		int.IN("height", "the destination rectangle height"),
		int.IN("xSrc", "the buffer region x-coordinate for the source of the data"),
		int.IN("ySrc", "the buffer region y-coordinate for the source of the data")
	)

	IntConstant(
		"Accepted by the {@code type} parameter of #CreateBufferRegionARB().",

		"FRONT_COLOR_BUFFER_BIT_ARB" _ 0x00000001,
		"BACK_COLOR_BUFFER_BIT_ARB" _ 0x00000002,
		"DEPTH_BUFFER_BIT_ARB" _ 0x00000004,
		"STENCIL_BUFFER_BIT_ARB" _ 0x00000008
	)
}