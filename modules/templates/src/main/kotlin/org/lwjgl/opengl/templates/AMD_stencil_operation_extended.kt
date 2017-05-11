/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengl.templates

import org.lwjgl.generator.*
import org.lwjgl.opengl.*

val AMD_stencil_operation_extended = "AMDStencilOperationExtended".nativeClassGL("AMD_stencil_operation_extended", postfix = AMD) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Stencil buffers are special buffers that allow tests to be made against an incoming value and action taken based on that value. The stencil buffer is
        updated during rasterization, and the operation used to update the stencil buffer is chosen based on whether the fragment passes the stencil test, and
        if it does, whether it passes the depth test. Traditional OpenGL includes support for several primitive operations, such as incrementing, or clearing
        the content of the stencil buffer, or replacing it with a specified reference value.

        This extension adds support for an additional set of operations that may be performed on the stencil buffer under each circumstance. Additionally, this
        extension separates the value used as the source for stencil operations from the reference value, allowing different values to be used in the stencil
        test, and in the update of the stencil buffer.
        """

    IntConstant(
        "Accepted by the {@code sfail}, {@code dpfail} and {@code dppass} parameters of StencilOp and StencilOpSeparate.",

        "SET_AMD"..0x874A,
        "REPLACE_VALUE_AMD"..0x874B
    )

    IntConstant(
        "Accepted by the {@code param} parameter of GetIntegerv, GetFloatv, GetBooleanv GetDoublev and GetInteger64v.",

        "STENCIL_OP_VALUE_AMD"..0x874C,
        "STENCIL_BACK_OP_VALUE_AMD"..0x874D
    )

    void(
        "StencilOpValueAMD",
        "",

        GLenum.IN("face", ""),
        GLuint.IN("value", "")
    )
}