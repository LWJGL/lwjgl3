/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.generator.opengl.PIXEL_PACK_BUFFER

val KHR_context_flush_control = "KHRContextFlushControl".nativeClassGL("KHR_context_flush_control") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		OpenGL and OpenGL ES have long supported multiple contexts. The semantics of switching contexts is generally left to window system binding APIs such as
		WGL, GLX and EGL. Most of these APIs (if not all) specify that when the current context for a thread is changed, the outgoing context performs an
		implicit flush of any commands that have been issued to that point. OpenGL and OpenGL ES define a flush as sending any pending commands for execution
		and that this action will result in their completion in finite time.

		This behavior has subtle consequences. For example, if an application is rendering to the front buffer and switches contexts, it may assume that any
		rendering performed thus far will eventually be visible to the user. With recent introduction of shared memory buffers, there become inumerable ways in
		which applications may observe side effects of an implicit flush (or lack thereof).

		In general, a full flush is not the desired behavior of the application. Nonetheless, applications that switch contexts frequently suffer the
		performance consequences of this unless implementations make special considerations for them, which is generally untenable.

		This extension allows querying the context flush behavior.

		${GL45.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v.",

		"CONTEXT_RELEASE_BEHAVIOR" _ 0x82FB
	)

	IntConstant(
		"Returned in {@code data} by GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v when {@code pname} is #CONTEXT_RELEASE_BEHAVIOR.",

		"CONTEXT_RELEASE_BEHAVIOR_FLUSH" _ 0x82FC
	)

}