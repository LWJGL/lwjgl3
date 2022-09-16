/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRBlockQueue = "VRBlockQueue".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRBlockQueue_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    EBlockQueueError(
        "Create",
        "",

        Check(1)..PropertyContainerHandle_t.p("pulQueueHandle", ""),
        nullable..charASCII.p("pchPath", ""),
        uint32_t("unBlockDataSize", ""),
        uint32_t("unBlockHeaderSize", ""),
        uint32_t("unBlockCount", ""),
        uint32_t("unFlags", "")
    )

    EBlockQueueError(
        "Connect",
        "",

        Check(1)..PropertyContainerHandle_t.p("pulQueueHandle", ""),
        nullable..charASCII.p("pchPath", "")
    )

    EBlockQueueError(
        "Destroy",
        "",

        PropertyContainerHandle_t("ulQueueHandle", "")
    )

    EBlockQueueError(
        "AcquireWriteOnlyBlock",
        "",

        PropertyContainerHandle_t("ulQueueHandle", ""),
        Check(1)..PropertyContainerHandle_t.p("pulBlockHandle", ""),
        Check(1)..void.p.p("ppvBuffer", "")
    )

    EBlockQueueError(
        "ReleaseWriteOnlyBlock",
        "",

        PropertyContainerHandle_t("ulQueueHandle", ""),
        PropertyContainerHandle_t("ulBlockHandle", "")
    )

    EBlockQueueError(
        "WaitAndAcquireReadOnlyBlock",
        "",

        PropertyContainerHandle_t("ulQueueHandle", ""),
        Check(1)..PropertyContainerHandle_t.p("pulBlockHandle", ""),
        Check(1)..void.p.p("ppvBuffer", ""),
        EBlockQueueReadType("eReadType", ""),
        uint32_t("unTimeoutMs", "")
    )

    EBlockQueueError(
        "AcquireReadOnlyBlock",
        "",

        PropertyContainerHandle_t("ulQueueHandle", ""),
        Check(1)..PropertyContainerHandle_t.p("pulBlockHandle", ""),
        Check(1)..void.p.p("ppvBuffer", ""),
        EBlockQueueReadType("eReadType", "")
    )

    EBlockQueueError(
        "ReleaseReadOnlyBlock",
        "",

        PropertyContainerHandle_t("ulQueueHandle", ""),
        PropertyContainerHandle_t("ulBlockHandle", "")
    )

    EBlockQueueError(
        "QueueHasReader",
        "",

        PropertyContainerHandle_t("ulQueueHandle", ""),
        Check(1)..bool.p("pbHasReaders", "")
    )
}