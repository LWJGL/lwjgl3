/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val INTEL_map_texture = "INTELMapTexture".nativeClassGL("INTEL_map_texture", postfix = INTEL) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		Systems with integrated GPUs can share the same physical memory between CPU and GPU. This feature, if exposed by API, can bring significant performance
		benefits for graphics applications by reducing the complexity of uploading/accessing texture contents. This extension enables CPU direct access to the
		GPU memory holding textures.

		The problem with texture memory directly exposed to clients is that textures are often 'tiled'. Texels are kept in specific layout to improve locality
		of reference and thus performance of texturing. This 'tiling' is specific to particular hardware and would be thus difficult to use.

		This extension allows to create textures with 'linear' layout which allows for simplified access on user side (potentially sacrificing some performance
		during texture sampling).

		Requires ${GL30.core}.
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of TexParameteri, for target TEXTURE_2D.",

		"TEXTURE_MEMORY_LAYOUT_INTEL" _ 0x83FF
	)

	IntConstant(
		"Accepted by the {@code params} when {@code pname} is set to {@code TEXTURE_MEMORY_LAYOUT_INTEL}.",

		"LAYOUT_DEFAULT_INTEL" _ 0,
		"LAYOUT_LINEAR_INTEL" _ 1,
		"LAYOUT_LINEAR_CPU_CACHED_INTEL" _ 2
	)

	void(
		"SyncTextureINTEL",
		"""
		Makes sure that changes made by CPU are visible to GPU by flushing texture cache in GPU. The GL implementation tracks the cache usage and ignores the
		command if such flush is not needed.

		It is worth noting that this extension does not address automatic synchronization between CPU and GPU when both entities operate on the same texture at
		the same time. This is up to the application to assure such synchronization. Otherwise, the results may not be deterministic (writes from different
		entities may interleave in a non-deterministic way).
		""",

		GLuint.IN("texture", "the texture to synchronize")
	)

	void(
		"UnmapTexture2DINTEL",
		"""
		Releases the pointer obtained previously via #MapTexture2DINTEL(). This means that virtual memory space dedicated to make the texture available via a
		pointer is released and an application can no longer assume this memory is accessible from CPU. Successful execution of this command has an additional
		effect as if #SyncTextureINTEL() was called with {@code texture} parameter.
		""",

		GLuint.IN("texture", "the texture to unmap"),
		GLint.IN("level", "the mipmap level-of-detail of the texture")
	)

	(MapPointer("memGetInt(memAddress(stride)) * GLChecks.getTexLevelParameteri(texture, GL11.GL_TEXTURE_2D, level, GL11.GL_TEXTURE_HEIGHT)") _ void_p)(
		"MapTexture2DINTEL",
		"""
		Attempts to return a direct pointer to the graphics storage for 2D texture indicated by the {@code texture} parameter.

		<b>LWJGL note</b>: If glMapTexture2DINTEL without an explicit length argument is used and direct-state-access functionality is not available in the
		current context, the texture object must currently be bound to the GL_TEXTURE_2D target.
		""",

		GLuint.IN("texture", "the texture to map"),
		GLint.IN("level", "the mipmap level-of-detail of the texture"),
		GLbitfield.IN("access", "the type of access that will be performed by the application", "GL30#MAP_READ_BIT GL30#MAP_WRITE_BIT"),
		Check(1) _ GLint_p.OUT("stride", "returns the distance in bytes between subsequent rows in the texture"),
		Check(1) _ GLenum_p.OUT("layout", "returns the internal layout of the texture in the graphics memory")
	)
}