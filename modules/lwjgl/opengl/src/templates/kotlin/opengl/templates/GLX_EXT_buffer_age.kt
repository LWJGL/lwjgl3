/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_buffer_age = "GLXEXTBufferAge".nativeClassGLX("GLX_EXT_buffer_age", EXT) {
    IntConstant(
        "BACK_BUFFER_AGE_EXT"..0x20F4
    )

}