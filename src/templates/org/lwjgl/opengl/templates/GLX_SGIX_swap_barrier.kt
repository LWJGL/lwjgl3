/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

fun GLX_SGIX_swap_barrier() = "GLXSGIXSwapBarrier".nativeClassGLX("GLX_SGIX_swap_barrier", SGIX) {
	javaImport(
		"org.lwjgl.system.linux.X"
	)

	nativeImport (
		"<GL/glx.h>"
	)

	javaDoc(
		"""
		Native bindings to the ${link("http://www.opengl.org/registry/specs/SGIX/swap_barrier.txt", templateName)} extension.

		This extension provides the capability to sychronize the buffer swaps of different swap groups.
		"""
	)

	void.func(
		"BindSwapBarrierSGIX",
		"""
		Binds the swap group that contains {@code drawable} to {@code barrier}. Subsequent buffer swaps for that group will be subject to this binding, until
		the group is unbound from {@code barrier}. If {@code barrier} is zero, the group is unbound from its current barrier, if any.
		""",

		DISPLAY,
		GLXDrawable.IN("drawable", "the swap group GLXDrawable"),
		int.IN("barrier", "the swap barrier")
	)

	Bool.func(
		"QueryMaxSwapBarriersSGIX",
		"Returns in {@code max} the maximum number of barriers supported by an implementation on {@code screen}.",

		DISPLAY,
		int.IN("screen", "the screen"),
		Check(1) _ int_p.OUT("max", "returns the maximum number of barriers")
	)

}