/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import opengl.BufferType.*

val GL31 = "GL31".nativeClassGL("GL31") {
    documentation =
        """
        The core OpenGL 3.1 functionality. OpenGL 3.1 implementations support revision 1.40 of the OpenGL Shading Language.

        Extensions promoted to core in this release:
        ${ul(
            registryLinkTo("ARB", "draw_instanced"),
            registryLinkTo("ARB", "copy_buffer"),
            registryLinkTo("NV", "primitive_restart"),
            registryLinkTo("ARB", "texture_buffer_object"),
            registryLinkTo("ARB", "texture_rectangle"),
            registryLinkTo("ARB", "uniform_buffer_object")
        )}
        """

    IntConstant(
        "Accepted by the {@code internalFormat} parameter of TexImage1D, TexImage2D, and TexImage3D.",

        "R8_SNORM"..0x8F94,
        "RG8_SNORM"..0x8F95,
        "RGB8_SNORM"..0x8F96,
        "RGBA8_SNORM"..0x8F97,
        "R16_SNORM"..0x8F98,
        "RG16_SNORM"..0x8F99,
        "RGB16_SNORM"..0x8F9A,
        "RGBA16_SNORM"..0x8F9B
    )

    IntConstant(
        "Returned by GetTexLevelParameter and GetFramebufferAttachmentParameter.",

        "SIGNED_NORMALIZED"..0x8F9C
    )

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveUniform.",

        "SAMPLER_BUFFER"..0x8DC2,
        "INT_SAMPLER_2D_RECT"..0x8DCD,
        "INT_SAMPLER_BUFFER"..0x8DD0,
        "UNSIGNED_INT_SAMPLER_2D_RECT"..0x8DD5,
        "UNSIGNED_INT_SAMPLER_BUFFER"..0x8DD8
    )

    // ARB_draw_instanced

    void(
        "DrawArraysInstanced",
        "Draw multiple instances of a range of elements.",

        GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
        GLint.IN("first", "the index of the first vertex to be rendered"),
        GLsizei.IN("count", "the number of vertices to be rendered"),
        GLsizei.IN("primcount", "the number of instances of the specified range of vertices to be rendered")
    )

    void(
        "DrawElementsInstanced",
        "Draws multiple instances of a set of elements.",

        GLenum.IN("mode", "the kind of primitives to render", PRIMITIVE_TYPES),
        AutoSizeShr("GLChecks.typeToByteShift(type)", "indices")..GLsizei.IN("count", "the number of elements to be rendered"),
        AutoType("indices", GL_UNSIGNED_BYTE, GL_UNSIGNED_SHORT, GL_UNSIGNED_INT)..GLenum.IN(
            "type",
            "the type of the values in {@code indices}",
            "#UNSIGNED_BYTE #UNSIGNED_SHORT #UNSIGNED_INT"
        ),
        ELEMENT_ARRAY_BUFFER..void.const.p.IN("indices", "the ByteBuffer containing the indices to be rendered"),
        GLsizei.IN("primcount", "the number of instances of the specified range of indices to be rendered")
    )

    // ARB_copy_buffer

    IntConstant(
        """
        Accepted by the target parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, GetBufferPointerv, MapBufferRange,
        FlushMappedBufferRange, GetBufferParameteriv, BindBufferRange, BindBufferBase, and CopyBufferSubData.
        """,

        "COPY_READ_BUFFER"..0x8F36,
        "COPY_WRITE_BUFFER"..0x8F37
    )

    void(
        "CopyBufferSubData",
        """
        Copies all or part of one buffer object's data store to the data store of another buffer object.

        An #INVALID_VALUE error is generated if any of readoffset, writeoffset, or size are negative, if readoffset+size exceeds the size of the buffer object
        bound to readtarget, or if writeoffset+size exceeds the size of the buffer object bound to writetarget.

        An #INVALID_VALUE error is generated if the same buffer object is bound to both readtarget and writetarget, and the ranges [readoffset, readoffset+size)
        and [writeoffset, writeoffset+size) overlap.

        An #INVALID_OPERATION error is generated if zero is bound to readtarget or writetarget.

        An #INVALID_OPERATION error is generated if the buffer objects bound to either readtarget or writetarget are mapped.
        """,

        GLenum.IN(
            "readTarget",
            "the source buffer object target.",
            """
            #ARRAY_BUFFER #COPY_READ_BUFFER #COPY_WRITE_BUFFER #ELEMENT_ARRAY_BUFFER #PIXEL_PACK_BUFFER #PIXEL_UNPACK_BUFFER
            #TRANSFORM_FEEDBACK_BUFFER #TEXTURE_BUFFER #UNIFORM_BUFFER
            """
        ),
        GLenum.IN("writeTarget", "the destination buffer object target"),
        GLintptr.IN("readOffset", "the source buffer object offset, in bytes"),
        GLintptr.IN("writeOffset", "the destination buffer object offset, in bytes"),
        GLsizeiptr.IN("size", "the number of bytes to copy")
    )

    // NV_primitive_restart

    IntConstant(
        "Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled.",

        "PRIMITIVE_RESTART"..0x8F9D
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "PRIMITIVE_RESTART_INDEX"..0x8F9E
    )

    void(
        "PrimitiveRestartIndex",
        "Specifies the primitive restart index.",

        GLuint.IN("index", "the value to be interpreted as the primitive restart index")
    )

    // ARB_texture_buffer_object

    IntConstant(
        """
        Accepted by the {@code target} parameter of BindBuffer, BufferData, BufferSubData, MapBuffer, MapBufferRange, BindTexture, UnmapBuffer,
        GetBufferSubData, GetBufferParameteriv, GetBufferPointerv, and TexBuffer, and the {@code pname} parameter of GetBooleanv, GetDoublev, GetFloatv, and
        GetIntegerv.
        """,

        "TEXTURE_BUFFER"..0x8C2A
    )

    IntConstant(
        "Accepted by the {@code pname} parameters of GetBooleanv, GetDoublev, GetFloatv, and GetIntegerv.",

        "MAX_TEXTURE_BUFFER_SIZE"..0x8C2B,
        "TEXTURE_BINDING_BUFFER"..0x8C2C,
        "TEXTURE_BUFFER_DATA_STORE_BINDING"..0x8C2D
    )

    void(
        "TexBuffer",
        """
        Attaches the storage for the buffer object named {@code buffer} to the active buffer texture, and specifies an internal format for the texel array found
        in the attached buffer object. If {@code buffer} is zero, any buffer object attached to the buffer texture is detached, and no new buffer object is
        attached. If {@code buffer} is non-zero, but is not the name of an existing buffer object, the error #INVALID_OPERATION is generated.

        When a buffer object is attached to a buffer texture, the buffer object's data store is taken as the texture's texel array. The number of texels in the
        buffer texture's texel array is given by

        {@code floor(buffer_size / (components * sizeof(base_type))},

        where {@code buffer_size} is the size of the buffer object, in basic machine units and {@code components} and {@code base_type} are the element count
        and base data type for elements. The number of texels in the texel array is then clamped to the implementation-dependent limit #MAX_TEXTURE_BUFFER_SIZE.
        When a buffer texture is accessed in a shader, the results of a texel fetch are undefined if the specified texel number is greater than or equal to the
        clamped number of texels in the texel array.

        When a buffer texture is accessed in a shader, an integer is provided to indicate the texel number being accessed. If no buffer object is bound to the
        buffer texture, the results of the texel access are undefined. Otherwise, the attached buffer object's data store is interpreted as an array of elements
        of the GL data type corresponding to {@code internalformat}. Each texel consists of one to four elements that are mapped to texture components
        (R, G, B, A, L, and I). Element {@code m} of the texel numbered {@code n} is taken from element {@code n} * {@code components} + {@code m} of the
        attached buffer object's data store. Elements and texels are both numbered starting with zero. For texture formats with normalized components, the
        extracted values are converted to floating-point values. The components of the texture are then converted to an (R,G,B,A) vector, and returned to the
        shader as a four-component result vector with components of the appropriate data type for the texture's internal format.
        """,

        GLenum.IN("target", "the target of the operation", "#TEXTURE_BUFFER"),
        GLenum.IN("internalformat", "the sized internal format of the data in the store belonging to {@code buffer}"),
        GLuint.IN("buffer", "the name of the buffer object whose storage to attach to the active buffer texture")
    )

    // ARB_texture_rectangle

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable, Disable and IsEnabled; by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and
        GetDoublev; and by the {@code target} parameter of BindTexture, GetTexParameterfv, GetTexParameteriv, TexParameterf, TexParameteri, TexParameterfv and
        TexParameteriv.
        """,

        "TEXTURE_RECTANGLE"..0x84F5
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv and GetDoublev.",

        "TEXTURE_BINDING_RECTANGLE"..0x84F6
    )

    IntConstant(
        "Accepted by the {@code target} parameter of GetTexLevelParameteriv, GetTexLevelParameterfv, GetTexParameteriv and TexImage2D.",

        "PROXY_TEXTURE_RECTANGLE"..0x84F7
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetDoublev, GetIntegerv and GetFloatv.",

        "MAX_RECTANGLE_TEXTURE_SIZE"..0x84F8
    )

    IntConstant(
        "Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type sampler2DRect.",

        "SAMPLER_2D_RECT"..0x8B63
    )

    IntConstant(
        """
        Returned by {@code type} parameter of GetActiveUniform when the location {@code index} for program object {@code program} is of type
        sampler2DRectShadow.
        """,

        "SAMPLER_2D_RECT_SHADOW"..0x8B64
    )

    // ARB_uniform_buffer_object

    IntConstant(
        "Accepted by the {@code target} parameters of BindBuffer, BufferData, BufferSubData, MapBuffer, UnmapBuffer, GetBufferSubData, and GetBufferPointerv.",

        "UNIFORM_BUFFER"..0x8A11
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegeri_v, GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "UNIFORM_BUFFER_BINDING"..0x8A28
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetIntegeri_v.",

        "UNIFORM_BUFFER_START"..0x8A29,
        "UNIFORM_BUFFER_SIZE"..0x8A2A
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, GetFloatv, and GetDoublev.",

        "MAX_VERTEX_UNIFORM_BLOCKS"..0x8A2B,
        "MAX_GEOMETRY_UNIFORM_BLOCKS"..0x8A2C,
        "MAX_FRAGMENT_UNIFORM_BLOCKS"..0x8A2D,
        "MAX_COMBINED_UNIFORM_BLOCKS"..0x8A2E,
        "MAX_UNIFORM_BUFFER_BINDINGS"..0x8A2F,
        "MAX_UNIFORM_BLOCK_SIZE"..0x8A30,
        "MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS"..0x8A31,
        "MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS"..0x8A32,
        "MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS"..0x8A33,
        "UNIFORM_BUFFER_OFFSET_ALIGNMENT"..0x8A34
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetProgramiv.",

        "ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH"..0x8A35,
        "ACTIVE_UNIFORM_BLOCKS"..0x8A36
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveUniformsiv.",

        "UNIFORM_TYPE"..0x8A37,
        "UNIFORM_SIZE"..0x8A38,
        "UNIFORM_NAME_LENGTH"..0x8A39,
        "UNIFORM_BLOCK_INDEX"..0x8A3A,
        "UNIFORM_OFFSET"..0x8A3B,
        "UNIFORM_ARRAY_STRIDE"..0x8A3C,
        "UNIFORM_MATRIX_STRIDE"..0x8A3D,
        "UNIFORM_IS_ROW_MAJOR"..0x8A3E
    )

    val UniformBlockParameters = IntConstant(
        "Accepted by the {@code pname} parameter of GetActiveUniformBlockiv.",

        "UNIFORM_BLOCK_BINDING"..0x8A3F,
        "UNIFORM_BLOCK_DATA_SIZE"..0x8A40,
        "UNIFORM_BLOCK_NAME_LENGTH"..0x8A41,
        "UNIFORM_BLOCK_ACTIVE_UNIFORMS"..0x8A42,
        "UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES"..0x8A43,
        "UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER"..0x8A44,
        "UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER"..0x8A45,
        "UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER"..0x8A46
    ).javaDocLinks

    IntConstant(
        "Returned by GetActiveUniformsiv and GetUniformBlockIndex.",

        "INVALID_INDEX"..0xFFFFFFFF.i
    )

    void(
        "GetUniformIndices",
        "Retrieves the indices of a number of uniforms within a program object",

        GLuint.IN("program", "the name of a program containing uniforms whose indices to query"),
        AutoSize("uniformNames", "uniformIndices")..GLsizei.IN("uniformCount", "the number of uniforms whose indices to query"),
        PointerArray(GLcharASCII.p, "uniformName")..GLcharASCII.const.p.p.IN(
            "uniformNames",
            "an array of pointers to buffers containing the names of the queried uniforms"
        ),
        ReturnParam..GLuint.p.OUT("uniformIndices", "an array that will receive the indices of the uniforms")
    )

    void(
        "GetActiveUniformsiv",
        "Returns information about several active uniform variables for the specified program object.",

        GLuint.IN("program", "the program object to be queried"),
        AutoSize("uniformIndices", "params")..GLsizei.IN(
            "uniformCount",
            "the number of elements in the array of indices {@code uniformIndices} and the number of parameters written to {@code params} upon successful return"
        ),
        SingleValue("uniformIndex")..GLuint.const.p.IN("uniformIndices", "an array of {@code uniformCount} integers containing the indices of uniforms within {@code program}"),
        GLenum.IN("pname", "the property of the each uniform in {@code uniformIndices} that should be written into the corresponding element of {@code params}"),
        ReturnParam..GLint.p.OUT("params", "an array of {@code uniformCount} integers which are to receive the value of {@code pname} for each uniform in {@code uniformIndices}")
    )

    void(
        "GetActiveUniformName",
        "Queries the name of an active uniform.",

        GLuint.IN("program", "the program containing the active uniform index {@code uniformIndex}"),
        GLuint.IN("uniformIndex", "the index of the active uniform whose name to query"),
        AutoSize("uniformName")..GLsizei.IN(
            "bufSize",
            "the size of the buffer, in units of {@code GLchar}, of the buffer whose address is specified in {@code uniformName}"
        ),
        Check(1)..nullable..GLsizei.p.OUT(
            "length",
            "the address of a variable that will receive the number of characters that were or would have been written to the buffer addressed by {@code uniformName}"
        ),
        Return("length", "glGetActiveUniformsi(program, uniformIndex, GL_UNIFORM_NAME_LENGTH)")..GLcharASCII.p.OUT(
            "uniformName",
            "the address of a buffer into which the GL will place the name of the active uniform at {@code uniformIndex} within {@code program}"
        )
    )

    GLuint(
        "GetUniformBlockIndex",
        "Retrieves the index of a named uniform block.",

        GLuint.IN("program", "the name of a program containing the uniform block"),
        GLcharASCII.const.p.IN("uniformBlockName", "an array of characters to containing the name of the uniform block whose index to retrieve")
    )

    void(
        "GetActiveUniformBlockiv",
        "Queries information about an active uniform block.",

        GLuint.IN("program", "the name of a program containing the uniform block"),
        GLuint.IN("uniformBlockIndex", "the index of the uniform block within {@code program}"),
        GLenum.IN("pname", "the name of the parameter to query", UniformBlockParameters),
        Check(1)..ReturnParam..GLint.p.OUT("params", "the address of a variable to receive the result of the query")
    )

    void(
        "GetActiveUniformBlockName",
        "Retrieves the name of an active uniform block.",

        GLuint.IN("program", "the name of a program containing the uniform block"),
        GLuint.IN("uniformBlockIndex", "the index of the uniform block within {@code program}"),
        AutoSize("uniformBlockName")..GLsizei.IN("bufSize", "the size of the buffer addressed by {@code uniformBlockName}"),
        Check(1)..nullable..GLsizei.p.OUT("length", "the address of a variable to receive the number of characters that were written to {@code uniformBlockName}"),
        Return("length", "glGetActiveUniformBlocki(program, uniformBlockIndex, GL_UNIFORM_BLOCK_NAME_LENGTH)")..GLcharASCII.p.OUT(
            "uniformBlockName",
            "an array of characters to receive the name of the uniform block at {@code uniformBlockIndex}"
        )
    )

    void(
        "UniformBlockBinding",
        "Assigns a binding point to an active uniform block.",

        GLuint.IN("program", "the name of a program object containing the active uniform block whose binding to assign"),
        GLuint.IN("uniformBlockIndex", "the index of the active uniform block within {@code program} whose binding to assign"),
        GLuint.IN("uniformBlockBinding", "the binding point to which to bind the uniform block with index {@code uniformBlockIndex} within {@code program}")
    )

}