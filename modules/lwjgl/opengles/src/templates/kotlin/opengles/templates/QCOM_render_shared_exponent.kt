/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_render_shared_exponent = "QCOMRenderSharedExponent".nativeClassGLES("QCOM_render_shared_exponent", postfix = QCOM) {
    IntConstant(
        "RGB9_E5"..0x8C3D
    )
}