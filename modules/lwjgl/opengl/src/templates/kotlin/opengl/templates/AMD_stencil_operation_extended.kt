/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val AMD_stencil_operation_extended = "AMDStencilOperationExtended".nativeClassGL("AMD_stencil_operation_extended", postfix = AMD) {
    IntConstant(
        "SET_AMD"..0x874A,
        "REPLACE_VALUE_AMD"..0x874B
    )

    IntConstant(
        "STENCIL_OP_VALUE_AMD"..0x874C,
        "STENCIL_BACK_OP_VALUE_AMD"..0x874D
    )

    void(
        "StencilOpValueAMD",

        GLenum("face"),
        GLuint("value")
    )
}