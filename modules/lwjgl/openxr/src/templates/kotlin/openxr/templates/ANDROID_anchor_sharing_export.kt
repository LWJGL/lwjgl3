/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val ANDROID_anchor_sharing_export = "ANDROIDAnchorSharingExport".nativeClassXR("ANDROID_anchor_sharing_export", type = "instance", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_anchor_sharing_export_SPEC_VERSION".."1"
    )

    StringConstant(
        "ANDROID_ANCHOR_SHARING_EXPORT_EXTENSION_NAME".."XR_ANDROID_anchor_sharing_export"
    )

    EnumConstant(
        "TYPE_ANCHOR_SHARING_INFO_ANDROID".."1000701000",
        "TYPE_ANCHOR_SHARING_TOKEN_ANDROID".."1000701001",
        "TYPE_SYSTEM_ANCHOR_SHARING_EXPORT_PROPERTIES_ANDROID".."1000701002"
    )

    EnumConstant(
        "ERROR_ANCHOR_NOT_OWNED_BY_CALLER_ANDROID".."-1000701000"
    )

    XrResult(
        "ShareAnchorANDROID",

        XrSession("session"),
        XrAnchorSharingInfoANDROID.const.p("sharingInfo"),
        XrAnchorSharingTokenANDROID.p("anchorToken")
    )

    XrResult(
        "UnshareAnchorANDROID",

        XrSession("session"),
        XrSpace("anchor")
    )
}