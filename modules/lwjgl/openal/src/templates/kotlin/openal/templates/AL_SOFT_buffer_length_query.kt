/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openal.templates

import org.lwjgl.generator.*
import openal.*

val AL_SOFT_buffer_length_query = "SOFTBufferLengthQuery".nativeClassAL("SOFT_buffer_length_query") {
    documentation =
        """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension adds buffer queries to get the length in bytes, samples, and seconds.

        Standard OpenAL only has queries for a buffer's storage size, the bits per sample, channel count, and sample rate, where the application needs to
        calculate what it wants from those. While this works alright for standard formats and most extension formats, it won't work for certain compressed
        formats like ADPCM. These extra queries ensure the application can get information about the buffer it may need.
        """

    IntConstant(
        "Accepted by the {@code paramName} parameter of #GetBufferi() and #GetBufferiv().",

        "BYTE_LENGTH_SOFT"..0x2009,
        "SAMPLE_LENGTH_SOFT"..0x200A
    )

    IntConstant(
        "Accepted by the {@code paramName} parameter of #GetBufferf() and #GetBufferfv().",

        "SEC_LENGTH_SOFT"..0x200B
    )
}