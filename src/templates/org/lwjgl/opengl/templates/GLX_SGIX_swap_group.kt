/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*
import org.lwjgl.system.linux.*

val GLX_SGIX_swap_group = "GLXSGIXSwapGroup".nativeClassGLX("GLX_SGIX_swap_group", SGIX) {
	javaImport(
		"org.lwjgl.system.linux.X"
	)

	nativeImport (
		"<GL/glx.h>"
	)

	documentation =
		"""
		Native bindings to the ${registryLink("SGIX", "swap_group")} extension.

		This extension provides the capability to synchronize the buffer swaps of a group of GLX drawables.  A swap group is created, and drawables are added as
		members to the swap group. Buffer swaps to members of the swap group will then take place concurrently.

		This extension extends the set of conditions that must be met before a buffer swap can take place.
		"""

	void(
		"JoinSwapGroupSGIX",
		"""
		Adds {@code drawable} to the swap group containing {@code member} as a member. If {@code drawable} is already a member of a different group, it is
		implicitly removed from that group first. If {@code member} is X##None, {@code drawable} is removed from the swap group that it belongs to, if
		any.
		""",

		DISPLAY,
		GLXDrawable.IN("drawable", "the GLXDrawable to add to the swap group"),
		nullable _ GLXDrawable.IN("member", "a member of the swap group or X##None")
	)

}