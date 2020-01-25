/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_direct_channels_remix = "SOFTDirectChannelsRemix".nativeClassAL("SOFT_direct_channels_remix") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension adds the ability to remix channels to the ${AL_SOFT_direct_channels.link} extension. By default, that extension drops input buffer
        channels that don't have a matching output channel. This really only works well for controlled setups where the input and output are known, but
        problems arise when these become variable. An option to remix input channels to the closest output channels will ensure the sound will still be audible
        with as little virtualization as possible.
        """

    IntConstant(
        "Accepted as the {@code value} parameter of #Sourcei() and #Sourceiv() for the #DIRECT_CHANNELS_SOFT property.",

        "DROP_UNMATCHED_SOFT"..0x0001,
        "REMIX_UNMATCHED_SOFT"..0x0002
    )
}