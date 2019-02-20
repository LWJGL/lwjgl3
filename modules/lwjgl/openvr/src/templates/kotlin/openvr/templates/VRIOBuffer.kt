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
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EIOBufferError(
        "Open",
        "Opens an existing or creates a new {@code IOBuffer} of {@code unSize} bytes.",

        charASCII.const.p("pchPath", ""),
        EIOBufferMode("mode", "", "EIOBufferMode_\\w+"),
        uint32_t("unElementSize", ""),
        uint32_t("unElements", ""),
        Check(1)..IOBufferHandle_t.p("pulBuffer", "")
    )

    EIOBufferError(
        "Close",
        "Closes a previously opened or created buffer.",

        IOBufferHandle_t("ulBuffer", "")
    )

    EIOBufferError(
        "Read",
        "Reads up to {@code unBytes} from buffer into {@code *pDst}, returning number of bytes read in {@code *punRead}",

        IOBufferHandle_t("ulBuffer", ""),
        void.p("pDst", ""),
        AutoSize("pDst")..uint32_t("unBytes", ""),
        Check(1)..uint32_t.p("punRead", "")
    )

    EIOBufferError(
        "Write",
        "Writes {@code unBytes} of data from {@code *pSrc} into a buffer.",

        IOBufferHandle_t("ulBuffer", ""),
        void.p("pSrc", ""),
        AutoSize("pSrc")..uint32_t("unBytes", "")
    )

    PropertyContainerHandle_t(
        "PropertyContainer",
        "Retrieves the property container of a buffer.",

        IOBufferHandle_t("ulBuffer", "")
    )

    bool(
        "HasReaders",
        "Inexpensively checks for readers to allow writers to fast-fail potentially expensive copies and writes.",

        IOBufferHandle_t("ulBuffer", "")
    )
}