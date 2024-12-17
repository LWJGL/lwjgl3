/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_EXT_DEFAULT_FILTER_ORDER = "EXTDefaultFilterOrder".nativeClassALC("EXT_DEFAULT_FILTER_ORDER") {
    IntConstant(
        "DEFAULT_FILTER_ORDER"..0x1100
    )
}