/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_data_graph_neural_accelerator_statistics = "ARMDataGraphNeuralAcceleratorStatistics".nativeClassVK("ARM_data_graph_neural_accelerator_statistics", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_EXTENSION_NAME".."VK_ARM_data_graph_neural_accelerator_statistics"
    )

    EnumConstant(
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_NEURAL_STATISTICS_CREATE_INFO_ARM".."1000676000",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_SESSION_NEURAL_STATISTICS_CREATE_INFO_ARM".."1000676001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_NEURAL_ACCELERATOR_STATISTICS_FEATURES_ARM".."1000676002"
    )

    EnumConstant(
        "DATA_GRAPH_PIPELINE_PROPERTY_NEURAL_ACCELERATOR_DEBUG_DATABASE_ARM".."1000676000",
        "DATA_GRAPH_PIPELINE_PROPERTY_NEURAL_ACCELERATOR_STATISTICS_INFO_ARM".."1000676001"
    )

    EnumConstant(
        "DATA_GRAPH_PIPELINE_SESSION_BIND_POINT_NEURAL_ACCELERATOR_STATISTICS_ARM".."1000676000"
    )

    EnumConstant(
        "NEURAL_ACCELERATOR_STATISTICS_MODE_DISABLED_ARM".."0",
        "NEURAL_ACCELERATOR_STATISTICS_MODE_STATISTICS0_ARM".."1",
        "NEURAL_ACCELERATOR_STATISTICS_MODE_STATISTICS1_ARM".."2"
    )
}