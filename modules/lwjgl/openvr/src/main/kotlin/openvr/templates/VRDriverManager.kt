/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openvr.templates

import org.lwjgl.generator.*
import org.lwjgl.openvr.*

val VRDriverManager = "VRDriverManager".nativeClass(
    packageName = OPENVR_PACKAGE,
    prefixMethod = "VRDriverManager_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    uint32_t(
        "GetDriverCount",
        ""
    )

    uint32_t(
        "GetDriverName",
        "",

        DriverId_t.IN("nDriver", ""),
        Return(RESULT, includesNT = true)..nullable..charASCII_p.OUT("pchValue", ""),
        AutoSize("pchValue")..uint32_t.IN("unBufferSize", ""),

        returnDoc = "the length of the number of bytes necessary to hold this string including the trailing null"
    )
}