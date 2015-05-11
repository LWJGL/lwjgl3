/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_SGI_make_current_read = "GLXSGIMakeCurrentRead".nativeClassGLX("GLX_SGI_make_current_read", SGI) {
	nativeImport (
		"<GL/glx.h>"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("SGI", "make_current_read")} extension.

		The association of the current context with a drawable is extended to allow separate write and read drawables.  This paves the way for allowing
		preprocessing of image data in an "off screen" window which is then read into the visible window for final display.  Similarly it sets the frame-work
		for direct transfer of video to the GL, by treating the video as a special kind of read drawable (a.k.a, readable).
		"""

	Bool(
		"MakeCurrentReadSGI",
		"Associates two {@code GLXDrawables} with the current rendering context.",

		DISPLAY,
		nullable _ GLXDrawable.IN("draw", "the draw drawable"),
		nullable _ GLXDrawable.IN("read", "the read drawable"),
		nullable _ GLXContext.IN("ctx", "the current context")
	)

	GLXDrawable(
		"GetCurrentReadDrawableSGI",
		"Returns the name of the {@code GLXDrawable} currently being used as a pixel query source."
	)

}