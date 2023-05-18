/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_UHJ_ex = "SOFTUHJEx".nativeClassAL("SOFT_UHJ_ex") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension supplements {@code AL_SOFT_UHJ} by adding {@code muLaw}, {@code aLaw}, {@code IMA4}, and {@code MSADPCM} sample types to UHJ formats.
        The base {@code AL_SOFT_UHJ} extension could already use these formats (when available) for Super Stereo processing, and this extension allows them to
        be used for UHJ itself too.

        Requires ${AL_SOFT_UHJ.link} and one or more of ${AL_EXT_MULAW.link}, ${AL_EXT_ALAW.link}, ${AL_EXT_IMA4.link}, and ${AL_SOFT_MSADPCM.link}.
        """

    IntConstant(
        "Accepted by the {@code format} parameter of #BufferData() if ${AL_EXT_MULAW.link} is also supported.",

        "FORMAT_UHJ2CHN_MULAW_SOFT"..0x19B3,
        "FORMAT_UHJ3CHN_MULAW_SOFT"..0x19B7,
        "FORMAT_UHJ4CHN_MULAW_SOFT"..0x19B9
    )

    IntConstant(
        "Accepted by the {@code format} parameter of #BufferData() if ${AL_EXT_ALAW.link} is also supported.",

        "FORMAT_UHJ2CHN_ALAW_SOFT"..0x19B4,
        "FORMAT_UHJ3CHN_ALAW_SOFT"..0x19B8,
        "FORMAT_UHJ4CHN_ALAW_SOFT"..0x19BA
    )

    IntConstant(
        "Accepted by the {@code format} parameter of #BufferData() if ${AL_EXT_IMA4.link} is also supported.",

        "FORMAT_UHJ2CHN_IMA4_SOFT"..0x19B5
    )

    IntConstant(
        "Accepted by the {@code format} parameter of #BufferData() if ${AL_SOFT_MSADPCM.link} is also supported.",

        "FORMAT_UHJ2CHN_MSADPCM_SOFT"..0x19B6
    )
}