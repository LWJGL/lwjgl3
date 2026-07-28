/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val ARM_tensor_controls = "ARMTensorControls".nativeClassVK("ARM_tensor_controls", type = "device", postfix = "ARM") {
    IntConstant(
        "ARM_TENSOR_CONTROLS_SPEC_VERSION".."1"
    )

    StringConstant(
        "ARM_TENSOR_CONTROLS_EXTENSION_NAME".."VK_ARM_tensor_controls"
    )

    EnumConstant(
        "STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM".."1000565000",
        "STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM".."1000565001"
    )

    EnumConstant(
        "TENSOR_TILING_BRICK_16_WIDE_ARM".."1000565000",
        "TENSOR_TILING_BRICK_8_WIDE_ARM".."1000565001",
        "TENSOR_TILING_BRICK_4_WIDE_ARM".."1000565002",
        "TENSOR_TILING_BLOCK_U_INTERLEAVED_ARM".."1000565003",
        "TENSOR_TILING_BLOCK_U_INTERLEAVED_64K_ARM".."1000565004"
    )

    EnumConstant(
        "MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM".."4"
    )
}