/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_cl_event2 = "KHRCLEvent2".nativeClassEGL("KHR_cl_event2", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension allows creating an EGL sync object linked to an OpenCL event object, potentially improving efficiency of sharing images between the two
        APIs. The companion cl_khr_egl_event extension provides the complementary functionality of creating an OpenCL event object from an EGL sync object.

        This extension is functionally identical to EGL_KHR_cl_event, but is intended to replace that extension. It exists only to address an implementation
        issue on 64-bit platforms where passing OpenCL event handles in an EGLint attribute list value is impossible, because the implementations use a 32-bit
        type for EGLint.

        This extension also incorporates some required functionality from the EGL_KHR_fence_sync extension, similarly modified for 64-bit platforms.

        Requires ${EGL14.core} and ${KHR_fence_sync.link}.
        """

    IntConstant(
        "",

        "CL_EVENT_HANDLE_KHR"..0x309C,
        "SYNC_CL_EVENT_KHR"..0x30FE,
        "SYNC_CL_EVENT_COMPLETE_KHR"..0x30FF
    )

    EGLSyncKHR(
        "CreateSync64KHR",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLenum.IN("type", ""),
        noneTerminated..const..EGLAttribKHR_p.IN("attrib_list", "")
    )
}