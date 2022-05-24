/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_output_mode = "SOFTOutputMode".nativeClassALC("SOFT_output_mode") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides a method for applications to request a particular output mode for playback devices, and query what's in use. With standard
        OpenAL, the output mode is at the sole discretion of the library, with the application having no way to know what's being used. While this works fine
        most of the time (typically the library will be able to query the system configuration and auto-select a mode to match, and the app handles sounds as
        being in 3D space), this is sometimes not possible or the most ideal option for all use-cases. There are also cases where a desirable output mode isn't
        distinguishable by the device configuration, for example with stereo vs UHJ vs HRTF.
        """

    IntConstant(
        "Accepted as part of the {@code attrList} parameter of #CreateContext() and as the {@code paramName} parameter of #GetIntegerv().",

        "OUTPUT_MODE_SOFT"..0x19AC
    )

    IntConstant(
        "Accepted as part of the {@code attrList} parameter of #CreateContext(), for the #OUTPUT_MODE_SOFT attribute.",

        "ANY_SOFT"..0x19AD,
        "MONO_SOFT"..0x1500,
        "STEREO_SOFT"..0x1501,
        "STEREO_BASIC_SOFT"..0x19AE,
        "STEREO_UHJ_SOFT"..0x19AF,
        "STEREO_HRTF_SOFT"..0x19B2,
        "QUAD_SOFT"..0x1503,
        "SURROUND_5_1_SOFT"..0x1504,
        "SURROUND_6_1_SOFT"..0x1505,
        "SURROUND_7_1_SOFT"..0x1506
    )
}