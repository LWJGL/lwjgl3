/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_queue_perf_hint = "QCOMQueuePerfHint".nativeClassVK("QCOM_queue_perf_hint", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_QUEUE_PERF_HINT_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_QUEUE_PERF_HINT_EXTENSION_NAME".."VK_QCOM_queue_perf_hint"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PERF_HINT_INFO_QCOM".."1000302000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_FEATURES_QCOM".."1000302001",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_QUEUE_PERF_HINT_PROPERTIES_QCOM".."1000302002"
    )

    EnumConstant(
        "PERF_HINT_TYPE_DEFAULT_QCOM".."0",
        "PERF_HINT_TYPE_FREQUENCY_MIN_QCOM".."1",
        "PERF_HINT_TYPE_FREQUENCY_MAX_QCOM".."2",
        "PERF_HINT_TYPE_FREQUENCY_SCALED_QCOM".."3"
    )

    VkResult(
        "QueueSetPerfHintQCOM",

        VkQueue("queue"),
        VkPerfHintInfoQCOM.const.p("pPerfHintInfo")
    )
}