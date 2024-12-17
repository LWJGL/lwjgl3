/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_command_buffer_inheritance = "NVCommandBufferInheritance".nativeClassVK("NV_command_buffer_inheritance", type = "device", postfix = "NV") {
    IntConstant(
        "NV_COMMAND_BUFFER_INHERITANCE_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_COMMAND_BUFFER_INHERITANCE_EXTENSION_NAME".."VK_NV_command_buffer_inheritance"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COMMAND_BUFFER_INHERITANCE_FEATURES_NV".."1000559000"
    )
}