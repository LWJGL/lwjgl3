/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val NV_texture_multisample = "NVTextureMultisample".nativeClassGL("NV_texture_multisample", postfix = NV) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This specification extends ${"NV_gpu_program4".cap} to support per-sample fetching from multisample textures described in ARB_texture_multisample.
    
        Requires ${GL20.core}, ${ARB_texture_multisample.link}.
		"""

	IntConstant(
		"""
		Accepted by the {@code pname} parameter of GetTexLevelParameter.
		""",

		"TEXTURE_COVERAGE_SAMPLES_NV" _ 0x9045,
		"TEXTURE_COLOR_SAMPLES_NV" _ 0x9046
	)

	GLvoid(
		"TexImage2DMultisampleCoverageNV",
		"",

		GLenum.IN("target", ""),
		GLsizei.IN("coverageSamples", ""),
		GLsizei.IN("colorSamples", ""),
		GLint.IN("internalFormat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLboolean.IN("fixedSampleLocations", "")
	)

	GLvoid(
		"TexImage3DMultisampleCoverageNV",
		"",

		GLenum.IN("target", ""),
		GLsizei.IN("coverageSamples", ""),
		GLsizei.IN("colorSamples", ""),
		GLint.IN("internalFormat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLboolean.IN("fixedSampleLocations", "")
	)

	GLvoid(
		"TextureImage2DMultisampleNV",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLsizei.IN("samples", ""),
		GLint.IN("internalFormat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLboolean.IN("fixedSampleLocations", "")
	)

	GLvoid(
		"TextureImage3DMultisampleNV",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLsizei.IN("samples", ""),
		GLint.IN("internalFormat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLboolean.IN("fixedSampleLocations", "")
	)

	GLvoid(
		"TextureImage2DMultisampleCoverageNV",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLsizei.IN("coverageSamples", ""),
		GLsizei.IN("colorSamples", ""),
		GLint.IN("internalFormat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLboolean.IN("fixedSampleLocations", "")
	)

	GLvoid(
		"TextureImage3DMultisampleCoverageNV",
		"",

		GLuint.IN("texture", ""),
		GLenum.IN("target", ""),
		GLsizei.IN("coverageSamples", ""),
		GLsizei.IN("colorSamples", ""),
		GLint.IN("internalFormat", ""),
		GLsizei.IN("width", ""),
		GLsizei.IN("height", ""),
		GLsizei.IN("depth", ""),
		GLboolean.IN("fixedSampleLocations", "")
	)
}