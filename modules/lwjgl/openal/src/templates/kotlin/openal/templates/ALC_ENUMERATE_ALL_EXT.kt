/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_ENUMERATE_ALL_EXT = "EnumerateAllExt".nativeClassALC("ENUMERATE_ALL_EXT") {
    IntConstant(
        "DEFAULT_ALL_DEVICES_SPECIFIER"..0x1012,
        "ALL_DEVICES_SPECIFIER"..0x1013
    )
}