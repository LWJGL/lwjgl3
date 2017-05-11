/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_wait_sync = "KHRWaitSync".nativeClassEGL("KHR_wait_sync", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds the ability to wait for signaling of sync objects in the server for a client API context, rather than in the application thread
        bound to that context. This form of wait does not necessarily block the application thread which issued the wait (unlike eglClientWaitSyncKHR), so the
        application may continue to issue commands to the client API context or perform other work in parallel, leading to increased performance. The best
        performance is likely to be achieved by implementations which can perform this new wait operation in GPU hardware, although this is not required.

        Requires ${EGL11.core} and ${KHR_fence_sync.link}.
        """

    EGLint(
        "WaitSyncKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSyncKHR.IN("sync", ""),
        EGLint.IN("flags", "")
    )
}