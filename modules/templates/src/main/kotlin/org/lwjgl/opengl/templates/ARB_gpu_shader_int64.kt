/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val ARB_gpu_shader_int64 = "ARBGPUShaderInt64".nativeClassGL("ARB_gpu_shader_int64") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The extension introduces the following features for all shader types:
        ${ul(
            """
            support for 64-bit scalar and vector integer data types, including uniform API, uniform buffer object, transform feedback, and shader input and
            output support;
            """,
            "new built-in functions to pack and unpack 64-bit integer types into a two-component 32-bit integer vector;",
            "new built-in functions to convert double-precision floating-point values to or from their 64-bit integer bit encodings;",
            "vector relational functions supporting comparisons of vectors of 64-bit integer types; and",
            "common functions abs, sign, min, max, clamp, and mix supporting arguments of 64-bit integer types."
        )}

        Requires ${GL40.link} and GLSL 4.00.
        """

    IntConstant(
        "Returned by the {@code type} parameter of GetActiveAttrib, GetActiveUniform, and GetTransformFeedbackVarying.",

        "INT64_ARB"..0x140E,
        "UNSIGNED_INT64_ARB"..0x140F,
        "INT64_VEC2_ARB"..0x8FE9,
        "INT64_VEC3_ARB"..0x8FEA,
        "INT64_VEC4_ARB"..0x8FEB,
        "UNSIGNED_INT64_VEC2_ARB"..0x8FF5,
        "UNSIGNED_INT64_VEC3_ARB"..0x8FF6,
        "UNSIGNED_INT64_VEC4_ARB"..0x8FF7
    )

    var args = arrayOf(
        GLuint.IN("program", "the program object"),
        GLint.IN("location", "the location of the uniform variable to be modified"),
        GLint64.IN("x", "the uniform x value"),
        GLint64.IN("y", "the uniform y value"),
        GLint64.IN("z", "the uniform z value"),
        GLint64.IN("w", "the uniform w value")
    )

    val autoSizes = arrayOf(
        AutoSize(1, "value"),
        AutoSize(2, "value"),
        AutoSize(3, "value"),
        AutoSize(4, "value")
    )
    val autoSizeDoc = "the number of elements that are to be modified. This should be 1 if the targeted uniform variable is not an array, and 1 or more if it is an array."

    for (i in 1..4) {
        val glslType = if (i == 1) "int64_t" else "i64vec$i"
        val valueDoc = "a pointer to an array of {@code count} values that will be used to update the specified $glslType variable"

        // Uniform{1,2,3,4}i64ARB
        void(
            "Uniform${i}i64ARB",
            "Specifies the value of an $glslType uniform variable for the current program object.",
            *args.copyOfRange(1, 2 + i)
        )

        // Uniform{1,2,3,4}i64vARB
        void(
            "Uniform${i}i64vARB",
            "Specifies the value of a single $glslType uniform variable or a $glslType uniform variable array for the current program object.",

            args[1],
            autoSizes[i - 1]..GLsizei.IN("count", autoSizeDoc),
            const..GLint64_p.IN("value", valueDoc)
        )

        // ProgramUniform{1,2,3,4}i64ARB
        void(
            "ProgramUniform${i}i64ARB",
            "Specifies the value of an $glslType uniform variable for the specified program object.",
            *args.copyOfRange(0, 2 + i)
        )

        // ProgramUniform{1,2,3,4}i64vARB
        void(
            "ProgramUniform${i}i64vARB",
            "Specifies the value of a single $glslType uniform variable or a $glslType uniform variable array for the specified program object.",

            args[0],
            args[1],
            autoSizes[i - 1]..GLsizei.IN("count", autoSizeDoc),
            const..GLint64_p.IN("value", valueDoc)
        )
    }

    args[2] = GLuint64.IN("x", "the uniform x value")
    args[3] = GLuint64.IN("y", "the uniform y value")
    args[4] = GLuint64.IN("z", "the uniform z value")
    args[5] = GLuint64.IN("w", "the uniform w value")

    for (i in 1..4) {
        val glslType = if (i == 1) "uint64_t" else "u64vec$i"
        val valueDoc = "a pointer to an array of {@code count} values that will be used to update the specified $glslType variable"

        // Uniform{1,2,3,4}ui64ARB
        void(
            "Uniform${i}ui64ARB",
            "Specifies the value of an $glslType uniform variable for the current program object.",
            *args.copyOfRange(1, 2 + i)
        )

        // Uniform{1,2,3,4}ui64vARB
        void(
            "Uniform${i}ui64vARB",
            "Specifies the value of a single $glslType uniform variable or a $glslType uniform variable array for the current program object.",

            args[1],
            autoSizes[i - 1]..GLsizei.IN("count", autoSizeDoc),
            const..GLuint64_p.IN("value", valueDoc)
        )

        // ProgramUniform{1,2,3,4}ui64ARB
        void(
            "ProgramUniform${i}ui64ARB",
            "Specifies the value of an $glslType uniform variable for the current program object.",
            *args.copyOfRange(0, 2 + i)
        )

        // ProgramUniform{1,2,3,4}ui64vARB
        void(
            "ProgramUniform${i}ui64vARB",
            "Specifies the value of a single $glslType uniform variable or a $glslType uniform variable array for the specified program object.",

            args[0],
            args[1],
            autoSizes[i - 1]..GLsizei.IN("count", autoSizeDoc),
            const..GLuint64_p.IN("value", valueDoc)
        )
    }

    void(
        "GetUniformi64vARB",
        "Returns the int64_t value(s) of a uniform variable.",

        GLuint.IN("program", "the program object to be queried"),
        GLint.IN("location", "the location of the uniform variable to be queried"),
        ReturnParam..Check(1)..GLint64_p.OUT("params", "the value of the specified uniform variable")
    )

    void(
        "GetUniformui64vARB",
        "Returns the uint64_t value(s) of a uniform variable.",

        GLuint.IN("program", "the program object to be queried"),
        GLint.IN("location", "the location of the uniform variable to be queried"),
        ReturnParam..Check(1)..GLuint64_p.OUT("params", "the value of the specified uniform variable")
    )

    void(
        "GetnUniformi64vARB",
        "Robust version of #GetUniformi64vARB().",

        GLuint.IN("program", "the program object to be queried"),
        GLint.IN("location", "the location of the uniform variable to be queried"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of values to write in {@code params}"),
        ReturnParam..GLint64_p.OUT("params", "the value of the specified uniform variable")
    )

    void(
        "GetnUniformui64vARB",
        "Robust version of #GetUniformui64vARB().",

        GLuint.IN("program", "the program object to be queried"),
        GLint.IN("location", "the location of the uniform variable to be queried"),
        AutoSize("params")..GLsizei.IN("bufSize", "the maximum number of values to write in {@code params}"),
        ReturnParam..GLuint64_p.OUT("params", "the value of the specified uniform variable")
    )
}