/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_bformat_ex = "SOFTBformatEx".nativeClassAL("AL_SOFT_bformat_ex") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension allows B-Format buffers to be interpreted according to the ACN (Ambisonic Channel Number), SN3D (Semi-Normalized), and N3D (fully
        Normalized) standards. The AL_EXT_BFORMAT extension provides support for B-Format buffers using the FuMa standard for channel ordering and scaling,
        however much of the ambisonic content being produced today is using a more formalized ACN ordering and SN3D scaling, some even using N3D scaling. The
        option to interpret B-Format buffers using these standards makes them easier to use since an application won't need to manually convert them before
        loading.
        """

    IntConstant(
        "Accepted as the {@code paramName} parameter of #Bufferi(), #Bufferiv(), #GetBufferi(), and #GetBufferiv().",

        "AMBISONIC_LAYOUT_SOFT"..0x1997,
        "AMBISONIC_SCALING_SOFT"..0x1998
    )

    IntConstant(
        "Accepted as the {@code value} parameter of #Bufferi() and #Bufferiv() for the #AMBISONIC_LAYOUT_SOFT and #AMBISONIC_SCALING_SOFT properties.",

        "FUMA_SOFT"..0x0000
    )

    IntConstant(
        "Accepted as the {@code value} parameter of #Bufferi() and #Bufferiv() for the #AMBISONIC_LAYOUT_SOFT property.",

        "ACN_SOFT"..0x0001
    )

    IntConstant(
        "Accepted as the {@code value} parameter of #Bufferi() and #Bufferiv() for the #AMBISONIC_SCALING_SOFT property.",

        "SN3D_SOFT"..0x0001,
        "N3D_SOFT"..0x0002
    )
}