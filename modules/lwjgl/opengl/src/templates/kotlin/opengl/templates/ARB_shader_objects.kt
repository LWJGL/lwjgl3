/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_shader_objects = "ARBShaderObjects".nativeClassGL("ARB_shader_objects", postfix = ARB) {
    IntConstant(
        "PROGRAM_OBJECT_ARB"..0x8B40
    )

    IntConstant(
        "OBJECT_TYPE_ARB"..0x8B4E,
        "OBJECT_SUBTYPE_ARB"..0x8B4F,
        "OBJECT_DELETE_STATUS_ARB"..0x8B80,
        "OBJECT_COMPILE_STATUS_ARB"..0x8B81,
        "OBJECT_LINK_STATUS_ARB"..0x8B82,
        "OBJECT_VALIDATE_STATUS_ARB"..0x8B83,
        "OBJECT_INFO_LOG_LENGTH_ARB"..0x8B84,
        "OBJECT_ATTACHED_OBJECTS_ARB"..0x8B85,
        "OBJECT_ACTIVE_UNIFORMS_ARB"..0x8B86,
        "OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB"..0x8B87,
        "OBJECT_SHADER_SOURCE_LENGTH_ARB"..0x8B88
    )

    IntConstant(
        "SHADER_OBJECT_ARB"..0x8B48
    )

    IntConstant(
        "FLOAT_VEC2_ARB"..0x8B50,
        "FLOAT_VEC3_ARB"..0x8B51,
        "FLOAT_VEC4_ARB"..0x8B52,
        "INT_VEC2_ARB"..0x8B53,
        "INT_VEC3_ARB"..0x8B54,
        "INT_VEC4_ARB"..0x8B55,
        "BOOL_ARB"..0x8B56,
        "BOOL_VEC2_ARB"..0x8B57,
        "BOOL_VEC3_ARB"..0x8B58,
        "BOOL_VEC4_ARB"..0x8B59,
        "FLOAT_MAT2_ARB"..0x8B5A,
        "FLOAT_MAT3_ARB"..0x8B5B,
        "FLOAT_MAT4_ARB"..0x8B5C,
        "SAMPLER_1D_ARB"..0x8B5D,
        "SAMPLER_2D_ARB"..0x8B5E,
        "SAMPLER_3D_ARB"..0x8B5F,
        "SAMPLER_CUBE_ARB"..0x8B60,
        "SAMPLER_1D_SHADOW_ARB"..0x8B61,
        "SAMPLER_2D_SHADOW_ARB"..0x8B62,
        "SAMPLER_2D_RECT_ARB"..0x8B63,
        "SAMPLER_2D_RECT_SHADOW_ARB"..0x8B64
    )

    void(
        "DeleteObjectARB",

        GLhandleARB("obj")
    )

    GLhandleARB(
        "GetHandleARB",

        GLenum("pname")
    )

    void(
        "DetachObjectARB",

        GLhandleARB("containerObj"),
        GLhandleARB("attachedObj")
    )

    GLhandleARB(
        "CreateShaderObjectARB",

        GLenum("shaderType")
    )

    void(
        "ShaderSourceARB",

        GLhandleARB("shaderObj"),
        AutoSize("string", "length")..GLsizei("count"),
        PointerArray(GLcharARB.p, "string", "length")..GLcharARB.const.p.p("string"),
        nullable..GLint.const.p("length")
    )

    void(
        "CompileShaderARB",

        GLhandleARB("shaderObj")
    )

    GLhandleARB(
        "CreateProgramObjectARB",
        void()
    )

    void(
        "AttachObjectARB",

        GLhandleARB("containerObj"),
        GLhandleARB("obj")
    )

    void(
        "LinkProgramARB",

        GLhandleARB("programObj")
    )

    void(
        "UseProgramObjectARB",

        GLhandleARB("programObj")
    )

    void(
        "ValidateProgramARB",

        GLhandleARB("programObj")
    )

    val uniformLocation = GLint("location")

    void(
        "Uniform1fARB",

        uniformLocation,
        GLfloat("v0")
    )

    void(
        "Uniform2fARB",

        uniformLocation,
        GLfloat("v0"),
        GLfloat("v1")
    )

    void(
        "Uniform3fARB",

        uniformLocation,
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2")
    )

    void(
        "Uniform4fARB",

        GLint("location"),
        GLfloat("v0"),
        GLfloat("v1"),
        GLfloat("v2"),
        GLfloat("v3")
    )

    void(
        "Uniform1iARB",

        uniformLocation,
        GLint("v0")
    )

    void(
        "Uniform2iARB",

        uniformLocation,
        GLint("v0"),
        GLint("v1")
    )

    void(
        "Uniform3iARB",

        uniformLocation,
        GLint("v0"),
        GLint("v1"),
        GLint("v2")
    )

    void(
        "Uniform4iARB",

        uniformLocation,
        GLint("v0"),
        GLint("v1"),
        GLint("v2"),
        GLint("v3")
    )
    
    void(
        "Uniform1fvARB",

        uniformLocation,
        AutoSize("value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform2fvARB",

        uniformLocation,
        AutoSize(2, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform3fvARB",

        uniformLocation,
        AutoSize(3, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform4fvARB",

        uniformLocation,
        AutoSize(4, "value")..GLsizei("count"),
        GLfloat.const.p("value")
    )

    void(
        "Uniform1ivARB",

        uniformLocation,
        AutoSize("value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "Uniform2ivARB",

        uniformLocation,
        AutoSize(2, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "Uniform3ivARB",

        uniformLocation,
        AutoSize(3, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    void(
        "Uniform4ivARB",

        uniformLocation,
        AutoSize(4, "value")..GLsizei("count"),
        GLint.const.p("value")
    )

    val transpose = GLboolean("transpose")

    void(
        "UniformMatrix2fvARB",

        uniformLocation,
        AutoSize(2 x 2, "value")..GLsizei("count"),
        transpose,
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix3fvARB",

        uniformLocation,
        AutoSize(3 x 3, "value")..GLsizei("count"),
        transpose,
        GLfloat.const.p("value")
    )

    void(
        "UniformMatrix4fvARB",

        uniformLocation,
        AutoSize(4 x 4, "value")..GLsizei("count"),
        transpose,
        GLfloat.const.p("value")
    )

    void(
        "GetObjectParameterfvARB",

        GLhandleARB("obj"),
        GLenum("pname"),
        Check(1)..GLfloat.p("params")
    )

    void(
        "GetObjectParameterivARB",

        GLhandleARB("obj"),
        GLenum("pname"),
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetInfoLogARB",

        GLhandleARB("obj"),
        AutoSize("infoLog")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length",
            "glGetObjectParameteriARB(obj, GL_OBJECT_INFO_LOG_LENGTH_ARB)",
            heapAllocate = true
        )..GLcharARB.p("infoLog")
    )

    void(
        "GetAttachedObjectsARB",

        GLhandleARB("containerObj"),
        AutoSize("obj")..GLsizei("maxCount"),
        Check(1)..nullable..GLsizei.p("count"),
        GLhandleARB.p("obj")
    )

    GLint(
        "GetUniformLocationARB",

        GLhandleARB("programObj"),
        GLcharARB.const.p("name")
    )

    void(
        "GetActiveUniformARB",

        GLhandleARB("programObj"),
        GLuint("index"),
        AutoSize("name")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Check(1)..GLint.p("size"),
        Check(1)..GLenum.p("type"),
        Return(
            "length",
            "glGetObjectParameteriARB(programObj, GL_OBJECT_ACTIVE_UNIFORM_MAX_LENGTH_ARB)"
        )..GLcharARB.p("name")
    )

    void(
        "GetUniformfvARB",

        GLhandleARB("programObj"),
        uniformLocation,
        Check(1)..ReturnParam..GLfloat.p("params")
    )

    void(
        "GetUniformivARB",

        GLhandleARB("programObj"),
        uniformLocation,
        Check(1)..ReturnParam..GLint.p("params")
    )

    void(
        "GetShaderSourceARB",

        GLhandleARB("obj"),
        AutoSize("source")..GLsizei("maxLength"),
        Check(1)..nullable..GLsizei.p("length"),
        Return(
            "length",
            "glGetObjectParameteriARB(obj, GL_OBJECT_SHADER_SOURCE_LENGTH_ARB)",
            heapAllocate = true
        )..GLcharARB.p("source")
    )
}