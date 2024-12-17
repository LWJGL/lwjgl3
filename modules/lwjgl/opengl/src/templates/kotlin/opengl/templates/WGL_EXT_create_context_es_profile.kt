/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val WGL_EXT_create_context_es_profile = "WGLEXTCreateContextESProfile".nativeClassWGL("WGL_EXT_create_context_es_profile", EXT) {
    IntConstant(
        "CONTEXT_ES_PROFILE_BIT_EXT"..0x00000004
    )
}

val WGL_EXT_create_context_es2_profile = "WGLEXTCreateContextES2Profile".nativeClassWGL("WGL_EXT_create_context_es2_profile", EXT) {
    IntConstant(
        "CONTEXT_ES2_PROFILE_BIT_EXT"..0x00000004
    )
}