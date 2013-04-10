/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*
import org.lwjgl.opengl.*

fun GLX11() = "GLX11".nativeClassGLX("GLX_11") {
	nativeImport (
		"<GL/glx.h>"
	)

	javaDoc("Native bindings to GLX 1.1.")

	IntConstant.block(
		"Names for attributes to {@link #glXGetClientString}.",

		"VENDOR" _ 0x1,
		"VERSION" _ 0x2,
		"EXTENSIONS" _ 0x3
	)

	(const _ charASCII_p).func(
		"QueryExtensionsString",
		"Returns a string describing which GLX extensions are supported on the connection.",

		DISPLAY,
		int.IN("screen", "the screen number")
	)

	(const _ charASCII_p).func(
		"GetClientString",
		"Returns a pointer to a string describing some aspect of the client library.",

		DISPLAY,
		int.IN("name", "the string to query")
	)

	(const _ charASCII_p).func(
		"QueryServerString",
		"Returns a pointer to a string describing some aspect of the server's GLX extension.",

		DISPLAY,
		int.IN("screen", "the screen number"),
		int.IN("name", "the string to query")
	)

}