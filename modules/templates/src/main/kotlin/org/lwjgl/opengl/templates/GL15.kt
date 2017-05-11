/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val BUFFER_OBJECT_TARGETS =
    """
    #ARRAY_BUFFER #ELEMENT_ARRAY_BUFFER #PIXEL_PACK_BUFFER #PIXEL_UNPACK_BUFFER #TRANSFORM_FEEDBACK_BUFFER
    #UNIFORM_BUFFER #TEXTURE_BUFFER #COPY_READ_BUFFER #COPY_WRITE_BUFFER #DRAW_INDIRECT_BUFFER #ATOMIC_COUNTER_BUFFER
    #DISPATCH_INDIRECT_BUFFER #SHADER_STORAGE_BUFFER #PARAMETER_BUFFER_ARB
    """

val BUFFER_OBJECT_PARAMETERS =
    """
    GL15#GL_BUFFER_SIZE #BUFFER_USAGE #BUFFER_ACCESS #BUFFER_MAPPED #BUFFER_ACCESS_FLAGS #BUFFER_MAP_LENGTH #BUFFER_MAP_OFFSET
    #BUFFER_IMMUTABLE_STORAGE #BUFFER_STORAGE_FLAGS
    """

val QUERY_TARGETS =
    """
    #SAMPLES_PASSED #PRIMITIVES_GENERATED #TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN #TIME_ELAPSED #TIMESTAMP
    #ANY_SAMPLES_PASSED #ANY_SAMPLES_PASSED_CONSERVATIVE
    """

