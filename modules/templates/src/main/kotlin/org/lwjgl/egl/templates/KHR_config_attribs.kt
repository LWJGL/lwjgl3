/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.egl.templates

import org.lwjgl.egl.*
import org.lwjgl.generator.*

val KHR_config_attribs = "KHRConfigAttribs".nativeClassEGL("KHR_config_attribs", postfix = KHR) {
    documentation =
        """
        Native bindings to the $registryLink extension.

        This extension adds new EGL config attributes and attribute bits that express limitations of configs on a per-API basis, including whether client APIs
        created with respect to a config are expected to pass conformance, and which optional OpenVG color space and alpha mask format attributes are valid at
        surface creation time.

        Requires ${EGL12.core}.
        """

    IntConstant(
        "",

        "CONFORMANT_KHR"..0x3042,
        "VG_COLORSPACE_LINEAR_BIT_KHR"..0x0020,
        "VG_ALPHA_FORMAT_PRE_BIT_KHR"..0x0040
    )
}