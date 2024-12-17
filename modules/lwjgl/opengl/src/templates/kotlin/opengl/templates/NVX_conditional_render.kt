/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NVX_conditional_render = "NVXConditionalRender".nativeClassGL("NVX_conditional_render", postfix = NVX) {
    void(
        "BeginConditionalRenderNVX",

        GLuint("id")
    )

    void("EndConditionalRenderNVX")
}