val GL15 = "GL15".nativeClassGL("GL15") {
    documentation =
        """
        The core OpenGL 1.5 functionality.

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

    val BUFFER_OBJECT_USAGE_HINTS = IntConstant(
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
    ).javaDocLinks

    val BUFFER_OBJECT_ACCESS_POLICIES = IntConstant(
        "Accepted by the {@code access} parameter of MapBuffer.",

        "READ_ONLY"..0x88B8,
        "WRITE_ONLY"..0x88B9,
        "READ_WRITE"..0x88BA
    ).javaDocLinks

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

    void(
        "BindBuffer",
        "Binds a named buffer object.",

        GLenum.IN("target", "the target to which the buffer object is bound", BUFFER_OBJECT_TARGETS),
        GLuint.IN("buffer", "the name of a buffer object")
    )

    void(
        "DeleteBuffers",
        "Deletes named buffer objects.",

        AutoSize("buffers")..GLsizei.IN("n", "the number of buffer objects to be deleted"),
        SingleValue("buffer")..const..GLuint_p.IN("buffers", "an array of buffer objects to be deleted")
    )

    void(
        "GenBuffers",
        "Generates buffer object names.",

        AutoSize("buffers")..GLsizei.IN("n", "the number of buffer object names to be generated"),
        ReturnParam..GLuint_p.OUT("buffers", "a buffer in which the generated buffer object names are stored")
    )

    GLboolean(
        "IsBuffer",
        "Determines if a name corresponds to a buffer object.",

        GLuint.IN("buffer", "a value that may be the name of a buffer object")
    )

    void(
        "BufferData",
        """
        Creates and initializes a buffer object's data store.

        {@code usage} is a hint to the GL implementation as to how a buffer object's data store will be accessed. This enables the GL implementation to make
        more intelligent decisions that may significantly impact buffer object performance. It does not, however, constrain the actual usage of the data store.
        {@code usage} can be broken down into two parts: first, the frequency of access (modification and usage), and second, the nature of that access. The
        frequency of access may be one of these:
        ${ul(
            "<em>STREAM</em> - The data store contents will be modified once and used at most a few times.",
            "<em>STATIC</em> - The data store contents will be modified once and used many times.",
            "<em>DYNAMIC</em> - The data store contents will be modified repeatedly and used many times."
        )}
        The nature of access may be one of these:
        ${ul(
            "<em>DRAW</em> - The data store contents are modified by the application, and used as the source for GL drawing and image specification commands.",
            "<em>READ</em> - The data store contents are modified by reading data from the GL, and used to return that data when queried by the application.",
            "<em>COPY</em> - The data store contents are modified by reading data from the GL, and used as the source for GL drawing and image specification commands."
        )}
        """,

        GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
        AutoSize("data")..GLsizeiptr.IN("size", "the size in bytes of the buffer object's new data store"),
        optional..MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..const..void_p.IN("data", "a pointer to data that will be copied into the data store for initialization, or #NULL if no data is to be copied"),
        GLenum.IN("usage", "the expected usage pattern of the data store", BUFFER_OBJECT_USAGE_HINTS)
    )

    void(
        "BufferSubData",
        "Updates a subset of a buffer object's data store.",

        GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
        GLintptr.IN("offset", "the offset into the buffer object's data store where data replacement will begin, measured in bytes"),
        AutoSize("data")..GLsizeiptr.IN("size", "the size in bytes of the data store region being replaced"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..const..void_p.IN("data", "a pointer to the new data that will be copied into the data store")
    )

    void(
        "GetBufferSubData",
        "Returns a subset of a buffer object's data store.",

        GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
        GLintptr.IN("offset", "the offset into the buffer object's data store from which data will be returned, measured in bytes"),
        AutoSize("data")..GLsizeiptr.IN("size", "the size in bytes of the data store region being returned"),
        MultiType(
            PointerMapping.DATA_SHORT,
            PointerMapping.DATA_INT,
            PointerMapping.DATA_FLOAT,
            PointerMapping.DATA_DOUBLE
        )..void_p.IN("data", "a pointer to the location where buffer object data is returned")
    )

    MapPointer("glGetBufferParameteri(target, GL_BUFFER_SIZE)")..void_p(
        "MapBuffer",
        """
        Maps a buffer object's data store.

        <b>LWJGL note</b>: This method comes in 3 flavors:
        ${ol(
            "#MapBuffer(int, int) - Calls #GetBufferParameteriv() to retrieve the buffer size and a new ByteBuffer instance is always returned.",
            "#MapBuffer(int, int, ByteBuffer) - Calls #GetBufferParameteriv() to retrieve the buffer size and the {@code old_buffer} parameter is reused if not null.",
            "#MapBuffer(int, int, long, ByteBuffer) - The buffer size is explicitly specified and the {@code old_buffer} parameter is reused if not null. This is the most efficient method."
        )}
        """,

        GLenum.IN("target", "the target buffer object being mapped", BUFFER_OBJECT_TARGETS),
        GLenum.IN(
            "access",
            "the access policy, indicating whether it will be possible to read from, write to, or both read from and write to the buffer object's mapped data store",
            BUFFER_OBJECT_ACCESS_POLICIES
        )
    )

    GLboolean(
        "UnmapBuffer",
        """
        Relinquishes the mapping of a buffer object and invalidates the pointer to its data store.

        Returns TRUE unless data values in the buffer’s data store have become corrupted during the period that the buffer was mapped. Such corruption can be
        the result of a screen resolution change or other window system-dependent event that causes system heaps such as those for high-performance graphics
        memory to be discarded. GL implementations must guarantee that such corruption can occur only during the periods that a buffer’s data store is mapped.
        If such corruption has occurred, UnmapBuffer returns FALSE, and the contents of the buffer’s data store become undefined.
        """,

        GLenum.IN("target", "the target buffer object being unmapped", BUFFER_OBJECT_TARGETS)
    )

    void(
        "GetBufferParameteriv",
        "Returns the value of a buffer object parameter.",

        GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
        GLenum.IN("pname", "the symbolic name of a buffer object parameter", BUFFER_OBJECT_PARAMETERS),
        Check(1)..ReturnParam..GLint_p.OUT("params", "the requested parameter")
    )

    void(
        "GetBufferPointerv",
        "Returns the pointer to a mapped buffer object's data store.",

        GLenum.IN("target", "the target buffer object", BUFFER_OBJECT_TARGETS),
        GLenum.IN("pname", "the pointer to be returned", "#BUFFER_MAP_POINTER"),
        Check(1)..ReturnParam..void_pp.OUT("params", "the pointer value specified by {@code pname}")
    )

    // ARB_occlusion_query

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "SAMPLES_PASSED"..0x8914
    )

    val QUERY_PARAMETERS = IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryiv.",

        "QUERY_COUNTER_BITS"..0x8864,
        "CURRENT_QUERY"..0x8865
    ).javaDocLinks

    val QUERY_OBJECT_PARAMETERS = IntConstant(
        "Accepted by the {@code pname} parameter of GetQueryObjectiv and GetQueryObjectuiv.",

        "QUERY_RESULT"..0x8866,
        "QUERY_RESULT_AVAILABLE"..0x8867
    ).javaDocLinks

    void(
        "GenQueries",
        "Generates query object names.",

        AutoSize("ids")..GLsizei.IN("n", "the number of query object names to be generated"),
        ReturnParam..GLuint_p.OUT("ids", "a buffer in which the generated query object names are stored")
    )

    void(
        "DeleteQueries",
        "Deletes named query objects.",

        AutoSize("ids")..GLsizei.IN("n", "the number of query objects to be deleted"),
        SingleValue("id")..const..GLuint_p.IN("ids", "an array of query objects to be deleted")
    )

    GLboolean(
        "IsQuery",
        "Determine if a name corresponds to a query object.",

        GLuint.IN("id", "a value that may be the name of a query object")
    )

    void(
        "BeginQuery",
        "Creates a query object and makes it active.",

        GLenum.IN("target", "the target type of query object established", QUERY_TARGETS),
        GLuint.IN("id", "the name of a query object")
    )

    void(
        "EndQuery",
        "Marks the end of the sequence of commands to be tracked for the active query specified by {@code target}.",

        GLenum.IN("target", "the query object target", QUERY_TARGETS)
    )

    void(
        "GetQueryiv",
        "Returns parameters of a query object target.",

        GLenum.IN("target", "the query object target", QUERY_TARGETS),
        GLenum.IN("pname", "the symbolic name of a query object target parameter", QUERY_PARAMETERS),
        Check(1)..ReturnParam..GLint_p.OUT("params", "the requested data")
    )

    void(
        "GetQueryObjectiv",
        "Returns the integer value of a query object parameter.",

        GLuint.IN("id", "the name of a query object"),
        GLenum.IN("pname", "the symbolic name of a query object parameter", QUERY_OBJECT_PARAMETERS),
        Check(1)..ReturnParam..GLint_p.OUT("params", "the requested data")
    )

    void(
        "GetQueryObjectuiv",
        "Unsigned version of #GetQueryObjectiv().",

        GLuint.IN("id", "the name of a query object"),
        GLenum.IN("pname", "the symbolic name of a query object parameter", QUERY_OBJECT_PARAMETERS),
        Check(1)..ReturnParam..GLuint_p.OUT("params", "the requested data")
    )

}