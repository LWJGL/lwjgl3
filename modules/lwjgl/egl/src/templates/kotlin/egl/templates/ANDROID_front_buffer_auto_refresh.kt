/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_front_buffer_auto_refresh = "ANDROIDFrontBufferAutoRefresh".nativeClassEGL("ANDROID_front_buffer_auto_refresh", postfix = ANDROID) {
    IntConstant("FRONT_BUFFER_AUTO_REFRESH_ANDROID"..0x314C)
}