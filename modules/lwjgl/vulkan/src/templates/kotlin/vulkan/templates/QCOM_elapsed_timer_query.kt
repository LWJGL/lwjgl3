/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val QCOM_elapsed_timer_query = "QCOMElapsedTimerQuery".nativeClassVK("QCOM_elapsed_timer_query", type = "device", postfix = "QCOM") {
    IntConstant(
        "QCOM_ELAPSED_TIMER_QUERY_SPEC_VERSION".."1"
    )

    StringConstant(
        "QCOM_ELAPSED_TIMER_QUERY_EXTENSION_NAME".."VK_QCOM_elapsed_timer_query"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_ELAPSED_TIMER_QUERY_FEATURES_QCOM".."1000173000"
    )

    EnumConstant(
        "QUERY_TYPE_TIME_ELAPSED_QCOM".."1000173000"
    )
}