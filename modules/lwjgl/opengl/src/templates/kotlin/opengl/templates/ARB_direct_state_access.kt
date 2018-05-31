/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

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

        Requires ${GL20.core}. ${GL45C.promoted}
        """

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTextureParameter{if}v and GetTextureParameterI{i ui}v.",

        "TEXTURE_TARGET"..0x1006
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryObjectiv.",

        "QUERY_TARGET"..0x82EA
    )

    fun checkExtensionPresent(core: String, extension: String) {
        customMethod("""
    private static boolean $extension(java.util.Set<String> ext) {
        return ext.contains("OpenGL$core") || ext.contains("GL_$extension");
    }
    """)
    }

    checkExtensionPresent("30", "ARB_framebuffer_object")
    checkExtensionPresent("30", "ARB_map_buffer_range")
    checkExtensionPresent("30", "ARB_vertex_array_object")
    checkExtensionPresent("31", "ARB_copy_buffer")
    checkExtensionPresent("31", "ARB_texture_buffer_object") // TextureBuffer
    checkExtensionPresent("31", "ARB_uniform_buffer_object") // TransformFeedbackBufferBase, TransformFeedbackBufferRange
    checkExtensionPresent("33", "ARB_instanced_arrays")
    checkExtensionPresent("33", "ARB_sampler_objects")
    checkExtensionPresent("40", "ARB_transform_feedback2")
    checkExtensionPresent("41", "ARB_vertex_attrib_64bit")
    checkExtensionPresent("41", "ARB_separate_shader_objects")
    checkExtensionPresent("42", "ARB_texture_storage")
    checkExtensionPresent("43", "ARB_texture_storage_multisample")
    checkExtensionPresent("43", "ARB_vertex_attrib_binding")
    checkExtensionPresent("43", "ARB_invalidate_subdata")
    checkExtensionPresent("43", "ARB_texture_buffer_range")
    checkExtensionPresent("43", "ARB_clear_buffer_object")
    checkExtensionPresent("43", "ARB_framebuffer_no_attachments")
    checkExtensionPresent("44", "ARB_buffer_storage")
    checkExtensionPresent("44", "ARB_clear_texture")
    checkExtensionPresent("44", "ARB_multi_bind")
    checkExtensionPresent("44", "ARB_query_buffer_object")

    fun dsa(extension: String, func: String) {
        DependsOn("$extension(ext)")..(GL45C reuse func)
    }

    dsa("ARB_transform_feedback2", "CreateTransformFeedbacks")
    dsa("ARB_uniform_buffer_object", "TransformFeedbackBufferBase") // TODO: interaction not mentioned, spec bug?
    dsa("ARB_uniform_buffer_object", "TransformFeedbackBufferRange") // TODO: interaction not mentioned, spec bug?
    dsa("ARB_transform_feedback2", "GetTransformFeedbackiv")
    dsa("ARB_transform_feedback2", "GetTransformFeedbacki_v")
    dsa("ARB_transform_feedback2", "GetTransformFeedbacki64_v")
    GL45C reuse "CreateBuffers"
    dsa("ARB_buffer_storage", "NamedBufferStorage")
    GL45C reuse "NamedBufferData"
    GL45C reuse "NamedBufferSubData"
    dsa("ARB_copy_buffer", "CopyNamedBufferSubData")
    dsa("ARB_clear_texture", "ClearNamedBufferData")
    dsa("ARB_clear_texture", "ClearNamedBufferSubData")
    GL45C reuse "MapNamedBuffer"
    dsa("ARB_map_buffer_range", "MapNamedBufferRange")
    GL45C reuse "UnmapNamedBuffer"
    dsa("ARB_map_buffer_range", "FlushMappedNamedBufferRange")
    GL45C reuse "GetNamedBufferParameteriv"
    GL45C reuse "GetNamedBufferParameteri64v"
    GL45C reuse "GetNamedBufferPointerv"
    GL45C reuse "GetNamedBufferSubData"
    dsa("ARB_framebuffer_object", "CreateFramebuffers")
    dsa("ARB_framebuffer_object", "NamedFramebufferRenderbuffer")
    dsa("ARB_framebuffer_no_attachments", "NamedFramebufferParameteri")
    dsa("ARB_framebuffer_object", "NamedFramebufferTexture")
    dsa("ARB_framebuffer_object", "NamedFramebufferTextureLayer")
    dsa("ARB_framebuffer_object", "NamedFramebufferDrawBuffer")
    dsa("ARB_framebuffer_object", "NamedFramebufferDrawBuffers")
    dsa("ARB_framebuffer_object", "NamedFramebufferReadBuffer")
    dsa("ARB_invalidate_subdata", "InvalidateNamedFramebufferData")
    dsa("ARB_invalidate_subdata", "InvalidateNamedFramebufferSubData")
    dsa("ARB_framebuffer_object", "ClearNamedFramebufferiv")
    dsa("ARB_framebuffer_object", "ClearNamedFramebufferuiv")
    dsa("ARB_framebuffer_object", "ClearNamedFramebufferfv")
    dsa("ARB_framebuffer_object", "ClearNamedFramebufferfi")
    dsa("ARB_framebuffer_object", "BlitNamedFramebuffer")
    dsa("ARB_framebuffer_object", "CheckNamedFramebufferStatus")
    dsa("ARB_framebuffer_no_attachments", "GetNamedFramebufferParameteriv")
    dsa("ARB_framebuffer_object", "GetNamedFramebufferAttachmentParameteriv")
    dsa("ARB_framebuffer_object", "CreateRenderbuffers")
    dsa("ARB_framebuffer_object", "NamedRenderbufferStorage")
    dsa("ARB_framebuffer_object", "NamedRenderbufferStorageMultisample")
    dsa("ARB_framebuffer_object", "GetNamedRenderbufferParameteriv")
    GL45C reuse "CreateTextures"
    dsa("ARB_texture_buffer_object", "TextureBuffer") // TODO: TextureBuffer depends on ARB_transform_feedback2? spec bug?
    dsa("ARB_texture_buffer_range", "TextureBufferRange")
    dsa("ARB_texture_storage", "TextureStorage1D")
    dsa("ARB_texture_storage", "TextureStorage2D")
    dsa("ARB_texture_storage", "TextureStorage3D")
    dsa("ARB_texture_storage_multisample", "TextureStorage2DMultisample")
    dsa("ARB_texture_storage_multisample", "TextureStorage3DMultisample")
    GL45C reuse "TextureSubImage1D"
    GL45C reuse "TextureSubImage2D"
    GL45C reuse "TextureSubImage3D"
    GL45C reuse "CompressedTextureSubImage1D"
    GL45C reuse "CompressedTextureSubImage2D"
    GL45C reuse "CompressedTextureSubImage3D"
    GL45C reuse "CopyTextureSubImage1D"
    GL45C reuse "CopyTextureSubImage2D"
    GL45C reuse "CopyTextureSubImage3D"
    GL45C reuse "TextureParameterf"
    GL45C reuse "TextureParameterfv"
    GL45C reuse "TextureParameteri"
    GL45C reuse "TextureParameterIiv"
    GL45C reuse "TextureParameterIuiv"
    GL45C reuse "TextureParameteriv"
    dsa("ARB_framebuffer_object", "GenerateTextureMipmap")
    GL45C reuse "BindTextureUnit"
    GL45C reuse "GetTextureImage"
    GL45C reuse "GetCompressedTextureImage"
    GL45C reuse "GetTextureLevelParameterfv"
    GL45C reuse "GetTextureLevelParameteriv"
    GL45C reuse "GetTextureParameterfv"
    GL45C reuse "GetTextureParameterIiv"
    GL45C reuse "GetTextureParameterIuiv"
    GL45C reuse "GetTextureParameteriv"
    dsa("ARB_vertex_array_object", "CreateVertexArrays")
    dsa("ARB_vertex_array_object", "DisableVertexArrayAttrib")
    dsa("ARB_vertex_array_object", "EnableVertexArrayAttrib")
    dsa("ARB_vertex_array_object", "VertexArrayElementBuffer")
    dsa("ARB_vertex_attrib_binding", "VertexArrayVertexBuffer")
    dsa("ARB_multi_bind", "VertexArrayVertexBuffers")
    dsa("ARB_vertex_attrib_binding", "VertexArrayAttribFormat")
    dsa("ARB_vertex_attrib_binding", "VertexArrayAttribIFormat")
    dsa("ARB_vertex_attrib_binding", "VertexArrayAttribLFormat")
    dsa("ARB_vertex_attrib_binding", "VertexArrayAttribBinding")
    dsa("ARB_vertex_attrib_binding", "VertexArrayBindingDivisor")
    dsa("ARB_vertex_array_object", "GetVertexArrayiv")
    dsa("ARB_vertex_array_object", "GetVertexArrayIndexediv")
    dsa("ARB_vertex_array_object", "GetVertexArrayIndexed64iv")
    dsa("ARB_sampler_objects", "CreateSamplers")
    dsa("ARB_separate_shader_objects", "CreateProgramPipelines")
    GL45C reuse "CreateQueries"
    dsa("ARB_query_buffer_object", "GetQueryBufferObjecti64v")
    dsa("ARB_query_buffer_object", "GetQueryBufferObjectiv")
    dsa("ARB_query_buffer_object", "GetQueryBufferObjectui64v")
    dsa("ARB_query_buffer_object", "GetQueryBufferObjectuiv")
}