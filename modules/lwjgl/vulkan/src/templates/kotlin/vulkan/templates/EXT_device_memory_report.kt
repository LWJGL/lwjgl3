/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val EXT_device_memory_report = "EXTDeviceMemoryReport".nativeClassVK("EXT_device_memory_report", type = "device", postfix = "EXT") {
    IntConstant(
        "EXT_DEVICE_MEMORY_REPORT_SPEC_VERSION".."2"
    )

    StringConstant(
        "EXT_DEVICE_MEMORY_REPORT_EXTENSION_NAME".."VK_EXT_device_memory_report"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_MEMORY_REPORT_FEATURES_EXT".."1000284000",
        "STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT".."1000284001",
        "STRUCTURE_TYPE_DEVICE_MEMORY_REPORT_CALLBACK_DATA_EXT".."1000284002"
    )

    EnumConstant(
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT".."0",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT".."1",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT".."2",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT".."3",
        "DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT".."4"
    )
}