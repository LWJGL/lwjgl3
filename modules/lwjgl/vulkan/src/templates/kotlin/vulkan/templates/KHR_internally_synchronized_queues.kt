/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_internally_synchronized_queues = "KHRInternallySynchronizedQueues".nativeClassVK("KHR_internally_synchronized_queues", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_INTERNALLY_SYNCHRONIZED_QUEUES_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_INTERNALLY_SYNCHRONIZED_QUEUES_EXTENSION_NAME".."VK_KHR_internally_synchronized_queues"
    )

    EnumConstant(
        "DEVICE_QUEUE_CREATE_INTERNALLY_SYNCHRONIZED_BIT_KHR".enum(0x00000004)
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_INTERNALLY_SYNCHRONIZED_QUEUES_FEATURES_KHR".."1000504000"
    )
}