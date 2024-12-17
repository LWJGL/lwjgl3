/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRResources = "VRResources".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRResources_",
    binding = OPENVR_FNTABLE_BINDING
) {
    uint32_t(
        "LoadSharedResource",

        charASCII.const.p("pchResourceName"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchBuffer"),
        AutoSize("pchBuffer")..uint32_t("unBufferLen")
    )

    uint32_t(
        "GetResourceFullPath",

        charASCII.const.p("pchResourceName"),
        charASCII.const.p("pchResourceTypeDirectory"),
        Return(RESULT, includesNT = true)..nullable..charASCII.p("pchPathBuffer"),
        AutoSize("pchPathBuffer")..uint32_t("unBufferLen")
    )
}