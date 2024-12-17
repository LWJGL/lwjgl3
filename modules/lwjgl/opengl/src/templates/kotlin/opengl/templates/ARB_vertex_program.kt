/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_vertex_program = "ARBVertexProgram".nativeClassGL("ARB_vertex_program", postfix = ARB) {
    IntConstant(
        "VERTEX_PROGRAM_ARB"..0x8620
    )

    IntConstant(
        "VERTEX_PROGRAM_POINT_SIZE_ARB"..0x8642,
        "VERTEX_PROGRAM_TWO_SIDE_ARB"..0x8643,
        "COLOR_SUM_ARB"..0x8458
    )

    IntConstant(
        "PROGRAM_FORMAT_ASCII_ARB"..0x8875
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_ENABLED_ARB"..0x8622,
        "VERTEX_ATTRIB_ARRAY_SIZE_ARB"..0x8623,
        "VERTEX_ATTRIB_ARRAY_STRIDE_ARB"..0x8624,
        "VERTEX_ATTRIB_ARRAY_TYPE_ARB"..0x8625,
        "VERTEX_ATTRIB_ARRAY_NORMALIZED_ARB"..0x886A,
        "CURRENT_VERTEX_ATTRIB_ARB"..0x8626
    )

    IntConstant(
        "VERTEX_ATTRIB_ARRAY_POINTER_ARB"..0x8645
    )

    IntConstant(
        "PROGRAM_LENGTH_ARB"..0x8627,
        "PROGRAM_FORMAT_ARB"..0x8876,
        "PROGRAM_BINDING_ARB"..0x8677,
        "PROGRAM_INSTRUCTIONS_ARB"..0x88A0,
        "MAX_PROGRAM_INSTRUCTIONS_ARB"..0x88A1,
        "PROGRAM_NATIVE_INSTRUCTIONS_ARB"..0x88A2,
        "MAX_PROGRAM_NATIVE_INSTRUCTIONS_ARB"..0x88A3,
        "PROGRAM_TEMPORARIES_ARB"..0x88A4,
        "MAX_PROGRAM_TEMPORARIES_ARB"..0x88A5,
        "PROGRAM_NATIVE_TEMPORARIES_ARB"..0x88A6,
        "MAX_PROGRAM_NATIVE_TEMPORARIES_ARB"..0x88A7,
        "PROGRAM_PARAMETERS_ARB"..0x88A8,
        "MAX_PROGRAM_PARAMETERS_ARB"..0x88A9,
        "PROGRAM_NATIVE_PARAMETERS_ARB"..0x88AA,
        "MAX_PROGRAM_NATIVE_PARAMETERS_ARB"..0x88AB,
        "PROGRAM_ATTRIBS_ARB"..0x88AC,
        "MAX_PROGRAM_ATTRIBS_ARB"..0x88AD,
        "PROGRAM_NATIVE_ATTRIBS_ARB"..0x88AE,
        "MAX_PROGRAM_NATIVE_ATTRIBS_ARB"..0x88AF,
        "PROGRAM_ADDRESS_REGISTERS_ARB"..0x88B0,
        "MAX_PROGRAM_ADDRESS_REGISTERS_ARB"..0x88B1,
        "PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB"..0x88B2,
        "MAX_PROGRAM_NATIVE_ADDRESS_REGISTERS_ARB"..0x88B3,
        "MAX_PROGRAM_LOCAL_PARAMETERS_ARB"..0x88B4,
        "MAX_PROGRAM_ENV_PARAMETERS_ARB"..0x88B5,
        "PROGRAM_UNDER_NATIVE_LIMITS_ARB"..0x88B6
    )

    IntConstant(
        "PROGRAM_STRING_ARB"..0x8628
    )

    IntConstant(
        "PROGRAM_ERROR_POSITION_ARB"..0x864B,
        "CURRENT_MATRIX_ARB"..0x8641,
        "TRANSPOSE_CURRENT_MATRIX_ARB"..0x88B7,
        "CURRENT_MATRIX_STACK_DEPTH_ARB"..0x8640,
        "MAX_VERTEX_ATTRIBS_ARB"..0x8869,
        "MAX_PROGRAM_MATRICES_ARB"..0x862F,
        "MAX_PROGRAM_MATRIX_STACK_DEPTH_ARB"..0x862E
    )

    IntConstant(
        "PROGRAM_ERROR_STRING_ARB"..0x8874
    )

    IntConstant(
        "MATRIX0_ARB"..0x88C0,
        "MATRIX1_ARB"..0x88C1,
        "MATRIX2_ARB"..0x88C2,
        "MATRIX3_ARB"..0x88C3,
        "MATRIX4_ARB"..0x88C4,
        "MATRIX5_ARB"..0x88C5,
        "MATRIX6_ARB"..0x88C6,
        "MATRIX7_ARB"..0x88C7,
        "MATRIX8_ARB"..0x88C8,
        "MATRIX9_ARB"..0x88C9,
        "MATRIX10_ARB"..0x88CA,
        "MATRIX11_ARB"..0x88CB,
        "MATRIX12_ARB"..0x88CC,
        "MATRIX13_ARB"..0x88CD,
        "MATRIX14_ARB"..0x88CE,
        "MATRIX15_ARB"..0x88CF,
        "MATRIX16_ARB"..0x88D0,
        "MATRIX17_ARB"..0x88D1,
        "MATRIX18_ARB"..0x88D2,
        "MATRIX19_ARB"..0x88D3,
        "MATRIX20_ARB"..0x88D4,
        "MATRIX21_ARB"..0x88D5,
        "MATRIX22_ARB"..0x88D6,
        "MATRIX23_ARB"..0x88D7,
        "MATRIX24_ARB"..0x88D8,
        "MATRIX25_ARB"..0x88D9,
        "MATRIX26_ARB"..0x88DA,
        "MATRIX27_ARB"..0x88DB,
        "MATRIX28_ARB"..0x88DC,
        "MATRIX29_ARB"..0x88DD,
        "MATRIX30_ARB"..0x88DE,
        "MATRIX31_ARB"..0x88DF
    )

    reuse(ARB_vertex_shader, "VertexAttrib1sARB")
    reuse(ARB_vertex_shader, "VertexAttrib1fARB")
    reuse(ARB_vertex_shader, "VertexAttrib1dARB")

    reuse(ARB_vertex_shader, "VertexAttrib2sARB")
    reuse(ARB_vertex_shader, "VertexAttrib2fARB")
    reuse(ARB_vertex_shader, "VertexAttrib2dARB")

    reuse(ARB_vertex_shader, "VertexAttrib3sARB")
    reuse(ARB_vertex_shader, "VertexAttrib3fARB")
    reuse(ARB_vertex_shader, "VertexAttrib3dARB")

    reuse(ARB_vertex_shader, "VertexAttrib4sARB")
    reuse(ARB_vertex_shader, "VertexAttrib4fARB")
    reuse(ARB_vertex_shader, "VertexAttrib4dARB")
    reuse(ARB_vertex_shader, "VertexAttrib4NubARB")

    reuse(ARB_vertex_shader, "VertexAttrib1svARB")
    reuse(ARB_vertex_shader, "VertexAttrib1fvARB")
    reuse(ARB_vertex_shader, "VertexAttrib1dvARB")

    reuse(ARB_vertex_shader, "VertexAttrib2svARB")
    reuse(ARB_vertex_shader, "VertexAttrib2fvARB")
    reuse(ARB_vertex_shader, "VertexAttrib2dvARB")

    reuse(ARB_vertex_shader, "VertexAttrib3svARB")
    reuse(ARB_vertex_shader, "VertexAttrib3fvARB")
    reuse(ARB_vertex_shader, "VertexAttrib3dvARB")

    reuse(ARB_vertex_shader, "VertexAttrib4fvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4bvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4svARB")
    reuse(ARB_vertex_shader, "VertexAttrib4ivARB")
    reuse(ARB_vertex_shader, "VertexAttrib4ubvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4usvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4uivARB")
    reuse(ARB_vertex_shader, "VertexAttrib4dvARB")

    reuse(ARB_vertex_shader, "VertexAttrib4NbvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4NsvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4NivARB")

    reuse(ARB_vertex_shader, "VertexAttrib4NubvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4NusvARB")
    reuse(ARB_vertex_shader, "VertexAttrib4NuivARB")

    reuse(ARB_vertex_shader, "VertexAttribPointerARB")

    reuse(ARB_vertex_shader, "EnableVertexAttribArrayARB")
    reuse(ARB_vertex_shader, "DisableVertexAttribArrayARB")

    val TARGET = GLenum("target")

    void(
        "ProgramStringARB",

        TARGET,
        GLenum("format"),
        AutoSize("string")..GLsizei("len"),
        void.const.p("string")
    )

    void(
        "BindProgramARB",

        TARGET,
        GLuint("program")
    )

    void(
        "DeleteProgramsARB",

        AutoSize("programs")..GLsizei("n"),
        GLuint.const.p("programs")
    )

    void(
        "GenProgramsARB",

        AutoSize("programs")..GLsizei("n"),
        ReturnParam..GLuint.p("programs")
    )

    val VP_INDEX = GLuint("index")

    void("ProgramEnvParameter4dARB", TARGET, VP_INDEX, GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))
    void("ProgramEnvParameter4dvARB", TARGET, VP_INDEX, Check(4)..GLdouble.const.p("params"))
    void(
        "ProgramEnvParameter4fARB",

        TARGET,
        VP_INDEX,
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z"),
        GLfloat("w")
    )
    void("ProgramEnvParameter4fvARB", TARGET, VP_INDEX, Check(4)..GLfloat.const.p("params"))

    void("ProgramLocalParameter4dARB", TARGET, VP_INDEX, GLdouble("x"), GLdouble("y"), GLdouble("z"), GLdouble("w"))
    void("ProgramLocalParameter4dvARB", TARGET, VP_INDEX, Check(4)..GLdouble.const.p("params"))
    void(
        "ProgramLocalParameter4fARB",

        TARGET,
        VP_INDEX,
        GLfloat("x"),
        GLfloat("y"),
        GLfloat("z"),
        GLfloat("w")
    )
    void("ProgramLocalParameter4fvARB", TARGET, VP_INDEX, Check(4)..GLfloat.const.p("params"))

    void(
        "GetProgramEnvParameterfvARB",

        TARGET,
        VP_INDEX,
        Check(4)..GLfloat.p("params")
    )

    void(
        "GetProgramEnvParameterdvARB",

        TARGET,
        VP_INDEX,
        Check(4)..GLdouble.p("params")
    )

    void(
        "GetProgramLocalParameterfvARB",

        TARGET,
        VP_INDEX,
        Check(4)..GLfloat.p("params")
    )

    void(
        "GetProgramLocalParameterdvARB",

        TARGET,
        VP_INDEX,
        Check(4)..GLdouble.p("params")
    )

    void(
        "GetProgramivARB",

        TARGET,
        GLenum("pname"),
        ReturnParam..Check(1)..GLint.p("params")
    )

    void(
        "GetProgramStringARB",

        TARGET,
        GLenum("pname"),
        Check("glGetProgramiARB(target, GL_PROGRAM_LENGTH_ARB)", debug = true)..void.p("string")
    )

    reuse(ARB_vertex_shader, "GetVertexAttribfvARB")
    reuse(ARB_vertex_shader, "GetVertexAttribdvARB")
    reuse(ARB_vertex_shader, "GetVertexAttribivARB")
    reuse(ARB_vertex_shader, "GetVertexAttribPointervARB")

    GLboolean(
        "IsProgramARB",

        GLuint("program")
    )

}