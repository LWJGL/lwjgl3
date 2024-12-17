/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRDriverManager = "VRDriverManager".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRDriverManager_",
    binding = OPENVR_FNTABLE_BINDING
) {
    uint32_t("GetDriverCount", void())

    uint32_t(
        "GetDriverName",

        DriverId_t("nDriver"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchValue"),
        AutoSize("pchValue")..uint32_t("unBufferSize")
    )

    DriverHandle_t(
        "GetDriverHandle",

        charASCII.const.p("pchDriverName")
    )

    bool(
        "IsEnabled",

        DriverId_t("nDriver")
    )
}