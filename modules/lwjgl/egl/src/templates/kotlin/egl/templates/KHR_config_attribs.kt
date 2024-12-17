/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_config_attribs = "KHRConfigAttribs".nativeClassEGL("KHR_config_attribs", postfix = KHR) {
    IntConstant(
        "CONFORMANT_KHR"..0x3042,
        "VG_COLORSPACE_LINEAR_BIT_KHR"..0x0020,
        "VG_ALPHA_FORMAT_PRE_BIT_KHR"..0x0040
    )
}