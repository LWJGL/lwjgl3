/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRPaths = "VRPaths".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRPaths_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    ETrackedPropertyError(
        "ReadPathBatch",
        "",

        PropertyContainerHandle_t("ulRootHandle", ""),
        PathRead_t.p("pBatch", ""),
        AutoSize("pBatch")..uint32_t("unBatchEntryCount", "")
    )

    ETrackedPropertyError(
        "WritePathBatch",
        "",

        PropertyContainerHandle_t("ulRootHandle", ""),
        PathWrite_t.p("pBatch", ""),
        AutoSize("pBatch")..uint32_t("unBatchEntryCount", "")
    )

    ETrackedPropertyError(
        "StringToHandle",
        "",

        Check(1)..PathHandle_t.p("pHandle", ""),
        charASCII.p("pchPath", "")
    )

    ETrackedPropertyError(
        "HandleToString",
        "",

        PathHandle_t("pHandle", ""),
        char.p("pchBuffer", ""),
        AutoSize("pchBuffer")..uint32_t("unBufferSize", ""),
        Check(1)..uint32_t.p("punBufferSizeUsed", "")
    )
}