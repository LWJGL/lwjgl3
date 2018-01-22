/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_gain_clamp_ex = "SOFTGainClampEx".nativeClassAL("SOFT_gain_clamp_ex") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension extends the gain clamping mechanism in standard AL. By default, OpenAL allows the source's and listener's #GAIN property to be set to
        any value that's greater-than or equal-to 0. The calculated source gain is clamped between its #MIN_GAIN and #MAX_GAIN properties after distance
        attenuation and the directional cone is applied, and before the listener gain is applied, however these two clamping properties are themselves
        restricted to being between 0 and 1 (inclusive).

        That behavior effectively nullifies any purpose of setting a source's gain being above 1, as the source's distance- and cone-related properties can be
        modified for the same effect. Oddly, the listener gain is applied to the source gain *after* the clamping, so it is still possible for the final
        calculated gain to exceed 1. On top of this, the spec allows an implementation the option to implicitly clamp the final calculated gain for the source
        as needed, but provides no means for applications to detect such behavior.

        This extension aims to fix those problems by removing the maximum limit for #MIN_GAIN and #MAX_GAIN, allowing applications to increase the effective
        source gain above 1. Additionally, it provides a query for the application to retrieve the implicit clamp level an implementation may put on the final
        calculated gain.
        """

    IntConstant(
        "An implementation-defined maximum per-source gain limit (guaranteed to be at least 1).",

        "GAIN_LIMIT_SOFT"..0x200E
    )
}