/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_primitive_restart = "NVPrimitiveRestart".nativeClassGL("NV_primitive_restart", postfix = NV) {
    IntConstant(
        "PRIMITIVE_RESTART_NV"..0x8558
    )

    IntConstant(
        "PRIMITIVE_RESTART_INDEX_NV"..0x8559
    )

    void("PrimitiveRestartNV")

    void(
        "PrimitiveRestartIndexNV",

        GLuint("index")
    )
}