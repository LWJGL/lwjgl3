/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_ARB_create_context = "GLXARBCreateContext".nativeClassGLX("GLX_ARB_create_context", ARB) {
	javaImport(
		"org.lwjgl.system.linux.*"
	)

	nativeImport (
		"<GL/glx.h>"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("ARB", "glx_create_context")} extension.

		With the advent of new versions of OpenGL which deprecate features and/or break backward compatibility with older versions, there is a need and desire
		to indicate at context creation which interface will be used. These extensions add a new context creation routine with attributes specifying the GL
		version and context properties requested for the context, and additionally add an attribute specifying the GL profile requested for a context of OpenGL
		3.2 or later. It also allows making an OpenGL 3.0 or later context current without providing a default framebuffer.

		Requires ${GLX14.glx}.
		"""

	IntConstant(
		"Accepted as an attribute name in {@code attrib_list}.",

		"CONTEXT_MAJOR_VERSION_ARB" _ 0x2091,
		"CONTEXT_MINOR_VERSION_ARB" _ 0x2092,
		"CONTEXT_FLAGS_ARB" _ 0x2094
	)

	IntConstant(
		"Accepted as bits in the attribute value for #CONTEXT_FLAGS_ARB in {@code attrib_list}.",

		"CONTEXT_DEBUG_BIT_ARB" _ 0x0001,
		"CONTEXT_FORWARD_COMPATIBLE_BIT_ARB" _ 0x0002
	)

	GLXContext(
		"CreateContextAttribsARB",
		"""
		Creates an OpenGL rendering context.

		If {@code glXCreateContextAttribsARB} succeeds, it initializes the context to the initial state defined by the OpenGL specification, and returns a
		handle to it. This handle can be used to render to any GLX surface (window, pixmap, or pbuffer) compatible with {@code config}, subject to constraints
		imposed by the OpenGL API version of the context.

		If {@code share_context} is not $NULL, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code share_context}, all
		other contexts {@code share_context} already shares with, and the newly created context. An arbitrary number of {@code GLXContexts} can share data in
		this fashion. The server context state for all sharing contexts must exist in a single address space.
		""",

		DISPLAY,
		GLXFBConfig.IN("config", "the {@code GLXFBConfig}"),
		nullable _ GLXContext.IN(
			"share_context",
			"""
			if not $NULL, then all shareable data (excluding OpenGL texture objects named 0) will be shared by {@code share_context}, all other contexts
			{@code share_context} already shares with, and the newly created context. An arbitrary number of GLXContexts can share data in this fashion. The
			server context state for all sharing contexts must exist in a single address space.
			"""
		),
		Bool.IN(
			"direct",
			"""
			direct rendering is requested if {@code direct} is Xlib##True, and indirect rendering if {@code direct} is Xlib##False. If
			{@code direct} is Xlib##True, the implementation may nonetheless create an indirect rendering context if any of the following conditions hold:
			${ul(
				"The implementation does not support direct rendering.",
				"{@code display} is not a local X server.",
				"Implementation-dependent limits on the number of direct rendering contexts that can be supported simultaneously are exceeded."
			)}
			Use GLX#IsDirect() to determine whether or not a request for a direct rendering context succeeded.
			"""
		),
		const _ nullable _ nullTerminated _ int_p.IN("attrib_list", "an optional list of attributes for the context, terminated with X##None")
	)

}