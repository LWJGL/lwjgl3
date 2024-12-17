/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_driver_properties = "KHRDriverProperties".nativeClassVK("KHR_driver_properties", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_DRIVER_PROPERTIES_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_DRIVER_PROPERTIES_EXTENSION_NAME".."VK_KHR_driver_properties"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES_KHR".."1000196000"
    )

    EnumConstant(
        "MAX_DRIVER_NAME_SIZE_KHR".."256"
    )

    EnumConstant(
        "MAX_DRIVER_INFO_SIZE_KHR".."256"
    )

    EnumConstant(
        "DRIVER_ID_AMD_PROPRIETARY_KHR".."1",
        "DRIVER_ID_AMD_OPEN_SOURCE_KHR".."2",
        "DRIVER_ID_MESA_RADV_KHR".."3",
        "DRIVER_ID_NVIDIA_PROPRIETARY_KHR".."4",
        "DRIVER_ID_INTEL_PROPRIETARY_WINDOWS_KHR".."5",
        "DRIVER_ID_INTEL_OPEN_SOURCE_MESA_KHR".."6",
        "DRIVER_ID_IMAGINATION_PROPRIETARY_KHR".."7",
        "DRIVER_ID_QUALCOMM_PROPRIETARY_KHR".."8",
        "DRIVER_ID_ARM_PROPRIETARY_KHR".."9",
        "DRIVER_ID_GOOGLE_SWIFTSHADER_KHR".."10",
        "DRIVER_ID_GGP_PROPRIETARY_KHR".."11",
        "DRIVER_ID_BROADCOM_PROPRIETARY_KHR".."12"
    )
}