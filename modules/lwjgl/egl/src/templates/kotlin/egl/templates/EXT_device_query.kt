/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_query = "EXTDeviceQuery".nativeClassEGL("EXT_device_query", postfix = EXT) {
    IntConstant(
        "BAD_DEVICE_EXT"..0x322B,
        "DEVICE_EXT"..0x322C
    )

    LongConstant(
        "NO_DEVICE_EXT"..0L
    )

    EGLBoolean(
        "QueryDeviceAttribEXT",

        EGLDeviceEXT("device"),
        EGLint("attribute"),
        Check(1)..EGLAttrib.p("value")
    )

    charASCII.p(
        "QueryDeviceStringEXT",

        EGLDeviceEXT("device"),
        EGLint("name")
    )

    EGLBoolean(
        "QueryDisplayAttribEXT",

        EGLDisplay("dpy"),
        EGLint("attribute"),
        Check(1)..EGLAttrib.p("value")
    )
}