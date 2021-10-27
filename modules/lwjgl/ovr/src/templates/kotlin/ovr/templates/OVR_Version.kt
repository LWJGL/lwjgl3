/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*

val OVR_Version = "OVRVersion".nativeClass(Module.OVR, prefix = "OVR") {
    documentation = "LibOVR version identification."

    IntConstant(
        "Master version numbers.",

        "PRODUCT_VERSION".."1",
        "MAJOR_VERSION".."1",
        "MINOR_VERSION".."64",
        "PATCH_VERSION".."0"
    )

    IntConstant(
        "The {@code ((product * 100) + major)} version of the service that the DLL is compatible with.",

        "DLL_COMPATIBLE_VERSION".."101"
    )

    IntConstant(
        """
        This is the minor version representing the minimum version an application can query with this SDK. Calls to #Initialize() will fail if the application
        requests a version that is less than this.
        """,

        "MIN_REQUESTABLE_MINOR_VERSION".."17"
    )

    IntConstant(
        "",

        "OVR_FEATURE_VERSION".."0"
    )

    StringConstant(
        "\"Major.Minor.Patch\"",

        "VERSION_STRING" expr "Integer.toString(OVR_MAJOR_VERSION) + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION"
    )
}