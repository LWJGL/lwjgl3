/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val KHR_no_error = "KHRNoError".nativeClassGL("KHR_no_error") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		With this extension enabled any behavior that generates a GL error will have undefined behavior. The reason this extension exists is performance can be
		increased and power usage decreased. When this mode is used, a GL driver can have undefined behavior where it would have generated a GL error without
		this extension. This could include application termination. In general this extension should be used after you have verified all the GL errors are
		removed, and an application is not the kind that would check for GL errors and adjust behavior based on those errors.

		Requires ${GL20.core}.
		"""

	IntConstant(
		" If set in GL30#CONTEXT_FLAGS, then no error behavior is enabled for this context.",

		"CONTEXT_FLAG_NO_ERROR_BIT_KHR" _ 0x00000008
	)
}