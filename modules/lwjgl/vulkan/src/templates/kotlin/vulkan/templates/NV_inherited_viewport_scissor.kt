/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_inherited_viewport_scissor = "NVInheritedViewportScissor".nativeClassVK("NV_inherited_viewport_scissor", type = "device", postfix = "NV") {
    IntConstant(
        "NV_INHERITED_VIEWPORT_SCISSOR_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_INHERITED_VIEWPORT_SCISSOR_EXTENSION_NAME".."VK_NV_inherited_viewport_scissor"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INHERITED_VIEWPORT_SCISSOR_FEATURES_NV".."1000278000",
        "STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV".."1000278001"
    )
}