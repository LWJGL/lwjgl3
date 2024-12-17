/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_framebuffer_target = "ANDROIDFramebufferTarget".nativeClassEGL("ANDROID_framebuffer_target", postfix = ANDROID) {
    IntConstant("FRAMEBUFFER_TARGET_ANDROID"..0x3147)
}