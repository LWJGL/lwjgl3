/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_block_alignment = "SOFTBlockAlignment".nativeClassAL("SOFT_block_alignment") {
    IntConstant(
        "UNPACK_BLOCK_ALIGNMENT_SOFT"..0x200C,
        "PACK_BLOCK_ALIGNMENT_SOFT"..0x200D
    )
}