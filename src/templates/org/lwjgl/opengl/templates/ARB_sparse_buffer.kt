/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_sparse_buffer = "ARBSparseBuffer".nativeClassGL("ARB_sparse_buffer", postfix = ARB) {
	nativeImport (
		"OpenGL.h"
	)

	documentation =
		"""
		Native bindings to the $registryLink extension.

		This extension adds to GL a mechanism to decouple the virtual and physical storage requirements of textures and allows an application
		to create partially populated textures that would over-subscribe available graphics memory if made fully resident. This extension provides like
		functionality for buffer objects, allowing applications to manage buffer object storage in a similar manner.

		Requires ${GL15.core} or ${ARB_vertex_buffer_object.link}.
		"""

	IntConstant(
		"Accepted as part of the the {@code flags} parameter to GL44#BufferStorage().",

		"SPARSE_STORAGE_BIT_ARB" _ 0x0400
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, GetIntegerv, and GetInteger64v.",

		"SPARSE_BUFFER_PAGE_SIZE_ARB" _ 0x82F8
	)

	GLvoid(
		"BufferPageCommitmentARB",
		"Commit and de-commits regions of sparse buffer storage.",

		GLenum.IN("target", "buffer object target", BUFFER_OBJECT_TARGETS),
		GLintptr.IN("offset", "the region offset. Must be an integer multiple of the implementation dependent constant #SPARSE_BUFFER_PAGE_SIZE_ARB."),
		GLsizeiptr.IN("size", "the data size. must either be a multiple of #SPARSE_BUFFER_PAGE_SIZE_ARB, or extend to the end of the buffer's data store."),
		GLboolean.IN(
			"commit",
			"""
			If true, then pages contained in the specified range become committed and become physically backed. If false, then physical storage associated with
			the data store in the specified region may be freed and those pages become uncommitted. Newly committed pages have undefined content. However,
			redundantly committing pages does not alter their content.
			"""
		)
	)

	DependsOn("GL_EXT_direct_state_access") _ GLvoid(
		"NamedBufferPageCommitmentEXT",
		"Direct-state-access version of #BufferPageCommitmentARB().",

		GLuint.IN("buffer", "the buffer object"),
		GLintptr.IN("offset", "the region offset. Must be an integer multiple of the implementation dependent constant #SPARSE_BUFFER_PAGE_SIZE_ARB."),
		GLsizeiptr.IN("size", "the data size. must either be a multiple of #SPARSE_BUFFER_PAGE_SIZE_ARB, or extend to the end of the buffer's data store."),
		GLboolean.IN("commit", "the commit state")
	)

	DependsOn("GL_ARB_direct_state_access") _ GLvoid(
		"NamedBufferPageCommitmentARB",
		"Direct-state-access version of #BufferPageCommitmentARB().",

		GLuint.IN("buffer", "the buffer object"),
		GLintptr.IN("offset", "the region offset. Must be an integer multiple of the implementation dependent constant #SPARSE_BUFFER_PAGE_SIZE_ARB."),
		GLsizeiptr.IN("size", "the data size. must either be a multiple of #SPARSE_BUFFER_PAGE_SIZE_ARB, or extend to the end of the buffer's data store."),
		GLboolean.IN("commit", "the commit state")
	)
}