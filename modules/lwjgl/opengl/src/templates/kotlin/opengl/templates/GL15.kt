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
    documentation =
        """
        The OpenGL functionality up to version 1.5. Includes the deprecated symbols of the Compatibility Profile.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "vertex_buffer_object"),
            registryLinkTo("ARB", "occlusion_query"),
            registryLinkTo("EXT", "shadow_funcs")
        )}
        """

    IntConstant(
        "New token names.",

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
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData,
        GetBufferParameteriv, and GetBufferPointerv.
        """,

        "ARRAY_BUFFER"..0x8892,
        "ELEMENT_ARRAY_BUFFER"..0x8893
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

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
        "Accepted by the {@code pname} parameter of GetVertexAttribiv.",

        "VERTEX_ATTRIB_ARRAY_BUFFER_BINDING"..0x889F
    )

    IntConstant(
        "Accepted by the {@code usage} parameter of BufferData.",

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
        "Accepted by the {@code access} parameter of MapBuffer.",

        "READ_ONLY"..0x88B8,
        "WRITE_ONLY"..0x88B9,
        "READ_WRITE"..0x88BA
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBufferParameteriv.",

        "BUFFER_SIZE"..0x8764,
        "BUFFER_USAGE"..0x8765,
        "BUFFER_ACCESS"..0x88BB,
        "BUFFER_MAPPED"..0x88BC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBufferPointerv.",

        "BUFFER_MAP_POINTER"..0x88BD
    )

    GL15C reuse "BindBuffer"
    GL15C reuse "DeleteBuffers"
    GL15C reuse "GenBuffers"
    GL15C reuse "IsBuffer"
    GL15C reuse "BufferData"
    GL15C reuse "BufferSubData"
    GL15C reuse "GetBufferSubData"
    GL15C reuse "MapBuffer"
    GL15C reuse "UnmapBuffer"
    GL15C reuse "GetBufferParameteriv"
    GL15C reuse "GetBufferPointerv"

    // ARB_occlusion_query

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "SAMPLES_PASSED"..0x8914
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryiv.",

        "QUERY_COUNTER_BITS"..0x8864,
        "CURRENT_QUERY"..0x8865
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryObjectiv and GetQueryObjectuiv.",

        "QUERY_RESULT"..0x8866,
        "QUERY_RESULT_AVAILABLE"..0x8867
    )

    GL15C reuse "GenQueries"
    GL15C reuse "DeleteQueries"
    GL15C reuse "IsQuery"
    GL15C reuse "BeginQuery"
    GL15C reuse "EndQuery"
    GL15C reuse "GetQueryiv"
    GL15C reuse "GetQueryObjectiv"
    GL15C reuse "GetQueryObjectuiv"
}