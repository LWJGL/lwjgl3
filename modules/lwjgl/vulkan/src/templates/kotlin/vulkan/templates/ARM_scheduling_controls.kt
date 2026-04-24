/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_scheduling_controls = "ARMSchedulingControls".nativeClassVK("ARM_scheduling_controls", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_SCHEDULING_CONTROLS_SPEC_VERSION".."2"
    )

    StringConstant(
        "ARM_SCHEDULING_CONTROLS_EXTENSION_NAME".."VK_ARM_scheduling_controls"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DEVICE_QUEUE_SHADER_CORE_CONTROL_CREATE_INFO_ARM".."1000417000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_FEATURES_ARM".."1000417001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_PROPERTIES_ARM".."1000417002",
        "STRUCTURE_TYPE_DISPATCH_PARAMETERS_ARM".."1000417003",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_PROPERTIES_ARM".."1000417004"
    )

    EnumConstantLong(
        "PHYSICAL_DEVICE_SCHEDULING_CONTROLS_SHADER_CORE_COUNT_ARM".enum(0x00000001L),
        "PHYSICAL_DEVICE_SCHEDULING_CONTROLS_DISPATCH_PARAMETERS_ARM".enum(0x00000002L)
    )

    void(
        "CmdSetDispatchParametersARM",

        VkCommandBuffer("commandBuffer"),
        VkDispatchParametersARM.const.p("pDispatchParameters")
    )
}