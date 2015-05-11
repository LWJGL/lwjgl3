/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX_EXT_buffer_age = "GLXEXTBufferAge".nativeClassGLX("GLX_EXT_buffer_age", EXT) {
	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "glx_buffer_age")} extension.

		The aim of this extension is to expose enough information to applications about how the driver manages the set of front and back buffers associated with
		a given surface to allow applications to re-use the contents of old frames and minimize how much must be redrawn for the next frame.

		Requires ${GLX14.glx}.
		"""

	IntConstant(
		"Accepted by GLX13#QueryDrawable().",

		"BACK_BUFFER_AGE_EXT" _ 0x20F4
	)

}