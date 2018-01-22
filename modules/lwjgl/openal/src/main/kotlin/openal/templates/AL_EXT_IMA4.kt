/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_IMA4 = "EXTIma4".nativeClassAL("EXT_IMA4") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Buffer formats.",

        "FORMAT_MONO_IMA4"..0x1300,
        "FORMAT_STEREO_IMA4"..0x1301
    )
}