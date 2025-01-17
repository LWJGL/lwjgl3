/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_maintenance1 = "KHRMaintenance1".nativeClassXR("KHR_maintenance1", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_maintenance1_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_MAINTENANCE1_EXTENSION_NAME".."XR_KHR_maintenance1"
    )

    EnumConstant(
        "ERROR_PERMISSION_INSUFFICIENT_KHR".."-1000710000",
        "ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR".."-1000710001"
    )
}