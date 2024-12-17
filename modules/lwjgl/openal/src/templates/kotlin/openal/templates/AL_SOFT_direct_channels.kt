/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_direct_channels = "SOFTDirectChannels".nativeClassAL("SOFT_direct_channels") {
    IntConstant(
        "DIRECT_CHANNELS_SOFT"..0x1033
    )
}