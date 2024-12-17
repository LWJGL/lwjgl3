/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_debug = "KHRDebug".nativeClassEGL("KHR_debug", postfix = KHR) {
    IntConstant(
        "OBJECT_THREAD_KHR"..0x33B0,
        "OBJECT_DISPLAY_KHR"..0x33B1,
        "OBJECT_CONTEXT_KHR"..0x33B2,
        "OBJECT_SURFACE_KHR"..0x33B3,
        "OBJECT_IMAGE_KHR"..0x33B4,
        "OBJECT_SYNC_KHR"..0x33B5,
        "OBJECT_STREAM_KHR"..0x33B6
    )

    IntConstant(
        "DEBUG_MSG_CRITICAL_KHR"..0x33B9,
        "DEBUG_MSG_ERROR_KHR"..0x33BA,
        "DEBUG_MSG_WARN_KHR"..0x33BB,
        "DEBUG_MSG_INFO_KHR"..0x33BC
    )

    IntConstant(
        "DEBUG_CALLBACK_KHR"..0x33B8
    )

    EGLint(
        "DebugMessageControlKHR",

        EGLDEBUGPROCKHR("callback"),
        nullable..noneTerminated..EGLAttrib.const.p("attrib_list")
    )

    EGLBoolean(
        "QueryDebugKHR",

        EGLint("attribute"),
        Check(1)..EGLAttrib.p("value")
    )

    EGLint(
        "LabelObjectKHR",

        EGLDisplay("display"),
        EGLenum("objectType"),
        EGLObjectKHR("object"),
        EGLLabelKHR("label")
    )
}