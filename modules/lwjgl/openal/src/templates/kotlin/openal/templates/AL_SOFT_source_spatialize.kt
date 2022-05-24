/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_source_spatialize = "SOFTSourceSpatialize".nativeClassAL("SOFT_source_spatialize") {
    documentation = """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension provides more control over the spatialization behavior of sources. By default, OpenAL will spatialize sources playing a mono buffer and
        not spatialize sources playing a multi-channel buffer. Spatialization features include positional panning, distance attenuation, cone-related
        attenuation, and doppler effects. This extension allows such features to be enabled and disabled per-source independently of the buffer format.

        <h3>Controlling Source Spatialization</h3>

        A source may have spatialization features applied depending on its #SOURCE_SPATIALIZE_SOFT property. Valid values for the property are #FALSE, #TRUE,
        and #AUTO_SOFT. When set to {@code AL_FALSE}, spatialization features are never applied to the source. When set to {@code AL_TRUE}, they are always
        applied. When set to {@code AL_AUTO_SOFT}, they are applied if playing a buffer with one channel, and not if the buffer has more than one channel.
        The default is {@code AL_AUTO_SOFT}.

        When spatialization features are applied on a source playing a non-mono buffer, if the source occupies the same 3D position as the listener the
        buffer's channels are placed around the listener according to the format (e.g. a stereo buffer has the left channel 30 degrees left of front, and the
        right channel 30 degrees right of front). This panning is NOT effected by the source direction or listener orientation.

        If the source does not occupy the same 3D position as the listener, the proper panning direction is calculated and all channels of the buffer will be
        panned to that direction (effectively down-mixing the buffer to mono dynamically). The buffer's channels will also receive a gain correction of
        {@code 1/num_channels} when panned, to preserve peak amplitude of the mixed channels. An exception is the LFE channel in buffer formats that include
        one. The LFE channel may be sent to the LFE output as normal and not be part of the panned mix, however it is still attenuated according to the source
        distance and cone.
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