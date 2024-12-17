/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_image_native_buffer = "ANDROIDImageNativeBuffer".nativeClassEGL("ANDROID_image_native_buffer", postfix = ANDROID) {
    IntConstant("NATIVE_BUFFER_ANDROID"..0x3140)
}