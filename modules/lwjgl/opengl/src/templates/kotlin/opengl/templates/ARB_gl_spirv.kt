/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val ARB_gl_spirv = "ARBGLSPIRV".nativeClassGL("ARB_gl_spirv") {
    IntConstant(
        "SHADER_BINARY_FORMAT_SPIR_V_ARB"..0x9551
    )

    IntConstant(
        "SPIR_V_BINARY_ARB"..0x9552
    )

    void(
        "SpecializeShaderARB",

        GLuint("shader"),
        GLcharUTF8.const.p("pEntryPoint"),
        AutoSize("pConstantIndex", "pConstantValue")..GLuint("numSpecializationConstants"),
        GLuint.const.p("pConstantIndex"),
        GLuint.const.p("pConstantValue")
    )
}