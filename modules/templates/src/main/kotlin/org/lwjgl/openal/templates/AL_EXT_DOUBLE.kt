/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_DOUBLE = "EXTDouble".nativeClassAL("EXT_DOUBLE") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Buffer formats.",

        "FORMAT_MONO_DOUBLE_EXT"..0x10012,
        "FORMAT_STEREO_DOUBLE_EXT"..0x10013
    )
}