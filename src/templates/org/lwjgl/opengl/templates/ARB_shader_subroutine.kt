/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_shader_subroutine = "ARBShaderSubroutine".nativeClassGL("ARB_shader_subroutine") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds support to shaders for "indirect subroutine calls", where a single shader can include many subroutines and dynamically select
		through the API which subroutine is called from each call site. Switching subroutines dynamically in this fashion can avoid the cost of recompiling and
		managing multiple shaders, while still retaining most of the performance of specialized shaders.

		Requires ${ARB_gpu_shader5.link}. ${GL40.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetProgramStageiv.",

		"ACTIVE_SUBROUTINES" _ 0x8DE5,
		"ACTIVE_SUBROUTINE_UNIFORMS" _ 0x8DE6,
		"ACTIVE_SUBROUTINE_UNIFORM_LOCATIONS" _ 0x8E47,
		"ACTIVE_SUBROUTINE_MAX_LENGTH" _ 0x8E48,
		"ACTIVE_SUBROUTINE_UNIFORM_MAX_LENGTH" _ 0x8E49
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

		"MAX_SUBROUTINES" _ 0x8DE7,
		"MAX_SUBROUTINE_UNIFORM_LOCATIONS" _ 0x8DE8
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetActiveSubroutineUniformiv.",

		"NUM_COMPATIBLE_SUBROUTINES" _ 0x8E4A,
		"COMPATIBLE_SUBROUTINES" _ 0x8E4B
	)

	GL40 reuse "GetSubroutineUniformLocation"
	GL40 reuse "GetSubroutineIndex"
	GL40 reuse "GetActiveSubroutineUniformiv"
	GL40 reuse "GetActiveSubroutineUniformName"
    GL40 reuse "GetActiveSubroutineName"
    GL40 reuse "UniformSubroutinesuiv"
    GL40 reuse "GetUniformSubroutineuiv"
    GL40 reuse "GetProgramStageiv"
}