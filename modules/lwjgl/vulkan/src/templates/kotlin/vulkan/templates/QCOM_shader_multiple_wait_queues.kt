/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_shader_multiple_wait_queues = "QCOMShaderMultipleWaitQueues".nativeClassVK("QCOM_shader_multiple_wait_queues", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_SHADER_MULTIPLE_WAIT_QUEUES_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_SHADER_MULTIPLE_WAIT_QUEUES_EXTENSION_NAME".."VK_QCOM_shader_multiple_wait_queues"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_FEATURES_QCOM".."1000304000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_MULTIPLE_WAIT_QUEUES_PROPERTIES_QCOM".."1000304001"
    )
}