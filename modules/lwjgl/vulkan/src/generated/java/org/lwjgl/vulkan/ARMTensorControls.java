/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

public final class ARMTensorControls {

    public static final int VK_ARM_TENSOR_CONTROLS_SPEC_VERSION = 1;

    public static final String VK_ARM_TENSOR_CONTROLS_EXTENSION_NAME = "VK_ARM_tensor_controls";

    public static final int
        VK_STRUCTURE_TYPE_TENSOR_EXPLICIT_TILING_FORMAT_PROPERTIES_ARM = 1000565000,
        VK_STRUCTURE_TYPE_TENSOR_ROLLING_BACKING_CREATE_INFO_ARM       = 1000565001;

    public static final int
        VK_TENSOR_TILING_BRICK_16_WIDE_ARM           = 1000565000,
        VK_TENSOR_TILING_BRICK_8_WIDE_ARM            = 1000565001,
        VK_TENSOR_TILING_BRICK_4_WIDE_ARM            = 1000565002,
        VK_TENSOR_TILING_BLOCK_U_INTERLEAVED_ARM     = 1000565003,
        VK_TENSOR_TILING_BLOCK_U_INTERLEAVED_64K_ARM = 1000565004;

    public static final int VK_MAX_TENSOR_CREATE_INFO_ROLLING_BACKING_WRAP_COUNT_ARM = 4;

    private ARMTensorControls() {}

}