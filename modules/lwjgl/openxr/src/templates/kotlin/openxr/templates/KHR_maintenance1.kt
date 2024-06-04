/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package openxr.templates

import org.lwjgl.generator.*
import openxr.*

val KHR_maintenance1 = "KHRMaintenance1".nativeClassXR("KHR_maintenance1", type = "instance", postfix = "KHR") {
    documentation =
        """
        The <a href="https://registry.khronos.org/OpenXR/specs/1.1/html/xrspec.html\#XR_KHR_maintenance1">XR_KHR_maintenance1</a> extension.

        {@link KHRMaintenance1 XR_KHR_maintenance1} adds a collection of minor features that were intentionally left out or overlooked from the original OpenXR 1.0 release. All are promoted to the OpenXR 1.1 release.
        """

    IntConstant(
        "The extension specification version.",

        "KHR_maintenance1_SPEC_VERSION".."1"
    )

    StringConstant(
        "The extension name.",

        "KHR_MAINTENANCE1_EXTENSION_NAME".."XR_KHR_maintenance1"
    )

    EnumConstant(
        "Extends {@code XrResult}.",

        "ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR".."-1000710001",
        "ERROR_PERMISSION_INSUFFICIENT_KHR".."-1000710000"
    )
}