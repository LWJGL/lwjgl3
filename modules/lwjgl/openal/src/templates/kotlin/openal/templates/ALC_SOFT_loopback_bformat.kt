/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val ALC_SOFT_loopback_bformat = "SOFTLoopbackBformat".nativeClassALC("ALC_SOFT_loopback_bformat") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows a loopback device to render B-Format audio channels. The base loopback extension provides for discrete channel mixes, while
        sometimes a non-discrete soundfield mix may be desirable, for instance if recording a 3D video or passing the output to an external ambisonic decoder.
        """

    IntConstant(
        """
        Accepted as parameters for #FORMAT_CHANNELS_SOFT in the {@code attrList} parameter of #CreateContext(), and by the {@code channels} parameter of
        #IsRenderFormatSupportedSOFT().
        """,

        "BFORMAT3D_SOFT"..0x1507
    )

    IntConstant(
        "Accepted as part of the {@code attrList} parameter of #CreateContext().",

        "AMBISONIC_LAYOUT_SOFT"..0x1997,
        "AMBISONIC_SCALING_SOFT"..0x1998,
        "AMBISONIC_ORDER_SOFT"..0x1999
    )

    IntConstant(
        "Accepted as parameters for #AMBISONIC_LAYOUT_SOFT in the {@code attrList} parameter of #CreateContext().",

        "FUMA_SOFT"..0x0000,
        "ACN_SOFT"..0x0001
    )

    IntConstant(
        "Accepted as parameters for #AMBISONIC_SCALING_SOFT in the {@code attrList} parameter of #CreateContext().",

        "SN3D_SOFT"..0x0001,
        "N3D_SOFT"..0x0002
    )

    IntConstant(
        "Accepted as the {@code paramName} parameter of #GetIntegerv().",

        "MAX_AMBISONIC_ORDER_SOFT"..0x199B
    )
}