/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_wait_sync = "KHRWaitSync".nativeClassEGL("KHR_wait_sync", postfix = KHR) {
    EGLint(
        "WaitSyncKHR",

        EGLDisplay("dpy"),
        EGLSyncKHR("sync"),
        EGLint("flags")
    )
}