/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_surface_maintenance1 = "KHRSurfaceMaintenance1".nativeClassVK("KHR_surface_maintenance1", type = "instance", postfix = "KHR") {
    IntConstant(
        "KHR_SURFACE_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SURFACE_MAINTENANCE_1_EXTENSION_NAME".."VK_KHR_surface_maintenance1"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SURFACE_PRESENT_MODE_KHR".."1000274000",
        "STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_KHR".."1000274001",
        "STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_KHR".."1000274002"
    )
}