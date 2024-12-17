/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val MESA_image_alignment_control = "MESAImageAlignmentControl".nativeClassVK("MESA_image_alignment_control", type = "device", postfix = "MESA") {
    IntConstant(
        "MESA_IMAGE_ALIGNMENT_CONTROL_SPEC_VERSION".."1"
    )

    StringConstant(
        "MESA_IMAGE_ALIGNMENT_CONTROL_EXTENSION_NAME".."VK_MESA_image_alignment_control"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_FEATURES_MESA".."1000575000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_ALIGNMENT_CONTROL_PROPERTIES_MESA".."1000575001",
        "STRUCTURE_TYPE_IMAGE_ALIGNMENT_CONTROL_CREATE_INFO_MESA".."1000575002"
    )
}