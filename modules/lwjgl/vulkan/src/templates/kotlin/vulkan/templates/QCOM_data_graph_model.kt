/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_data_graph_model = "QCOMDataGraphModel".nativeClassVK("QCOM_data_graph_model", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_DATA_GRAPH_MODEL_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_DATA_GRAPH_MODEL_EXTENSION_NAME".."VK_QCOM_data_graph_model"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DATA_GRAPH_MODEL_FEATURES_QCOM".."1000629000",
        "STRUCTURE_TYPE_DATA_GRAPH_PIPELINE_BUILTIN_MODEL_CREATE_INFO_QCOM".."1000629001"
    )

    EnumConstant(
        "PHYSICAL_DEVICE_DATA_GRAPH_PROCESSING_ENGINE_TYPE_NEURAL_QCOM".."1000629000",
        "PHYSICAL_DEVICE_DATA_GRAPH_PROCESSING_ENGINE_TYPE_COMPUTE_QCOM".."1000629001"
    )

    EnumConstant(
        "PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_NEURAL_MODEL_QCOM".."1000629000",
        "PHYSICAL_DEVICE_DATA_GRAPH_OPERATION_TYPE_BUILTIN_MODEL_QCOM".."1000629001"
    )

    EnumConstant(
        "PIPELINE_CACHE_HEADER_VERSION_DATA_GRAPH_QCOM".."1000629000"
    )

    EnumConstant(
        "DATA_GRAPH_MODEL_TOOLCHAIN_VERSION_LENGTH_QCOM".."3"
    )

    EnumConstant(
        "DATA_GRAPH_MODEL_CACHE_TYPE_GENERIC_BINARY_QCOM".."0"
    )
}