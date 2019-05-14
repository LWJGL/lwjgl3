/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL30C = "GL30C".nativeClassGL("GL30C") {
    extends = GL21C
    documentation =
        """
        The OpenGL functionality of a forward compatible context, up to version 3.0.

        OpenGL 3.0 implementations are guaranteed to support at least versions 1.10, 1.20 and 1.30 of the shading language,
        although versions 1.10 and 1.20 are deprecated in a forward-compatible context.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("EXT", "gpu_shader4"),
            registryLinkTo("NV", "conditional_render"),
            registryLinkTo("APPLE", "flush_buffer_range"),
            """
            ${registryLinkTo("ARB", "color_buffer_float")}, ${registryLinkTo("NV", "depth_buffer_float")}, ${registryLinkTo("ARB", "texture_float")},
            ${registryLinkTo("EXT", "packed_float")} and ${registryLinkTo("EXT", "texture_shared_exponent")}
            """,
            registryLinkTo("EXT", "framebuffer_object"),
            "${registryLinkTo("NV", "half_float")} and ${registryLinkTo("ARB", "half_FLOAT_pixel")}",
            "${registryLinkTo("EXT", "framebuffer_multisample")} and ${registryLinkTo("EXT", "framebuffer_blit")}",
            registryLinkTo("EXT", "texture_integer"),
            registryLinkTo("EXT", "texture_array"),
            registryLinkTo("EXT", "packed_depth_stencil"),
            registryLinkTo("EXT", "draw_buffers2"),
            registryLinkTo("EXT", "texture_compression_rgtc"),
            registryLinkTo("EXT", "transform_feedback"),
            registryLinkTo("APPLE", "vertex_array_object"),
            registryLinkTo("EXT", "framebuffer_sRGB")
        )}
        """

    IntConstant(
        "GetTarget",

        "MAJOR_VERSION"..0x821B,
        "MINOR_VERSION"..0x821C,
        "NUM_EXTENSIONS"..0x821D,

        "CONTEXT_FLAGS"..0x821E,
        "CONTEXT_FLAG_FORWARD_COMPATIBLE_BIT"..0x0001
    )

    IntConstant(
        "Renamed tokens.",

        "COMPARE_REF_TO_TEXTURE"..0x884E,

        "CLIP_DISTANCE0"..0x3000,
        "CLIP_DISTANCE1"..0x3001,
        "CLIP_DISTANCE2"..0x3002,
        "CLIP_DISTANCE3"..0x3003,
        "CLIP_DISTANCE4"..0x3004,
        "CLIP_DISTANCE5"..0x3005,
        "CLIP_DISTANCE6"..0x3006,
        "CLIP_DISTANCE7"..0x3007,

        "MAX_CLIP_DISTANCES"..0x0D32,

        "MAX_VARYING_COMPONENTS"..0x8B4B
    )

    GLubyteUTF8.const.p(
        "GetStringi",
        "Queries indexed string state.",

        GLenum("name", "the indexed state to query", "#EXTENSIONS #SHADING_LANGUAGE_VERSION"),
        GLuint("index", "the index of the particular element being queried")
    )

    void(
        "ClearBufferiv",
        "Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

        GLenum("buffer", "the buffer to clear", "#COLOR #STENCIL"),
        GLint("drawbuffer", "the draw buffer to clear"),
        Check(1)..GLint.p(
            "value",
            """
            for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For stencil buffers, a pointer to a
            single stencil value to clear the buffer to.
            """
        )
    )

    void(
        "ClearBufferuiv",
        "Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

        GLenum("buffer", "the buffer to clear", "#COLOR"),
        GLint("drawbuffer", "the draw buffer to clear"),
        Check(4)..GLint.p("value", "a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to")
    )

    void(
        "ClearBufferfv",
        "Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

        GLenum("buffer", "the buffer to clear", "#COLOR #DEPTH"),
        GLint("drawbuffer", "the draw buffer to clear"),
        Check(1)..GLfloat.p(
            "value",
            """
            for color buffers, a pointer to a four-element vector specifying R, G, B and A values to clear the buffer to. For depth buffers, a pointer to a
            single depth value to clear the buffer to.
            """
        )
    )

    void(
        "ClearBufferfi",
        "Clears an individual buffer of the currently bound framebuffer object to the #DRAW_FRAMEBUFFER binding.",

        GLenum("buffer", "the buffer to clear", "#DEPTH_STENCIL"),
        GLint("drawbuffer", "the draw buffer to clear"),
        GLfloat("depth", "the depth value to clear the buffer to"),
        GLint("stencil", "the stencil value to clear the buffer to")
    )

    // EXT_gpu_shader4

    IntConstant(
        """
        Accepted by the {@code pname} parameters of GetVertexAttribdv, GetVertexAttribfv, GetVertexAttribiv, GetVertexAttribIuiv and GetVertexAttribIiv.
        """,

        "VERTEX_ATTRIB_ARRAY_INTEGER"..0x88FD
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_1D_ARRAY"..0x8DC0,
        "SAMPLER_2D_ARRAY"..0x8DC1,
        "SAMPLER_1D_ARRAY_SHADOW"..0x8DC3,
        "SAMPLER_2D_ARRAY_SHADOW"..0x8DC4,
        "SAMPLER_CUBE_SHADOW"..0x8DC5,
        "UNSIGNED_INT_VEC2"..0x8DC6,
        "UNSIGNED_INT_VEC3"..0x8DC7,
        "UNSIGNED_INT_VEC4"..0x8DC8,
        "INT_SAMPLER_1D"..0x8DC9,
        "INT_SAMPLER_2D"..0x8DCA,
        "INT_SAMPLER_3D"..0x8DCB,
        "INT_SAMPLER_CUBE"..0x8DCC,
        "INT_SAMPLER_1D_ARRAY"..0x8DCE,
        "INT_SAMPLER_2D_ARRAY"..0x8DCF,
        "UNSIGNED_INT_SAMPLER_1D"..0x8DD1,
        "UNSIGNED_INT_SAMPLER_2D"..0x8DD2,
        "UNSIGNED_INT_SAMPLER_3D"..0x8DD3,
        "UNSIGNED_INT_SAMPLER_CUBE"..0x8DD4,
        "UNSIGNED_INT_SAMPLER_1D_ARRAY"..0x8DD6,
        "UNSIGNED_INT_SAMPLER_2D_ARRAY"..0x8DD7
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MIN_PROGRAM_TEXEL_OFFSET"..0x8904,
        "MAX_PROGRAM_TEXEL_OFFSET"..0x8905
    )

    // Vertex attrib functions javadoc
    val vertexAttribIndex = "the index of the pure integer generic vertex attribute to be modified"
    val vertexAttribX = "the vertex attribute x component"
    val vertexAttribY = "the vertex attribute y component"
    val vertexAttribZ = "the vertex attribute z component"
    val vertexAttribW = "the vertex attribute w component"
    val vertexAttribBuffer = "the pure integer vertex attribute buffer"

    void("VertexAttribI1i", "Specifies the value of a pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.", GLuint("index", vertexAttribIndex), GLint("x", vertexAttribX))
    void("VertexAttribI2i", "Specifies the value of a pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.", GLuint("index", vertexAttribIndex), GLint("x", vertexAttribX), GLint("y", vertexAttribY))
    void("VertexAttribI3i", "Specifies the value of a pure integer generic vertex attribute. The w component is implicitly set to 1.", GLuint("index", vertexAttribIndex), GLint("x", vertexAttribX), GLint("y", vertexAttribY), GLint("z", vertexAttribZ))
    void("VertexAttribI4i", "Specifies the value of a pure integer generic vertex attribute.", GLuint("index", vertexAttribIndex), GLint("x", vertexAttribX), GLint("y", vertexAttribY), GLint("z", vertexAttribZ), GLint("w", vertexAttribW))

    void("VertexAttribI1ui", "Specifies the value of an unsigned pure integer generic vertex attribute. The y and z components are implicitly set to 0 and w to 1.", GLuint("index", vertexAttribIndex), GLuint("x", vertexAttribX))
    void("VertexAttribI2ui", "Specifies the value of an unsigned pure integer generic vertex attribute. The z component is implicitly set to 0 and w to 1.", GLuint("index", vertexAttribIndex), GLuint("x", vertexAttribX), GLuint("y", vertexAttribY))
    void("VertexAttribI3ui", "Specifies the value of an unsigned pure integer generic vertex attribute. The w component is implicitly set to 1.", GLuint("index", vertexAttribIndex), GLint("x", vertexAttribX), GLint("y", vertexAttribY), GLint("z", vertexAttribZ))
    void("VertexAttribI4ui", "Specifies the value of an unsigned pure integer generic vertex attribute.", GLuint("index", vertexAttribIndex), GLint("x", vertexAttribX), GLint("y", vertexAttribY), GLint("z", vertexAttribZ), GLint("w", vertexAttribW))

    void("VertexAttribI1iv", "Pointer version of #VertexAttribI1i().", GLuint("index", vertexAttribIndex), Check(1)..GLint.const.p("v", vertexAttribBuffer))
    void("VertexAttribI2iv", "Pointer version of #VertexAttribI2i().", GLuint("index", vertexAttribIndex), Check(2)..GLint.const.p("v", vertexAttribBuffer))
    void("VertexAttribI3iv", "Pointer version of #VertexAttribI3i().", GLuint("index", vertexAttribIndex), Check(3)..GLint.const.p("v", vertexAttribBuffer))
    void("VertexAttribI4iv", "Pointer version of #VertexAttribI4i().", GLuint("index", vertexAttribIndex), Check(4)..GLint.const.p("v", vertexAttribBuffer))

    void("VertexAttribI1uiv", "Pointer version of #VertexAttribI1ui().", GLuint("index", vertexAttribIndex), Check(1)..GLuint.const.p("v", vertexAttribBuffer))
    void("VertexAttribI2uiv", "Pointer version of #VertexAttribI2ui().", GLuint("index", vertexAttribIndex), Check(2)..GLuint.const.p("v", vertexAttribBuffer))
    void("VertexAttribI3uiv", "Pointer version of #VertexAttribI3ui().", GLuint("index", vertexAttribIndex), Check(3)..GLuint.const.p("v", vertexAttribBuffer))
    void("VertexAttribI4uiv", "Pointer version of #VertexAttribI4ui().", GLuint("index", vertexAttribIndex), Check(4)..GLuint.const.p("v", vertexAttribBuffer))

    void("VertexAttribI4bv", "Byte version of #VertexAttribI4iv().", GLuint("index", vertexAttribIndex), Check(4)..GLbyte.const.p("v", vertexAttribBuffer))
    void("VertexAttribI4sv", "Short version of #VertexAttribI4iv().", GLuint("index", vertexAttribIndex), Check(4)..GLshort.const.p("v", vertexAttribBuffer))

    void("VertexAttribI4ubv", "Byte version of #VertexAttribI4uiv().", GLuint("index", vertexAttribIndex), Check(4)..GLbyte.const.p("v", vertexAttribBuffer))
    void("VertexAttribI4usv", "Short version of #VertexAttribI4uiv().", GLuint("index", vertexAttribIndex), Check(4)..GLshort.const.p("v", vertexAttribBuffer))

    OffHeapOnly..void(
        "VertexAttribIPointer",
        "Specifies the location and organization of a pure integer vertex attribute array.",

        GLuint("index", vertexAttribIndex),
        GLint("size", "the number of values per vertex that are stored in the array. The initial value is 4", "1 2 3 4 #BGRA"),
        GLenum(
            "type",
            "the data type of each component in the array",
            "#BYTE #UNSIGNED_BYTE #SHORT #UNSIGNED_SHORT #INT #UNSIGNED_INT"
        ),
        GLsizei(
            "stride",
            """
            the byte offset between consecutive generic vertex attributes. If stride is 0, the generic vertex attributes are understood to be tightly packed in
            the array. The initial value is 0.
            """),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT
        )..Unsafe..RawPointer..void.const.p(
            "pointer",
            """
            the vertex attribute data or the offset of the first component of the first generic vertex attribute in the array in the data store of the buffer
            currently bound to the #ARRAY_BUFFER target. The initial value is 0.
            """
        )
    )

    void(
        "GetVertexAttribIiv",
        "Returns the value of a pure integer generic vertex attribute parameter.",

        GLuint("index", vertexAttribIndex),
        GLenum("pname", "the symbolic name of the vertex attribute parameter to be queried", "#CURRENT_VERTEX_ATTRIB"),
        Check(4)..ReturnParam..GLint.p("params", "returns the requested data")
    )

    void(
        "GetVertexAttribIuiv",
        "Unsigned version of #GetVertexAttribIiv().",

        GLuint("index", vertexAttribIndex),
        GLenum("pname", "the symbolic name of the vertex attribute parameter to be queried", "#CURRENT_VERTEX_ATTRIB"),
        Check(4)..ReturnParam..GLuint.p("params", "returns the requested data")
    )

    // Uniform functions javadoc
    val uniformLocation = "the location of the uniform variable to be modified"
    val uniformX = "the uniform x value"
    val uniformY = "the uniform y value"
    val uniformZ = "the uniform z value"
    val uniformW = "the uniform w value"

    void(
        "Uniform1ui",
        "Specifies the value of a uint uniform variable for the current program object.",

        GLint("location", uniformLocation),
        GLuint("v0", "the uniform value")
    )

    void(
        "Uniform2ui",
        "Specifies the value of a uvec2 uniform variable for the current program object.",

        GLint("location", uniformLocation),
        GLuint("v0", uniformX),
        GLuint("v1", uniformY)
    )

    void(
        "Uniform3ui",
        "Specifies the value of a uvec3 uniform variable for the current program object.",

        GLint("location", uniformLocation),
        GLuint("v0", uniformX),
        GLuint("v1", uniformY),
        GLuint("v2", uniformZ)
    )

    void(
        "Uniform4ui",
        "Specifies the value of a uvec4 uniform variable for the current program object.",

        GLint("location", uniformLocation),
        GLuint("v0", uniformX),
        GLuint("v1", uniformY),
        GLuint("v2", uniformZ),
        GLuint("v3", uniformW)
    )

    void(
        "Uniform1uiv",
        "Specifies the value of a single uint uniform variable or a uint uniform variable array for the current program object.",

        GLint("location", uniformLocation),
        AutoSize("value")..GLsizei("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLuint.const.p("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform2uiv",
        "Specifies the value of a single uvec2 uniform variable or a uvec2 uniform variable array for the current program object.",

        GLint("location", uniformLocation),
        AutoSize(2, "value")..GLsizei("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLuint.const.p("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform3uiv",
        "Specifies the value of a single uvec3 uniform variable or a uvec3 uniform variable array for the current program object.",

        GLint("location", uniformLocation),
        AutoSize(3, "value")..GLsizei("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLuint.const.p("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "Uniform4uiv",
        "Specifies the value of a single uvec4 uniform variable or a uvec4 uniform variable array for the current program object.",

        GLint("location", uniformLocation),
        AutoSize(4, "value")..GLsizei("count", "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."),
        GLuint.const.p("value", "a pointer to an array of {@code count} values that will be used to update the specified uniform variable")
    )

    void(
        "GetUniformuiv",
        "Returns the uint value(s) of a uniform variable.",

        GLuint("program", "the program object to be queried"),
        GLint("location", "the location of the uniform variable to be queried"),
        Check(1)..ReturnParam..GLuint.p("params", "the value of the specified uniform variable")
    )

    void(
        "BindFragDataLocation",
        "Binds a user-defined varying out variable to a fragment shader color number.",

        GLuint("program", "the name of the program containing varying out variable whose binding to modify"),
        GLuint("colorNumber", "the color number to bind the user-defined varying out variable to"),
        GLcharASCII.const.p("name", "the name of the user-defined varying out variable whose binding to modify")
    )

    GLint(
        "GetFragDataLocation",
        "Queries the bindings of color numbers to user-defined varying out variables.",

        GLuint("program", "the name of the program containing varying out variable whose binding to query"),
        GLcharASCII.const.p("name", "the name of the user-defined varying out variable whose binding to query")
    )

    // NV_conditional_render

    IntConstant(
        "Accepted by the {@code mode} parameter of BeginConditionalRender.",

        "QUERY_WAIT"..0x8E13,
        "QUERY_NO_WAIT"..0x8E14,
        "QUERY_BY_REGION_WAIT"..0x8E15,
        "QUERY_BY_REGION_NO_WAIT"..0x8E16
    )

    void(
        "BeginConditionalRender",
        "Starts conditional rendering.",

        GLuint("id", "the name of an occlusion query object whose results are used to determine if the rendering commands are discarded"),
        GLenum("mode", "how {@code glBeginConditionalRender} interprets the results of the occlusion query", CONDITIONAL_RENDER_MODES)
    )

    void(
        "EndConditionalRender",
        "Ends conditional rendering."
    )

    // ARB_map_buffer_range

    val MapBufferRangeBits = IntConstant(
        "Accepted by the {@code access} parameter of MapBufferRange.",

        "MAP_READ_BIT"..0x0001,
        "MAP_WRITE_BIT"..0x0002,
        "MAP_INVALIDATE_RANGE_BIT"..0x0004,
        "MAP_INVALIDATE_BUFFER_BIT"..0x0008,
        "MAP_FLUSH_EXPLICIT_BIT"..0x0010,
        "MAP_UNSYNCHRONIZED_BIT"..0x0020
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBufferParameteriv.",

        "BUFFER_ACCESS_FLAGS"..0x911F,
        "BUFFER_MAP_LENGTH"..0x9120,
        "BUFFER_MAP_OFFSET"..0x9121
    )

    MapPointer("length", oldBufferOverloads = true)..void.p(
        "MapBufferRange",
        """
        Maps a section of a buffer object's data store.

        <b>LWJGL note</b>: This method comes in 2 flavors:
        ${ol(
            "#MapBufferRange(int, long, long, int) - Always returns a new ByteBuffer instance.",
            "#MapBufferRange(int, long, long, int, ByteBuffer) - The {@code old_buffer} parameter is reused if not null."
        )}
        """,

        GLenum("target", "a binding to which the target buffer is bound", BUFFER_OBJECT_TARGETS),
        GLintptr("offset", "the starting offset within the buffer of the range to be mapped"),
        GLsizeiptr("length", "the length of the range to be mapped"),
        GLbitfield("access", "a combination of access flags indicating the desired access to the range", MapBufferRangeBits, LinkMode.BITFIELD)
    )

    void(
        "FlushMappedBufferRange",
        "Indicates modifications to a range of a mapped buffer.",

        GLenum("target", "the target of the flush operation", BUFFER_OBJECT_TARGETS),
        GLintptr("offset", "the start of the buffer subrange, in basic machine units"),
        GLsizeiptr("length", "the length of the buffer subrange, in basic machine units")
    )

    // ARB_color_buffer_float

    val ClampTargets = IntConstant(
        "Accepted by the {@code target} parameter of ClampColor and the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "CLAMP_READ_COLOR"..0x891C
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code clamp} parameter of ClampColor.",

        "FIXED_ONLY"..0x891D
    )

    void(
        "ClampColor",
        "Controls color clamping.",

        GLenum("target", "target for color clamping", ClampTargets),
        GLenum("clamp", "whether to apply color clamping", "#TRUE #FALSE #FIXED_ONLY")
    )

    // ARB_depth_buffer_float

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
        returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
        """,

        "DEPTH_COMPONENT32F"..0x8CAC,
        "DEPTH32F_STENCIL8"..0x8CAD
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
        GetTexImage.
        """,

        "FLOAT_32_UNSIGNED_INT_24_8_REV"..0x8DAD
    )

    // ARB_texture_float

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexLevelParameter.",

        "TEXTURE_RED_TYPE"..0x8C10,
        "TEXTURE_GREEN_TYPE"..0x8C11,
        "TEXTURE_BLUE_TYPE"..0x8C12,
        "TEXTURE_ALPHA_TYPE"..0x8C13,
        "TEXTURE_DEPTH_TYPE"..0x8C16
    )

    IntConstant(
        "Returned by the {@code params} parameter of GetTexLevelParameter.",

        "UNSIGNED_NORMALIZED"..0x8C17
    )

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

        "RGBA32F"..0x8814,
        "RGB32F"..0x8815,
        "RGBA16F"..0x881A,
        "RGB16F"..0x881B
    )

    // EXT_packed_float

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.",

        "R11F_G11F_B10F"..0x8C3A
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
        """,

        "UNSIGNED_INT_10F_11F_11F_REV"..0x8C3B
    )

    // EXT_texture_shared_exponent

    IntConstant(
        "Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage.",

        "RGB9_E5"..0x8C3D
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, GetTexImage, TexImage3D, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, ConvolutionFilter3D, GetConvolutionFilter, SeparableFilter2D,
        GetSeparableFilter, ColorTable, ColorSubTable, and GetColorTable.
        """,

        "UNSIGNED_INT_5_9_9_9_REV"..0x8C3E
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetTexLevelParameterfv and GetTexLevelParameteriv.",

        "TEXTURE_SHARED_SIZE"..0x8C3F
    )

    // ARB_framebuffer_object

    val FramebufferTargets = IntConstant(
        """
        Accepted by the {@code target} parameter of BindFramebuffer, CheckFramebufferStatus, FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and
        GetFramebufferAttachmentParameteriv.
        """,

        "FRAMEBUFFER"..0x8D40,
        "READ_FRAMEBUFFER"..0x8CA8,
        "DRAW_FRAMEBUFFER"..0x8CA9
    ).javaDocLinks

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindRenderbuffer, RenderbufferStorage, and GetRenderbufferParameteriv, and returned by
        GetFramebufferAttachmentParameteriv.
        """,

        "RENDERBUFFER"..0x8D41
    )

    IntConstant(
        "Accepted by the {@code internalformat} parameter of RenderbufferStorage.",

        "STENCIL_INDEX1"..0x8D46,
        "STENCIL_INDEX4"..0x8D47,
        "STENCIL_INDEX8"..0x8D48,
        "STENCIL_INDEX16"..0x8D49
    )

    val RenderbufferParameters = IntConstant(
        "Accepted by the {@code pname} parameter of GetRenderbufferParameteriv.",

        "RENDERBUFFER_WIDTH"..0x8D42,
        "RENDERBUFFER_HEIGHT"..0x8D43,
        "RENDERBUFFER_INTERNAL_FORMAT"..0x8D44,
        "RENDERBUFFER_RED_SIZE"..0x8D50,
        "RENDERBUFFER_GREEN_SIZE"..0x8D51,
        "RENDERBUFFER_BLUE_SIZE"..0x8D52,
        "RENDERBUFFER_ALPHA_SIZE"..0x8D53,
        "RENDERBUFFER_DEPTH_SIZE"..0x8D54,
        "RENDERBUFFER_STENCIL_SIZE"..0x8D55,
        "RENDERBUFFER_SAMPLES"..0x8CAB
    ).javaDocLinks

    val FramebufferParameters = IntConstant(
        "Accepted by the {@code pname} parameter of GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE"..0x8CD0,
        "FRAMEBUFFER_ATTACHMENT_OBJECT_NAME"..0x8CD1,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL"..0x8CD2,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE"..0x8CD3,
        "FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER"..0x8CD4,
        "FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING"..0x8210,
        "FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE"..0x8211,
        "FRAMEBUFFER_ATTACHMENT_RED_SIZE"..0x8212,
        "FRAMEBUFFER_ATTACHMENT_GREEN_SIZE"..0x8213,
        "FRAMEBUFFER_ATTACHMENT_BLUE_SIZE"..0x8214,
        "FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE"..0x8215,
        "FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE"..0x8216,
        "FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE"..0x8217
    ).javaDocLinks

    IntConstant(
        "Returned in {@code params} by GetFramebufferAttachmentParameteriv.",

        "FRAMEBUFFER_DEFAULT"..0x8218
    )

    val FramebufferAttachments = IntConstant(
        "Accepted by the {@code attachment} parameter of FramebufferTexture{1D|2D|3D}, FramebufferRenderbuffer, and GetFramebufferAttachmentParameteriv.",

        "COLOR_ATTACHMENT0"..0x8CE0,
        "COLOR_ATTACHMENT1"..0x8CE1,
        "COLOR_ATTACHMENT2"..0x8CE2,
        "COLOR_ATTACHMENT3"..0x8CE3,
        "COLOR_ATTACHMENT4"..0x8CE4,
        "COLOR_ATTACHMENT5"..0x8CE5,
        "COLOR_ATTACHMENT6"..0x8CE6,
        "COLOR_ATTACHMENT7"..0x8CE7,
        "COLOR_ATTACHMENT8"..0x8CE8,
        "COLOR_ATTACHMENT9"..0x8CE9,
        "COLOR_ATTACHMENT10"..0x8CEA,
        "COLOR_ATTACHMENT11"..0x8CEB,
        "COLOR_ATTACHMENT12"..0x8CEC,
        "COLOR_ATTACHMENT13"..0x8CED,
        "COLOR_ATTACHMENT14"..0x8CEE,
        "COLOR_ATTACHMENT15"..0x8CEF,
        "COLOR_ATTACHMENT16"..0x8CF0,
        "COLOR_ATTACHMENT17"..0x8CF1,
        "COLOR_ATTACHMENT18"..0x8CF2,
        "COLOR_ATTACHMENT19"..0x8CF3,
        "COLOR_ATTACHMENT20"..0x8CF4,
        "COLOR_ATTACHMENT21"..0x8CF5,
        "COLOR_ATTACHMENT22"..0x8CF6,
        "COLOR_ATTACHMENT23"..0x8CF7,
        "COLOR_ATTACHMENT24"..0x8CF8,
        "COLOR_ATTACHMENT25"..0x8CF9,
        "COLOR_ATTACHMENT26"..0x8CFA,
        "COLOR_ATTACHMENT27"..0x8CFB,
        "COLOR_ATTACHMENT28"..0x8CFC,
        "COLOR_ATTACHMENT29"..0x8CFD,
        "COLOR_ATTACHMENT30"..0x8CFE,
        "COLOR_ATTACHMENT31"..0x8CFF,
        "DEPTH_ATTACHMENT"..0x8D00,
        "STENCIL_ATTACHMENT"..0x8D20,
        "DEPTH_STENCIL_ATTACHMENT"..0x821A
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_SAMPLES"..0x8D57
    )

    IntConstant(
        "Returned by CheckFramebufferStatus().",

        "FRAMEBUFFER_COMPLETE"..0x8CD5,
        "FRAMEBUFFER_INCOMPLETE_ATTACHMENT"..0x8CD6,
        "FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT"..0x8CD7,
        "FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER"..0x8CDB,
        "FRAMEBUFFER_INCOMPLETE_READ_BUFFER"..0x8CDC,
        "FRAMEBUFFER_UNSUPPORTED"..0x8CDD,
        "FRAMEBUFFER_INCOMPLETE_MULTISAMPLE"..0x8D56,
        "FRAMEBUFFER_UNDEFINED"..0x8219
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetIntegerv, GetFloatv,  and GetDoublev.",

        "FRAMEBUFFER_BINDING"..0x8CA6,
        "DRAW_FRAMEBUFFER_BINDING"..0x8CA6,
        "READ_FRAMEBUFFER_BINDING"..0x8CAA,
        "RENDERBUFFER_BINDING"..0x8CA7,
        "MAX_COLOR_ATTACHMENTS"..0x8CDF,
        "MAX_RENDERBUFFER_SIZE"..0x84E8
    )

    IntConstant(
        "Returned by GetError().",

        "INVALID_FRAMEBUFFER_OPERATION"..0x0506
    )

    IntConstant(
        """
        Accepted by the {@code format} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
        GetTexImage, by the {@code type} parameter of CopyPixels, by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D,
        CopyTexImage2D, and RenderbufferStorage, and returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
        """,

        "DEPTH_STENCIL"..0x84F9
    )

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and
        GetTexImage.
        """,

        "UNSIGNED_INT_24_8"..0x84FA
    )

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, CopyTexImage2D, and RenderbufferStorage, and
        returned in the {@code data} parameter of GetTexLevelParameter and GetRenderbufferParameteriv.
        """,

        "DEPTH24_STENCIL8"..0x88F0
    )

    IntConstant(
        "Accepted by the {@code value} parameter of GetTexLevelParameter.",

        "TEXTURE_STENCIL_SIZE"..0x88F1
    )

    GLboolean(
        "IsRenderbuffer",
        "Determines if a name corresponds to a renderbuffer object.",

        GLuint("renderbuffer", "a value that may be the name of a renderbuffer object")
    )

    void(
        "BindRenderbuffer",
        "Binds a renderbuffer to a renderbuffer target.",

        GLenum("target", "the renderbuffer target of the binding operation", "#RENDERBUFFER"),
        GLuint("renderbuffer", "the name of the renderbuffer object to bind")
    )

    void(
        "DeleteRenderbuffers",
        "Deletes renderbuffer objects.",

        AutoSize("renderbuffers")..GLsizei("n", "the number of renderbuffer objects to be deleted"),
        SingleValue("renderbuffer")..GLuint.const.p("renderbuffers", "an array containing {@code n} renderbuffer objects to be deleted")
    )

    void(
        "GenRenderbuffers",
        "Generates renderbuffer object names.",

        AutoSize("renderbuffers")..GLsizei("n", "the number of renderbuffer object names to generate"),
        ReturnParam..GLuint.p("renderbuffers", "a buffer in which the generated renderbuffer object names are stored")
    )

    void(
        "RenderbufferStorage",
        "Establishes data storage, format and dimensions of a renderbuffer object's image.",

        GLenum("target", "the target of the allocation", "#RENDERBUFFER"),
        GLenum("internalformat", "the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format."),
        GLsizei("width", "the width of the renderbuffer, in pixels"),
        GLsizei("height", "the height of the renderbuffer, in pixels")
    )

    void(
        "RenderbufferStorageMultisample",
        """
        Establishes data storage, format, dimensions and sample count of a renderbuffer object's image.

        #RenderbufferStorage() is equivalent to calling this method with the samples set to zero.
        """,

        GLenum("target", "the target of the allocation", "#RENDERBUFFER"),
        GLsizei("samples", "the number of samples to be used for the renderbuffer object's storage"),
        GLenum("internalformat", "the internal format to use for the renderbuffer object's image. Must be a color-renderable, depth-renderable, or stencil-renderable format."),
        GLsizei("width", "the width of the renderbuffer, in pixels"),
        GLsizei("height", "the height of the renderbuffer, in pixels")
    )

    void(
        "GetRenderbufferParameteriv",
        "Retrieves information about a bound renderbuffer object.",

        GLenum("target", "the target of the query operation", "#RENDERBUFFER"),
        GLenum("pname", "the parameter whose value to retrieve from the renderbuffer bound to {@code target}", RenderbufferParameters),
        Check(1)..ReturnParam..GLint.p("params", "an array to receive the value of the queried parameter")
    )

    GLboolean(
        "IsFramebuffer",
        "Determines if a name corresponds to a framebuffer object.",

        GLuint("framebuffer", "a value that may be the name of a framebuffer object")
    )

    void(
        "BindFramebuffer",
        "Binds a framebuffer to a framebuffer target.",

        GLenum("target", "the framebuffer target of the binding operation", FramebufferTargets),
        GLuint("framebuffer", "the name of the framebuffer object to bind")
    )

    void(
        "DeleteFramebuffers",
        "Deletes framebuffer objects.",

        AutoSize("framebuffers")..GLsizei("n", "the number of framebuffer objects to be deleted"),
        SingleValue("framebuffer")..GLuint.const.p("framebuffers", "an array containing {@code n} framebuffer objects to be deleted")
    )

    void(
        "GenFramebuffers",
        "Generates framebuffer object names.",

        AutoSize("framebuffers")..GLsizei("n", "the number of framebuffer object names to generate"),
        ReturnParam..GLuint.p("framebuffers", "a buffer in which the generated framebuffer object names are stored")
    )

    GLenum(
        "CheckFramebufferStatus",
        "Checks the completeness status of a framebuffer.",

        GLenum("target", "the target of the framebuffer completeness check", FramebufferTargets)
    )

    void(
        "FramebufferTexture1D",
        "Attaches a level of a 1D texture object as a logical buffer to the currently bound framebuffer object.",

        GLenum("target", "the framebuffer target", FramebufferTargets),
        GLenum("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
        GLenum("textarget", "the type of texture"),
        GLuint("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
        GLint("level", "the mipmap level of {@code texture} to attach")
    )

    void(
        "FramebufferTexture2D",
        "Attaches a level of a 2D texture object as a logical buffer to the currently bound framebuffer object.",

        GLenum("target", "the framebuffer target", FramebufferTargets),
        GLenum("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
        GLenum("textarget", "the type of texture"),
        GLuint("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
        GLint("level", "the mipmap level of {@code texture} to attach")
    )

    void(
        "FramebufferTexture3D",
        "Attaches a layer of a 3D texture object as a logical buffer to the currently bound framebuffer object.",

        GLenum("target", "the framebuffer target", FramebufferTargets),
        GLenum("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
        GLenum("textarget", "the type of texture"),
        GLuint("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
        GLint("level", "the mipmap level of {@code texture} to attach"),
        GLint("layer", "the layer of a 2-dimensional image within the 3-dimensional texture.")
    )

    void(
        "FramebufferTextureLayer",
        "Attaches a single layer of a texture to a framebuffer",

        GLenum("target", "the framebuffer target", FramebufferTargets),
        GLenum("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
        GLuint("texture", "the texture object to attach to the framebuffer attachment point named by {@code attachment}"),
        GLint("level", "the mipmap level of {@code texture} to attach"),
        GLint("layer", "the layer of {@code texture} to attach.")
    )

    void(
        "FramebufferRenderbuffer",
        "Attaches a renderbuffer as a logical buffer to the currently bound framebuffer object.",

        GLenum("target", "the framebuffer target", FramebufferTargets),
        GLenum("attachment", "the attachment point of the framebuffer", FramebufferAttachments),
        GLenum("renderbuffertarget", "the renderbuffer target", "#RENDERBUFFER"),
        GLuint("renderbuffer", "the name of an existing renderbuffer object of type {@code renderbuffertarget} to attach")
    )

    void(
        "GetFramebufferAttachmentParameteriv",
        "Retrievees information about attachments of a bound framebuffer object.",

        GLenum("target", "the target of the query operation", FramebufferTargets),
        GLenum("attachment", "the attachment within {@code target}", FramebufferAttachments),
        GLenum("pname", "the parameter of {@code attachment} to query", FramebufferParameters),
        Check(1)..ReturnParam..GLint.p("params", "an array to receive the value of the queried parameter")
    )

    void(
        "BlitFramebuffer",
        "Copies a block of pixels from the read framebuffer to the draw framebuffer.",

        GLint("srcX0", "the lower-left coordinate of the source rectangle within the read buffer"),
        GLint("srcY0", "the upper-left coordinate of the source rectangle within the read buffer"),
        GLint("srcX1", "the lower-right coordinate of the source rectangle within the read buffer"),
        GLint("srcY1", "the upper-right coordinate of the source rectangle within the read buffer"),
        GLint("dstX0", "the lower-left coordinate of the destination rectangle within the write buffer"),
        GLint("dstY0", "the upper-left coordinate of the destination rectangle within the write buffer"),
        GLint("dstX1", "the lower-right coordinate of the destination rectangle within the write buffer"),
        GLint("dstY1", "the upper-right coordinate of the destination rectangle within the write buffer"),
        GLbitfield(
            "mask",
            "the bitwise OR of the flags indicating which buffers are to be copied",
            "#COLOR_BUFFER_BIT #DEPTH_BUFFER_BIT #STENCIL_BUFFER_BIT"
        ),
        GLenum("filter", "the interpolation to be applied if the image is stretched", "#NEAREST #LINEAR")
    )

    void(
        "GenerateMipmap",
        "Generate mipmaps for a specified texture target.",

        GLenum(
            "target",
            "the target to which the texture whose mimaps to generate is bound",
            "#TEXTURE_1D #TEXTURE_2D #TEXTURE_3D #TEXTURE_1D_ARRAY #TEXTURE_2D_ARRAY #TEXTURE_CUBE_MAP"
        )
    )

    // ARB_half_float_pixel & ARB_half_float_vertex

    IntConstant(
        """
        Accepted by the {@code type} parameter of DrawPixels, ReadPixels, TexImage1D, TexImage2D, TexImage3D, GetTexImage, TexSubImage1D, TexSubImage2D,
        TexSubImage3D, GetHistogram, GetMinmax, ConvolutionFilter1D, ConvolutionFilter2D, GetConvolutionFilter, SeparableFilter2D, GetSeparableFilter,
        ColorTable, ColorSubTable, and GetColorTable.

        Accepted by the {@code type} argument of VertexPointer, NormalPointer, ColorPointer, SecondaryColorPointer, FogCoordPointer, TexCoordPointer, and
        VertexAttribPointer.
        """,

        "HALF_FLOAT"..0x140B
    )

    // EXT_texture_integer

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

        "RGBA32UI"..0x8D70,
        "RGB32UI"..0x8D71,
        "RGBA16UI"..0x8D76,
        "RGB16UI"..0x8D77,
        "RGBA8UI"..0x8D7C,
        "RGB8UI"..0x8D7D,
        "RGBA32I"..0x8D82,
        "RGB32I"..0x8D83,
        "RGBA16I"..0x8D88,
        "RGB16I"..0x8D89,
        "RGBA8I"..0x8D8E,
        "RGB8I"..0x8D8F
    )

    IntConstant(
        """
        Accepted by the {@code format} parameter of TexImage1D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, DrawPixels and ReadPixels.
        """,

        "RED_INTEGER"..0x8D94,
        "GREEN_INTEGER"..0x8D95,
        "BLUE_INTEGER"..0x8D96,
        "RGB_INTEGER"..0x8D98,
        "RGBA_INTEGER"..0x8D99,
        "BGR_INTEGER"..0x8D9A,
        "BGRA_INTEGER"..0x8D9B
    )

    void(
        "TexParameterIiv",
        "Sets the integer value of a texture parameter.",

        GLenum("target", "the texture target"),
        GLenum("pname", "the symbolic name of a single-valued texture parameter"),
        Check(1)..SingleValue("param")..GLint.const.p("params", "the value of {@code pname}")
    )

    void(
        "TexParameterIuiv",
        "Sets the unsigned integer value of a texture parameter.",

        GLenum("target", "the texture target"),
        GLenum("pname", "the symbolic name of a single-valued texture parameter"),
        Check(1)..SingleValue("param")..GLuint.const.p("params", "the value of {@code pname}")
    )

    void(
        "GetTexParameterIiv",
        "Returns the integer value of a texture parameter.",

        GLenum("target", "the texture target"),
        GLenum("pname", "the symbolic name of a texture parameter"),
        Check(1)..ReturnParam..GLint.p("params", "returns the texture parameter value")
    )

    void(
        "GetTexParameterIuiv",
        "Returns the unsigned integer value of a texture parameter.",

        GLenum("target", "the texture target"),
        GLenum("pname", "the symbolic name of a texture parameter"),
        Check(1)..ReturnParam..GLuint.p("params", "returns the texture parameter value")
    )

    // EXT_texture_array

    IntConstant(
        "Accepted by the {@code target} parameter of TexParameteri, TexParameteriv, TexParameterf, TexParameterfv, GenerateMipmap, and BindTexture.",

        "TEXTURE_1D_ARRAY"..0x8C18,
        "TEXTURE_2D_ARRAY"..0x8C1A
    )

    IntConstant(
        "Accepted by the {@code target} parameter of TexImage3D, TexSubImage3D, CopyTexSubImage3D, CompressedTexImage3D, and CompressedTexSubImage3D.",

        "PROXY_TEXTURE_2D_ARRAY"..0x8C1B
    )

    IntConstant(
        """
        Accepted by the {@code target} parameter of TexImage2D, TexSubImage2D, CopyTexImage2D, CopyTexSubImage2D, CompressedTexImage2D, and
        CompressedTexSubImage2D.
        """,

        "PROXY_TEXTURE_1D_ARRAY"..0x8C19
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

        "TEXTURE_BINDING_1D_ARRAY"..0x8C1C,
        "TEXTURE_BINDING_2D_ARRAY"..0x8C1D,
        "MAX_ARRAY_TEXTURE_LAYERS"..0x88FF
    )

    // EXT_draw_buffers2

    void(
        "ColorMaski",
        "Enables and disables writing of frame buffer color components.",

        GLuint("buf", "the index of the draw buffer whose color mask to set"),
        GLboolean("r", "whether R values are written or not"),
        GLboolean("g", "whether G values are written or not"),
        GLboolean("b", "whether B values are written or not"),
        GLboolean("a", "whether A values are written or not")
    )

    void(
        "GetBooleani_v",
        "Queries the boolean value of an indexed state variable.",

        GLenum("target", "the indexed state to query"),
        GLuint("index", "the index of the element being queried"),
        Check(1)..ReturnParam..GLboolean.p("data", "a scalar or buffer in which to place the returned data")
    )

    void(
        "GetIntegeri_v",
        "Queries the integer value of an indexed state variable.",

        GLenum("target", "the indexed state to query"),
        GLuint("index", "the index of the element being queried"),
        Check(1)..ReturnParam..GLint.p("data", "a scalar or buffer in which to place the returned data")
    )

    void(
        "Enablei",
        "Enables an indexed capability.",

        GLenum("cap", "the indexed capability to enable"),
        GLuint("index", "the index to enable")
    )

    void(
        "Disablei",
        "Disables an indexed capability.",

        GLenum("target", "the indexed capability to disable"),
        GLuint("index", "the index to disable")
    )

    GLboolean(
        "IsEnabledi",
        "Tests whether an indexed capability is enabled.",

        GLenum("target", "the indexed capability to query"),
        GLuint("index", "the index to query")
    )

    // EXT_texture_compression_rgtc

    IntConstant(
        """
        Accepted by the {@code internalformat} parameter of TexImage2D, CopyTexImage2D, and CompressedTexImage2D and the {@code format} parameter of
        CompressedTexSubImage2D.
        """,

        "COMPRESSED_RED_RGTC1"..0x8DBB,
        "COMPRESSED_SIGNED_RED_RGTC1"..0x8DBC,
        "COMPRESSED_RG_RGTC2"..0x8DBD,
        "COMPRESSED_SIGNED_RG_RGTC2"..0x8DBE
    )

    // ARB_texture_rg

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, TexImage3D, CopyTexImage1D, and CopyTexImage2D.",

        "R8"..0x8229,
        "R16"..0x822A,
        "RG8"..0x822B,
        "RG16"..0x822C,
        "R16F"..0x822D,
        "R32F"..0x822E,
        "RG16F"..0x822F,
        "RG32F"..0x8230,
        "R8I"..0x8231,
        "R8UI"..0x8232,
        "R16I"..0x8233,
        "R16UI"..0x8234,
        "R32I"..0x8235,
        "R32UI"..0x8236,
        "RG8I"..0x8237,
        "RG8UI"..0x8238,
        "RG16I"..0x8239,
        "RG16UI"..0x823A,
        "RG32I"..0x823B,
        "RG32UI"..0x823C,
        "RG"..0x8227,
        "COMPRESSED_RED"..0x8225,
        "COMPRESSED_RG"..0x8226
    )

    IntConstant(
        "Accepted by the {@code format} parameter of TexImage3D, TexImage2D, TexImage3D, TexSubImage1D, TexSubImage2D, TexSubImage3D, and ReadPixels.",

        "RG_INTEGER"..0x8228
    )

    // EXT_transform_feedback

    IntConstant(
        """
        Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv,
        BindBufferRange, BindBufferOffset and BindBufferBase.
        """,

        "TRANSFORM_FEEDBACK_BUFFER"..0x8C8E
    )

    IntConstant(
        "Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v.",

        "TRANSFORM_FEEDBACK_BUFFER_START"..0x8C84,
        "TRANSFORM_FEEDBACK_BUFFER_SIZE"..0x8C85
    )

    IntConstant(
        """
        Accepted by the {@code param} parameter of GetIntegeri_v and GetBooleani_v, and by the {@code pname} parameter of GetBooleanv,
        GetDoublev, GetIntegerv, and GetFloatv.
        """,

        "TRANSFORM_FEEDBACK_BUFFER_BINDING"..0x8C8F
    )

    val BufferModes = IntConstant(
        "Accepted by the {@code bufferMode} parameter of TransformFeedbackVaryings.",

        "INTERLEAVED_ATTRIBS"..0x8C8C,
        "SEPARATE_ATTRIBS"..0x8C8D
    ).javaDocLinks

    IntConstant(
        "Accepted by the {@code target} parameter of BeginQuery, EndQuery, and GetQueryiv.",

        "PRIMITIVES_GENERATED"..0x8C87,
        "TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN"..0x8C88
    )

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "RASTERIZER_DISCARD"..0x8C89
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv, and GetFloatv.",

        "MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS"..0x8C8A,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS"..0x8C8B,
        "MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS"..0x8C80
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "TRANSFORM_FEEDBACK_VARYINGS"..0x8C83,
        "TRANSFORM_FEEDBACK_BUFFER_MODE"..0x8C7F,
        "TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH"..0x8C76
    )

    void(
        "BindBufferRange",
        "Binds a range within a buffer object to an indexed buffer target.",

        GLenum(
            "target",
            "the target of the bind operation",
            "#TRANSFORM_FEEDBACK_BUFFER #UNIFORM_BUFFER #ATOMIC_COUNTER_BUFFER #SHADER_STORAGE_BUFFER"
        ),
        GLuint("index", "the index of the binding point within the array specified by {@code target}"),
        GLuint("buffer", "a buffer object to bind to the specified binding point"),
        GLintptr("offset", "the starting offset in basic machine units into the buffer object {@code buffer}"),
        GLsizeiptr("size", "the amount of data in machine units that can be read from the buffer object while used as an indexed target")
    )

    void(
        "BindBufferBase",
        "Binds a buffer object to an indexed buffer target.",

        GLenum(
            "target",
            "the target of the bind operation",
            "#TRANSFORM_FEEDBACK_BUFFER #UNIFORM_BUFFER #ATOMIC_COUNTER_BUFFER #SHADER_STORAGE_BUFFER"
        ),
        GLuint("index", "the index of the binding point within the array specified by {@code target}"),
        GLuint("buffer", "a buffer object to bind to the specified binding point")
    )

    void(
        "BeginTransformFeedback",
        "Starts transform feedback operation.",

        GLenum(
            "primitiveMode",
            "the output type of the primitives that will be recorded into the buffer objects that are bound for transform feedback",
            "#POINTS #LINES #TRIANGLES"
        )
    )

    void("EndTransformFeedback", "Ends transform feedback operation.")

    void(
        "TransformFeedbackVaryings",
        "Specifies values to record in transform feedback buffers.",

        GLuint("program", "the target program object"),
        AutoSize("varyings")..GLsizei("count", "the number of varying variables used for transform feedback"),
        PointerArray(GLcharASCII.p, "varying")..GLcharASCII.const.p.p(
            "varyings",
            "an array of {@code count} zero-terminated strings specifying the names of the varying variables to use for transform feedback"
        ),
        GLenum("bufferMode", "the mode used to capture the varying variables when transform feedback is active", BufferModes)
    )

    void(
        "GetTransformFeedbackVarying",
        "Retrieves information about varying variables selected for transform feedback.",

        GLuint("program", "the target program object"),
        GLuint("index", "the index of the varying variable whose information to retrieve"),
        AutoSize("name")..GLsizei("bufSize", "the maximum number of characters, including the null terminator, that may be written into {@code name}"),
        Check(1)..nullable..GLsizei.p("length", "a variable which will receive the number of characters written into {@code name}, excluding the null-terminator. If {@code length} is NULL no length is returned."),
        Check(1)..GLsizei.p("size", "a variable that will receive the size of the varying"),
        Check(1)..GLenum.p("type", "a variable that will receive the type of the varying"),
        Return("length", "GL20.glGetProgrami(program, GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH)")..GLcharASCII.p(
            "name",
            "a buffer into which will be written the name of the varying"
        )
    )

    // ARB_vertex_array_object

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "VERTEX_ARRAY_BINDING"..0x85B5
    )

    void(
        "BindVertexArray",
        "Binds a vertex array object",

        GLuint("array", "the name of the vertex array to bind")
    )

    void(
        "DeleteVertexArrays",
        "Deletes vertex array objects.",

        AutoSize("arrays")..GLsizei("n", "the number of vertex array objects to be deleted"),
        SingleValue("array")..GLuint.const.p("arrays", "an array containing the n names of the objects to be deleted")
    )

    void(
        "GenVertexArrays",
        "Generates vertex array object names.",

        AutoSize("arrays")..GLsizei("n", "the number of vertex array object names to generate"),
        ReturnParam..GLuint.p("arrays", "a buffer in which the generated vertex array object names are stored")
    )

    GLboolean(
        "IsVertexArray",
        "Determines if a name corresponds to a vertex array object.",

        GLuint("array", "a value that may be the name of a vertex array object")
    )

    // ARB_framebuffer_sRGB

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and
        GetDoublev.
        """,

        "FRAMEBUFFER_SRGB"..0x8DB9
    )
}