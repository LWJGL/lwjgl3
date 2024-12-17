/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val GLX_EXT_create_context_es_profile = "GLXEXTCreateContextESProfile".nativeClassGLX("GLX_EXT_create_context_es_profile", EXT) {
    IntConstant(
        "CONTEXT_ES_PROFILE_BIT_EXT"..0x00000004
    )
}

val GLX_EXT_create_context_es2_profile = "GLXEXTCreateContextES2Profile".nativeClassGLX("GLX_EXT_create_context_es2_profile", EXT) {
    IntConstant(
        "CONTEXT_ES2_PROFILE_BIT_EXT"..0x00000004
    )
}