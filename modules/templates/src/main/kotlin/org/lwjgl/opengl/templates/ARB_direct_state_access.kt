/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_direct_state_access = "ARBDirectStateAccess".nativeClassGL("ARB_direct_state_access") {
	documentation =
		"""
		Native bindings to the $registryLink extension.

		In unextended OpenGL, most mutation of state contained in objects is through an indirection known as a binding. Objects are attached to a context
		(either directly or indirectly via a container) and then commands to modify or query their state are issued on that context, indirecting through its
		attachments and into the underlying object. This is known as `bind-to-edit'.

		This extension derives from the GL_EXT_direct_state_access extension, which added accessors for most state on most objects, allowing it to be queried
		and modified without the object needing to be bound to a context. In cases where a single property of an object is to be modified, directly accessing
		its state can be more efficient than binding the object to the context and then indirecting through it. Further, directly accessing the state of objects
		through their names rather than by bind-to-edit does not disturb the bindings of the current context, which is useful for tools, middleware and other
		applications that are unaware of the outer state but it can also avoid cases of redundant state changes.

		Requires ${GL20.core}. ${GL45.promoted}
		"""

	IntConstant(
		"Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v.",

		"TEXTURE_TARGET" _ 0x1006
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetQueryObjectiv.",

		"QUERY_TARGET" _ 0x82EA
	)

	IntConstant(
		"Accepted by the {@code pname} parameter of GetIntegeri_v.",

		"TEXTURE_BINDING" _ 0x82EB
	)

	GL45 reuse "CreateTransformFeedbacks"
	GL45 reuse "TransformFeedbackBufferBase"
	GL45 reuse "TransformFeedbackBufferRange"
	GL45 reuse "GetTransformFeedbackiv"
	GL45 reuse "GetTransformFeedbacki_v"
	GL45 reuse "GetTransformFeedbacki64_v"
	GL45 reuse "CreateBuffers"
	GL45 reuse "NamedBufferStorage"
	GL45 reuse "NamedBufferData"
	GL45 reuse "NamedBufferSubData"
	GL45 reuse "CopyNamedBufferSubData"
	GL45 reuse "ClearNamedBufferData"
	GL45 reuse "ClearNamedBufferSubData"
	GL45 reuse "MapNamedBuffer"
	GL45 reuse "MapNamedBufferRange"
	GL45 reuse "UnmapNamedBuffer"
	GL45 reuse "FlushMappedNamedBufferRange"
	GL45 reuse "GetNamedBufferParameteriv"
	GL45 reuse "GetNamedBufferParameteri64v"
	GL45 reuse "GetNamedBufferPointerv"
	GL45 reuse "GetNamedBufferSubData"
	GL45 reuse "CreateFramebuffers"
	GL45 reuse "NamedFramebufferRenderbuffer"
	GL45 reuse "NamedFramebufferParameteri"
	GL45 reuse "NamedFramebufferTexture"
	GL45 reuse "NamedFramebufferTextureLayer"
	GL45 reuse "NamedFramebufferDrawBuffer"
	GL45 reuse "NamedFramebufferDrawBuffers"
	GL45 reuse "NamedFramebufferReadBuffer"
	GL45 reuse "InvalidateNamedFramebufferData"
	GL45 reuse "InvalidateNamedFramebufferSubData"
	GL45 reuse "ClearNamedFramebufferiv"
	GL45 reuse "ClearNamedFramebufferuiv"
	GL45 reuse "ClearNamedFramebufferfv"
	GL45 reuse "ClearNamedFramebufferfi"
	GL45 reuse "BlitNamedFramebuffer"
	GL45 reuse "CheckNamedFramebufferStatus"
	GL45 reuse "GetNamedFramebufferParameteriv"
	GL45 reuse "GetNamedFramebufferAttachmentParameteriv"
	GL45 reuse "CreateRenderbuffers"
	GL45 reuse "NamedRenderbufferStorage"
	GL45 reuse "NamedRenderbufferStorageMultisample"
	GL45 reuse "GetNamedRenderbufferParameteriv"
	GL45 reuse "CreateTextures"
	GL45 reuse "TextureBuffer"
	GL45 reuse "TextureBufferRange"
	GL45 reuse "TextureStorage1D"
	GL45 reuse "TextureStorage2D"
	GL45 reuse "TextureStorage3D"
	GL45 reuse "TextureStorage2DMultisample"
	GL45 reuse "TextureStorage3DMultisample"
	GL45 reuse "TextureSubImage1D"
	GL45 reuse "TextureSubImage2D"
	GL45 reuse "TextureSubImage3D"
	GL45 reuse "CompressedTextureSubImage1D"
	GL45 reuse "CompressedTextureSubImage2D"
	GL45 reuse "CompressedTextureSubImage3D"
	GL45 reuse "CopyTextureSubImage1D"
	GL45 reuse "CopyTextureSubImage2D"
	GL45 reuse "CopyTextureSubImage3D"
	GL45 reuse "TextureParameterf"
	GL45 reuse "TextureParameterfv"
	GL45 reuse "TextureParameteri"
	GL45 reuse "TextureParameterIiv"
	GL45 reuse "TextureParameterIuiv"
	GL45 reuse "TextureParameteriv"
	GL45 reuse "GenerateTextureMipmap"
	GL45 reuse "BindTextureUnit"
	GL45 reuse "GetTextureImage"
	GL45 reuse "GetCompressedTextureImage"
	GL45 reuse "GetTextureLevelParameterfv"
	GL45 reuse "GetTextureLevelParameteriv"
	GL45 reuse "GetTextureParameterfv"
	GL45 reuse "GetTextureParameterIiv"
	GL45 reuse "GetTextureParameterIuiv"
	GL45 reuse "GetTextureParameteriv"
	GL45 reuse "CreateVertexArrays"
	GL45 reuse "DisableVertexArrayAttrib"
	GL45 reuse "EnableVertexArrayAttrib"
	GL45 reuse "VertexArrayElementBuffer"
	GL45 reuse "VertexArrayVertexBuffer"
	GL45 reuse "VertexArrayVertexBuffers"
	GL45 reuse "VertexArrayAttribFormat"
	GL45 reuse "VertexArrayAttribIFormat"
	GL45 reuse "VertexArrayAttribLFormat"
	GL45 reuse "VertexArrayAttribBinding"
	GL45 reuse "VertexArrayBindingDivisor"
	GL45 reuse "GetVertexArrayiv"
	GL45 reuse "GetVertexArrayIndexediv"
	GL45 reuse "GetVertexArrayIndexed64iv"
	GL45 reuse "CreateSamplers"
	GL45 reuse "CreateProgramPipelines"
	GL45 reuse "CreateQueries"
}