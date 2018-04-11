/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_MSADPCM = "SOFTMSADPCM".nativeClassAL("SOFT_MSADPCM") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension adds support for MSADPCM compressed sample formats.
        """

    IntConstant(
        "Accepted by the {@code format} parameter of #BufferData().",

        "FORMAT_MONO_MSADPCM_SOFT"..0x1302,
        "FORMAT_STEREO_MSADPCM_SOFT"..0x1303
    )
}