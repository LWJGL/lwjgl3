/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ANDROID_external_memory_android_hardware_buffer = "ANDROIDExternalMemoryAndroidHardwareBuffer".nativeClassVK("ANDROID_external_memory_android_hardware_buffer", type = "device", postfix = "ANDROID") {
    IntConstant(
        "ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_SPEC_VERSION".."5"
    )

    StringConstant(
        "ANDROID_EXTERNAL_MEMORY_ANDROID_HARDWARE_BUFFER_EXTENSION_NAME".."VK_ANDROID_external_memory_android_hardware_buffer"
    )

    EnumConstant(
        "EXTERNAL_MEMORY_HANDLE_TYPE_ANDROID_HARDWARE_BUFFER_BIT_ANDROID".enum(0x00000400)
    )

    EnumConstant(
        "STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_USAGE_ANDROID".."1000129000",
        "STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_PROPERTIES_ANDROID".."1000129001",
        "STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID".."1000129002",
        "STRUCTURE_TYPE_IMPORT_ANDROID_HARDWARE_BUFFER_INFO_ANDROID".."1000129003",
        "STRUCTURE_TYPE_MEMORY_GET_ANDROID_HARDWARE_BUFFER_INFO_ANDROID".."1000129004",
        "STRUCTURE_TYPE_EXTERNAL_FORMAT_ANDROID".."1000129005",
        "STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_2_ANDROID".."1000129006"
    )

    VkResult(
        "GetAndroidHardwareBufferPropertiesANDROID",

        VkDevice("device"),
        AHardwareBuffer.const.p("buffer"),
        VkAndroidHardwareBufferPropertiesANDROID.p("pProperties")
    )

    VkResult(
        "GetMemoryAndroidHardwareBufferANDROID",

        VkDevice("device"),
        VkMemoryGetAndroidHardwareBufferInfoANDROID.const.p("pInfo"),
        Check(1)..AHardwareBuffer.p.p("pBuffer")
    )
}