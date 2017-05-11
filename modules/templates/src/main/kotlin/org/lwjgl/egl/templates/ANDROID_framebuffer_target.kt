/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_framebuffer_target = "ANDROIDFramebufferTarget".nativeClassEGL("ANDROID_framebuffer_target", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Android supports a number of different ANativeWindow implementations that can be used to create an EGLSurface. One implementation, which is used to
        send the result of performing window composition to a display, may have some device-specific restrictions. Because of this, some EGLConfigs may be
        incompatible with these ANativeWindows. This extension introduces a new boolean EGLConfig attribute that indicates whether the EGLConfig supports
        rendering to an ANativeWindow for which the buffers are passed to the HWComposer HAL as a framebuffer target layer.
        """

    IntConstant(
        "",

        "FRAMEBUFFER_TARGET_ANDROID"..0x3147
    )
}