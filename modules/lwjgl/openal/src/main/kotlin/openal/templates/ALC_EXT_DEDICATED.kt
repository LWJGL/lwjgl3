/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val ALC_EXT_DEDICATED = "EXTDedicated".nativeClassALC("EXT_DEDICATED", prefix = AL) {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension provides two "routing" EFX effects that allow sounds to be sent to dedicated speaker channels. Audio rendered to the dedicated low
        frequency effect (#EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT) is routed to a subwoofer if one is present. Otherwise, it is discarded.

        Audio rendered to the dedicated dialogue effect (#EFFECT_DEDICATED_DIALOGUE) is routed to a front centre speaker if one is present. Otherwise, it is
        rendered to the front centre using the normal spatialisation logic.

        Both effects support a gain control parameter #DEDICATED_GAIN, which defaults to 1.
        """

    IntConstant(
        "$extensionName tokens.",

        "DEDICATED_GAIN"..0x1,
        "EFFECT_DEDICATED_DIALOGUE"..0x9001,
        "EFFECT_DEDICATED_LOW_FREQUENCY_EFFECT"..0x9000
    )
}