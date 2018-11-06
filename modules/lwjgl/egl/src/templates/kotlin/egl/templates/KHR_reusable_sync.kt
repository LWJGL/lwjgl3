/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_reusable_sync = "KHRReusableSync".nativeClassEGL("KHR_reusable_sync", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
        can be tested or waited upon. This extension borrows from the GL_ARB_sync extension but introduces a type of sync object known as "reusable sync
        object" comparable to an OS semaphore. The specification is designed to allow additional types of sync objects to be easily introduced in later
        extensions.

        Reusable sync objects may be used to synchronize activity between threads or between client APIs. Synchronization is accomplished by explicitly
        changing the status of a reusable object using EGL API commands.

        Requires ${EGL11.core}.
        """

    IntConstant(
        "",

        "SYNC_STATUS_KHR"..0x30F1,
        "SIGNALED_KHR"..0x30F2,
        "UNSIGNALED_KHR"..0x30F3,
        "TIMEOUT_EXPIRED_KHR"..0x30F5,
        "CONDITION_SATISFIED_KHR"..0x30F6,
        "SYNC_TYPE_KHR"..0x30F7,
        "SYNC_REUSABLE_KHR"..0x30FA,
        "SYNC_FLUSH_COMMANDS_BIT_KHR"..0x0001
    )

    LongConstant(
        "",

        "FOREVER_KHR".."0xFFFFFFFFFFFFFFFFL",
        "NO_SYNC_KHR"..0L
    )

    EGLSyncKHR(
        "CreateSyncKHR",
        "",

        EGLDisplay("dpy", ""),
        EGLenum("type", ""),
        nullable..noneTerminated..EGLint.const.p("attrib_list", "")
    )

    EGLBoolean(
        "DestroySyncKHR",
        "",

        EGLDisplay("dpy", ""),
        EGLSyncKHR("sync", "")
    )

    EGLint(
        "ClientWaitSyncKHR",
        "",

        EGLDisplay("dpy", ""),
        EGLSyncKHR("sync", ""),
        EGLint("flags", ""),
        EGLTimeKHR("timeout", "")
    )

    EGLBoolean(
        "SignalSyncKHR",
        "",

        EGLDisplay("dpy", ""),
        EGLSyncKHR("sync", ""),
        EGLenum("mode", "")
    )

    EGLBoolean(
        "GetSyncAttribKHR",
        "",

        EGLDisplay("dpy", ""),
        EGLSyncKHR("sync", ""),
        EGLint("attribute", ""),
        Check(1)..EGLint.p("value", "")
    )
}