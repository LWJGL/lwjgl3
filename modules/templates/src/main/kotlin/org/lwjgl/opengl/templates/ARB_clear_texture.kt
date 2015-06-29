/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_clear_texture = "ARBClearTexture".nativeClassGL("ARB_clear_texture") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Texture objects are fundamental to the operation of OpenGL. They are used as a source for texture sampling and destination for rendering as well as
		being accessed in shaders for image load/store operations. It is also possible to invalidate the contents of a texture. It is currently only possible to
		set texture image data to known values by uploading some or all of a image array from application memory or by attaching it to a framebuffer object and
		using GL11#Clear() or the ${GL30.core} ClearBuffer commands.

		Both uploading initial texture data and clearing by attaching to a framebuffer have potential disadvantages when one simply wants to initialize texture
		data to a known value. Uploading initial data requires the application to allocate a (potentially large) chunk of memory and transferring that to the
		GL. This can be a costly operation both in terms of memory bandwidth and power usage. Alternatively, attaching a texture level to a framebuffer to clear
		it may not be possible if the texture format isn't supported for rendering, or even if it is, attaching the image to a framebuffer object may cause the
		texture to be allocated in certain types of memory, which it may otherwise not need to be placed in.

		This extension solves these problems by providing a mechanism whereby the contents of a texture image array can be set to known values by using the
		#ClearTexImage() or #ClearTexSubImage() commands. These commands can also be useful for initializing an image that will be used for atomic shader
		operations.

        Requires ${GL13.core}. ${GL44.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter for GL42#GetInternalformati() and GL43#GetInternalformati64().",

		"CLEAR_TEXTURE" _ 0x9365
	)

	GL44 reuse "ClearTexSubImage"
	GL44 reuse "ClearTexImage"
}