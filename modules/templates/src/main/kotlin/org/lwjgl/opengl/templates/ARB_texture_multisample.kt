/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_texture_multisample = "ARBTextureMultisample".nativeClassGL("ARB_texture_multisample") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		 This extension provides support for two new types of "multisample textures" - two-dimensional and two-dimensional array - as well as mechanisms to
		 fetch a specific sample from such a texture in a shader, and to attach such textures to FBOs for rendering.

		This extension also includes the following functionality, first described in ${registryLinkTo("NV", "explicit_multisample")}:
		${ul(
			"A query in the API to query the location of samples within the pixel",
		    "An explicit control for the multisample sample mask to augment the control provided by SampleCoverage"
		)}

		${GL32.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetMultisamplefv.",

		"SAMPLE_POSITION" _ 0x8E50
	)

	IntConstant(
		"""
		Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
		GetDoublev.
		""",

		"SAMPLE_MASK" _ 0x8E51
	)

	IntConstant(
		"Accepted by the {@code target} parameter of GetBooleani_v and GetIntegeri_v.",

		"SAMPLE_MASK_VALUE" _ 0x8E52
	)

	IntConstant(
		"Accepted by the {@code target} parameter of BindTexture and TexImage2DMultisample.",

		"TEXTURE_2D_MULTISAMPLE" _ 0x9100
	)

	IntConstant(
		"Accepted by the {@code target} parameter of TexImage2DMultisample.",

		"PROXY_TEXTURE_2D_MULTISAMPLE" _ 0x9101
	)

	IntConstant(
		"Accepted by the {@code target} parameter of BindTexture and TexImage3DMultisample.",

		"TEXTURE_2D_MULTISAMPLE_ARRAY" _ 0x9102
	)

	IntConstant(
		"Accepted by the {@code target} parameter of TexImage3DMultisample.",

		"PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY" _ 0x9103
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

		"MAX_SAMPLE_MASK_WORDS" _ 0x8E59,
		"MAX_COLOR_TEXTURE_SAMPLES" _ 0x910E,
		"MAX_DEPTH_TEXTURE_SAMPLES" _ 0x910F,
		"MAX_INTEGER_SAMPLES" _ 0x9110,
		"TEXTURE_BINDING_2D_MULTISAMPLE" _ 0x9104,
		"TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY" _ 0x9105
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTexLevelParameter.",

		"TEXTURE_SAMPLES" _ 0x9106,
		"TEXTURE_FIXED_SAMPLE_LOCATIONS" _ 0x9107
	)

	IntConstant(
		"Returned by the {@code type} parameter of GetActiveUniform.",

		"SAMPLER_2D_MULTISAMPLE" _ 0x9108,
		"INT_SAMPLER_2D_MULTISAMPLE" _ 0x9109,
		"UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE" _ 0x910A,
		"SAMPLER_2D_MULTISAMPLE_ARRAY" _ 0x910B,
		"INT_SAMPLER_2D_MULTISAMPLE_ARRAY" _ 0x910C,
		"UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY" _ 0x910D
	)

	GL32 reuse "TexImage2DMultisample"
	GL32 reuse "TexImage3DMultisample"
	GL32 reuse "GetMultisamplefv"
	GL32 reuse "SampleMaski"
}