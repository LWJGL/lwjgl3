/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package openvr.templates

import org.lwjgl.generator.*
import openvr.*

val VRProperties = "VRProperties".nativeClass(
    Module.OPENVR,
    prefixMethod = "VRProperties_",
    binding = OPENVR_FNTABLE_BINDING
) {
    documentation =
        """
        """

    ETrackedPropertyError(
        "ReadPropertyBatch",
        "",

        PropertyContainerHandle_t("ulContainerHandle", ""),
        PropertyRead_t.p("pBatch", ""),
        AutoSize("pBatch")..uint32_t("unBatchEntryCount", "")
    )

    ETrackedPropertyError(
        "WritePropertyBatch",
        "",

        PropertyContainerHandle_t("ulContainerHandle", ""),
        PropertyWrite_t.p("pBatch", ""),
        AutoSize("pBatch")..uint32_t("unBatchEntryCount", "")
    )

    charASCII.p(
        "GetPropErrorNameFromEnum",
        "",

        ETrackedPropertyError("error", "")
    )

    PropertyContainerHandle_t(
        "TrackedDeviceToPropertyContainer",
        "",

        TrackedDeviceIndex_t("nDevice", "")
    )
}