/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_buffer_length_query = "SOFTBufferLengthQuery".nativeClassAL("SOFT_buffer_length_query") {
    IntConstant(
        "BYTE_LENGTH_SOFT"..0x2009,
        "SAMPLE_LENGTH_SOFT"..0x200A
    )

    IntConstant(
        "SEC_LENGTH_SOFT"..0x200B
    )
}