/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_visibility_mask = "KHRVisibilityMask".nativeClassXR("KHR_visibility_mask", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_visibility_mask_SPEC_VERSION".."2"
    )

    StringConstant(
        "KHR_VISIBILITY_MASK_EXTENSION_NAME".."XR_KHR_visibility_mask"
    )

    EnumConstant(
        "TYPE_VISIBILITY_MASK_KHR".."1000031000",
        "TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR".."1000031001"
    )

    EnumConstant(
        "VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR".."1",
        "VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR".."2",
        "VISIBILITY_MASK_TYPE_LINE_LOOP_KHR".."3"
    )

    XrResult(
        "GetVisibilityMaskKHR",

        XrSession("session"),
        XrViewConfigurationType("viewConfigurationType"),
        uint32_t("viewIndex"),
        XrVisibilityMaskTypeKHR("visibilityMaskType"),
        XrVisibilityMaskKHR.p("visibilityMask")
    )
}