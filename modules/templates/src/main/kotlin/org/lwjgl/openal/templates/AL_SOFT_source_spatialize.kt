/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_source_spatialize = "SOFTSourceSpatialize".nativeClassAL("SOFT_source_spatialize") {
    documentation = """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides more control over the spatialization behavior of sources. By default, OpenAL will spatialize sources playing a mono buffer and
        not spatialize sources playing a multi-channel buffer. Spatialization features include positional panning, distance attenuation, cone-related
        attenuation, and doppler effects. This extension allows such features to be enabled and disabled per-source independently of the buffer format.
        """

    IntConstant(
        "Accepted as the {@code param} parameter of #Sourcei(), #Sourceiv(), #GetSourcei(), and #GetSourceiv().",

        "SOURCE_SPATIALIZE_SOFT"..0x1214
    )

    IntConstant(
        "Accepted as the {@code value} of the #SOURCE_SPATIALIZE_SOFT property.",

        "AUTO_SOFT"..0x0002
    )
}