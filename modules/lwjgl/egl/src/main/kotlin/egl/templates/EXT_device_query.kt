/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val EXT_device_query = "EXTDeviceQuery".nativeClassEGL("EXT_device_query", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        Increasingly, EGL and its client APIs are being used in place of "native" rendering APIs to implement the basic graphics functionality of native
        windowing systems. This creates demand for a method to access native GPU or device objects directly rather than calling EGL or GL entry points.

        This extension defines the method for an application to query native device objects from an EGL Display.

        Requires ${EGL15.core} or an earlier verison of EGL with the ${registryLink("EXT", "EGL_EXT_client_extensions")} extension.
        """

    IntConstant(
        "",

        "BAD_DEVICE_EXT"..0x322B,
        "DEVICE_EXT"..0x322C
    )

    LongConstant(
        "",

        "NO_DEVICE_EXT"..0L
    )

    EGLBoolean(
        "QueryDeviceAttribEXT",
        "",

        EGLDeviceEXT.IN("device", ""),
        EGLint.IN("attribute", ""),
        Check(1)..EGLAttrib_p.OUT("value", "")
    )

    charASCII_p(
        "QueryDeviceStringEXT",
        "",

        EGLDeviceEXT.IN("device", ""),
        EGLint.IN("name", "")
    )

    EGLBoolean(
        "QueryDisplayAttribEXT",
        "",

        EGLDisplay.IN("dpy", ""),
        EGLint.IN("attribute", ""),
        Check(1)..EGLAttrib_p.OUT("value", "")
    )
}