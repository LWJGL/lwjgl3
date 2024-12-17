/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package vulkan.templates

import org.lwjgl.generator.*
import vulkan.*

val KHR_shader_atomic_int64 = "KHRShaderAtomicInt64".nativeClassVK("KHR_shader_atomic_int64", type = "device", postfix = "KHR") {
    IntConstant(
        "KHR_SHADER_ATOMIC_INT64_SPEC_VERSION".."1"
    )

    StringConstant(
        "KHR_SHADER_ATOMIC_INT64_EXTENSION_NAME".."VK_KHR_shader_atomic_int64"
    )

    EnumConstant(
        "STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_ATOMIC_INT64_FEATURES_KHR".."1000180000"
    )
}