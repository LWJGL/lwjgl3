/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_gl_spirv = "ARBGLSPIRV".nativeClassGL("ARB_gl_spirv") {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This is version 100 of the GL_ARB_gl_spirv extension.

        This extension does two things:
        ${ol(
            """
            Allows a SPIR-V module to be specified as containing a programmable shader stage, rather than using GLSL, whatever the source language was used to
            create the SPIR-V module.
            """,
            """
            Modifies GLSL to be a source language for creating SPIR-V modules for OpenGL consumption. Such GLSL can be used to create such SPIR-V modules,
            outside of the OpenGL runtime.
            """
        )}

        Requires ${GL33.core}.
        """

    IntConstant(
        "Accepted by the {@code binaryformat} parameter of #ShaderBinary().",

        "SHADER_BINARY_FORMAT_SPIR_V_ARB"..0x9551
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of #GetShaderiv().",

        "SPIR_V_BINARY_ARB"..0x9552
    )

    void(
        "SpecializeShaderARB",
        """
        Specializes a shader created from a SPIR-V module.

        Shaders associated with SPIR-V modules must be specialized before they can be linked into a program object. It is not necessary to specialize the
        shader before it is attached to a program object. Once specialized, a shader may not be specialized again without first re-associating the original
        SPIR-V module with it, through #ShaderBinary().

        Specialization does two things:
        ${ul(
            "Selects the name of the entry point, for that shader’s stage, from the SPIR-V module.",
            "Sets the values of all, or a subset of, the specialization constants in the SPIRV module."
        )}

        On successful shader specialization, the compile status for shader is set to #TRUE. On failure, the compile status for shader is set to #FALSE and
        additional information about the cause of the failure may be available in the shader compilation log.
        """,

        GLuint(
            "shader",
            """
            the name of a shader object containing unspecialized SPIR-V as created from a successful call to #ShaderBinary() to which a SPIR-V module was
            passed
            """
        ),
        GLcharUTF8.const.p(
            "pEntryPoint",
            "a pointer to a null-terminated UTF-8 string specifying the name of the entry point in the SPIR-V module to use for this shader"
        ),
        AutoSize("pConstantIndex", "pConstantValue")..GLuint(
            "numSpecializationConstants",
            "the number of specialization constants whose values to set in this call"
        ),
        GLuint.const.p(
            "pConstantIndex",
            """
            is a pointer to an array of {@code numSpecializationConstants} unsigned integers, each holding the index of a specialization constant in the SPIR-V
            module whose value to set.

            Specialization constants not referenced by {@code pConstantIndex} retain their default values as specified in the SPIR-V module.
            """
        ),
        GLuint.const.p(
            "pConstantValue",
            """
            an entry in {@code pConstantValue} is used to set the value of the specialization constant indexed by the corresponding entry in
            {@code pConstantIndex}.

            Although this array is of unsigned integer, each entry is bitcast to the appropriate type for the module, and therefore, floating-point constants
            may be set by including their IEEE-754 bit representation in the {@code pConstantValue} array.
            """
        )
    )
}