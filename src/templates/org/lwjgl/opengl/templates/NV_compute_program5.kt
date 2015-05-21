/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_compute_program5 = "NVComputeProgram5".nativeClassGL("NV_compute_program5", postfix = NV) {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension builds on the ARB_compute_shader extension to provide new assembly compute program capability for OpenGL.

		Requires ${GL40.core}, ${"NV_gpu_program4".cap}, ${"NV_gpu_program5".cap}, ${ARB_compute_shader.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Disable, Enable, and IsEnabled, by the {@code pname} parameter of GetBooleanv,
		GetIntegerv, GetFloatv, and GetDoublev, and by the {@code target} parameter of ProgramStringARB, BindProgramARB,
		ProgramEnvParameter4[df][v]ARB, ProgramLocalParameter4[df][v]ARB, GetProgramEnvParameter[df]vARB, GetProgramLocalParameter[df]vARB,
		GetProgramivARB and GetProgramStringARB.
		""",

		"COMPUTE_PROGRAM_NV" _ 0x90FB
	)

	IntConstant(
		"""
		Accepted by the {@code target} parameter of ProgramBufferParametersfvNV, ProgramBufferParametersIivNV, and ProgramBufferParametersIuivNV,
		BindBufferRangeNV, BindBufferOffsetNV, BindBufferBaseNV, and BindBuffer and the {@code value} parameter of GetIntegerIndexedvEXT.
		""",

		"COMPUTE_PROGRAM_PARAMETER_BUFFER_NV" _ 0x90FC
	)
}