/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package opengl.templates

import org.lwjgl.generator.*
import opengl.*

val NV_multisample_filter_hint = "NVMultisampleFilterHint".nativeClassGL("NV_multisample_filter_hint", postfix = NV) {
    IntConstant(
        "MULTISAMPLE_FILTER_HINT_NV"..0x8534
    )
}