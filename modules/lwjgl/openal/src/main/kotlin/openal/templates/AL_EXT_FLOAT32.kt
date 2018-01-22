/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_FLOAT32 = "EXTFloat32".nativeClassAL("EXT_FLOAT32") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Buffer formats.",

        "FORMAT_MONO_FLOAT32"..0x10010,
        "FORMAT_STEREO_FLOAT32"..0x10011
    )
}