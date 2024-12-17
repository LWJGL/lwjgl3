/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_direct_channels_remix = "SOFTDirectChannelsRemix".nativeClassAL("SOFT_direct_channels_remix") {
    IntConstant(
        "DROP_UNMATCHED_SOFT"..0x0001,
        "REMIX_UNMATCHED_SOFT"..0x0002
    )
}