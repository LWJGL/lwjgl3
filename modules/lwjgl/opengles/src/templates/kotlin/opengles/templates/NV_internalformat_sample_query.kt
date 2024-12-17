/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_internalformat_sample_query = "NVInternalformatSampleQuery".nativeClassGLES("NV_internalformat_sample_query", postfix = NV) {
    IntConstant(
        "MULTISAMPLES_NV"..0x9371,
        "SUPERSAMPLE_SCALE_X_NV"..0x9372,
        "SUPERSAMPLE_SCALE_Y_NV"..0x9373,
        "CONFORMANT_NV"..0x9374
    )

    void(
        "GetInternalformatSampleivNV",

        GLenum("target"),
        GLenum("internalformat"),
        GLsizei("samples"),
        GLenum("pname"),
        AutoSize("params")..GLsizei("bufSize"),
        GLint.p("params")
    )
}