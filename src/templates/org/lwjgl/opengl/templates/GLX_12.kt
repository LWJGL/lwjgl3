/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*
import org.lwjgl.opengl.*

val GLX12 = "GLX12".nativeClassGLX("GLX_12") {
	nativeImport (
		"<GL/glx.h>"
	)

	documentation = "Native bindings to GLX 1.2."

	Display_p(
		"GetCurrentDisplay",
		"Returns the display associated with the current context and drawable."
	)

}