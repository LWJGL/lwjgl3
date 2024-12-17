/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_ARB_fbconfig_float = "GLXARBFBConfigFloat".nativeClassGLX("GLX_ARB_fbconfig_float", ARB) {
    IntConstant(
        "RGBA_FLOAT_TYPE_ARB"..0x20B9
    )

    IntConstant(
        "RGBA_FLOAT_BIT_ARB"..0x00000004
    )

}