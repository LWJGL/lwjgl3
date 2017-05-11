/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_MULAW_MCFORMATS = "EXTMulawMCFormats".nativeClassAL("EXT_MULAW_MCFORMATS") {
    documentation = "Native bindings to the $extensionName extension."

    IntConstant(
        "Buffer formats.",

        "FORMAT_MONO_MULAW"..0x10014,
        "FORMAT_STEREO_MULAW"..0x10015,
        "FORMAT_QUAD_MULAW"..0x10021,
        "FORMAT_REAR_MULAW"..0x10022,
        "FORMAT_51CHN_MULAW"..0x10023,
        "FORMAT_61CHN_MULAW"..0x10024,
        "FORMAT_71CHN_MULAW"..0x10025
    )
}