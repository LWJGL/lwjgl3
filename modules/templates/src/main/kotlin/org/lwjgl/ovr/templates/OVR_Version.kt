/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.ovr.templates

import org.lwjgl.generator.*
import org.lwjgl.ovr.*

val OVR_Version = "OVRVersion".nativeClass(packageName = OVR_PACKAGE, prefix = "OVR") {
    documentation = "LibOVR version identification."

    IntConstant(
        "Master version numbers.",

        "PRODUCT_VERSION".."1",
        "MAJOR_VERSION".."1",
        "MINOR_VERSION".."15",
        "PATCH_VERSION".."0",
        "BUILD_NUMBER".."0"
    )

    IntConstant(
        "The {@code ((product * 100) + major)} version of the service that the DLL is compatible with.",

        "DLL_COMPATIBLE_VERSION".."101"
    )

    IntConstant(
        "",

        "OVR_FEATURE_VERSION".."0"
    )

    StringConstant(
        "\"Major.Minor.Patch.Build\"",

        "VERSION_STRING" expr "Integer.toString(OVR_MAJOR_VERSION) + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION"
    )

    StringConstant(
        "\"Major.Minor.Patch.Build\"",

        "DETAILED_VERSION_STRING" expr "Integer.toString(OVR_MAJOR_VERSION) + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION + '.' + OVR_BUILD_NUMBER"
    )
}