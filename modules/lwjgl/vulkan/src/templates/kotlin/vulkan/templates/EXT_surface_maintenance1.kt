/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_surface_maintenance1 = "EXTSurfaceMaintenance1".nativeClassVK("EXT_surface_maintenance1", type = "instance", postfix = "EXT") {
    IntConstant(
        "EXT_SURFACE_MAINTENANCE_1_SPEC_VERSION".."1"
    )

    StringConstant(
        "EXT_SURFACE_MAINTENANCE_1_EXTENSION_NAME".."VK_EXT_surface_maintenance1"
    )

    EnumConstant(
        "STRUCTURE_TYPE_SURFACE_PRESENT_MODE_EXT".."1000274000",
        "STRUCTURE_TYPE_SURFACE_PRESENT_SCALING_CAPABILITIES_EXT".."1000274001",
        "STRUCTURE_TYPE_SURFACE_PRESENT_MODE_COMPATIBILITY_EXT".."1000274002"
    )

    EnumConstant(
        "PRESENT_SCALING_ONE_TO_ONE_BIT_KHR".enum(0x00000001),
        "PRESENT_SCALING_ONE_TO_ONE_BIT_EXT".enum(0x00000001),
        "PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_KHR".enum(0x00000002),
        "PRESENT_SCALING_ASPECT_RATIO_STRETCH_BIT_EXT".enum(0x00000002),
        "PRESENT_SCALING_STRETCH_BIT_KHR".enum(0x00000004),
        "PRESENT_SCALING_STRETCH_BIT_EXT".enum(0x00000004)
    )

    EnumConstant(
        "PRESENT_GRAVITY_MIN_BIT_KHR".enum(0x00000001),
        "PRESENT_GRAVITY_MIN_BIT_EXT".enum(0x00000001),
        "PRESENT_GRAVITY_MAX_BIT_KHR".enum(0x00000002),
        "PRESENT_GRAVITY_MAX_BIT_EXT".enum(0x00000002),
        "PRESENT_GRAVITY_CENTERED_BIT_KHR".enum(0x00000004),
        "PRESENT_GRAVITY_CENTERED_BIT_EXT".enum(0x00000004)
    )
}