/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val NV_displacement_micromap = "NVDisplacementMicromap".nativeClassVK("NV_displacement_micromap", type = "device", postfix = "NV") {
    IntConstant(
        "NV_DISPLACEMENT_MICROMAP_SPEC_VERSION".."2"
    )

    StringConstant(
        "NV_DISPLACEMENT_MICROMAP_EXTENSION_NAME".."VK_NV_displacement_micromap"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_FEATURES_NV".."1000397000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DISPLACEMENT_MICROMAP_PROPERTIES_NV".."1000397001",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV".."1000397002"
    )

    EnumConstant(
        "PIPELINE_CREATE_RAY_TRACING_DISPLACEMENT_MICROMAP_BIT_NV".enum(0x10000000)
    )

    EnumConstant(
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DISPLACEMENT_MICROMAP_UPDATE_BIT_NV".enum(0x00000200),
        "BUILD_ACCELERATION_STRUCTURE_ALLOW_DISPLACEMENT_MICROMAP_UPDATE_NV".enum(0x00000200)
    )

    EnumConstant(
        "MICROMAP_TYPE_DISPLACEMENT_MICROMAP_NV".."1000397000"
    )

    EnumConstant(
        "DISPLACEMENT_MICROMAP_FORMAT_64_TRIANGLES_64_BYTES_NV".."1",
        "DISPLACEMENT_MICROMAP_FORMAT_256_TRIANGLES_128_BYTES_NV".."2",
        "DISPLACEMENT_MICROMAP_FORMAT_1024_TRIANGLES_128_BYTES_NV".."3"
    )
}