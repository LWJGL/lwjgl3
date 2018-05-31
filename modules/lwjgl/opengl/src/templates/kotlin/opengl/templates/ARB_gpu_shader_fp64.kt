/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_gpu_shader_fp64 = "ARBGPUShaderFP64".nativeClassGL("ARB_gpu_shader_fp64") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows GLSL shaders to use double-precision floating-point data types, including vectors and matrices of doubles. Doubles may be used as
        inputs, outputs, and uniforms.

        The shading language supports various arithmetic and comparison operators on double-precision scalar, vector, and matrix types, and provides a set of
        built-in functions including:
        ${ul(
            "square roots and inverse square roots;",
            "fused floating-point multiply-add operations;",
            """
            splitting a floating-point number into a significand and exponent (frexp), or building a floating-point number from a significand and exponent
            (ldexp);
            """,
            """
            absolute value, sign tests, various functions to round to an integer value, modulus, minimum, maximum, clamping, blending two values, step
            functions, and testing for infinity and NaN values;
            """,
            "packing and unpacking doubles into a pair of 32-bit unsigned integers;",
            "matrix component-wise multiplication, and computation of outer products, transposes, determinants, and inverses; and",
            "vector relational functions."
        )}

        Double-precision versions of angle, trigonometry, and exponential functions are not supported.

        Implicit conversions are supported from integer and single-precision floating-point values to doubles, and this extension uses the relaxed function
        overloading rules specified by the ARB_gpu_shader5 extension to resolve ambiguities.

        This extension provides API functions for specifying double-precision uniforms in the default uniform block, including functions similar to the uniform
        functions added by ${EXT_direct_state_access.link} (if supported).

        This extension provides an "LF" suffix for specifying double-precision constants. Floating-point constants without a suffix in GLSL are treated as
        single-precision values for backward compatibility with versions not supporting doubles; similar constants are treated as double-precision values in the
        "C" programming language.

        This extension does not support interpolation of double-precision values; doubles used as fragment shader inputs must be qualified as "flat".
        Additionally, this extension does not allow vertex attributes with 64-bit components. That support is added separately by
        ${registryLinkTo("EXT", "vertex_attrib_64bit")}.

        Requires ${GL32.link} and GLSL 1.50. ${GL40.promoted}
        """

    IntConstant(
        "Returned in the {@code type} parameter of GetActiveUniform, and GetTransformFeedbackVarying.",

        "DOUBLE_VEC2"..0x8FFC,
        "DOUBLE_VEC3"..0x8FFD,
        "DOUBLE_VEC4"..0x8FFE,
        "DOUBLE_MAT2"..0x8F46,
        "DOUBLE_MAT3"..0x8F47,
        "DOUBLE_MAT4"..0x8F48,
        "DOUBLE_MAT2x3"..0x8F49,
        "DOUBLE_MAT2x4"..0x8F4A,
        "DOUBLE_MAT3x2"..0x8F4B,
        "DOUBLE_MAT3x4"..0x8F4C,
        "DOUBLE_MAT4x2"..0x8F4D,
        "DOUBLE_MAT4x3"..0x8F4E
    )

    GL40C reuse "Uniform1d"
    GL40C reuse "Uniform2d"
    GL40C reuse "Uniform3d"
    GL40C reuse "Uniform4d"
    GL40C reuse "Uniform1dv"
    GL40C reuse "Uniform2dv"
    GL40C reuse "Uniform3dv"
    GL40C reuse "Uniform4dv"

    GL40C reuse "UniformMatrix2dv"
    GL40C reuse "UniformMatrix3dv"
    GL40C reuse "UniformMatrix4dv"
    GL40C reuse "UniformMatrix2x3dv"
    GL40C reuse "UniformMatrix2x4dv"
    GL40C reuse "UniformMatrix3x2dv"
    GL40C reuse "UniformMatrix3x4dv"
    GL40C reuse "UniformMatrix4x2dv"
    GL40C reuse "UniformMatrix4x3dv"

    GL40C reuse "GetUniformdv"

    val program = GLuint.IN("program", "the program object to update")

    var src = GL40C["Uniform1d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform1dEXT",
        "DSA version of #Uniform1d().",

        program,
        src["location"],
        src["x"]
    )

    src = GL40C["Uniform2d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform2dEXT",
        "DSA version of #Uniform2d().",

        program,
        src["location"],
        src["x"],
        src["y"]
    )

    src = GL40C["Uniform3d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform3dEXT",
        "DSA version of #Uniform3d().",

        program,
        src["location"],
        src["x"],
        src["y"],
        src["z"]
    )

    src = GL40C["Uniform4d"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform4dEXT",
        "DSA version of #Uniform4d().",

        program,
        src["location"],
        src["x"],
        src["y"],
        src["z"],
        src["w"]
    )

    src = GL40C["Uniform1dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform1dvEXT",
        "DSA version of #Uniform1dv().",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["Uniform2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform2dvEXT",
        "DSA version of #Uniform2dv().",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["Uniform3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform3dvEXT",
        "DSA version of #Uniform3dv().",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["Uniform4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniform4dvEXT",
        "DSA version of #Uniform4dv().",

        program,
        src["location"],
        src["count"],
        src["value"]
    )

    src = GL40C["UniformMatrix2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix2dvEXT",
        "DSA version of #UniformMatrix2dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix3dvEXT",
        "DSA version of #UniformMatrix3dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix4dvEXT",
        "DSA version of #UniformMatrix4dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix2x3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix2x3dvEXT",
        "DSA version of #UniformMatrix2x3dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix2x4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix2x4dvEXT",
        "DSA version of #UniformMatrix2x4dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix3x2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix3x2dvEXT",
        "DSA version of #UniformMatrix3x2dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix3x4dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix3x4dvEXT",
        "DSA version of #UniformMatrix3x4dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix4x2dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix4x2dvEXT",
        "DSA version of #UniformMatrix4x2dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )

    src = GL40C["UniformMatrix4x3dv"]
    IgnoreMissing..DependsOn("GL_EXT_direct_state_access")..void(
        "ProgramUniformMatrix4x3dvEXT",
        "DSA version of #UniformMatrix4x3dv().",

        program,
        src["location"],
        src["count"],
        src["transpose"],
        src["value"]
    )
}