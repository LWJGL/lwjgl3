/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_compute_occupancy_priority = "NVComputeOccupancyPriority".nativeClassVK("NV_compute_occupancy_priority", type = "device", postfix = "NV") {
    IntConstant(
        "NV_COMPUTE_OCCUPANCY_PRIORITY_SPEC_VERSION".."1"
    )

    StringConstant(
        "NV_COMPUTE_OCCUPANCY_PRIORITY_EXTENSION_NAME".."VK_NV_compute_occupancy_priority"
    )

    FloatConstant(
        "COMPUTE_OCCUPANCY_PRIORITY_LOW_NV".."0.25f",
        "COMPUTE_OCCUPANCY_PRIORITY_NORMAL_NV".."0.50f",
        "COMPUTE_OCCUPANCY_PRIORITY_HIGH_NV".."0.75f"
    )

    EnumConstant(
        "STRUCTURE_TYPE_COMPUTE_OCCUPANCY_PRIORITY_PARAMETERS_NV".."1000645000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_OCCUPANCY_PRIORITY_FEATURES_NV".."1000645001"
    )

    void(
        "CmdSetComputeOccupancyPriorityNV",

        VkCommandBuffer("commandBuffer"),
        VkComputeOccupancyPriorityParametersNV.const.p("pParameters")
    )
}