/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package ovr.templates

import org.lwjgl.generator.*

val OVR_Version = "OVRVersion".nativeClass(Module.OVR, prefix = "OVR") {
    IntConstant(
        "PRODUCT_VERSION".."1",
        "MAJOR_VERSION".."1",
        "MINOR_VERSION".."64",
        "PATCH_VERSION".."0"
    )

    IntConstant(
        "DLL_COMPATIBLE_VERSION".."101"
    )

    IntConstant(
        "MIN_REQUESTABLE_MINOR_VERSION".."17"
    )

    IntConstant(
        "FEATURE_VERSION".."0"
    )

    StringConstant(
        "VERSION_STRING" expr "Integer.toString(OVR_MAJOR_VERSION) + '.' + OVR_MINOR_VERSION + '.' + OVR_PATCH_VERSION"
    )
}