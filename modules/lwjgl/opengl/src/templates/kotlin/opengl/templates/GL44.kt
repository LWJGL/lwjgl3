/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL44 = "GL44".nativeClassGL("GL44") {
    extends = GL43

    IntConstant(
        "MAX_VERTEX_ATTRIB_STRIDE"..0x82E5
    )

    IntConstant(
        "PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED"..0x8221
    )

    IntConstant(
        "TEXTURE_BUFFER_BINDING"..0x8C2A
    )

    // ARB_buffer_storage

    IntConstant(
        "MAP_PERSISTENT_BIT"..0x0040,
        "MAP_COHERENT_BIT"..0x0080,
        "DYNAMIC_STORAGE_BIT"..0x0100,
        "CLIENT_STORAGE_BIT"..0x0200
    )

    IntConstant(
        "BUFFER_IMMUTABLE_STORAGE"..0x821F,
        "BUFFER_STORAGE_FLAGS"..0x8220
    )

    IntConstant(
        "CLIENT_MAPPED_BUFFER_BARRIER_BIT"..0x00004000
    )

    reuse(GL44C, "BufferStorage")

    // ARB_clear_texture

    IntConstant(
        "CLEAR_TEXTURE"..0x9365
    )

    reuse(GL44C, "ClearTexSubImage")
    reuse(GL44C, "ClearTexImage")

    // ARB_enhanced_layouts

    IntConstant(
        "LOCATION_COMPONENT"..0x934A,
        "TRANSFORM_FEEDBACK_BUFFER_INDEX"..0x934B,
        "TRANSFORM_FEEDBACK_BUFFER_STRIDE"..0x934C
    )

    // ARB_multi_bind

    reuse(GL44C, "BindBuffersBase")
    reuse(GL44C, "BindBuffersRange")
    reuse(GL44C, "BindTextures")
    reuse(GL44C, "BindSamplers")
    reuse(GL44C, "BindImageTextures")
    reuse(GL44C, "BindVertexBuffers")

    // ARB_query_buffer_object

    IntConstant(
        "QUERY_RESULT_NO_WAIT"..0x9194
    )

    IntConstant(
        "QUERY_BUFFER"..0x9192
    )

    IntConstant(
        "QUERY_BUFFER_BINDING"..0x9193
    )

    IntConstant(
        "QUERY_BUFFER_BARRIER_BIT"..0x00008000
    )

    // ARB_texture_mirror_clamp_to_edge

    IntConstant(
        "MIRROR_CLAMP_TO_EDGE"..0x8743
    )
}