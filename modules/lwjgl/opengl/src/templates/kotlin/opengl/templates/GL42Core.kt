/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val GL42C = "GL42C".nativeClassGL("GL42C") {
    extends = GL41C
    documentation =
        """
        The OpenGL functionality up to version 4.2. Includes only Core Profile symbols.

        OpenGL 4.2 implementations support revision 4.20 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "texture_compression_bptc"),
            registryLinkTo("ARB", "compressed_texture_pixel_storage"),
            registryLinkTo("ARB", "shader_atomic_counters"),
            registryLinkTo("ARB", "texture_storage"),
            registryLinkTo("ARB", "transform_feedback_instanced"),
            registryLinkTo("ARB", "base_instance"),
            registryLinkTo("ARB", "shader_image_load_store"),
            "${registryLinkTo("ARB", "conservative_depth")} and ${registryLinkTo("ARB", "shading_language_420pack")}",
            registryLinkTo("ARB", "internalformat_query"),
            registryLinkTo("ARB", "map_buffer_alignment")
        )}
        """

    IntConstant(
        "Renamed tokens.",

        "COPY_READ_BUFFER_BINDING".."GL31.GL_COPY_READ_BUFFER",
        "COPY_WRITE_BUFFER_BINDING".."GL31.GL_COPY_WRITE_BUFFER",

        "TRANSFORM_FEEDBACK_ACTIVE".."GL40.GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE",
        "TRANSFORM_FEEDBACK_PAUSED".."GL40.GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED"
    )

    // ARB_texture_compression_bptc

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, TexImage3D, CopyTexImage2D, CopyTexImage3D, CompressedTexImage2D, and
        CompressedTexImage3D and the {@code format} parameter of CompressedTexSubImage2D and CompressedTexSubImage3D.
        """,

        "COMPRESSED_RGBA_BPTC_UNORM"..0x8E8C,
        "COMPRESSED_SRGB_ALPHA_BPTC_UNORM"..0x8E8D,
        "COMPRESSED_RGB_BPTC_SIGNED_FLOAT"..0x8E8E,
        "COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT"..0x8E8F
    )

    // ARB_compressed_texture_pixel_storage

    IntConstant(
        "Accepted by the {@code pname} parameter of PixelStore[fi], GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "UNPACK_COMPRESSED_BLOCK_WIDTH"..0x9127,
        "UNPACK_COMPRESSED_BLOCK_HEIGHT"..0x9128,
        "UNPACK_COMPRESSED_BLOCK_DEPTH"..0x9129,
        "UNPACK_COMPRESSED_BLOCK_SIZE"..0x912A,
        "PACK_COMPRESSED_BLOCK_WIDTH"..0x912B,
        "PACK_COMPRESSED_BLOCK_HEIGHT"..0x912C,
        "PACK_COMPRESSED_BLOCK_DEPTH"..0x912D,
        "PACK_COMPRESSED_BLOCK_SIZE"..0x912E
    )

    // ARB_shader_atomic_counters

    IntConstant(
        "Accepted by the {@code target} parameter of BindBufferBase and BindBufferRange.",

        "ATOMIC_COUNTER_BUFFER"..0x92C0
    )

    IntConstant(
        """
        Accepted by the {@code pname} parameter of GetBooleani_v, GetIntegeri_v, GetFloati_v, GetDoublei_v, GetInteger64i_v, GetBooleanv, GetIntegerv,
        GetInteger64v, GetFloatv, GetDoublev, and GetActiveAtomicCounterBufferiv.
        """,

        "ATOMIC_COUNTER_BUFFER_BINDING"..0x92C1
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegeri_64v.",

        "ATOMIC_COUNTER_BUFFER_START"..0x92C2,
        "ATOMIC_COUNTER_BUFFER_SIZE"..0x92C3
    )

    val AtomicCounterBufferParameters = IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveAtomicCounterBufferiv.",

        "ATOMIC_COUNTER_BUFFER_DATA_SIZE"..0x92C4,
        "ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS"..0x92C5,
        "ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES"..0x92C6,
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER"..0x92C7,
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER"..0x92C8,
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER"..0x92C9,
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER"..0x92CA,
        "ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER"..0x92CB
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_ATOMIC_COUNTER_BUFFERS"..0x92CC,
        "MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS"..0x92CD,
        "MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS"..0x92CE,
        "MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS"..0x92CF,
        "MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS"..0x92D0,
        "MAX_COMBINED_ATOMIC_COUNTER_BUFFERS"..0x92D1,
        "MAX_VERTEX_ATOMIC_COUNTERS"..0x92D2,
        "MAX_TESS_CONTROL_ATOMIC_COUNTERS"..0x92D3,
        "MAX_TESS_EVALUATION_ATOMIC_COUNTERS"..0x92D4,
        "MAX_GEOMETRY_ATOMIC_COUNTERS"..0x92D5,
        "MAX_FRAGMENT_ATOMIC_COUNTERS"..0x92D6,
        "MAX_COMBINED_ATOMIC_COUNTERS"..0x92D7,
        "MAX_ATOMIC_COUNTER_BUFFER_SIZE"..0x92D8,
        "MAX_ATOMIC_COUNTER_BUFFER_BINDINGS"..0x92DC
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "ACTIVE_ATOMIC_COUNTER_BUFFERS"..0x92D9
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveUniformsiv.",

        "UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX"..0x92DA
    )

    IntConstant(
        "Returned in {@code params} by GetActiveUniform and GetActiveUniformsiv.",

        "UNSIGNED_INT_ATOMIC_COUNTER"..0x92DB
    )

    void(
        "GetActiveAtomicCounterBufferiv",
        "Obtains information about the set of active atomic counter buffers for a program.",

        GLuint.IN("program", "the name of a program object for which the command #LinkProgram() has been issued in the past"),
        GLuint.IN("bufferIndex", "the index of an active atomic counter buffer"),
        GLenum.IN("pname", "the parameter to query", AtomicCounterBufferParameters),
        Check(1)..ReturnParam..GLint.p.OUT("params", "a buffer in which to place the returned value")
    )

    // ARB_texture_storage

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexParameter{if}v.",

        "TEXTURE_IMMUTABLE_FORMAT"..0x912F
    )

    void(
        "TexStorage1D",
        "Simultaneously specifies storage for all levels of a one-dimensional texture.",

        GLenum.IN("target", "the target of the operation", "#TEXTURE_1D #PROXY_TEXTURE_1D"),
        GLsizei.IN("levels", "the number of texture levels"),
        GLenum.IN("internalformat", "the sized internal format to be used to store texture image data"),
        GLsizei.IN("width", "the width of the texture, in texels")
    )

    void(
        "TexStorage2D",
        "Simultaneously specifies storage for all levels of a two-dimensional or one-dimensional array texture.",

        GLenum.IN("target", "the target of the operation", "$TEXTURE_2D_TARGETS $PROXY_TEXTURE_2D_TARGETS"),
        GLsizei.IN("levels", "the number of texture levels"),
        GLenum.IN("internalformat", "the sized internal format to be used to store texture image data"),
        GLsizei.IN("width", "the width of the texture, in texels"),
        GLsizei.IN("height", "the height of the texture, in texels")
    )

    void(
        "TexStorage3D",
        "Simultaneously specifies storage for all levels of a three-dimensional, two-dimensional array or cube-map array texture.",

        GLenum.IN("target", "the target of the operation", "$TEXTURE_3D_TARGETS $PROXY_TEXTURE_3D_TARGETS"),
        GLsizei.IN("levels", "the number of texture levels"),
        GLenum.IN("internalformat", "the sized internal format to be used to store texture image data"),
        GLsizei.IN("width", "the width of the texture, in texels"),
        GLsizei.IN("height", "the height of the texture, in texels"),
        GLsizei.IN("depth", "the depth of the texture, in texels")
    )

    // ARB_transform_feedback_instanced

    void(
        "DrawTransformFeedbackInstanced",
        "Renders multiple instances of primitives using a count derived from a transform feedback object.",

        GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
        GLuint.IN("id", "the name of a transform feedback object from which to retrieve a primitive count"),
        GLsizei.IN("primcount", "the number of instances of the geometry to render")
    )

    void(
        "DrawTransformFeedbackStreamInstanced",
        "Renders multiple instances of primitives using a count derived from a specifed stream of a transform feedback object.",

        GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
        GLuint.IN("id", "the name of a transform feedback object from which to retrieve a primitive count"),
        GLuint.IN("stream", "the index of the transform feedback stream from which to retrieve a primitive count"),
        GLsizei.IN("primcount", "the number of instances of the geometry to render")
    )

    // ARB_base_instance

    void(
        "DrawArraysInstancedBaseInstance",
        "Draws multiple instances of a range of elements with an offset applied to instanced attributes.",

        GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
        GLint.IN("first", "the starting index in the enabled arrays"),
        GLsizei.IN("count", "the number of indices to be rendered"),
        GLsizei.IN("primcount", "the number of instances of the specified range of indices to be rendered"),
        GLuint.IN("baseinstance", "the base instance for use in fetching instanced vertex attributes")
    )

    void(
        "DrawElementsInstancedBaseInstance",
        "Draws multiple instances of a set of elements with an offset applied to instanced attributes",

        GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", "the number of elements to be rendered"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the type of the values in {@code indices}",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "a pointer to the location where the indices are stored"),
        GLsizei.IN("primcount", "the number of instances of the specified range of indices to be rendered"),
        GLuint.IN("baseinstance", "the base instance for use in fetching instanced vertex attributes")
    )

    void(
        "DrawElementsInstancedBaseVertexBaseInstance",
        "Renders multiple instances of a set of primitives from array data with a per-element offset.",

        GLenum.IN("mode", "what kind of primitives to render", PRIMITIVE_TYPES),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", "the number of elements to be rendered"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the type of the values in {@code indices}",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "a pointer to the location where the indices are stored"),
        GLsizei.IN("primcount", "the number of instances of the indexed geometry that should be drawn"),
        GLint.IN("basevertex", "a constant that should be added to each element of {@code indices} when choosing elements from the enabled vertex arrays"),
        GLuint.IN("baseinstance", "the base instance for use in fetching instanced vertex attributes")
    )

    // ARB_shader_image_load_store

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, GetDoublev, and GetInteger64v.",

        "MAX_IMAGE_UNITS"..0x8F38,
        "MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS"..0x8F39,
        "MAX_IMAGE_SAMPLES"..0x906D,
        "MAX_VERTEX_IMAGE_UNIFORMS"..0x90CA,
        "MAX_TESS_CONTROL_IMAGE_UNIFORMS"..0x90CB,
        "MAX_TESS_EVALUATION_IMAGE_UNIFORMS"..0x90CC,
        "MAX_GEOMETRY_IMAGE_UNIFORMS"..0x90CD,
        "MAX_FRAGMENT_IMAGE_UNIFORMS"..0x90CE,
        "MAX_COMBINED_IMAGE_UNIFORMS"..0x90CF
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetIntegeri_v and GetBooleani_v.",

        "IMAGE_BINDING_NAME"..0x8F3A,
        "IMAGE_BINDING_LEVEL"..0x8F3B,
        "IMAGE_BINDING_LAYERED"..0x8F3C,
        "IMAGE_BINDING_LAYER"..0x8F3D,
        "IMAGE_BINDING_ACCESS"..0x8F3E,
        "IMAGE_BINDING_FORMAT"..0x906E
    )

    val MemoryBarriers = IntConstant(
        "Accepted by the {@code barriers} parameter of MemoryBarrier.",

        "VERTEX_ATTRIB_ARRAY_BARRIER_BIT"..0x00000001,
        "ELEMENT_ARRAY_BARRIER_BIT"..0x00000002,
        "UNIFORM_BARRIER_BIT"..0x00000004,
        "TEXTURE_FETCH_BARRIER_BIT"..0x00000008,
        "SHADER_IMAGE_ACCESS_BARRIER_BIT"..0x00000020,
        "COMMAND_BARRIER_BIT"..0x00000040,
        "PIXEL_BUFFER_BARRIER_BIT"..0x00000080,
        "TEXTURE_UPDATE_BARRIER_BIT"..0x00000100,
        "BUFFER_UPDATE_BARRIER_BIT"..0x00000200,
        "FRAMEBUFFER_BARRIER_BIT"..0x00000400,
        "TRANSFORM_FEEDBACK_BARRIER_BIT"..0x00000800,
        "ATOMIC_COUNTER_BARRIER_BIT"..0x00001000,
        "ALL_BARRIER_BITS"..0xFFFFFFFF.i
    ).javaDocLinks

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "IMAGE_1D"..0x904C,
        "IMAGE_2D"..0x904D,
        "IMAGE_3D"..0x904E,
        "IMAGE_2D_RECT"..0x904F,
        "IMAGE_CUBE"..0x9050,
        "IMAGE_BUFFER"..0x9051,
        "IMAGE_1D_ARRAY"..0x9052,
        "IMAGE_2D_ARRAY"..0x9053,
        "IMAGE_CUBE_MAP_ARRAY"..0x9054,
        "IMAGE_2D_MULTISAMPLE"..0x9055,
        "IMAGE_2D_MULTISAMPLE_ARRAY"..0x9056,
        "INT_IMAGE_1D"..0x9057,
        "INT_IMAGE_2D"..0x9058,
        "INT_IMAGE_3D"..0x9059,
        "INT_IMAGE_2D_RECT"..0x905A,
        "INT_IMAGE_CUBE"..0x905B,
        "INT_IMAGE_BUFFER"..0x905C,
        "INT_IMAGE_1D_ARRAY"..0x905D,
        "INT_IMAGE_2D_ARRAY"..0x905E,
        "INT_IMAGE_CUBE_MAP_ARRAY"..0x905F,
        "INT_IMAGE_2D_MULTISAMPLE"..0x9060,
        "INT_IMAGE_2D_MULTISAMPLE_ARRAY"..0x9061,
        "UNSIGNED_INT_IMAGE_1D"..0x9062,
        "UNSIGNED_INT_IMAGE_2D"..0x9063,
        "UNSIGNED_INT_IMAGE_3D"..0x9064,
        "UNSIGNED_INT_IMAGE_2D_RECT"..0x9065,
        "UNSIGNED_INT_IMAGE_CUBE"..0x9066,
        "UNSIGNED_INT_IMAGE_BUFFER"..0x9067,
        "UNSIGNED_INT_IMAGE_1D_ARRAY"..0x9068,
        "UNSIGNED_INT_IMAGE_2D_ARRAY"..0x9069,
        "UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY"..0x906A,
        "UNSIGNED_INT_IMAGE_2D_MULTISAMPLE"..0x906B,
        "UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY"..0x906C
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv.",

        "IMAGE_FORMAT_COMPATIBILITY_TYPE"..0x90C7
    )

    IntConstant(
        """
        Returned in the {@code data} parameter of GetTexParameteriv, GetTexParameterfv, GetTexParameterIiv, and GetTexParameterIuiv when {@code value} is
        IMAGE_FORMAT_COMPATIBILITY_TYPE.
        """,

        "IMAGE_FORMAT_COMPATIBILITY_BY_SIZE"..0x90C8,
        "IMAGE_FORMAT_COMPATIBILITY_BY_CLASS"..0x90C9
    )

    void(
        "BindImageTexture",
        "Binds a level of a texture to an image unit.",

        GLuint.IN("unit", "the index of the image unit to which to bind the texture"),
        GLuint.IN("texture", "the name of the texture to bind to the image unit"),
        GLint.IN("level", "the level of the texture that is to be bound"),
        GLboolean.IN("layered", "whether a layered texture binding is to be established"),
        GLint.IN("layer", "if {@code layered} is false, specifies the layer of texture to be bound to the image unit. Ignored otherwise."),
        GLenum.IN("access", "a token indicating the type of access that will be performed on the image"),
        GLenum.IN("format", "the format that the elements of the image will be treated as for the purposes of formatted stores")
    )

    void(
        "MemoryBarrier",
        "Defines a barrier ordering memory transactions.",

        GLbitfield.IN("barriers", "the barriers to insert (bitwise combination)", MemoryBarriers + " #SHADER_STORAGE_BARRIER_BIT", LinkMode.BITFIELD)
    )

    // ARB_internal_format_query

    IntConstant(
        "Accepted by the {@code pname} parameter of GetInternalformativ.",

        "NUM_SAMPLE_COUNTS"..0x9380
    )

    void(
        "GetInternalformativ",
        "Retrieves information about implementation-dependent support for internal formats.",

        GLenum.IN(
            "target",
            "the usage of the internal format",
            """
            #TEXTURE_1D $TEXTURE_2D_TARGETS $TEXTURE_3D_TARGETS #RENDERBUFFER #TEXTURE_BUFFER #TEXTURE_2D_MULTISAMPLE
            #TEXTURE_2D_MULTISAMPLE_ARRAY
            """
        ),
        GLenum.IN("internalformat", "the internal format about which to retrieve information"),
        GLenum.IN("pname", "the type of information to query"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of values that may be written to params by the function"),
        ReturnParam..GLint.p.OUT("params", "a variable into which to write the retrieved information")
    )

    // ARB_map_buffer_alignment

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetInteger64v, GetFloatv, and GetDoublev.",

        "MIN_MAP_BUFFER_ALIGNMENT"..0x90BC
    )
}