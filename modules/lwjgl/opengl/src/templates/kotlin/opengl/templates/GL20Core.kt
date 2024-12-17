/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GL20C = "GL20C".nativeClassGL("GL20C") {
    extends = GL15C

    // ARB_shading_language_100

    IntConstant(
        "SHADING_LANGUAGE_VERSION"..0x8B8C
    )

    // ARB_shader_objects

    IntConstant(
        "CURRENT_PROGRAM"..0x8B8D
    )

    IntConstant(
        "SHADER_TYPE"..0x8B4F,
        "DELETE_STATUS"..0x8B80,
        "COMPILE_STATUS"..0x8B81,
        "LINK_STATUS"..0x8B82,
        "VALIDATE_STATUS"..0x8B83,
        "INFO_LOG_LENGTH"..0x8B84,
        "ATTACHED_SHADERS"..0x8B85,
        "ACTIVE_UNIFORMS"..0x8B86,
        "ACTIVE_UNIFORM_MAX_LENGTH"..0x8B87,
        "ACTIVE_ATTRIBUTES"..0x8B89,
        "ACTIVE_ATTRIBUTE_MAX_LENGTH"..0x8B8A,
        "SHADER_SOURCE_LENGTH"..0x8B88
    )

    IntConstant(
        "FLOAT_VEC2"..0x8B50,
        "FLOAT_VEC3"..0x8B51,
        "FLOAT_VEC4"..0x8B52,
        "INT_VEC2"..0x8B53,
        "INT_VEC3"..0x8B54,
        "INT_VEC4"..0x8B55,
        "BOOL"..0x8B56,
        "BOOL_VEC2"..0x8B57,
        "BOOL_VEC3"..0x8B58,
        "BOOL_VEC4"..0x8B59,
        "FLOAT_MAT2"..0x8B5A,
        "FLOAT_MAT3"..0x8B5B,
        "FLOAT_MAT4"..0x8B5C,
        "SAMPLER_1D"..0x8B5D,
        "SAMPLER_2D"..0x8B5E,
        "SAMPLER_3D"..0x8B5F,
        "SAMPLER_CUBE"..0x8B60,
        "SAMPLER_1D_SHADOW"..0x8B61,
        "SAMPLER_2D_SHADOW"..0x8B62
    )

    GLuint("CreateProgram", void())

    void(
        "DeleteProgram",

        GLuint("program")
    )

    GLboolean(
        "IsProgram",

        GLuint("program")
    )

    GLuint(
        "CreateShader",

        GLenum("type")
    )

    void(
        "DeleteShader",

        GLuint("shader")
    )

    GLboolean(
        "IsShader",

        GLuint("shader")
    )

    void(
        "AttachShader",

        GLuint("program"),
        GLuint("shader")
    )

    void(
        "DetachShader",

        GLuint("program"),
        GLuint("shader")
    )

    void(
        "ShaderSource",

        GLuint("shader"),
        AutoSize("strings", "length")..GLsizei("count"),
        PointerArray(GLcharUTF8.p, "string", "length")..GLcharUTF8.const.p.const.p("strings"),
        nullable..GLint.const.p("length")
    )

    void(
        "CompileShader",

        GLuint("shader")
    )

    void(
        "LinkProgram",

        GLuint("program")
    )

    void(
        "UseProgram",

        GLuint("program")
    )

    void(
        "ValidateProgram",

        GLuint("program")
    )

    // Uniform functions javadoc

    val uniformLocation = GLint("location")

    void(
        "Uniform1f",

        uniformLocation,
        GLfloat("v0")
    )

    void(
        "Uniform2f",

        uniformLocation,
        GLfloat("v0"),
        GLfloat("v1")
    )

    void(
        "Uniform3f",

        uniformLocation,
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2")
    )

    void(
        "Uniform4f",

        uniformLocation,
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2"),
        GLfloat("v3")
    )

    void(
        "Uniform1i",

        uniformLocation,
        GLint("v0")
    )

    void(
        "Uniform2i",

        uniformLocation,
        GLint("v0"),
        GLint("v1")
    )

    void(
        "Uniform3i",

        uniformLocation,
        GLint("v0"),
        GLint("v1"),
        GLint("v2")
    )

    void(
        "Uniform4i",

        uniformLocation,
        GLint("v0"),
        GLint("v1"),
        GLint("v2"),
        GLint("v3")
    )

    void(
        "Uniform1fv",

        uniformLocation,
        AutoSize("value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform2fv",

        uniformLocation,
        AutoSize(2, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform3fv",

        uniformLocation,
        AutoSize(3, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform4fv",

        uniformLocation,
        AutoSize(4, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform1iv",

        uniformLocation,
        AutoSize("value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "Uniform2iv",

        uniformLocation,
        AutoSize(2, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "Uniform3iv",

        uniformLocation,
        AutoSize(3, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "Uniform4iv",

        uniformLocation,
        AutoSize(4, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "UniformMatrix2fv",

        uniformLocation,
        AutoSize(2 x 2, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix3fv",

        uniformLocation,
        AutoSize(3 x 3, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix4fv",

        uniformLocation,
        AutoSize(4 x 4, "value")..GLsizei("count"),
        GLboolean("transpose"),
        GLfloat.const.p("value")
    )

    void(
        "GetShaderiv",

        GLuint("shader"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetProgramiv",

        GLuint("program"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetShaderInfoLog",

        GLuint("shader"),
        AutoSize("infoLog")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length",
            "glGetShaderi(shader, GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p("infoLog")
    )

    void(
        "GetProgramInfoLog",

        GLuint("program"),
        AutoSize("infoLog")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length",
            "glGetProgrami(program, GL_INFO_LOG_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p("infoLog")
    )

    void(
        "GetAttachedShaders",

        GLuint("program"),
        AutoSize("shaders")..GLsizei("maxCount"),
        Check(1)..nullable..GLsizei.p("count"),
        GLuint.p("shaders")
    )

    GLint(
        "GetUniformLocation",

        GLuint("program"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetActiveUniform",

        GLuint("program"),
        GLuint("index"),
        AutoSize("name")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Check(1)..GLint.p("size"),
        Check(1)..GLenum.p("type"),
        Return(
            "length",
            "glGetProgrami(program, GL_ACTIVE_UNIFORM_MAX_LENGTH)"
        )..GLcharASCII.p("name")
    )

    void(
        "GetUniformfv",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLfloat.p("params")
    )

    void(
        "GetUniformiv",

        GLuint("program"),
        GLint("location"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetShaderSource",

        GLuint("shader"),
        AutoSize("source")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length",
            "glGetShaderi(shader, GL_SHADER_SOURCE_LENGTH)",
            heapAllocate = true
        )..GLcharUTF8.p("source")
    )

    // ARB_vertex_shader

    IntConstant(
        "VERTEX_SHADER"..0x8B31
    )

    IntConstant(
        "MAX_VERTEX_UNIFORM_COMPONENTS"..0x8B4A,
        "MAX_VARYING_FLOATS"..0x8B4B,
        "MAX_VERTEX_ATTRIBS"..0x8869,
        "MAX_TEXTURE_IMAGE_UNITS"..0x8872,
        "MAX_VERTEX_TEXTURE_IMAGE_UNITS"..0x8B4C,
        "MAX_COMBINED_TEXTURE_IMAGE_UNITS"..0x8B4D
    )

    IntConstant(
        "VERTEX_PROGRAM_POINT_SIZE"..0x8642
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_ENABLED"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED"..0x886A,
        "CURRENT_VERTEX_ATTRIB"..0x8626
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_POINTER"..0x8645
    )

    void(
        "VertexAttrib1f",

        GLuint("index"),
        GLfloat("v0")
    )

    void("VertexAttrib1s", GLuint("index"), GLshort("v0"))
    void("VertexAttrib1d", GLuint("index"), GLdouble("v0"))

    void(
        "VertexAttrib2f",

        GLuint("index"),
        GLfloat("v0"),
        GLfloat("v1")
    )

    void("VertexAttrib2s", GLuint("index"), GLshort("v0"), GLshort("v1"))
    void("VertexAttrib2d", GLuint("index"), GLdouble("v0"), GLdouble("v1"))

    void(
        "VertexAttrib3f",

        GLuint("index"),
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2")
    )

    void("VertexAttrib3s", GLuint("index"), GLshort("v0"), GLshort("v1"), GLshort("v2"))
    void("VertexAttrib3d", GLuint("index"), GLdouble("v0"), GLdouble("v1"), GLdouble("v2"))

    void(
        "VertexAttrib4f",

        GLuint("index"),
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2"),
        GLfloat("v3")
    )

    void("VertexAttrib4s", GLuint("index"), GLshort("v0"), GLshort("v1"), GLshort("v2"), GLshort("v3"))
    void("VertexAttrib4d", GLuint("index"), GLdouble("v0"), GLdouble("v1"), GLdouble("v2"), GLdouble("v3"))
    void("VertexAttrib4Nub", GLuint("index"), GLubyte("x"), GLubyte("y"), GLubyte("z"), GLubyte("w"))

    void("VertexAttrib1fv", GLuint("index"), Check(1)..GLfloat.const.p("v"))
    void("VertexAttrib1sv", GLuint("index"), Check(1)..GLshort.const.p("v"))
    void("VertexAttrib1dv", GLuint("index"), Check(1)..GLdouble.const.p("v"))

    void("VertexAttrib2fv", GLuint("index"), Check(2)..GLfloat.const.p("v"))
    void("VertexAttrib2sv", GLuint("index"), Check(2)..GLshort.const.p("v"))
    void("VertexAttrib2dv", GLuint("index"), Check(2)..GLdouble.const.p("v"))

    void("VertexAttrib3fv", GLuint("index"), Check(3)..GLfloat.const.p("v"))
    void("VertexAttrib3sv", GLuint("index"), Check(3)..GLshort.const.p("v"))
    void("VertexAttrib3dv", GLuint("index"), Check(3)..GLdouble.const.p("v"))

    void("VertexAttrib4fv", GLuint("index"), Check(4)..GLfloat.const.p("v"))
    void("VertexAttrib4sv", GLuint("index"), Check(4)..GLshort.const.p("v"))
    void("VertexAttrib4dv", GLuint("index"), Check(4)..GLdouble.const.p("v"))

    void("VertexAttrib4iv", GLuint("index"), Check(4)..GLint.const.p("v"))
    void("VertexAttrib4bv", GLuint("index"), Check(4)..GLbyte.const.p("v"))
    void("VertexAttrib4ubv", GLuint("index"), Check(4)..GLubyte.const.p("v"))
    void("VertexAttrib4usv", GLuint("index"), Check(4)..GLushort.const.p("v"))
    void("VertexAttrib4uiv", GLuint("index"), Check(4)..GLuint.const.p("v"))
    void("VertexAttrib4Nbv", GLuint("index"), Check(4)..GLbyte.const.p("v"))
    void("VertexAttrib4Nsv", GLuint("index"), Check(4)..GLshort.const.p("v"))
    void("VertexAttrib4Niv", GLuint("index"), Check(4)..GLint.const.p("v"))
    void("VertexAttrib4Nubv", GLuint("index"), Check(4)..GLubyte.const.p("v"))
    void("VertexAttrib4Nusv", GLuint("index"), Check(4)..GLushort.const.p("v"))
    void("VertexAttrib4Nuiv", GLuint("index"), Check(4)..GLuint.const.p("v"))

    OffHeapOnly..void(
        "VertexAttribPointer",

        GLuint("index"),
        GLint("size"),
        GLenum("type"),
        GLboolean("normalized"),
        GLsizei("stride"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..Unsafe..RawPointer..void.const.p("pointer")
    )

    void(
        "EnableVertexAttribArray",

        GLuint("index")
    )

    void(
        "DisableVertexAttribArray",

        GLuint("index")
    )

    void(
        "BindAttribLocation",

        GLuint("program"),
        GLuint("index"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetActiveAttrib",

        GLuint("program"),
        GLuint("index"),
        AutoSize("name")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Check(1)..GLint.p("size"),
        Check(1)..GLenum.p("type"),
        Return(
            "length",
            "glGetProgrami(program, GL_ACTIVE_ATTRIBUTE_MAX_LENGTH)"
        )..GLcharASCII.p("name")
    )

    GLint(
        "GetAttribLocation",

        GLuint("program"),
        GLcharASCII.const.p("name")
    )

    void(
        "GetVertexAttribiv",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetVertexAttribfv",

        GLuint("index"),
        GLenum("pname"),
        Check(4)..GLfloat.p("params")
    )

    void(
        "GetVertexAttribdv",

        GLuint("index"),
        GLenum("pname"),
        Check(4)..GLdouble.p("params")
    )


    void(
        "GetVertexAttribPointerv",

        GLuint("index"),
        GLenum("pname"),
        Check(1)..ReturnParam..void.p.p("pointer")
    )

    // ARB_fragment_shader

    IntConstant(
        "FRAGMENT_SHADER"..0x8B30
    )

    IntConstant(
        "MAX_FRAGMENT_UNIFORM_COMPONENTS"..0x8B49
    )

    IntConstant(
        "FRAGMENT_SHADER_DERIVATIVE_HINT"..0x8B8B
    )

    // ARB_draw_buffers

    IntConstant(
        "MAX_DRAW_BUFFERS"..0x8824,
        "DRAW_BUFFER0"..0x8825,
        "DRAW_BUFFER1"..0x8826,
        "DRAW_BUFFER2"..0x8827,
        "DRAW_BUFFER3"..0x8828,
        "DRAW_BUFFER4"..0x8829,
        "DRAW_BUFFER5"..0x882A,
        "DRAW_BUFFER6"..0x882B,
        "DRAW_BUFFER7"..0x882C,
        "DRAW_BUFFER8"..0x882D,
        "DRAW_BUFFER9"..0x882E,
        "DRAW_BUFFER10"..0x882F,
        "DRAW_BUFFER11"..0x8830,
        "DRAW_BUFFER12"..0x8831,
        "DRAW_BUFFER13"..0x8832,
        "DRAW_BUFFER14"..0x8833,
        "DRAW_BUFFER15"..0x8834
    )

    void(
        "DrawBuffers",

        AutoSize("bufs")..GLsizei("n"),
        SingleValue("buf")..GLenum.const.p("bufs")
    )

    // ARB_point_sprite

    IntConstant(
        "POINT_SPRITE_COORD_ORIGIN"..0x8CA0
    )

    IntConstant(
        "LOWER_LEFT"..0x8CA1,
        "UPPER_LEFT"..0x8CA2
    )

    // EXT_blend_equation_separate

    IntConstant(
        "BLEND_EQUATION_RGB"..0x8009,
        "BLEND_EQUATION_ALPHA"..0x883D
    )

    void(
        "BlendEquationSeparate",

        GLenum("modeRGB"),
        GLenum("modeAlpha")
    )

    // ATI_separate_stencil

    IntConstant(
        "STENCIL_BACK_FUNC"..0x8800,
        "STENCIL_BACK_FAIL"..0x8801,
        "STENCIL_BACK_PASS_DEPTH_FAIL"..0x8802,
        "STENCIL_BACK_PASS_DEPTH_PASS"..0x8803,
        "STENCIL_BACK_REF"..0x8CA3,
        "STENCIL_BACK_VALUE_MASK"..0x8CA4,
        "STENCIL_BACK_WRITEMASK"..0x8CA5
    )

    void(
        "StencilOpSeparate",

        GLenum("face"),
        GLenum("sfail"),
        GLenum("dpfail"),
        GLenum("dppass")
    )

    void(
        "StencilFuncSeparate",

        GLenum("face"),
        GLenum("func"),
        GLint("ref"),
        GLuint("mask")
    )

    void(
        "StencilMaskSeparate",

        GLenum("face"),
        GLuint("mask")
    )
}