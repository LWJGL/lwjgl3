/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

const val BUFFER_OBJECT_TARGETS =
    """
    #ARRAY_BUFFER #ELEMENT_ARRAY_BUFFER #PIXEL_PACK_BUFFER #PIXEL_UNPACK_BUFFER #TRANSFORM_FEEDBACK_BUFFER
    #UNIFORM_BUFFER #TEXTURE_BUFFER #COPY_READ_BUFFER #COPY_WRITE_BUFFER #DRAW_INDIRECT_BUFFER #ATOMIC_COUNTER_BUFFER
    #DISPATCH_INDIRECT_BUFFER #SHADER_STORAGE_BUFFER #PARAMETER_BUFFER_ARB
    """

const val BUFFER_OBJECT_PARAMETERS =
    """
    GL15#GL_BUFFER_SIZE #BUFFER_USAGE #BUFFER_ACCESS #BUFFER_MAPPED #BUFFER_ACCESS_FLAGS #BUFFER_MAP_LENGTH #BUFFER_MAP_OFFSET
    #BUFFER_IMMUTABLE_STORAGE #BUFFER_STORAGE_FLAGS
    """

const val QUERY_TARGETS =
    """
    #SAMPLES_PASSED #PRIMITIVES_GENERATED #TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN #TIME_ELAPSED #TIMESTAMP
    #ANY_SAMPLES_PASSED #ANY_SAMPLES_PASSED_CONSERVATIVE
    """

val GL15 = "GL15".nativeClassGL("GL15") {
    extends = GL14

    IntConstant(
        "FOG_COORD_SRC"..0x8450,
        "FOG_COORD"..0x8451,
        "CURRENT_FOG_COORD"..0x8453,
        "FOG_COORD_ARRAY_TYPE"..0x8454,
        "FOG_COORD_ARRAY_STRIDE"..0x8455,
        "FOG_COORD_ARRAY_POINTER"..0x8456,
        "FOG_COORD_ARRAY"..0x8457,
        "FOG_COORD_ARRAY_BUFFER_BINDING"..0x889D,
        "SRC0_RGB"..0x8580,
        "SRC1_RGB"..0x8581,
        "SRC2_RGB"..0x8582,
        "SRC0_ALPHA"..0x8588,
        "SRC1_ALPHA"..0x8589,
        "SRC2_ALPHA"..0x858A
    )

    // ARB_vertex_buffer_object

    IntConstant(
        "ARRAY_BUFFER"..0x8892,
        "ELEMENT_ARRAY_BUFFER"..0x8893
    )

    IntConstant(
        "ARRAY_BUFFER_BINDING"..0x8894,
        "ELEMENT_ARRAY_BUFFER_BINDING"..0x8895,
        "VERTEX_ARRAY_BUFFER_BINDING"..0x8896,
        "NORMAL_ARRAY_BUFFER_BINDING"..0x8897,
        "COLOR_ARRAY_BUFFER_BINDING"..0x8898,
        "INDEX_ARRAY_BUFFER_BINDING"..0x8899,
        "TEXTURE_COORD_ARRAY_BUFFER_BINDING"..0x889A,
        "EDGE_FLAG_ARRAY_BUFFER_BINDING"..0x889B,
        "SECONDARY_COLOR_ARRAY_BUFFER_BINDING"..0x889C,
        "FOG_COORDINATE_ARRAY_BUFFER_BINDING"..0x889D,
        "WEIGHT_ARRAY_BUFFER_BINDING"..0x889E
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_BUFFER_BINDING"..0x889F
    )

    IntConstant(
        "STREAM_DRAW"..0x88E0,
        "STREAM_READ"..0x88E1,
        "STREAM_COPY"..0x88E2,
        "STATIC_DRAW"..0x88E4,
        "STATIC_READ"..0x88E5,
        "STATIC_COPY"..0x88E6,
        "DYNAMIC_DRAW"..0x88E8,
        "DYNAMIC_READ"..0x88E9,
        "DYNAMIC_COPY"..0x88EA
    )

    IntConstant(
        "READ_ONLY"..0x88B8,
        "WRITE_ONLY"..0x88B9,
        "READ_WRITE"..0x88BA
    )

    IntConstant(
        "BUFFER_SIZE"..0x8764,
        "BUFFER_USAGE"..0x8765,
        "BUFFER_ACCESS"..0x88BB,
        "BUFFER_MAPPED"..0x88BC
    )

    IntConstant(
        "BUFFER_MAP_POINTER"..0x88BD
    )

    reuse(GL15C, "BindBuffer")
    reuse(GL15C, "DeleteBuffers")
    reuse(GL15C, "GenBuffers")
    reuse(GL15C, "IsBuffer")
    reuse(GL15C, "BufferData")
    reuse(GL15C, "BufferSubData")
    reuse(GL15C, "GetBufferSubData")
    reuse(GL15C, "MapBuffer")
    reuse(GL15C, "UnmapBuffer")
    reuse(GL15C, "GetBufferParameteriv")
    reuse(GL15C, "GetBufferPointerv")

    // ARB_occlusion_query

    IntConstant(
        "SAMPLES_PASSED"..0x8914
    )

    IntConstant(
        "QUERY_COUNTER_BITS"..0x8864,
        "CURRENT_QUERY"..0x8865
    )

    IntConstant(
        "QUERY_RESULT"..0x8866,
        "QUERY_RESULT_AVAILABLE"..0x8867
    )

    reuse(GL15C, "GenQueries")
    reuse(GL15C, "DeleteQueries")
    reuse(GL15C, "IsQuery")
    reuse(GL15C, "BeginQuery")
    reuse(GL15C, "EndQuery")
    reuse(GL15C, "GetQueryiv")
    reuse(GL15C, "GetQueryObjectiv")
    reuse(GL15C, "GetQueryObjectuiv")
}