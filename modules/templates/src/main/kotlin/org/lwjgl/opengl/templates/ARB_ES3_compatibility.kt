/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_ES3_compatibility = "ARBES3Compatibility".nativeClassGL("ARB_ES3_compatibility") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds support for features of OpenGL ES 3.0 that are missing from OpenGL 3.x. Enabling these features will ease the process of porting
		applications from OpenGL ES 3.0 to OpenGL. These features include conservative boolean occlusion queries, primitive restart with a fixed index, the
		OpenGL ES Shading Language 3.00 specification, and the dependencies stated below.

		Requires ${GL33.core}, ${ARB_ES2_compatibility.link}, ${ARB_invalidate_subdata.link} and ${ARB_texture_storage.link}. ${GL43.promoted}
		"""

	IntConstant(
		"Accepted by the {@code internalformat} parameter of CompressedTexImage2D.",

		"COMPRESSED_RGB8_ETC2" _ 0x9274,
		"COMPRESSED_SRGB8_ETC2" _ 0x9275,
		"COMPRESSED_RGB8_PUNCHTHROUGH_ALPHA1_ETC2" _ 0x9276,
		"COMPRESSED_SRGB8_PUNCHTHROUGH_ALPHA1_ETC2" _ 0x9277,
		"COMPRESSED_RGBA8_ETC2_EAC" _ 0x9278,
		"COMPRESSED_SRGB8_ALPHA8_ETC2_EAC" _ 0x9279,
		"COMPRESSED_R11_EAC" _ 0x9270,
		"COMPRESSED_SIGNED_R11_EAC" _ 0x9271,
		"COMPRESSED_RG11_EAC" _ 0x9272,
		"COMPRESSED_SIGNED_RG11_EAC" _ 0x9273
	)

	IntConstant(
		"Accepted by the {@code target} parameter of Enable and Disable.",

		"PRIMITIVE_RESTART_FIXED_INDEX" _ 0x8D69
	)

	IntConstant(
		"Accepted by the {@code target} parameter of BeginQuery, EndQuery, GetQueryIndexediv and GetQueryiv.",

		"ANY_SAMPLES_PASSED_CONSERVATIVE" _ 0x8D6A
	)

	IntConstant(
		"Accepted by the {@code value} parameter of the GetInteger functions.",

		"MAX_ELEMENT_INDEX" _ 0x8D6B
	)

	IntConstant(
		"Accepted by the {@code pname} parameters of GetTexParameterfv and GetTexParameteriv.",

		"TEXTURE_IMMUTABLE_LEVELS" _ 0x82DF
	)
}