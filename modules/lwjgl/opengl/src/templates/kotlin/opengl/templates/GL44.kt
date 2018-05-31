/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL44 = "GL44".nativeClassGL("GL44") {
    extends = GL43
    documentation =
        """
        The OpenGL functionality up to version 4.4. Includes the deprecated symbols of the Compatibility Profile.

        OpenGL 4.4 implementations support revision 4.40 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "buffer_storage"),
            registryLinkTo("ARB", "clear_texture"),
            registryLinkTo("ARB", "enhanced_layouts"),
            registryLinkTo("ARB", "multi_bind"),
            registryLinkTo("ARB", "query_buffer_object"),
            registryLinkTo("ARB", "texture_mirror_clamp_to_edge"),
            registryLinkTo("ARB", "texture_stencil8"),
            registryLinkTo("ARB", "vertex_type_10f_11f_11f_rev")
        )}
        """

    IntConstant(
        "Implementation-dependent state which constrains the maximum value of stride parameters to vertex array pointer-setting commands.",

        "MAX_VERTEX_ATTRIB_STRIDE"..0x82E5
    )

    IntConstant(
        """
        Implementations are not required to support primitive restart for separate patch primitives (primitive type PATCHES). Support can be queried by calling
        GetBooleanv with the symbolic constant PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED. A value of FALSE indicates that primitive restart is treated as
        disabled when drawing patches, no matter the value of the enables. A value of TRUE indicates that primitive restart behaves normally for patches.
        """,

        "PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED"..0x8221
    )

    IntConstant(
        "Equivalent to #TEXTURE_BUFFER_ARB query, but named more consistently.",

        "TEXTURE_BUFFER_BINDING"..0x8C2A
    )

    // ARB_buffer_storage

    IntConstant(
        "Accepted in the {@code flags} parameter of #BufferStorage() and #NamedBufferStorageEXT().",

        "MAP_PERSISTENT_BIT"..0x0040,
        "MAP_COHERENT_BIT"..0x0080,
        "DYNAMIC_STORAGE_BIT"..0x0100,
        "CLIENT_STORAGE_BIT"..0x0200
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of {@code GetBufferParameter&#123;i|i64&#125;v}.",

        "BUFFER_IMMUTABLE_STORAGE"..0x821F,
        "BUFFER_STORAGE_FLAGS"..0x8220
    )

    IntConstant(
        "Accepted by the {@code barriers} parameter of #MemoryBarrier().",

        "CLIENT_MAPPED_BUFFER_BARRIER_BIT"..0x00004000
    )

    GL44C reuse "BufferStorage"

    // ARB_clear_texture

    IntConstant(
        "Accepted by the {@code pname} parameter for #GetInternalformativ() and #GetInternalformati64v().",

        "CLEAR_TEXTURE"..0x9365
    )

    GL44C reuse "ClearTexSubImage"
    GL44C reuse "ClearTexImage"

    // ARB_enhanced_layouts

    IntConstant(
        "Accepted in the {@code props} array of #GetProgramResourceiv().",

        "LOCATION_COMPONENT"..0x934A,
        "TRANSFORM_FEEDBACK_BUFFER_INDEX"..0x934B,
        "TRANSFORM_FEEDBACK_BUFFER_STRIDE"..0x934C
    )

    // ARB_multi_bind

    GL44C reuse "BindBuffersBase"
    GL44C reuse "BindBuffersRange"
    GL44C reuse "BindTextures"
    GL44C reuse "BindSamplers"
    GL44C reuse "BindImageTextures"
    GL44C reuse "BindVertexBuffers"

    // ARB_query_buffer_object

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetQueryObjectiv(), #GetQueryObjectuiv(), #GetQueryObjecti64v() and #GetQueryObjectui64v().",

        "QUERY_RESULT_NO_WAIT"..0x9194
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of #BindBuffer(), #BufferData(), #BufferSubData(),
        #MapBuffer(), #UnmapBuffer(), #MapBufferRange(), #GetBufferSubData(),
        #GetBufferParameteriv(), #GetBufferParameteri64v(), #GetBufferPointerv(),
        #ClearBufferSubData(), and the {@code readtarget} and {@code writetarget} parameters of #CopyBufferSubData().
        """,

        "QUERY_BUFFER"..0x9192
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of #GetBooleanv(), #GetIntegerv(), #GetFloatv(),
        and #GetDoublev().
        """,

        "QUERY_BUFFER_BINDING"..0x9193
    )

    IntConstant(
        "Accepted in the {@code barriers} bitfield in #MemoryBarrier().",

        "QUERY_BUFFER_BARRIER_BIT"..0x00008000
    )

    // ARB_texture_mirror_clamp_to_edge

    IntConstant(
        """
        Accepted by the {@code param} parameter of TexParameter{if}, SamplerParameter{if} and SamplerParameter{if}v, and by the {@code params} parameter of
        TexParameter{if}v, TexParameterI{i ui}v and SamplerParameterI{i ui}v when their {@code pname} parameter is #TEXTURE_WRAP_S, #TEXTURE_WRAP_T, or
        #TEXTURE_WRAP_R,
        """,

        "MIRROR_CLAMP_TO_EDGE"..0x8743
    )
}