/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_shader_thread_group = "NVShaderThreadGroup".nativeClassGL("NV_shader_thread_group", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		Implementations of the OpenGL Shading Language may, but are not required to, run multiple shader threads for a single stage as a SIMD thread group,
		where individual execution threads are assigned to thread groups in an undefined, implementation-dependent order. This extension provides a set of new
		features to the OpenGL Shading Language to query thread states and to share data between fragments within a 2x2 pixel quad.

        Requires ${GL43.core}.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

		"WARP_SIZE_NV" _ 0x9339,
		"WARPS_PER_SM_NV" _ 0x933A,
		"SM_COUNT_NV" _ 0x933B
	)
}