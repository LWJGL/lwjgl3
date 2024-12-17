/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_compute_shader_derivatives = "KHRComputeShaderDerivatives".nativeClassVK("KHR_compute_shader_derivatives", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_COMPUTE_SHADER_DERIVATIVES_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_COMPUTE_SHADER_DERIVATIVES_EXTENSION_NAME".."VK_KHR_compute_shader_derivatives"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_FEATURES_KHR".."1000201000",
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_COMPUTE_SHADER_DERIVATIVES_PROPERTIES_KHR".."1000511000"
    )
}