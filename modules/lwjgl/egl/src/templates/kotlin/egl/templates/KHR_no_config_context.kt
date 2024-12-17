/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package egl.templates

import egl.*
import org.lwjgl.generator.*

val KHR_no_config_context = "KHRNoConfigContext".nativeClassEGL("KHR_no_config_context", postfix = KHR) {
    LongConstant(
        "NO_CONFIG_KHR".."0L"
    )
}