/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val QCOM_writeonly_rendering = "QCOMWriteonlyRendering".nativeClassGLES("QCOM_writeonly_rendering", postfix = QCOM) {
    IntConstant(
        "WRITEONLY_RENDERING_QCOM"..0x8823
    )
}