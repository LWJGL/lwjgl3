/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGIX_swap_group = "GLXSGIXSwapGroup".nativeClassGLX("GLX_SGIX_swap_group", SGIX) {
    void(
        "JoinSwapGroupSGIX",

        DISPLAY,
        GLXDrawable("drawable"),
        nullable..GLXDrawable("member")
    )

}