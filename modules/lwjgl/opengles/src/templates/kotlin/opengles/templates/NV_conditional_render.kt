/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengles.templates

import org.lwjgl.generator.*
import opengles.*

val NV_conditional_render = "NVConditionalRender".nativeClassGLES("NV_conditional_render", postfix = NV) {
    IntConstant(
        "QUERY_WAIT_NV"..0x8E13,
        "QUERY_NO_WAIT_NV"..0x8E14,
        "QUERY_BY_REGION_WAIT_NV"..0x8E15,
        "QUERY_BY_REGION_NO_WAIT_NV"..0x8E16
    )

    void(
        "BeginConditionalRenderNV",

        GLuint("id"),
        GLenum("mode")
    )

    void("EndConditionalRenderNV")
}