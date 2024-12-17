/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*
import core.linux.*

val GLX_SGI_make_current_read = "GLXSGIMakeCurrentRead".nativeClassGLX("GLX_SGI_make_current_read", SGI) {
    Bool(
        "MakeCurrentReadSGI",

        DISPLAY,
        nullable..GLXDrawable("draw"),
        nullable..GLXDrawable("read"),
        nullable..GLXContext("ctx")
    )

    GLXDrawable(
        "GetCurrentReadDrawableSGI",
        void()
    )

}