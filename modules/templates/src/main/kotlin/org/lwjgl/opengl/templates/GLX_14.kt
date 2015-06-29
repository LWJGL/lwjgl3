/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val GLX14 = "GLX14".nativeClassGLX("GLX_14") {
	javaImport("org.lwjgl.system.linux.*")

	nativeImport (
		"<GL/glx.h>"
	)

	documentation = "Native bindings to GLX 1.4."

	IntConstant(
		"Added in GLX 1.4.",

		"SAMPLE_BUFFERS" _ 0x186a0,
		"SAMPLES" _ 0x186a1
	)

	voidptr(
		"GetProcAddress",
		"""
		Returns the address of the extension function named by {@code procName}. The pointer returned should be cast to a function pointer type matching the
		extension function's definition in that extension specification. A return value of $NULL indicates that the specified function does not exist for the
		implementation.

		A non-$NULL return value for {@code glXGetProcAddress} does not guarantee that an extension function is actually supported at runtime. The client must
		also query GL11##glGetString()(GL11##GL_EXTENSIONS) or GLX11#QueryExtensionsString() to determine if an extension is supported
		by a particular context.

		GL function pointers returned by {@code glXGetProcAddress} are independent of the currently bound context and may be used by any context which
		supports the extension.

		{@code glXGetProcAddress} may be queried for all of the following functions:
		${ul(
			"All GL and GLX extension functions supported by the implementation (whether those extensions are supported by the current context or not).",
			"""
			All core (non-extension) functions in GL and GLX from version 1.0 up to and including the versions of those specifications supported by the
			implementation, as determined by GL11##glGetString()(GL11##GL_VERSION) and GLX#QueryVersion() queries.
			"""
		)}
		""",

		const _ GLubyte_p.IN("procName", "the function name to query")
	)

}