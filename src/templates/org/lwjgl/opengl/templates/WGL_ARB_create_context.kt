/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.windows.*

fun WGL_ARB_create_context() = "WGLARBCreateContext".nativeClassWGL("WGL_ARB_create_context", ARB) {
	nativeImport (
		"OpenGL.h"
	)

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/ARB/wgl_create_context.txt", templateName)} extension.

		With the advent of new versions of OpenGL which deprecate features and/or break backward compatibility with older versions, there is a need and desire
		to indicate at context creation which interface will be used. This extension add a new context creation routine with attributes specifying the GL
		version and context properties requested for the context.
		"""
	)

	IntConstant.block(
		"Accepted as an attribute name in {@code attribList}.",
	
		"CONTEXT_MAJOR_VERSION_ARB" _ 0x2091,
		"CONTEXT_MINOR_VERSION_ARB" _ 0x2092,
		"CONTEXT_LAYER_PLANE_ARB" _ 0x2093,
		"CONTEXT_FLAGS_ARB" _ 0x2094
	)

	IntConstant.block(
		"Accepted as bits in the attribute value for {@link #WGL_CONTEXT_FLAGS_ARB} in {@code attribList}.",

		"CONTEXT_DEBUG_BIT_ARB" _ 0x0001,
		"CONTEXT_FORWARD_COMPATIBLE_BIT_ARB" _ 0x0002
	)

	IntConstant.block(
		"New errors returned by {@link org.lwjgl.system.windows.WinBase#GetLastError}.",
	
		"ERROR_INVALID_VERSION_ARB" _ 0x2095,
		"ERROR_INVALID_PROFILE_ARB" _ 0x2096
	).noPrefix()

	HGLRC.func(
		"CreateContextAttribsARB",
		"""
		Creates an OpenGL context.

		If {@code shareContext} is not 0L, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code shareContext}, all other
		contexts {@code shareContext} already shares with, and the newly created context. An arbitrary number of contexts can share data in this fashion.
		""",

		HDC.IN("hdc", ""),
		nullable _ HGLRC.IN("shareContext", ""),
		mods(const, nullTerminated, nullable) _ int_p.IN(
			"attribList",
			"""
			a list of attributes for the context. The list consists of a sequence of &lt;name, value&gt; pairs terminated by the value 0. If an attribute is not
			specified in {@code attribList}, then the default value is used instead. If an attribute is specified more than once, then the last value specified
			is used.
			"""
		)
	)
}