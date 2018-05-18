/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRIOBuffer = "VRIOBuffer".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRIOBuffer_",
    library = OPENVR_LIBRARY,
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EIOBufferError(
        "Open",
        "Opens an existing or creates a new {@code IOBuffer} of {@code unSize} bytes.",

        charASCII.const.p.IN("pchPath", ""),
        EIOBufferMode.IN("mode", "", "EIOBufferMode_\\w+"),
        uint32_t.IN("unElementSize", ""),
        uint32_t.IN("unElements", ""),
        Check(1)..IOBufferHandle_t.p.OUT("pulBuffer", "")
    )

    EIOBufferError(
        "Close",
        "Closes a previously opened or created buffer.",

        IOBufferHandle_t.IN("ulBuffer", "")
    )

    EIOBufferError(
        "Read",
        "Reads up to {@code unBytes} from buffer into {@code *pDst}, returning number of bytes read in {@code *punRead}",

        IOBufferHandle_t.IN("ulBuffer", ""),
        void.p.OUT("pDst", ""),
        AutoSize("pDst")..uint32_t.IN("unBytes", ""),
        Check(1)..uint32_t.p.OUT("punRead", "")
    )

    EIOBufferError(
        "Write",
        "Writes {@code unBytes} of data from {@code *pSrc} into a buffer.",

        IOBufferHandle_t.IN("ulBuffer", ""),
        void.p.OUT("pSrc", ""),
        AutoSize("pSrc")..uint32_t.IN("unBytes", "")
    )

    PropertyContainerHandle_t(
        "PropertyContainer",
        "Retrieves the property container of a buffer.",

        IOBufferHandle_t.IN("ulBuffer", "")
    )
}