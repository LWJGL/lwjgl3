/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val NV_triple_buffer = "NVTripleBuffer".nativeClassEGL("NV_triple_buffer", postfix = NV) {
    IntConstant(
        "TRIPLE_BUFFER_NV"..0x3230
    )
}

val NV_quadruple_buffer = "NVQuadrupleBuffer".nativeClassEGL("NV_quadruple_buffer", postfix = NV) {
    IntConstant(
        "QUADRUPLE_BUFFER_NV"..0x3231
    )
}