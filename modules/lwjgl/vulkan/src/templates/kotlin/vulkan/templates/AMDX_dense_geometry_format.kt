/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val AMDX_dense_geometry_format = "AMDXDenseGeometryFormat".nativeClassVK("AMDX_dense_geometry_format", type = "device", postfix = "AMDX") {
    IntConstant(
        "AMDX_DENSE_GEOMETRY_FORMAT_SPEC_VERSION".."1"
    )

    StringConstant(
        "AMDX_DENSE_GEOMETRY_FORMAT_EXTENSION_NAME".."VK_AMDX_dense_geometry_format"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_DENSE_GEOMETRY_FORMAT_FEATURES_AMDX".."1000478000",
        "STRUCTURE_TYPE_ACCELERATION_STRUCTURE_DENSE_GEOMETRY_FORMAT_TRIANGLES_DATA_AMDX".."1000478001"
    )

    EnumConstant(
        "GEOMETRY_TYPE_DENSE_GEOMETRY_FORMAT_TRIANGLES_AMDX".."1000478000"
    )

    EnumConstantLong(
        "BUFFER_USAGE_2_COMPRESSED_DATA_DGF1_BIT_AMDX".enum(0x200000000L)
    )

    EnumConstant(
        "COMPRESSED_TRIANGLE_FORMAT_DGF1_BYTE_ALIGNMENT_AMDX".."128",
        "COMPRESSED_TRIANGLE_FORMAT_DGF1_BYTE_STRIDE_AMDX".."128"
    )

    EnumConstant(
        "COMPRESSED_TRIANGLE_FORMAT_DGF1_AMDX".."0"
    )
}