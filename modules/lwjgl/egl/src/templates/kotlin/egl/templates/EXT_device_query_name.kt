/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val EXT_device_query_name = "EXTDeviceQueryName".nativeClassEGL("EXT_device_query_name", postfix = EXT) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        The {@code EGL_EXT_device_enumeration} and {@code EGL_EXT_device_query} extensions provide a list of devices and a list of extensions, but lacks a way
        to find a name for a device that an application can present to a user.

        This extension adds two new strings that an application can query to find human-readable names.
        
        Requires ${EXT_device_query.link}.
        """

    IntConstant(
        "Accepted by the {@code name} parameter of #QueryDeviceStringEXT().",

        "RENDERER_EXT"..0x335F
    )
}