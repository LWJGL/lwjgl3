/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_EXT_import_context = "GLXEXTImportContext".nativeClassGLX("GLX_EXT_import_context", EXT) {
	nativeImport (
		"<GL/glx.h>"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("EXT", "import_context")} extension.

		This extension allows multiple X clients to share an indirect rendering context.

		Additional convenience procedures to get the current Display* bound to a context as well as other context information are also added.
		"""

	IntConstant(
		"Accepted by the {@code attribute} parameter of #QueryContextInfoEXT().",

		"SHARE_CONTEXT_EXT" _ 0x800A,
		"VISUAL_ID_EXT" _ 0x800B,
		"SCREEN_EXT" _ 0x800C
	)

	Display_p(
		"GetCurrentDisplayEXT",
		"Returns the display associated with the current context."
	)

	int(
		"QueryContextInfoEXT",
		"Obtains the value of a context's attribute.",

		DISPLAY,
		GLXContext.IN("context", "the context being queried"),
		int.IN("attribute", "the attribute to query"),
		Check(1) _ int_p.OUT("value", "returns the attribute value")
	)

	GLXContextID(
		"GetContextIDEXT",
		"Returns the XID of a GLXContext.",

		const _ GLXContext.IN("context", "the context")
	)

	GLXContext(
		"ImportContextEXT",
		"May be used in place of glXCreateContext to share another process's indirect rendering context.",

		DISPLAY,
		GLXContextID.IN("contextID", "the context XID")
	)

	void(
		"FreeContextEXT",
		"Frees the client-side part of a GLXContext that was created  with #ImportContextEXT().",

		DISPLAY,
		GLXContext.IN("context", "the context to free")
	)

}