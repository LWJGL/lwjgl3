/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_gl_colorspace_bt2020_linear = "EXTGLColorspaceBT2020Linear".nativeClassEGL("EXT_gl_colorspace_bt2020_linear", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_BT2020_LINEAR_EXT"..0x333F
    )
}

val EXT_gl_colorspace_bt2020_pq = "EXTGLColorspaceBT2020PQ".nativeClassEGL("EXT_gl_colorspace_bt2020_pq", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_BT2020_PQ_EXT"..0x3340
    )
}

val EXT_gl_colorspace_bt2020_hlg = "EXTGLColorspaceBT2020HLG".nativeClassEGL("EXT_gl_colorspace_bt2020_hlg", postfix = EXT) {
    IntConstant(
        "GL_COLORSPACE_BT2020_HLG_EXT"..0x3540
    )
}