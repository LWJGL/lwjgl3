/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun WGL_EXT_extensions_string() = "WGLEXTExtensionsString".nativeClassWGL("WGL_EXT_extensions_string", EXT) {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc("Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/wgl_extensions_string.txt", templateName)} extension.")

	(const _ string).func(
		"GetExtensionsStringEXT",
		"""
		Returns a list of supported extensions to WGL. Although the contents of the string is implementation specific, the string will be NULL terminated and
		will contain a space-separated list of extension names. (The extension names themselves do not contain spaces.) If there are no extensions then the
		empty string is returned.
		"""
	)

}