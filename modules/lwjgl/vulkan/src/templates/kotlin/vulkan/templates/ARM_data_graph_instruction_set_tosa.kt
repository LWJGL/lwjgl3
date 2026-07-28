/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_data_graph_instruction_set_tosa = "ARMDataGraphInstructionSetTosa".nativeClassVK("ARM_data_graph_instruction_set_tosa", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_DATA_GRAPH_INSTRUCTION_SET_TOSA_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_DATA_GRAPH_INSTRUCTION_SET_TOSA_EXTENSION_NAME".."VK_ARM_data_graph_instruction_set_tosa"
    )

    EnumConstant(
        "STRUCTURE_TYPE_QUEUE_FAMILY_DATA_GRAPH_TOSA_PROPERTIES_ARM".."1000508000"
    )

    EnumConstant(
        "MAX_DATA_GRAPH_TOSA_NAME_SIZE_ARM".."128"
    )

    EnumConstant(
        "DATA_GRAPH_TOSA_QUALITY_ACCELERATED_ARM".enum(0x00000001),
        "DATA_GRAPH_TOSA_QUALITY_CONFORMANT_ARM".enum(0x00000002),
        "DATA_GRAPH_TOSA_QUALITY_EXPERIMENTAL_ARM".enum(0x00000004),
        "DATA_GRAPH_TOSA_QUALITY_DEPRECATED_ARM".enum(0x00000008)
    )

    EnumConstant(
        "DATA_GRAPH_TOSA_LEVEL_NONE_ARM".."0",
        "DATA_GRAPH_TOSA_LEVEL_8K_ARM".."1"
    )

    VkResult(
        "GetPhysicalDeviceQueueFamilyDataGraphEngineOperationPropertiesARM",

        VkPhysicalDevice("physicalDevice"),
        uint32_t("queueFamilyIndex"),
        VkQueueFamilyDataGraphPropertiesARM.const.p("pQueueFamilyDataGraphProperties"),
        nullable..VkBaseOutStructure.p("pProperties")
    )
}