/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_fence_sync = "KHRFenceSync".nativeClassEGL("KHR_fence_sync", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension introduces the concept of "sync objects" into EGL. Sync objects are a synchronization primitive, representing events whose completion
        can be tested or waited upon. This extension borrows heavily from the GL_ARB_sync extension and introduces a type of sync object known as a "fence sync
        object" comparable to the OpenGL fence sync object. The specification is designed to allow additional types of sync objects to be easily introduced in
        later extensions.

        Fence sync objects have corresponding fence commands, which are inserted into a client API command stream at the time the fence sync is created. A
        fence sync object is used to wait for completion of the corresponding fence command. This allows applications to request a partial Finish of an API
        command stream, wherein all commands issued in a particular client API context will be forced to complete before control is returned to the calling
        thread.

        This document describes three different extension strings collectively. The "EGL_KHR_fence_sync" string indicates that fence syncs and the
        corresponding interfaces (to create and place a fence, destroy, query, and wait on) are supported.

        The remaining extensions list valid client APIs for fence syncs. The "GL_OES_EGL_sync" string indicates that a fence sync object can be created in
        association with a fence command placed in the command stream of a bound OpenGL ES context. The "VG_KHR_EGL_sync" string indicates the same thing for a
        bound OpenVG context.

        Requires ${EGL11.core}.
        """

    IntConstant(
        "",

        "SYNC_PRIOR_COMMANDS_COMPLETE_KHR"..0x30F0,
        "SYNC_CONDITION_KHR"..0x30F8,
        "SYNC_FENCE_KHR"..0x30F9
    )

    EGLSyncKHR(
        "CreateSyncKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLenum.IN("type", ""),
        noneTerminated..const..EGLint_p.IN("attrib_list", "")
    )

    EGLBoolean(
        "DestroySyncKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSyncKHR.IN("sync", "")
    )

    EGLint(
        "ClientWaitSyncKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSyncKHR.IN("sync", ""),
        EGLint.IN("flags", ""),
        EGLTimeKHR.IN("timeout", "")
    )

    EGLBoolean(
        "GetSyncAttribKHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLSyncKHR.IN("sync", ""),
        EGLint.IN("attribute", ""),
        Check(1)..EGLint_p.OUT("value", "")
    )
}