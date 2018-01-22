/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_MULAW_BFORMAT = "EXTMulawBFormat".nativeClassAL("EXT_MULAW_BFORMAT") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension implies two MULAW formats are available, based on 2D and 3D Ambisonic B-Format.

        See ${AL_EXT_BFORMAT.link} for a discussion of the channel numberings and meanings.
        """

    IntConstant(
        "Buffer formats.",

        "FORMAT_BFORMAT2D_MULAW"..0x10031,
        "FORMAT_BFORMAT3D_MULAW"..0x10032
    )
}