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
    EIOBufferError(
        "Open",

        charASCII.const.p("pchPath"),
        EIOBufferMode("mode"),
        uint32_t("unElementSize"),
        uint32_t("unElements"),
        Check(1)..IOBufferHandle_t.p("pulBuffer")
    )

    EIOBufferError(
        "Close",

        IOBufferHandle_t("ulBuffer")
    )

    EIOBufferError(
        "Read",

        IOBufferHandle_t("ulBuffer"),
        void.p("pDst"),
        AutoSize("pDst")..uint32_t("unBytes"),
        Check(1)..uint32_t.p("punRead")
    )

    EIOBufferError(
        "Write",

        IOBufferHandle_t("ulBuffer"),
        void.p("pSrc"),
        AutoSize("pSrc")..uint32_t("unBytes")
    )

    PropertyContainerHandle_t(
        "PropertyContainer",

        IOBufferHandle_t("ulBuffer")
    )

    bool(
        "HasReaders",

        IOBufferHandle_t("ulBuffer")
    )
}