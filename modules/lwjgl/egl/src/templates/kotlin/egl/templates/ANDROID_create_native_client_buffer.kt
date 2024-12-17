/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_create_native_client_buffer = "ANDROIDCreateNativeClientBuffer".nativeClassEGL("ANDROID_create_native_client_buffer", postfix = ANDROID) {
    IntConstant("NATIVE_BUFFER_USAGE_ANDROID"..0x3143)

    IntConstant(
        "NATIVE_BUFFER_USAGE_PROTECTED_BIT_ANDROID"..0x00000001,
        "NATIVE_BUFFER_USAGE_RENDERBUFFER_BIT_ANDROID"..0x00000002,
        "NATIVE_BUFFER_USAGE_TEXTURE_BIT_ANDROID"..0x00000004
    )


    EGLClientBuffer(
        "CreateNativeClientBufferANDROID",

        nullable..noneTerminated..EGLint.const.p("attrib_list")
    )
}