/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_multi_draw_indirect = "ARBMultiDrawIndirect".nativeClassGL("ARB_multi_draw_indirect") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		The ${ARB_draw_indirect.link} extension (included in OpenGL 4.0) introduced mechanisms whereby the parameters for a draw function may be provided in a
		structure contained in a buffer object rather than as parameters to the drawing procedure. This is known as an indirect draw and is exposed as two new
		functions, ARBDrawIndirect#DrawArraysIndirect() and ARBDrawIndirect#DrawElementsIndirect(). Each of these functions generates a single batch of
		primitives.

		This extension builds on this functionality by providing procedures to invoke multiple draws from a single procedure call. This allows large batches of
		drawing commands to be assembled in server memory (via a buffer object) which may then be dispatched through a single function call.

		Requires ${GL40.core} or ${ARB_draw_indirect.link}. ${GL43.promoted}
		"""

	GL43 reuse "MultiDrawArraysIndirect"
	GL43 reuse "MultiDrawElementsIndirect"
}