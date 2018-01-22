/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.opengles.templates

import org.lwjgl.generator.*
import org.lwjgl.opengles.*

val QCOM_alpha_test = "QCOMAlphaTest".nativeClassGLES("QCOM_alpha_test", postfix = QCOM) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension reintroduces the alpha test per-fragment operation from OpenGL ES 1.x. Some hardware has a dedicated unit capable of performing this
        operation, and it can save ALU operations in the fragment shader by avoiding the conditional discard.
        """

    IntConstant(
        """
        Accepted by the {@code cap} parameter of Enable and Disable, and IsEnabled, and by the {@code pname} parameter of GetBooleanv, GetIntegerv, and
        GetFloatv.
        """,

        "ALPHA_TEST_QCOM"..0x0BC0
    )

    IntConstant(
        "Accepted by the {@code pname} parameter of GetBooleanv, GetIntegerv, and GetFloatv.",

        "ALPHA_TEST_FUNC_QCOM"..0x0BC1,
        "ALPHA_TEST_REF_QCOM"..0x0BC2
    )

    void(
        "AlphaFuncQCOM",
        "",

        GLenum.IN("func", ""),
        GLfloat.IN("ref", "")
    )
}