/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_ES3_1_compatibility = "ARBES31Compatibility".nativeClassGL("ARB_ES3_1_compatibility") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds support for features of OpenGL ES 3.1 that are missing from OpenGL 4.4. Enabling these features will ease the process of porting
		applications from OpenGL ES 3.1 to OpenGL. Enabling these features will ease the process of porting applications from OpenGL ES 3.1 to OpenGL.

		In particular this adds the following features:
		${ul(
			"a new #MemoryBarrierByRegion() API which is potentially more efficient for specific localized memory access patterns.",
			"increases the minimum required size of SSBOs to 2^27 (128 MB).",
			"support for GLSL ES version 310.",
			"a new GLSL built-in function, {@code imageAtomicExchange}, which performs atomic exchanges on {@code r32f} floating point images.",
			"""
			a new GLSL built-in fragment shader input, {@code gl_HelperInvocation}, that identifies whether the current fragment shader input is a helper
			invocation. Fragment shader code can use this variable to skip performing operations that are useless or potentially dangerous for helper
			invocations.
			""",
			"a new GLSL built-in constant for the maximum supported samples: {@code gl_MaxSamples}.",
			"""
			a number of new GLSL built-in constants mirroring the API limits for image uniforms: {@code gl_Max * ImageUniforms},
			{@code gl_MaxCombinedShaderOutputResources}.
			""",
			"new GLSL built-in functions which extend {@code mix()} to select between int, uint, and bool components.",
			"add the \"coherent\" qualifier to all memory variables taken by the GLSL built-in {@code atomic*} and {@code imageAtomic*} functions.",
			"",
			""
		)}
		Requires ${GL44.core}, ${registryLinkTo("ARB", "ES2_compatibility")}, ${registryLinkTo("ARB", "ES3_compatibility")}. ${GL45.promoted}
		"""

	GL45 reuse "MemoryBarrierByRegion"
}