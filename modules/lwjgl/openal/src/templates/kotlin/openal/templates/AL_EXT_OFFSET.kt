/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_EXT_OFFSET = "EXTOffset".nativeClassAL("EXT_OFFSET") {
    IntConstant(
        "SEC_OFFSET"..0x1024,
        "SAMPLE_OFFSET"..0x1025,
        "BYTE_OFFSET"..0x1026
    )
}