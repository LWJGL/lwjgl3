/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_source_resampler = "SOFTSourceResampler".nativeClassAL("AL_SOFT_source_resampler") {
    documentation = """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a method for applications to use different resamplers for sources. OpenAL automatically resamples when playing a source at a
        sample rate that don't match the device's sample rate, but the resampling method is left unspecified. One could assume it would use the "best" resample
        method available, but this gives no clear information about what's used nor any way to choose between quality or performance. Further, some
        applications may prefer lower quality resamplers for its spectral properties.
        """

    IntConstant(
        "Accepted as the {@code pname} parameter of #GetInteger() and #GetIntegerv().",

        "NUM_RESAMPLERS_SOFT"..0x1210,
        "DEFAULT_RESAMPLER_SOFT"..0x1211
    )

    IntConstant(
        "Accepted as the {@code param} parameter of #Sourcei(), #Sourceiv(), #GetSourcei(), and #GetSourceiv().",

        "SOURCE_RESAMPLER_SOFT"..0x1212
    )

    IntConstant(
        "Accepted as the {@code pname} parameter of #GetStringiSOFT().",

        "RESAMPLER_NAME_SOFT"..0x1213
    )

    const..ALcharUTF8_p(
        "GetStringiSOFT",
        "",

        ALenum.IN("pname", ""),
        ALsizei.IN("index", "")
    )
}