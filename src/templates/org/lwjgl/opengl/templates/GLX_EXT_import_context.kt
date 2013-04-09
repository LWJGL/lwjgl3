/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

fun GLX_EXT_import_context() = "GLXEXTImportcontext".nativeClassGLX("GLX_EXT_import_context", EXT) {

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/EXT/import_context.txt", templateName)} extension.

		This extension allows multiple X clients to share an indirect rendering context.

        Additional convenience procedures to get the current Display* bound to a context as well as other context information are also added.
		"""
	)

	IntConstant.block(
		"Accepted by the {@code attribute} parameter of {@link #glXQueryContextInfoEXT}:",

		"GLX_SHARE_CONTEXT_EXT" _ 0x800A,
		"GLX_VISUAL_ID_EXT" _ 0x800B,
		"GLX_SCREEN_EXT" _ 0x800C
	)

	Display_p.func(
		"GetCurrentDisplayEXT",
		"Returns the display associated with the current context."
	)

	int.func(
		"QueryContextInfoEXT",
		"Obtains the value of a context's attribute.",

		DISPLAY,
		GLXContext.IN("context", "the context being queried"),
		int.IN("attribute", "the attribute to query"),
		Check(1) _ int_p.OUT("value", "returns the attribute value")
	)

	GLXContextID.func(
		"GetContextIDEXT",
		"Returns the XID of a GLXContext.",

		const _ GLXContext.IN("context", "the context")
	)

	GLXContext.func(
		"ImportContextEXT",
		"May be used in place of glXCreateContext to share another process's indirect rendering context.",

		DISPLAY,
		GLXContextID.IN("contextID", "the context XID")
	)

	void.func(
		"FreeContextEXT",
		"Frees the client-side part of a GLXContext that was created  with {@link #glXImportContext}.",

		DISPLAY,
		GLXContext.IN("context", "the context to free")
	)

}