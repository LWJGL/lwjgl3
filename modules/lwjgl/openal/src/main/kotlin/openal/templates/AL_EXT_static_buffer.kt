/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.openal.templates

import org.lwjgl.generator.*
import org.lwjgl.openal.*

val AL_EXT_static_buffer = "EXTStaticBuffer".nativeClassAL("EXT_static_buffer") {
    documentation =
        """
        Native bindings to the $extensionName extension.

        This extension provides a means for the caller to avoid the overhead associated with the #BufferData() call which performs a physical copy of the
        data provided by the caller to internal buffers. When using the $extensionName extension, OpenAL's internal buffers use the data pointer provided by
        the caller for all data access.
        """

    ALvoid(
        "BufferDataStatic",
        "Sets the sample data of the specified buffer.",

        ALint.IN("buffer", "the buffer handle"),
        ALenum.IN("format", "the data format"),
        MultiType(
            PointerMapping.DATA_SHORT, PointerMapping.DATA_INT, PointerMapping.DATA_FLOAT
        )..ALvoid_p.IN("data", "the sample data"),
        AutoSize("data")..ALsizei.IN("len", "the data buffer size, in bytes"),
        ALsizei.IN("freq", "the data frequency")
    )
}