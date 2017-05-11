/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_SOFT_source_length = "SOFTSourceLength".nativeClassAL("SOFT_source_length") {
    documentation = """
        Native bindings to the $specLinkOpenALSoft extension.

        This extension adds a method to retrieve the total length of a source's buffer data in bytes, samples, and seconds, which correspond to the byte,
        sample, and seconds offset extents. By default, OpenAL only provides a way to retrieve a buffer's storage size in bytes, which does not necessarily
        represent the data size given to alBufferData nor the byte offset extent for the source's #BYTE_OFFSET property. The
        {@code AL_SOFT_buffer_samples} extension allows an application to query a buffer for its length in bytes, samples, and seconds, but this is only for a
        single buffer; a buffer queue on a source still requires additional bookkeeping by the application to keep track of the length of  each buffer being
        queued and unqueued on a given source. This extension aims to ease that and provide a simple query.
        """

    IntConstant(
        "Accepted by the {@code paramName} parameter of #GetSourcei() and #GetSourceiv() (these are the same as in AL_SOFT_buffer_samples).",

        "BYTE_LENGTH_SOFT"..0x2009,
        "SAMPLE_LENGTH_SOFT"..0x200A
    )

    IntConstant(
        "Accepted by the {@code paramName} parameter of #GetSourcef() and #GetSourcefv() (these are the same as in AL_SOFT_buffer_samples).",

        "SEC_LENGTH_SOFT"..0x200B
    )
}