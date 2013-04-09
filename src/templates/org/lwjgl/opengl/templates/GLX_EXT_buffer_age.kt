/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

fun GLX_EXT_buffer_age() = "GLXEXTBufferAge".nativeClassGLX("GLX_EXT_buffer_age", EXT) {
	javaImport("org.lwjgl.linux.system")

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/glx_buffer_age.txt", templateName)} extension.

		The aim of this extension is to expose enough information to applications about how the driver manages the set of front and back buffers associated with
		a given surface to allow applications to re-use the contents of old frames and minimize how much must be redrawn for the next frame.
		"""
	)

	IntConstant.block(
		"Accepted by {@link GLX13#glXQueryDrawable}.",

		"BACK_BUFFER_AGE_EXT" _ 0x20F4
	)

}