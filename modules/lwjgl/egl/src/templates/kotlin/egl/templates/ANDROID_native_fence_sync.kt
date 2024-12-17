/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val ANDROID_native_fence_sync = "ANDROIDNativeFenceSync".nativeClassEGL("ANDROID_native_fence_sync", postfix = ANDROID) {
    IntConstant(
        "SYNC_NATIVE_FENCE_ANDROID"..0x3144,
        "SYNC_NATIVE_FENCE_FD_ANDROID"..0x3145,
        "SYNC_NATIVE_FENCE_SIGNALED_ANDROID"..0x3146,
        "NO_NATIVE_FENCE_FD_ANDROID".."-1"
    )

    EGLint(
        "DupNativeFenceFDANDROID",

        EGLDisplay("dpy"),
        EGLSyncKHR("sync")
    )
}