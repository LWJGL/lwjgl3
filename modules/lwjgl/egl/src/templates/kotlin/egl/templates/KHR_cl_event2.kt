/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_cl_event2 = "KHRCLEvent2".nativeClassEGL("KHR_cl_event2", postfix = KHR) {
    IntConstant(
        "CL_EVENT_HANDLE_KHR"..0x309C,
        "SYNC_CL_EVENT_KHR"..0x30FE,
        "SYNC_CL_EVENT_COMPLETE_KHR"..0x30FF
    )

    EGLSyncKHR(
        "CreateSync64KHR",

        EGLDisplay("dpy"),
        EGLenum("type"),
        noneTerminated..EGLAttribKHR.const.p("attrib_list")
    )
}