/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val ANDROID_native_fence_sync = "ANDROIDNativeFenceSync".nativeClassEGL("ANDROID_native_fence_sync", postfix = ANDROID) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension enables the creation of EGL fence sync objects that are associated with a native synchronization fence object that is referenced using a
        file descriptor. These EGL fence sync objects have nearly identical semantics to those defined by the KHR_fence_sync extension, except that they have
        an additional attribute storing the file descriptor referring to the native fence object.

        This extension assumes the existence of a native fence synchronization object that behaves similarly to an EGL fence sync object. These native objects
        must have a signal status like that of an EGLSyncKHR object that indicates whether the fence has ever been signaled. Once signaled the native object's
        signal status may not change again.

        Requires ${EGL11.core} and ${KHR_fence_sync.link}.
        """

    IntConstant(
        "",

        "SYNC_NATIVE_FENCE_ANDROID"..0x3144,
        "SYNC_NATIVE_FENCE_FD_ANDROID"..0x3145,
        "SYNC_NATIVE_FENCE_SIGNALED_ANDROID"..0x3146,
        "NO_NATIVE_FENCE_FD_ANDROID".."-1"
    )

    EGLint(
        "DupNativeFenceFDANDROID",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSyncKHR.IN("sync", "")
    )
}