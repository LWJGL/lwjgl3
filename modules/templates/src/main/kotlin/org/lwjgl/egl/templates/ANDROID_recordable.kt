/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_recordable = "ANDROIDRecordable".nativeClassEGL("ANDROID_recordable", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Android supports a number of different ANativeWindow implementations that can be used to create an EGLSurface. One implementation, which records the
        rendered image as a video each time eglSwapBuffers gets called, may have some device-specific restrictions. Because of this, some EGLConfigs may be
        incompatible with these ANativeWindows. This extension introduces a new boolean EGLConfig attribute that indicates whether the EGLConfig supports
        rendering to an ANativeWindow that records images to a video.
        """

    IntConstant(
        "",

        "RECORDABLE_ANDROID"..0x3142
    )
}