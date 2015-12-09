/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.nanovg

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NVGLUframebuffer_p = struct_p(NANOVG_PACKAGE, "NVGLUFramebuffer", nativeName = "NVGLUframebuffer") {
	documentation = ""

	GLuint.member("fbo", "")
	GLuint.member("rbo", "")
	GLuint.member("texture", "")
	int.member("image", "")
}
