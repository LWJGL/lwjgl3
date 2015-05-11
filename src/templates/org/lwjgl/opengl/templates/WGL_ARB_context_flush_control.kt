/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val WGL_ARB_context_flush_control = "WGLARBContextFlushControl".nativeClassWGL("WGL_ARB_context_flush_control", ARB) {
	documentation =
		"""
		Native bindings to the ${registryLink("KHR", "context_flush_control")} extension.

		The WGL version of ##KHRContextFlushControl. This extension adds new context creation parameters the allow an application to specify the behavior
		that is desired when a context is made non-current, and specifically to opt out of the implicit flush behavior.
		"""

	IntConstant(
		"Accepted as an attribute name in the {@code *attrib_list} argument to WGLARBCreateContext#CreateContextAttribsARB().",

		"CONTEXT_RELEASE_BEHAVIOR_ARB" _ 0x2097
	)

	IntConstant(
		"""
		Accepted as an attribute value for #CONTEXT_RELEASE_BEHAVIOR_ARB in the {@code *attrib_list} argument to
		WGLARBCreateContext#CreateContextAttribsARB().
		""",

		"CONTEXT_RELEASE_BEHAVIOR_NONE_ARB" _ 0x0000,
		"CONTEXT_RELEASE_BEHAVIOR_FLUSH_ARB" _ 0x2098
	)
}