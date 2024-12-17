/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_gpu_shader_int64 = "ARBGPUShaderInt64".nativeClassGL("ARB_gpu_shader_int64") {
    IntConstant(
        "INT64_ARB"..0x140E,
        "UNSIGNED_INT64_ARB"..0x140F,
        "INT64_VEC2_ARB"..0x8FE9,
        "INT64_VEC3_ARB"..0x8FEA,
        "INT64_VEC4_ARB"..0x8FEB,
        "UNSIGNED_INT64_VEC2_ARB"..0x8FF5,
        "UNSIGNED_INT64_VEC3_ARB"..0x8FF6,
        "UNSIGNED_INT64_VEC4_ARB"..0x8FF7
    )

    val args = arrayOf(
        GLuint("program"),
        GLint("location"),
        GLint64("x"),
        GLint64("y"),
        GLint64("z"),
        GLint64("w")
    )

    val autoSizes = arrayOf(
        AutoSize(1, "value"),
        AutoSize(2, "value"),
        AutoSize(3, "value"),
        AutoSize(4, "value")
    )

    for (i in 1..4) {
        // Uniform{1,2,3,4}i64ARB
        void(
            "Uniform${i}i64ARB",
            *args.copyOfRange(1, 2 + i)
        )

        // Uniform{1,2,3,4}i64vARB
        void(
            "Uniform${i}i64vARB",

            args[1],
            autoSizes[i - 1]..GLsizei("count"),
            GLint64.p("value")
        )

        // ProgramUniform{1,2,3,4}i64ARB
        void(
            "ProgramUniform${i}i64ARB",
            *args.copyOfRange(0, 2 + i)
        )

        // ProgramUniform{1,2,3,4}i64vARB
        void(
            "ProgramUniform${i}i64vARB",

            args[0],
            args[1],
            autoSizes[i - 1]..GLsizei("count"),
            GLint64.p("value")
        )
    }

    args[2] = GLuint64("x")
    args[3] = GLuint64("y")
    args[4] = GLuint64("z")
    args[5] = GLuint64("w")

    for (i in 1..4) {
        // Uniform{1,2,3,4}ui64ARB
        void(
            "Uniform${i}ui64ARB",
            *args.copyOfRange(1, 2 + i)
        )

        // Uniform{1,2,3,4}ui64vARB
        void(
            "Uniform${i}ui64vARB",

            args[1],
            autoSizes[i - 1]..GLsizei("count"),
            GLuint64.const.p("value")
        )

        // ProgramUniform{1,2,3,4}ui64ARB
        void(
            "ProgramUniform${i}ui64ARB",
            *args.copyOfRange(0, 2 + i)
        )

        // ProgramUniform{1,2,3,4}ui64vARB
        void(
            "ProgramUniform${i}ui64vARB",

            args[0],
            args[1],
            autoSizes[i - 1]..GLsizei("count"),
            GLuint64.const.p("value")
        )
    }

    void(
        "GetUniformi64vARB",

        GLuint("program"),
        GLint("location"),
        ReturnParam..Check(1)..GLint64.p("params")
    )

    void(
        "GetUniformui64vARB",

        GLuint("program"),
        GLint("location"),
        ReturnParam..Check(1)..GLuint64.p("params")
    )

    void(
        "GetnUniformi64vARB",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLint64.p("params")
    )

    void(
        "GetnUniformui64vARB",

        GLuint("program"),
        GLint("location"),
        AutoSize("params")..GLsizei("bufSize"),
        ReturnParam..GLuint64.p("params")
    )
}