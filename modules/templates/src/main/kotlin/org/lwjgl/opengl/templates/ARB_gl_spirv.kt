/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

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
        "Specializes a shader created from a SPIR-V module.",

        GLuint.IN("shader", ""),
        const..GLcharUTF8_p.IN("pEntryPoint", ""),
        AutoSize("pConstantIndex", "pConstantValue")..GLuint.IN("numSpecializationConstants", ""),
        const..GLuint_p.IN("pConstantIndex", ""),
        const..GLuint_p.IN("pConstantValue", "")
    )
}