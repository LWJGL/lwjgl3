/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

fun ARB_pipeline_statistics_query() = "ARBPipelineStatisticsQuery".nativeClassGL("ARB_pipeline_statistics_query") {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the ${url("http://www.opengl.org/registry/specs/ARB/pipeline_statistics_query.txt", templateName)} extension.

		This extension introduces new query types that allow applications to get statistics information about different parts of the pipeline.
		"""


	IntConstant.block(
		"""
		Accepted by the {@code target} parameter of GL15#BeginQuery(), GL15#EndQuery(), GL15#GetQueryiv(),
		GL40#BeginQueryIndexed(), GL40#EndQueryIndexed() and GL40#GetQueryIndexediv().
		""",

		"VERTICES_SUBMITTED_ARB" _ 0x82EE,
		"PRIMITIVES_SUBMITTED_ARB" _ 0x82EF,
		"VERTEX_SHADER_INVOCATIONS_ARB" _ 0x82F0,
		"TESS_CONTROL_SHADER_PATCHES_ARB" _ 0x82F1,
		"TESS_EVALUATION_SHADER_INVOCATIONS_ARB" _ 0x82F2,
		"GEOMETRY_SHADER_INVOCATIONS" _ 0x887F,
		"GEOMETRY_SHADER_PRIMITIVES_EMITTED_ARB" _ 0x82F3,
		"FRAGMENT_SHADER_INVOCATIONS_ARB" _ 0x82F4,
		"COMPUTE_SHADER_INVOCATIONS_ARB" _ 0x82F5,
		"CLIPPING_INPUT_PRIMITIVES_ARB" _ 0x82F6,
		"CLIPPING_OUTPUT_PRIMITIVES_ARB" _ 0x82F7
	)
}