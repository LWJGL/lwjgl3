/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_cull_distance = "ARBCullDistance".nativeClassGL("ARB_cull_distance") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds a new GLSL {@code gl_CullDistance} shader output, similar to {@code gl_ClipDistance}, but used for whole primitive culling.

		This new stage in the pipeline is added as part of the primitive clipping stage.

		Requires ${GL30.core}. ${GL45.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

		"MAX_CULL_DISTANCES" _ 0x82F9,
		"MAX_COMBINED_CLIP_AND_CULL_DISTANCES" _ 0x82FA
	)
}