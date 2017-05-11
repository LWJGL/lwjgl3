/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_BFORMAT = "EXTBFormat".nativeClassAL("EXT_BFORMAT") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension indicates support for the #FORMAT_BFORMAT2D_8, #FORMAT_BFORMAT2D_16, #FORMAT_BFORMAT2D_FLOAT32, #FORMAT_BFORMAT3D_8,
        #FORMAT_BFORMAT3D_16 and #FORMAT_BFORMAT3D_FLOAT32 buffer formats. These provide 2D (WXY) and 3D (WXYZ) 8bit int, 16bit int and ALfloat support for
        Ambisonic three- or four-channel B-Format (using W X Y Z channel ordering, encoded as the first three or four channels of Furse-Malham higher order
        Ambisonics). Use of these formats indicate that sources are Ambisonic sources. Such sources can be oriented via #Sourcefv() using the
        #ORIENTATION tag, which takes the same parameters as {@code alListenerfv(AL_ORIENTATION,...)}. Such sources DO support #SOURCE_RELATIVE and the
        soundfield will rotate to reflect the listener's orientation if this is off (the default). Other behaviour is as for stereo or multichannel assets.

        Note that Ambisonics orients X, Y and Z axes in a different way to OpenAL. For clarity, we ignore the Ambisonic coordinate system in the API and stick
        to the OpenAL one, making sure that the Front of the Ambisonic soundfield (actually Ambisonic +X) matches the Front of the OpenAL coordinate system (-Z
        by default) etc. For instance, if the orientation of the source is set so that the "at" vector is to the left, then the front of the B-Format
        soundfield will be presented to the left.
        """

    IntConstant(
        "Ambisonic formats.",

        "FORMAT_BFORMAT2D_16"..0x20022,
        "FORMAT_BFORMAT2D_8"..0x20021,
        "FORMAT_BFORMAT2D_FLOAT32"..0x20023,
        "FORMAT_BFORMAT3D_16"..0x20032,
        "FORMAT_BFORMAT3D_8"..0x20031,
        "FORMAT_BFORMAT3D_FLOAT32"..0x20033
    )
}